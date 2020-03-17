package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.AlipayCommerceQrcodeModifyRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class AlipayCommerceQrcodeModifySample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021966388155",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        AlipayCommerceQrcodeModifyRequest alipayRequest = new AlipayCommerceQrcodeModifyRequest();

        
        alipayRequest.setTimestamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        alipayRequest.setBizType("OVERSEASHOPQRCODE");
        alipayRequest.setBizData("{\"store_id\":\"SID_" + System.nanoTime() + "\",\"secondary_merchant_industry\":\"5311\",\"address\":\"3 Old Concord Rd, Burlington, MA 01803美国\",\"is_show_memo\":\"true\",\"secondary_merchant_id\":\"MID_" + System.nanoTime() + "\",\"country_code\":\"US\",\"trans_currency\":\"USD\",\"notify_sign_type\":\"MD5\",\"notify_charset\":\"UTF-8\",\"secondary_merchant_name\":\"Mika's coffee shop\",\"store_name\":\"Mika's coffee shop\",\"currency\":\"USD\"}");

        
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
