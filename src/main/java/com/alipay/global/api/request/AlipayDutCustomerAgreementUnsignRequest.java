package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayDutCustomerAgreementUnsignRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: 
     * 
     */
    private String service = "";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 
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
     * 字段描述：异步通知地址
     * Description: 异步通知地址
     * Example: 
     * 
     */
    private String notify_url;


    /**
     * 字段描述：产品代码
     * Description: 
     * Example: GENERAL_WITHHOLDING_P
     * GENERAL_WITHHOLDING_P
     */
    private String product_code;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String alipay_user_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String alipay_logon_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String third_party_type;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String scene;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String app_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String external_sign_no;

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
    public void setNotifyUrl(String notify_url) {
        if (notify_url != null) {
            this.notify_url = notify_url.trim();
        }
    }
    public void setProductCode(String product_code) {
        if (product_code != null) {
            this.product_code = product_code.trim();
        }
    }
    public void setAlipayUserId(String alipay_user_id) {
        if (alipay_user_id != null) {
            this.alipay_user_id = alipay_user_id.trim();
        }
    }
    public void setAlipayLogonId(String alipay_logon_id) {
        if (alipay_logon_id != null) {
            this.alipay_logon_id = alipay_logon_id.trim();
        }
    }
    public void setThirdPartyType(String third_party_type) {
        if (third_party_type != null) {
            this.third_party_type = third_party_type.trim();
        }
    }
    public void setScene(String scene) {
        if (scene != null) {
            this.scene = scene.trim();
        }
    }
    public void setId(String app_id) {
        if (app_id != null) {
            this.app_id = app_id.trim();
        }
    }
    public void setExternalSignNo(String external_sign_no) {
        if (external_sign_no != null) {
            this.external_sign_no = external_sign_no.trim();
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

    public String getNotifyUrl() {
        return notify_url;
    }

    public String getProductCode() {
        return product_code;
    }

    public String getAlipayUserId() {
        return alipay_user_id;
    }

    public String getAlipayLogonId() {
        return alipay_logon_id;
    }

    public String getThirdPartyType() {
        return third_party_type;
    }

    public String getScene() {
        return scene;
    }

    public String getId() {
        return app_id;
    }

    public String getExternalSignNo() {
        return external_sign_no;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (alipay_logon_id != null && !alipay_logon_id.equals("") && !alipay_logon_id.equals("null")) {
            para.put("alipay_logon_id", alipay_logon_id);
        }
        if (alipay_user_id != null && !alipay_user_id.equals("") && !alipay_user_id.equals("null")) {
            para.put("alipay_user_id", alipay_user_id);
        }
        if (app_id != null && !app_id.equals("") && !app_id.equals("null")) {
            para.put("app_id", app_id);
        }
        if (external_sign_no != null && !external_sign_no.equals("") && !external_sign_no.equals("null")) {
            para.put("external_sign_no", external_sign_no);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (product_code != null && !product_code.equals("") && !product_code.equals("null")) {
            para.put("product_code", product_code);
        }
        if (scene != null && !scene.equals("") && !scene.equals("null")) {
            para.put("scene", scene);
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
        if (third_party_type != null && !third_party_type.equals("") && !third_party_type.equals("null")) {
            para.put("third_party_type", third_party_type);
        }

        return para;
    }
}
