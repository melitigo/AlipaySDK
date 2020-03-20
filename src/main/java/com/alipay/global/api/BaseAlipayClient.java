package com.alipay.global.api;

import com.alibaba.fastjson.JSON;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.net.AlipayCharset;
import com.alipay.global.api.net.HttpRpcResult;
import com.alipay.global.api.request.AlipayRequest;
import com.alipay.global.api.response.AlipayResponse;
import com.alipay.global.api.tools.SignatureTool;
import com.alipay.global.api.tools.StringUtils;
import com.alipay.global.api.tools.XMLParser;
import org.dom4j.DocumentException;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class BaseAlipayClient implements AlipayClient {
    private String partner;

    private String gatewayUrl;


    private String merchantPrivateKey;
    private String alipayPublicKey;

    private String signType;
    private String inputCharset;

    public BaseAlipayClient() {
    }

    public BaseAlipayClient(String gatewayUrl, String partner, String signType, String merchantPrivateKey, String alipayPublicKey) {
        this(gatewayUrl, partner, signType, AlipayCharset.UTF8, merchantPrivateKey, alipayPublicKey);
    }

    public BaseAlipayClient(String gatewayUrl, String partner, String signType, AlipayCharset inputCharset, String merchantPrivateKey, String alipayPublicKey) {
        this.partner = partner;
        this.signType = signType;
        this.gatewayUrl = gatewayUrl;
        this.merchantPrivateKey = merchantPrivateKey;
        this.alipayPublicKey = alipayPublicKey;
        this.inputCharset = inputCharset == AlipayCharset.GBK ? "GBK" : "UTF-8";
    }

    public void initialize(AlipayRequest request) throws AlipayApiException {
        checkRequestParam(request);
        String sign = genSignValue(request);
        request.setSignType(signType);
        request.setSign(sign);
    }

    public String link(AlipayRequest request) throws AlipayApiException {
        initialize(request);
        String query = request.parameters().entrySet().stream().map(a1 -> {
            try {
                return a1.getKey() + "=" + URLEncoder.encode(a1.getValue(), inputCharset);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.joining("&"));
        return gatewayUrl + "?" + query;
    }

    @Override
    public String orderInfo(AlipayRequest request) throws AlipayApiException {
        initialize(request);
        if (!request.getService().equals("mobile.securitypay.pay")) {
            throw new AlipayApiException("service incorrect", "only service mobile.securitypay.pay is allowed to call this function");
        }
        return request.parameters().entrySet().stream().map(a1 -> {
            try {
                return a1.getKey().equals("sign") ? String.format("%s=\"%s\"", a1.getKey(), URLEncoder.encode(a1.getValue(), inputCharset)) : String.format("%s=\"%s\"", a1.getKey(), a1.getValue());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.joining("&"));
    }

    public String form(AlipayRequest request) throws AlipayApiException {
        initialize(request);
        Map<String, String> parameters = request.parameters();
        String gateway = gatewayUrl + "?_input_charset=" + inputCharset;
        parameters.remove("_input_charset");
        String form_head = "<form hidden = \"hidden\" id= \"_alipay_payment_form\" accept-charset=\"@{charset}\" action=\"@{gateway}\" method=\"@{method}\">\n";
        String input_model = "@{key}:<input name = \"@{key}\" value = \"@{value}\"/><br>\n";
        String form_tail = "</form>\n<script type=\"text/javascript\">document.getElementById(\"_alipay_payment_form\").submit();</script>";
        StringBuilder ret_html = new StringBuilder();
        ret_html.append(form_head.replace("@{charset}", inputCharset)
                .replace("@{gateway}", gateway)
                .replace("@{method}", "POST"));
        parameters.forEach((key, value) -> ret_html.append(input_model
                .replace("@{key}", key.replace("\"", "&quot;"))
                .replace("@{value}", value.replace("\"", "&quot;"))));
        ret_html.append(form_tail);
        return ret_html.toString();
    }

    public AlipayResponse execute(AlipayRequest request) throws AlipayApiException {
        initialize(request);
        String postGateway = String.format("%s?_input_charset=%s", gatewayUrl, inputCharset);
        Map<String, String> parameters = request.parameters();
        parameters.remove("_input_charset");
        String postBody = parameters.entrySet().stream().map(a1 -> {
            try {
                return a1.getKey() + "=" + URLEncoder.encode(a1.getValue(), inputCharset);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.joining("&"));

        HttpRpcResult rsp = sendRequest(postGateway, "POST", new HashMap<>(), postBody);
        if (rsp == null) {
            throw new AlipayApiException("HttpRpcResult is null.");
        }
        String rspBody = rsp.getRspBody();

        AlipayResponse alipayResponse = new AlipayResponse();
        if (rsp.getContentType().startsWith("text/html;")) {
            if (rsp.getRspBody().length() > 200) {
                throw new AlipayApiException("Wrong access, use function alipayClient.link to get the link and open it in a browser.");
            }
        }
        if (!rsp.getContentType().startsWith("text/xml;")) {
            alipayResponse = JSON.parseObject("{\"is_success\":\"T\",\"response\":{\"content\":{\"content\":{}}}}", AlipayResponse.class);
            alipayResponse.getResponse().put("content", rsp.getRspBody());
            return alipayResponse;
        }
        try {
            String responseContent = XMLParser.XMLtoJSON(rspBody).getString("alipay");
            alipayResponse = JSON.parseObject(responseContent, AlipayResponse.class);
        } catch (DocumentException e) {
            throw new AlipayApiException("Response parse fail", "Response parse fail");
        }

        if (!alipayResponse.isSuccess()) {
            return alipayResponse;
        }
        if (alipayResponse.getSign() != null && alipayResponse.getResponse() != null) {
            if (!checkRspSign(alipayResponse)) {
                throw new AlipayApiException("Response sign verify fail.");
            }
        }
        return alipayResponse;
    }

    private String genSignValue(AlipayRequest alipayRequest) throws AlipayApiException {
        Map<String, String> parameters = alipayRequest.parameters();
        String signatureValue;
        try {
            String preSignString = parameters.entrySet().stream().filter(a1 -> {
                return (a1.getKey() != null && a1.getKey().length() > 0) &&
                        (a1.getValue() != null && a1.getValue().length() > 0) &&
                        ((!a1.getKey().equals("sign")) && (!a1.getKey().equals("sign_type")));
            }).sorted(Map.Entry.comparingByKey()).map(a1 -> {
                return parameters.get("service").equals("mobile.securitypay.pay") ? String.format("%s=\"%s\"", a1.getKey(), a1.getValue()) : String.format("%s=%s", a1.getKey(), a1.getValue());
            }).collect(Collectors.joining("&"));
            signatureValue = SignatureTool.sign(preSignString, signType, inputCharset, merchantPrivateKey);
        } catch (Exception e) {
            throw new AlipayApiException(e);
        }
        return signatureValue;
    }

    private boolean checkRspSign(AlipayResponse alipayResponse) throws AlipayApiException {
        String rspCheckSignValue = alipayResponse.getPreSignString();
        try {
            return SignatureTool.verify(rspCheckSignValue, alipayResponse.getSignType(), inputCharset, alipayResponse.getSign(), alipayPublicKey);
        } catch (Exception e) {
            throw new AlipayApiException(e);
        }
    }

    private void checkRequestParam(AlipayRequest alipayRequest) throws AlipayApiException {
        if (alipayRequest == null) {
            throw new AlipayApiException("alipayRequest can't be null");
        }

        alipayRequest.setPartner(partner);
        alipayRequest.setInputCharset(inputCharset);

        String service = alipayRequest.getService();
        String partner = alipayRequest.getPartner();

        if (StringUtils.isBlank(gatewayUrl)) {
            throw new AlipayApiException("gatewayUrl can't be null");
        }

        if (StringUtils.isBlank(service)) {
            throw new AlipayApiException("service can't be null");
        }

        if (StringUtils.isBlank(partner)) {
            throw new AlipayApiException("partner can't be null");
        }
    }

    public abstract HttpRpcResult sendRequest(String requestUrl, String httpMethod, Map<String, String> header, String reqBody) throws AlipayApiException;

    public boolean verify(Map<String, String> alipayNotification) throws AlipayApiException {
//        alipayNotification.keySet().forEach(a1 -> {
//            try {
//                alipayNotification.put(a1, URLDecoder.decode(a1, inputCharset));
//            } catch (Exception ignored) {
//            }
//        });

        String preSignString = alipayNotification.entrySet().stream().filter(a1 ->
                (a1.getKey() != null && a1.getKey().length() > 0) &&
                        (a1.getValue() != null && a1.getValue().length() > 0) &&
                        ((!a1.getKey().equals("sign")) && (!a1.getKey().equals("sign_type"))))
                .sorted(Map.Entry.comparingByKey())
                .map(a1 -> String.format("%s=%s", a1.getKey(), a1.getValue())).collect(Collectors.joining("&"));
        String sign = alipayNotification.get("sign");
        if (sign == null || sign.length() == 0) {
            throw new AlipayApiException("Signature verify failed", "Signature verify failed");
        }
        sign = sign.replaceAll(" ", "+");
        return SignatureTool.verify(preSignString, signType, inputCharset, sign, alipayPublicKey);
    }
}
