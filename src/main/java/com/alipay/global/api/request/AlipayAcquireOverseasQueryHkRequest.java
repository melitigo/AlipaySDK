package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayAcquireOverseasQueryHkRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: alipay.acquire.overseas.query
     * alipay.acquire.overseas.query
     */
    private String service = "alipay.acquire.overseas.query";


    /**
     * 字段描述：签名值
     * Description: Signature value
     * Example: e5815a4556db338ed237f7d3fd222184
     * 
     */
    private String sign;


    /**
     * 字段描述：签名算法
     * Description: Signature algorithm
     * Example: MD5
     * RSA RSA2 MD5
     */
    private String sign_type;


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 2088021966645500
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
     * 字段描述：外部交易号
     * Description: Merchant transaction number
     * Example: TRADE_#auto#
     * 
     */
    private String partner_trans_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String alipay_trans_id;

    public void setService(String service) {
        if (service != null) {
            this.service = service.trim();
        }
    }
    public void setSign(String sign) {
        if (sign != null) {
            this.sign = sign.trim();
        }
    }
    public void setSignType(String sign_type) {
        if (sign_type != null) {
            this.sign_type = sign_type.trim();
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
    public void setPartnerTransId(String partner_trans_id) {
        if (partner_trans_id != null) {
            this.partner_trans_id = partner_trans_id.trim();
        }
    }
    public void setAlipayTransId(String alipay_trans_id) {
        if (alipay_trans_id != null) {
            this.alipay_trans_id = alipay_trans_id.trim();
        }
    }
    public String getService() {
        return service;
    }

    public String getSign() {
        return sign;
    }

    public String getSignType() {
        return sign_type;
    }

    public String getPartner() {
        return partner;
    }

    public String getInputCharset() {
        return _input_charset;
    }

    public String getPartnerTransId() {
        return partner_trans_id;
    }

    public String getAlipayTransId() {
        return alipay_trans_id;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (alipay_trans_id != null && !alipay_trans_id.equals("") && !alipay_trans_id.equals("null")) {
            para.put("alipay_trans_id", alipay_trans_id);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (partner_trans_id != null && !partner_trans_id.equals("") && !partner_trans_id.equals("null")) {
            para.put("partner_trans_id", partner_trans_id);
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

        return para;
    }
}
