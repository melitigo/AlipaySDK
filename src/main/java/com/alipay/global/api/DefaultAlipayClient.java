package com.alipay.global.api;

import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.net.AlipayCharset;
import com.alipay.global.api.net.DefaultHttpRPC;
import com.alipay.global.api.net.HttpRpcResult;
import com.alipay.global.api.request.AlipayRequest;

import java.io.IOException;
import java.util.Map;

public class DefaultAlipayClient extends BaseAlipayClient {

    public DefaultAlipayClient(String gatewayUrl, String partner, String sign_type, String merchantPrivateKey, String alipayPublicKey) {
        super(gatewayUrl, partner, sign_type, merchantPrivateKey, alipayPublicKey);
    }

    public DefaultAlipayClient(String gatewayUrl, String partner, String sign_type, AlipayCharset inputCharset, String merchantPrivateKey, String alipayPublicKey) {
        super(gatewayUrl, partner, sign_type, inputCharset, merchantPrivateKey, alipayPublicKey);
    }

    public HttpRpcResult sendRequest(String requestUrl, String httpMethod, Map<String, String> header, String reqBody) throws AlipayApiException {
        HttpRpcResult httpRpcResult;
        try {
            httpRpcResult = DefaultHttpRPC.doPost(requestUrl, header, reqBody);
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }
        return httpRpcResult;
    }
}
