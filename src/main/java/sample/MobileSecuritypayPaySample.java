package sample;

import com.alipay.global.api.AlipayClient;
import com.alipay.global.api.DefaultAlipayClient;
import com.alipay.global.api.exception.AlipayApiException;
import com.alipay.global.api.request.MobileSecuritypayPayRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

import com.alipay.global.api.response.AlipayResponse;
import java.util.Date;

public class MobileSecuritypayPaySample {
    public static void main(String[] args) throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://globalmapi.alipay.com/gateway.do",
                "2088021017666931",
                "RSA",
                "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCDl24yGjlPXnxlWgHGMfzTACPAidbJCIsEPtw2Eip9v3LZ34jJw7Aazuo/UCbmGwUJd1vzm+Y3gf9FJXnuVYzpxoOgtar3yI3J6fKeHrNsWb0geob8Ucmrtz/V9dQvTh67t0SiRfaSU2Ol9GfjCTrWLG21FWS2ulSjx629BFLcFcNsZzKkGm/F265sP5bP66YaktA5D4pJbOvgAZ9lI2FE/vpVuEmyeAfw5n5VAYvfHnvTIyi1LpumL+Lpy6jr2sOZNP/nZDJfPwhKIo3hlEVxQgFgQtH+XHr90A0oE5DPctmv8Ws/qJFsqhQl3cjoekDlbuQ+IXkuvtbTtwNi9sIfAgMBAAECggEAH5DuzTP/NWvb+VALBuks1cy9xs0J6fWTq3QMzSe0a6/GND9sB8Jad0PVa1Sl0CMBJVEtjJWENyKHAqZHxoVdJSMKpj2OApxobtwg6A9DSSWJucXKpbJU500xEflDagmaU7tVyntv94/rYn7rgMnRBFlqA7tbCn5OGW+n3KSx37s8hIgcks0CEqosJs+9pg2k3UDEulxMV5W7reVHcZsJntq+XvtIOl1uM2UB+3WGIAYAt1HsWtvsMb9oAK25i194r8H9bTfy7UXZh+1D6SH2CdyFFJtRK4suFrOqmZpezTVR5HuBRRGJvgcNzgyIKSLyQumKGT+ZcBdlt3JWcXAfyQKBgQDD3S7spaOKI3Is4y1dZTcnE9QaayYTyAFdVRk5nJV0EY2PxR4/GmmOqriUU9hkpgoMMpx1w4YHhUuG+AOshpDTsAQyHxYNgcYOVKUFOYsRWmdk0S5ocG5FvzBogaIzx54wQRP4i27gzgTq9XzjV1FixOx9yj2kT6NxTn2aHbXZswKBgQCr/nYmlWxphgJI9xqFiAcW+Tw6KH/I79L4zSr6JfvfQ346YpbD0Dm29emQb2lA7Sl2fl5Jm0zZqpRPspJC89JtorPi+xKPBD+P+GiUOlEYJh6EPrIX7Nw4X4FAnQwm7QZ9NYXUAe98rlR12iZFZ0q3LZawmNOu1lUoq3lxBnxn5QKBgHRfh9DtfaTG+MC43ixexg0+18g2n7IjJMRqmolDgv0qrLyedyExNUSiJPdkde8fRFsI+zNxT8JKLZzs4Wnxrj1ImMWa+MRfteiv3Dilfv55g3NAYl2FZ8+jEEUXuOMhGNk84XvMhL2nSv67i0+cguu3a3g14Lgu5UKeSzx1qKXHAoGBAKunH0XstTEvpJIrw9Vm6CR+hCRLDRV+fKEBKpZTWGf/lTgx8uPkqeU20m7rMjGxQENZZUKy8uT+AFz2DFEzxFzVGBE9oM0JYWKPedgNx6eBS82SQO3t3++HKZlR47HptyM5SqJHeDuIRRUFrlJv/zqIDi+bpxCEKqOXV3F9FqYdAoGBAJfTD8iMeavEdPAsU2rZXv/cDk9gWv22F/e1x9yGBQlfNL19+XVRNgU7MTjPZ06v8QnsKhqUWUzf/biKh79xDU17Pk+atle2XH0SryKY3Uuk7IoNQe1F3n7s+DEhiT94/SN+Rz0sV1Gf/o0zd56w5NsUEaUApUgnUls+7/McE2uL",
                "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCDl24yGjlPXnxlWgHGMfzTACPAidbJCIsEPtw2Eip9v3LZ34jJw7Aazuo/UCbmGwUJd1vzm+Y3gf9FJXnuVYzpxoOgtar3yI3J6fKeHrNsWb0geob8Ucmrtz/V9dQvTh67t0SiRfaSU2Ol9GfjCTrWLG21FWS2ulSjx629BFLcFcNsZzKkGm/F265sP5bP66YaktA5D4pJbOvgAZ9lI2FE/vpVuEmyeAfw5n5VAYvfHnvTIyi1LpumL+Lpy6jr2sOZNP/nZDJfPwhKIo3hlEVxQgFgQtH+XHr90A0oE5DPctmv8Ws/qJFsqhQl3cjoekDlbuQ+IXkuvtbTtwNi9sIfAgMBAAECggEAH5DuzTP/NWvb+VALBuks1cy9xs0J6fWTq3QMzSe0a6/GND9sB8Jad0PVa1Sl0CMBJVEtjJWENyKHAqZHxoVdJSMKpj2OApxobtwg6A9DSSWJucXKpbJU500xEflDagmaU7tVyntv94/rYn7rgMnRBFlqA7tbCn5OGW+n3KSx37s8hIgcks0CEqosJs+9pg2k3UDEulxMV5W7reVHcZsJntq+XvtIOl1uM2UB+3WGIAYAt1HsWtvsMb9oAK25i194r8H9bTfy7UXZh+1D6SH2CdyFFJtRK4suFrOqmZpezTVR5HuBRRGJvgcNzgyIKSLyQumKGT+ZcBdlt3JWcXAfyQKBgQDD3S7spaOKI3Is4y1dZTcnE9QaayYTyAFdVRk5nJV0EY2PxR4/GmmOqriUU9hkpgoMMpx1w4YHhUuG+AOshpDTsAQyHxYNgcYOVKUFOYsRWmdk0S5ocG5FvzBogaIzx54wQRP4i27gzgTq9XzjV1FixOx9yj2kT6NxTn2aHbXZswKBgQCr/nYmlWxphgJI9xqFiAcW+Tw6KH/I79L4zSr6JfvfQ346YpbD0Dm29emQb2lA7Sl2fl5Jm0zZqpRPspJC89JtorPi+xKPBD+P+GiUOlEYJh6EPrIX7Nw4X4FAnQwm7QZ9NYXUAe98rlR12iZFZ0q3LZawmNOu1lUoq3lxBnxn5QKBgHRfh9DtfaTG+MC43ixexg0+18g2n7IjJMRqmolDgv0qrLyedyExNUSiJPdkde8fRFsI+zNxT8JKLZzs4Wnxrj1ImMWa+MRfteiv3Dilfv55g3NAYl2FZ8+jEEUXuOMhGNk84XvMhL2nSv67i0+cguu3a3g14Lgu5UKeSzx1qKXHAoGBAKunH0XstTEvpJIrw9Vm6CR+hCRLDRV+fKEBKpZTWGf/lTgx8uPkqeU20m7rMjGxQENZZUKy8uT+AFz2DFEzxFzVGBE9oM0JYWKPedgNx6eBS82SQO3t3++HKZlR47HptyM5SqJHeDuIRRUFrlJv/zqIDi+bpxCEKqOXV3F9FqYdAoGBAJfTD8iMeavEdPAsU2rZXv/cDk9gWv22F/e1x9yGBQlfNL19+XVRNgU7MTjPZ06v8QnsKhqUWUzf/biKh79xDU17Pk+atle2XH0SryKY3Uuk7IoNQe1F3n7s+DEhiT94/SN+Rz0sV1Gf/o0zd56w5NsUEaUApUgnUls+7/McE2uL");
        MobileSecuritypayPayRequest alipayRequest = new MobileSecuritypayPayRequest();

        alipayRequest.setenv("system=android^version=3.0.1.2");

        alipayRequest.setOutTradeNo("TRADE_" + System.nanoTime());

        alipayRequest.setSubject("Mika's coffee shop");

        alipayRequest.setPaymentType("1");

        alipayRequest.setSellerId("2088021017666931");

        alipayRequest.setTotalFee("0.01");

        alipayRequest.setBody("test");

        alipayRequest.setCurrency("USD");

        alipayRequest.setForexBiz("FP");

        alipayRequest.setProductCode("NEW_WAP_OVERSEAS_SELLER");

        alipayRequest.setTradeInformation("{\"goods_info\":\"Macbook 12 inch M3 8G 256G SSD^1|Apple iPad Pro 11 inch^1\",\"business_type\":\"4\",\"total_quantity\":\"2\"}");


        
        String orderInfo = alipayClient.orderInfo(alipayRequest);
        System.out.println(orderInfo);

    }
}