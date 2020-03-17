package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.MobileSecuritypayPayHkRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class MobileSecuritypayPayHkSample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021966645500",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        MobileSecuritypayPayHkRequest alipayRequest = new MobileSecuritypayPayHkRequest();

        
        alipayRequest.setPaymentInst("ALIPAYHK");
        alipayRequest.setenv("system=android^version=3.0.1.2");
        alipayRequest.setOutTradeNo("TRADE_" + System.nanoTime());
        alipayRequest.setSubject("Mika's coffee shop");
        alipayRequest.setPaymentType("1");
        alipayRequest.setSellerId("2088021966645500");
        alipayRequest.setTotalFee("0.01");
        alipayRequest.setCurrency("HKD");
        alipayRequest.setForexBiz("FP");
        alipayRequest.setProductCode("NEW_WAP_OVERSEAS_SELLER");
        alipayRequest.setTradeInformation("{\"goods_info\":\"Macbook 12 inch M3 8G 256G SSD^1|Apple iPad Pro 11 inch^1\",\"business_type\":\"4\",\"total_quantity\":\"2\"}");

        
        String orderInfo = alipayClient.orderInfo(alipayRequest);
        System.out.println(orderInfo);
    }
}
