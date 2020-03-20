package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.RefundFastpayByPlatformPwdRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class RefundFastpayByPlatformPwdSample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088102135220161",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        RefundFastpayByPlatformPwdRequest alipayRequest = new RefundFastpayByPlatformPwdRequest();

        
        alipayRequest.setRefundDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        alipayRequest.setBatchNo(System.nanoTime() + "REFUND");

        
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
