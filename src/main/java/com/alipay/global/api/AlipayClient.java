package com.alipay.global.api;

import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.AlipayRequest;
import com.alipay.global.api.response.AlipayResponse;

import java.util.Map;

public interface AlipayClient {

    AlipayResponse execute(AlipayRequest alipayRequest) throws AlipayApiException;

    void initialize(AlipayRequest alipayRequest) throws AlipayApiException;

    String link(AlipayRequest alipayRequest) throws AlipayApiException;

    String orderInfo(AlipayRequest alipayRequest) throws AlipayApiException;

    String form(AlipayRequest alipayRequest) throws AlipayApiException;

    boolean verify(Map<String, String> alipayNotification) throws AlipayApiException;
}
