package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.CreateForexTradeWapHkRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class CreateForexTradeWapHkSample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021966645500",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        CreateForexTradeWapHkRequest alipayRequest = new CreateForexTradeWapHkRequest();

        
        alipayRequest.setPaymentInst("ALIPAYHK");
        alipayRequest.setSubject("Mika's coffee shop");
        alipayRequest.setOutTradeNo("TRADE_" + System.nanoTime());
        alipayRequest.setCurrency("HKD");
        alipayRequest.setTotalFee("0.01");
        alipayRequest.setTimeoutRule("12h");
        alipayRequest.setProductCode("NEW_WAP_OVERSEAS_SELLER");
        alipayRequest.setTradeInformation("{\"goods_info\":\"Macbook 12 inch M3 8G 256G SSD^1|Apple iPad Pro 11 inch^1\",\"business_type\":\"4\",\"total_quantity\":\"2\"}");

        
        String link = alipayClient.link(alipayRequest);
        System.out.println(link);
    }
}
