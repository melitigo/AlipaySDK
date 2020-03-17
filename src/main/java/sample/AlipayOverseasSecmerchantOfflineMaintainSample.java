package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.AlipayOverseasSecmerchantOfflineMaintainRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class AlipayOverseasSecmerchantOfflineMaintainSample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021966388155",
                "MD5",
                "your private key in single line",
                "alipay public key in single line");
        AlipayOverseasSecmerchantOfflineMaintainRequest alipayRequest = new AlipayOverseasSecmerchantOfflineMaintainRequest();

        
        alipayRequest.setTimestamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        alipayRequest.setSecondaryMerchantName("Mika's coffee shop");
        alipayRequest.setSecondaryMerchantId("MID_" + System.nanoTime());
        alipayRequest.setStoreId("SID_" + System.nanoTime());
        alipayRequest.setStoreName("Mika's coffee shop");
        alipayRequest.setStoreCountry("US");
        alipayRequest.setStoreAddress("3 Old Concord Rd, Burlington, MA 01803美国");
        alipayRequest.setStoreIndustry("5499");
        alipayRequest.setInternalStorePhoto("https://www.mikascoffee/img_321323.jpg");
        alipayRequest.setExternalStorefrontPhoto("https://www.mikascoffee/img_321322.jpg");
        alipayRequest.setSecondaryMerchantType("INDIVIDUAL");
        alipayRequest.setRegisterCountry("US");
        alipayRequest.setRegisterAddress("3 Old Concord Rd, Burlington, MA 01803美国");
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
