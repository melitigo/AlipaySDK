package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayCommerceQrcodeModifyRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: alipay.commerce.qrcode.modify
     * alipay.commerce.qrcode.modify
     */
    private String service = "alipay.commerce.qrcode.modify";


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
     * 字段描述：异步通知地址
     * Description: 异步通知地址
     * Example: 
     * 
     */
    private String notify_url;


    /**
     * 字段描述：
     * Description: 
     * Example: OVERSEASHOPQRCODE
     * OVERSEASHOPQRCODE
     */
    private String biz_type;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String qrcode;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String biz_data;

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
    public void setNotifyUrl(String notify_url) {
        if (notify_url != null) {
            this.notify_url = notify_url.trim();
        }
    }
    public void setBizType(String biz_type) {
        if (biz_type != null) {
            this.biz_type = biz_type.trim();
        }
    }
    public void setQrcode(String qrcode) {
        if (qrcode != null) {
            this.qrcode = qrcode.trim();
        }
    }
    public void setBizData(String biz_data) {
        if (biz_data != null) {
            this.biz_data = biz_data.trim();
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

    public String getNotifyUrl() {
        return notify_url;
    }

    public String getBizType() {
        return biz_type;
    }

    public String getQrcode() {
        return qrcode;
    }

    public String getBizData() {
        return biz_data;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (biz_data != null && !biz_data.equals("") && !biz_data.equals("null")) {
            para.put("biz_data", biz_data);
        }
        if (biz_type != null && !biz_type.equals("") && !biz_type.equals("null")) {
            para.put("biz_type", biz_type);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (qrcode != null && !qrcode.equals("") && !qrcode.equals("null")) {
            para.put("qrcode", qrcode);
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
        if (timestamp != null && !timestamp.equals("") && !timestamp.equals("null")) {
            para.put("timestamp", timestamp);
        }

        return para;
    }
}
