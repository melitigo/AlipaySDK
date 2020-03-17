package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.ForexRefundRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class ForexRefundSample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021017666931",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        ForexRefundRequest alipayRequest = new ForexRefundRequest();

        
        alipayRequest.setOutReturnNo("REFUND_" + System.nanoTime());
        alipayRequest.setOutTradeNo("TRADE_" + System.nanoTime());
        alipayRequest.setReturnAmount("0.01");
        alipayRequest.setCurrency("USD");
        alipayRequest.setGmtReturn("2020-01-14 15:45:57");
        alipayRequest.setReason("买家主动要求退款");
        alipayRequest.setProductCode("NEW_OVERSEAS_SELLER");

        
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
