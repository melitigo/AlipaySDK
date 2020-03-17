package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.AlipayAcquirePrecreateRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class AlipayAcquirePrecreateSample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021966388155",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        AlipayAcquirePrecreateRequest alipayRequest = new AlipayAcquirePrecreateRequest();

        
        alipayRequest.setTimestamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        alipayRequest.setOutTradeNo("TRADE_" + System.nanoTime());
        alipayRequest.setSubject("Mika's coffee shop");
        alipayRequest.setProductCode("OVERSEAS_MBARCODE_PAY");
        alipayRequest.setTotalFee("0.01");
        alipayRequest.setSellerId("2088021966388155");
        alipayRequest.setCurrency("USD");
        alipayRequest.setTransCurrency("USD");
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
