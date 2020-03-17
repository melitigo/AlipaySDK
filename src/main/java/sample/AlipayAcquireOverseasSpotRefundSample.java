package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.AlipayAcquireOverseasSpotRefundRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class AlipayAcquireOverseasSpotRefundSample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021966388155",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        AlipayAcquireOverseasSpotRefundRequest alipayRequest = new AlipayAcquireOverseasSpotRefundRequest();

        
        alipayRequest.setPartnerTransId("TRADE_" + System.nanoTime());
        alipayRequest.setCurrency("USD");
        alipayRequest.setRefundReason("买家主动要求退款");

        
        AlipayResponse execute = alipayClient.execute(alipayRequest);
        if (execute.isSuccess()) {
            System.out.println("调用成功");
            System.out.println(execute.getResponse());
        } else {
            System.out.println("调用失败");
            System.out.println(execute.getError());
        }
    }
}
