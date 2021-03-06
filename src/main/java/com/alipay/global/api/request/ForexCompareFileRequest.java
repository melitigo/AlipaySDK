package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class ForexCompareFileRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: forex_compare_file
     * forex_compare_file
     */
    private String service = "forex_compare_file";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 2088021017666931
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
     * 字段描述：
     * Description: 格式：YYYYMMDD
     * Example: 
     * 
     */
    private String start_date;


    /**
     * 字段描述：
     * Description: 格式：YYYYMMDD
     * Example: 
     * 
     */
    private String end_date;

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
    public void setStartDate(String start_date) {
        if (start_date != null) {
            this.start_date = start_date.trim();
        }
    }
    public void setEndDate(String end_date) {
        if (end_date != null) {
            this.end_date = end_date.trim();
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

    public String getStartDate() {
        return start_date;
    }

    public String getEndDate() {
        return end_date;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (end_date != null && !end_date.equals("") && !end_date.equals("null")) {
            para.put("end_date", end_date);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
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
        if (start_date != null && !start_date.equals("") && !start_date.equals("null")) {
            para.put("start_date", start_date);
        }

        return para;
    }
}
