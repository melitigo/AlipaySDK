package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayAcquireCreateandpayRequest extends AlipayRequest {

    /**
     * 字段描述：服务名
     * Description: service name
     * Example: alipay.acquire.createandpay
     * alipay.acquire.createandpay
     */
    private String service = "alipay.acquire.createandpay";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 
     * 
     */
    private String partner;


    /**
     * 字段描述：字符集，推荐UTF-8
     * Description: 
     * Example: UTF-8
     * UTF-8 GBK gbk utf-8
     */
    private String _input_charset;


    /**
     * 字段描述：签名算法
     * Description: Signature algorithm
     * Example: MD5
     * RSA RSA2 MD5
     */
    private String sign_type;


    /**
     * 字段描述：签名值
     * Description: Signature value
     * Example: e5815a4556db338ed237f7d3fd222184
     * 
     */
    private String sign;


    /**
     * 字段描述：异步通知地址
     * Description: 异步通知地址
     * Example: 
     * 
     */
    private String notify_url;


    /**
     * 字段描述：外部交易号，自定义设置，不能包含除中文、英文、数字以外的字符，且需要保证在商户端不重复。
     * Description: 
     * Example: TRADE_#auto#
     * 
     */
    private String out_trade_no;


    /**
     * 字段描述：
     * Description: 
     * Example: Mika's coffee shop
     * 
     */
    private String subject;


    /**
     * 字段描述：
     * Description: 
     * Example: FOREX_GENERAL_WITHHOLDING
     * FOREX_GENERAL_WITHHOLDING GENERAL_WITHHOLDING
     */
    private String product_code;


    /**
     * 字段描述：
     * Description: 
     * Example: 0.01
     * 
     */
    private String total_fee;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String body;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String show_url;


    /**
     * 字段描述：商户签约的结算币种。必须大写英文字母。
     * Description: 
     * Example: USD
     * 
     */
    private String currency;


    /**
     * 字段描述：
     * Description: 
     * Example: USD
     * 
     */
    private String trans_currency;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String agreement_info;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String extend_params;


    /**
     * 字段描述：订单信息
     * Description: A JSON format string to describe the items contained in this payment.
     * Example: 
     * 
     */
    private String trade_information;

    public void setService(String service) {
        if (service != null) {
            this.service = service.trim();
        }
    }
    public void setPartner(String partner) {
        if (partner != null) {
            this.partner = partner.trim();
        }
    }
    public void setInputCharset(String _input_charset) {
        if (_input_charset != null) {
            this._input_charset = _input_charset.trim();
        }
    }
    public void setSignType(String sign_type) {
        if (sign_type != null) {
            this.sign_type = sign_type.trim();
        }
    }
    public void setSign(String sign) {
        if (sign != null) {
            this.sign = sign.trim();
        }
    }
    public void setNotifyUrl(String notify_url) {
        if (notify_url != null) {
            this.notify_url = notify_url.trim();
        }
    }
    public void setOutTradeNo(String out_trade_no) {
        if (out_trade_no != null) {
            this.out_trade_no = out_trade_no.trim();
        }
    }
    public void setSubject(String subject) {
        if (subject != null) {
            this.subject = subject.trim();
        }
    }
    public void setProductCode(String product_code) {
        if (product_code != null) {
            this.product_code = product_code.trim();
        }
    }
    public void setTotalFee(String total_fee) {
        if (total_fee != null) {
            this.total_fee = total_fee.trim();
        }
    }
    public void setBody(String body) {
        if (body != null) {
            this.body = body.trim();
        }
    }
    public void setShowUrl(String show_url) {
        if (show_url != null) {
            this.show_url = show_url.trim();
        }
    }
    public void setCurrency(String currency) {
        if (currency != null) {
            this.currency = currency.trim();
        }
    }
    public void setTransCurrency(String trans_currency) {
        if (trans_currency != null) {
            this.trans_currency = trans_currency.trim();
        }
    }
    public void setAgreementInfo(String agreement_info) {
        if (agreement_info != null) {
            this.agreement_info = agreement_info.trim();
        }
    }
    public void setExtendParams(String extend_params) {
        if (extend_params != null) {
            this.extend_params = extend_params.trim();
        }
    }
    public void setTradeInformation(String trade_information) {
        if (trade_information != null) {
            this.trade_information = trade_information.trim();
        }
    }
    public String getService() {
        return service;
    }

    public String getPartner() {
        return partner;
    }

    public String getInputCharset() {
        return _input_charset;
    }

    public String getSignType() {
        return sign_type;
    }

    public String getSign() {
        return sign;
    }

    public String getNotifyUrl() {
        return notify_url;
    }

    public String getOutTradeNo() {
        return out_trade_no;
    }

    public String getSubject() {
        return subject;
    }

    public String getProductCode() {
        return product_code;
    }

    public String getTotalFee() {
        return total_fee;
    }

    public String getBody() {
        return body;
    }

    public String getShowUrl() {
        return show_url;
    }

    public String getCurrency() {
        return currency;
    }

    public String getTransCurrency() {
        return trans_currency;
    }

    public String getAgreementInfo() {
        return agreement_info;
    }

    public String getExtendParams() {
        return extend_params;
    }

    public String getTradeInformation() {
        return trade_information;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (agreement_info != null && !agreement_info.equals("") && !agreement_info.equals("null")) {
            para.put("agreement_info", agreement_info);
        }
        if (body != null && !body.equals("") && !body.equals("null")) {
            para.put("body", body);
        }
        if (currency != null && !currency.equals("") && !currency.equals("null")) {
            para.put("currency", currency);
        }
        if (extend_params != null && !extend_params.equals("") && !extend_params.equals("null")) {
            para.put("extend_params", extend_params);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (out_trade_no != null && !out_trade_no.equals("") && !out_trade_no.equals("null")) {
            para.put("out_trade_no", out_trade_no);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (product_code != null && !product_code.equals("") && !product_code.equals("null")) {
            para.put("product_code", product_code);
        }
        if (service != null && !service.equals("") && !service.equals("null")) {
            para.put("service", service);
        }
        if (show_url != null && !show_url.equals("") && !show_url.equals("null")) {
            para.put("show_url", show_url);
        }
        if (sign != null && !sign.equals("") && !sign.equals("null")) {
            para.put("sign", sign);
        }
        if (sign_type != null && !sign_type.equals("") && !sign_type.equals("null")) {
            para.put("sign_type", sign_type);
        }
        if (subject != null && !subject.equals("") && !subject.equals("null")) {
            para.put("subject", subject);
        }
        if (total_fee != null && !total_fee.equals("") && !total_fee.equals("null")) {
            para.put("total_fee", total_fee);
        }
        if (trade_information != null && !trade_information.equals("") && !trade_information.equals("null")) {
            para.put("trade_information", trade_information);
        }
        if (trans_currency != null && !trans_currency.equals("") && !trans_currency.equals("null")) {
            para.put("trans_currency", trans_currency);
        }

        return para;
    }
}
