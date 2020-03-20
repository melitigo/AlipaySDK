package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class RefundFastpayByPlatformPwdRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: refund_fastpay_by_platform_pwd
     * refund_fastpay_by_platform_pwd
     */
    private String service = "refund_fastpay_by_platform_pwd";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 2088102135220161
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
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String seller_email;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String seller_user_id;


    /**
     * 字段描述：
     * Description: 
     * Example: #now#
     * 
     */
    private String refund_date;


    /**
     * 字段描述：
     * Description: 
     * Example: #auto#REFUND
     * 
     */
    private String batch_no;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String batch_num;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String detail_data;

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
    public void setSellerEmail(String seller_email) {
        if (seller_email != null) {
            this.seller_email = seller_email.trim();
        }
    }
    public void setSellerUserId(String seller_user_id) {
        if (seller_user_id != null) {
            this.seller_user_id = seller_user_id.trim();
        }
    }
    public void setRefundDate(String refund_date) {
        if (refund_date != null) {
            this.refund_date = refund_date.trim();
        }
    }
    public void setBatchNo(String batch_no) {
        if (batch_no != null) {
            this.batch_no = batch_no.trim();
        }
    }
    public void setBatchNum(String batch_num) {
        if (batch_num != null) {
            this.batch_num = batch_num.trim();
        }
    }
    public void setDetailData(String detail_data) {
        if (detail_data != null) {
            this.detail_data = detail_data.trim();
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

    public String getSellerEmail() {
        return seller_email;
    }

    public String getSellerUserId() {
        return seller_user_id;
    }

    public String getRefundDate() {
        return refund_date;
    }

    public String getBatchNo() {
        return batch_no;
    }

    public String getBatchNum() {
        return batch_num;
    }

    public String getDetailData() {
        return detail_data;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (batch_no != null && !batch_no.equals("") && !batch_no.equals("null")) {
            para.put("batch_no", batch_no);
        }
        if (batch_num != null && !batch_num.equals("") && !batch_num.equals("null")) {
            para.put("batch_num", batch_num);
        }
        if (detail_data != null && !detail_data.equals("") && !detail_data.equals("null")) {
            para.put("detail_data", detail_data);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (refund_date != null && !refund_date.equals("") && !refund_date.equals("null")) {
            para.put("refund_date", refund_date);
        }
        if (seller_email != null && !seller_email.equals("") && !seller_email.equals("null")) {
            para.put("seller_email", seller_email);
        }
        if (seller_user_id != null && !seller_user_id.equals("") && !seller_user_id.equals("null")) {
            para.put("seller_user_id", seller_user_id);
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
