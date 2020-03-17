package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayDutCustomerAgreementPageSignRequest extends AlipayRequest {

    /**
     * 字段描述：服务名
     * Description: service name
     * Example: alipay.dut.customer.agreement.page.sign
     * alipay.dut.customer.agreement.page.sign
     */
    private String service = "alipay.dut.customer.agreement.page.sign";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 
     * 
     */
    private String partner;


    /**
     * 字段描述：字符集，推荐UTF-8
     * Description: 
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
     * 字段描述：
     * Description: 同步跳转地址
     * Example: 
     * 
     */
    private String return_url;


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
    private String access_info;


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
    private String sign_validity_period;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String external_sign_no;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String agreement_detail;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String prod_properties;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String external_user_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String zm_auth_info;


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
    private String sales_product_code;

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
    public void setReturnUrl(String return_url) {
        if (return_url != null) {
            this.return_url = return_url.trim();
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
    public void setAccessInfo(String access_info) {
        if (access_info != null) {
            this.access_info = access_info.trim();
        }
    }
    public void setScene(String scene) {
        if (scene != null) {
            this.scene = scene.trim();
        }
    }
    public void setSignValidityPeriod(String sign_validity_period) {
        if (sign_validity_period != null) {
            this.sign_validity_period = sign_validity_period.trim();
        }
    }
    public void setExternalSignNo(String external_sign_no) {
        if (external_sign_no != null) {
            this.external_sign_no = external_sign_no.trim();
        }
    }
    public void setAgreementDetail(String agreement_detail) {
        if (agreement_detail != null) {
            this.agreement_detail = agreement_detail.trim();
        }
    }
    public void setProdProperties(String prod_properties) {
        if (prod_properties != null) {
            this.prod_properties = prod_properties.trim();
        }
    }
    public void setExternalUserId(String external_user_id) {
        if (external_user_id != null) {
            this.external_user_id = external_user_id.trim();
        }
    }
    public void setZmAuthInfo(String zm_auth_info) {
        if (zm_auth_info != null) {
            this.zm_auth_info = zm_auth_info.trim();
        }
    }
    public void setThirdPartyType(String third_party_type) {
        if (third_party_type != null) {
            this.third_party_type = third_party_type.trim();
        }
    }
    public void setSalesProductCode(String sales_product_code) {
        if (sales_product_code != null) {
            this.sales_product_code = sales_product_code.trim();
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

    public String getReturnUrl() {
        return return_url;
    }

    public String getNotifyUrl() {
        return notify_url;
    }

    public String getProductCode() {
        return product_code;
    }

    public String getAccessInfo() {
        return access_info;
    }

    public String getScene() {
        return scene;
    }

    public String getSignValidityPeriod() {
        return sign_validity_period;
    }

    public String getExternalSignNo() {
        return external_sign_no;
    }

    public String getAgreementDetail() {
        return agreement_detail;
    }

    public String getProdProperties() {
        return prod_properties;
    }

    public String getExternalUserId() {
        return external_user_id;
    }

    public String getZmAuthInfo() {
        return zm_auth_info;
    }

    public String getThirdPartyType() {
        return third_party_type;
    }

    public String getSalesProductCode() {
        return sales_product_code;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (access_info != null && !access_info.equals("") && !access_info.equals("null")) {
            para.put("access_info", access_info);
        }
        if (agreement_detail != null && !agreement_detail.equals("") && !agreement_detail.equals("null")) {
            para.put("agreement_detail", agreement_detail);
        }
        if (external_sign_no != null && !external_sign_no.equals("") && !external_sign_no.equals("null")) {
            para.put("external_sign_no", external_sign_no);
        }
        if (external_user_id != null && !external_user_id.equals("") && !external_user_id.equals("null")) {
            para.put("external_user_id", external_user_id);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (prod_properties != null && !prod_properties.equals("") && !prod_properties.equals("null")) {
            para.put("prod_properties", prod_properties);
        }
        if (product_code != null && !product_code.equals("") && !product_code.equals("null")) {
            para.put("product_code", product_code);
        }
        if (return_url != null && !return_url.equals("") && !return_url.equals("null")) {
            para.put("return_url", return_url);
        }
        if (sales_product_code != null && !sales_product_code.equals("") && !sales_product_code.equals("null")) {
            para.put("sales_product_code", sales_product_code);
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
        if (sign_validity_period != null && !sign_validity_period.equals("") && !sign_validity_period.equals("null")) {
            para.put("sign_validity_period", sign_validity_period);
        }
        if (third_party_type != null && !third_party_type.equals("") && !third_party_type.equals("null")) {
            para.put("third_party_type", third_party_type);
        }
        if (zm_auth_info != null && !zm_auth_info.equals("") && !zm_auth_info.equals("null")) {
            para.put("zm_auth_info", zm_auth_info);
        }

        return para;
    }
}
