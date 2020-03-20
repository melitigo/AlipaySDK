package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayOverseasSecmerchantMaintainQueryStatusOfflineRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: alipay.overseas.secmerchant.maintain.queryStatus
     * alipay.overseas.secmerchant.maintain.queryStatus
     */
    private String service = "alipay.overseas.secmerchant.maintain.queryStatus";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 2088021966388155
     * 
     */
    private String partner;


    /**
     * 字段描述：字符集，推荐UTF-8
     * Description: Charset of this request, it's recommended to use UTF-8
     * Example: UTF-8
     * UTF-8 GBK gbk utf-8
     */
    private String _input_charset;


    /**
     * 字段描述：签名算法
     * Description: Signature algorithm
     * Example: MD5
     * RSA RSA2 MD5
     */
    private String sign_type;


    /**
     * 字段描述：签名值
     * Description: Signature value
     * Example: e5815a4556db338ed237f7d3fd222184
     * 
     */
    private String sign;


    /**
     * 字段描述：服务商发送请求的时间戳
     * Description: 
     * Example: #now{yyyy-MM-dd HH:mm:ss}#
     * 
     */
    private String timestamp;


    /**
     * 字段描述：
     * Description: 
     * Example: MID_#auto#
     * 
     */
    private String secondary_merchant_id;


    /**
     * 字段描述：
     * Description: 
     * Example: SID_#auto#
     * 
     */
    private String store_id;


    /**
     * 字段描述：
     * Description: 
     * Example: INSTORE_PAYMENT
     * INSTORE_PAYMENT
     */
    private String payment_method;

    public void setService(String service) {
        if (service != null) {
            this.service = service.trim();
        }
    }
    public void setPartner(String partner) {
        if (partner != null) {
            this.partner = partner.trim();
        }
    }
    public void setInputCharset(String _input_charset) {
        if (_input_charset != null) {
            this._input_charset = _input_charset.trim();
        }
    }
    public void setSignType(String sign_type) {
        if (sign_type != null) {
            this.sign_type = sign_type.trim();
        }
    }
    public void setSign(String sign) {
        if (sign != null) {
            this.sign = sign.trim();
        }
    }
    public void setTimestamp(String timestamp) {
        if (timestamp != null) {
            this.timestamp = timestamp.trim();
        }
    }
    public void setSecondaryMerchantId(String secondary_merchant_id) {
        if (secondary_merchant_id != null) {
            this.secondary_merchant_id = secondary_merchant_id.trim();
        }
    }
    public void setStoreId(String store_id) {
        if (store_id != null) {
            this.store_id = store_id.trim();
        }
    }
    public void setPaymentMethod(String payment_method) {
        if (payment_method != null) {
            this.payment_method = payment_method.trim();
        }
    }
    public String getService() {
        return service;
    }

    public String getPartner() {
        return partner;
    }

    public String getInputCharset() {
        return _input_charset;
    }

    public String getSignType() {
        return sign_type;
    }

    public String getSign() {
        return sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getSecondaryMerchantId() {
        return secondary_merchant_id;
    }

    public String getStoreId() {
        return store_id;
    }

    public String getPaymentMethod() {
        return payment_method;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (payment_method != null && !payment_method.equals("") && !payment_method.equals("null")) {
            para.put("payment_method", payment_method);
        }
        if (secondary_merchant_id != null && !secondary_merchant_id.equals("") && !secondary_merchant_id.equals("null")) {
            para.put("secondary_merchant_id", secondary_merchant_id);
        }
        if (service != null && !service.equals("") && !service.equals("null")) {
            para.put("service", service);
        }
        if (sign != null && !sign.equals("") && !sign.equals("null")) {
            para.put("sign", sign);
        }
        if (sign_type != null && !sign_type.equals("") && !sign_type.equals("null")) {
            para.put("sign_type", sign_type);
        }
        if (store_id != null && !store_id.equals("") && !store_id.equals("null")) {
            para.put("store_id", store_id);
        }
        if (timestamp != null && !timestamp.equals("") && !timestamp.equals("null")) {
            para.put("timestamp", timestamp);
        }

        return para;
    }
}
