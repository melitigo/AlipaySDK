package com.alipay.global.api.request;


import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public abstract class AlipayRequest {
    public abstract String getService();

    public abstract void setPartner(String partner);

    public abstract String getPartner();

    public abstract void setInputCharset(String _input_charset);

    public abstract String getInputCharset();

    public abstract void setSignType(String sign_type);

    public abstract void setSign(String sign);

    protected Map<String, String> other_param;

    public String getOtherParam(String key) {
        return other_param == null ? null : other_param.get(key);
    }

    public void setOtherParam(String key, String value) {
        if (other_param == null) {
            other_param = new HashMap<>();
        }
        other_param.put(key, value);
    }

    public abstract Map<String, String> parameters();
}
