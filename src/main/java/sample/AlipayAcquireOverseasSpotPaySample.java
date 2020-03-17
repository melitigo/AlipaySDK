package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.AlipayAcquireOverseasSpotPayRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class AlipayAcquireOverseasSpotPaySample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021966388155",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        AlipayAcquireOverseasSpotPayRequest alipayRequest = new AlipayAcquireOverseasSpotPayRequest();

        
        alipayRequest.setAlipaySellerId("2088021966388155");
        alipayRequest.setTransName("Mika's coffee shop");
        alipayRequest.setPartnerTransId("TRADE_" + System.nanoTime());
        alipayRequest.setCurrency("USD");
        alipayRequest.setTransAmount("0.01");
        alipayRequest.setIdentityCodeType("barcode");
        alipayRequest.setTransCreateTime(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        alipayRequest.setBizProduct("OVERSEAS_MBARCODE_PAY");
        alipayRequest.setTradeInformation("{\"goods_info\":\"Macbook 12 inch M3 8G 256G SSD^1|Apple iPad Pro 11 inch^1\",\"business_type\":\"4\",\"total_quantity\":\"2\"}");

        
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
