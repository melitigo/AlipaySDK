package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.AlipayOverseasForexOrderPayRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class AlipayOverseasForexOrderPaySample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088101141338400",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        AlipayOverseasForexOrderPayRequest alipayRequest = new AlipayOverseasForexOrderPayRequest();

        
        alipayRequest.setReturnUrl("https://www.google.com");
        alipayRequest.setPartnerTransId("TRADE_" + System.nanoTime());
        alipayRequest.setGoodsTitle("Mika Lines - to Mika's coffee shop");
        alipayRequest.setSellerId("2088101141338400");
        alipayRequest.setTotalFee("520.00");
        alipayRequest.setCurrency("USD");
        alipayRequest.setPricingCurrency("CNY");
        alipayRequest.setServiceType("100");
        alipayRequest.setExtParams("{\"VCN_ORG\":\"UATP\"}");

        
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
