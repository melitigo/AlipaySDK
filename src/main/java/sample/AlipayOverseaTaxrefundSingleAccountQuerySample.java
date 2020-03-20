package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.AlipayOverseaTaxrefundSingleAccountQueryRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class AlipayOverseaTaxrefundSingleAccountQuerySample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        AlipayOverseaTaxrefundSingleAccountQueryRequest alipayRequest = new AlipayOverseaTaxrefundSingleAccountQueryRequest();

        
        alipayRequest.setTimestamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        alipayRequest.setOutOrderNo("ORDER_" + System.nanoTime());

        
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
