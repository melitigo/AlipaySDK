package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.AlipayOverseasSecmerchantOnlineMaintainRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class AlipayOverseasSecmerchantOnlineMaintainSample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021017666931",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        AlipayOverseasSecmerchantOnlineMaintainRequest alipayRequest = new AlipayOverseasSecmerchantOnlineMaintainRequest();

        
        alipayRequest.setSecondaryMerchantName("Mika's coffee shop");
        alipayRequest.setSecondaryMerchantId("MID_" + System.nanoTime());
        alipayRequest.setSecondaryMerchantIndustry("5499");
        alipayRequest.setRegisterCountry("US");
        alipayRequest.setRegisterAddress("3 Old Concord Rd, Burlington, MA 01803美国");
        alipayRequest.setSiteInfos("[{\"site_name\":\"mikascoffee\",\"site_type\":\"WEB\",\"site_url\":\"https://www.mikascoffee.com\"}]");
        alipayRequest.setSecondaryMerchantType("INDIVIDUAL");
        alipayRequest.setShareholderName("mika");
        alipayRequest.setShareholderId("3428000000000000");
        alipayRequest.setContactNo("18688888888");

        
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
