package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayAcquireCustomsRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: alipay.acquire.customs
     * alipay.acquire.customs
     */
    private String service = "alipay.acquire.customs";


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
     * 字段描述：商户端请求ID
     * Description: ID of the request at merchant side
     * Example: REQUEST_
     * 
     */
    private String out_request_no;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String trade_no;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String merchant_customs_code;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String amount;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String customs_place;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String merchant_customs_name;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String is_split;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String sub_out_biz_no;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String buyer_name;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String buyer_id_no;

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
    public void setOutRequestNo(String out_request_no) {
        if (out_request_no != null) {
            this.out_request_no = out_request_no.trim();
        }
    }
    public void setTradeNo(String trade_no) {
        if (trade_no != null) {
            this.trade_no = trade_no.trim();
        }
    }
    public void setMerchantCustomsCode(String merchant_customs_code) {
        if (merchant_customs_code != null) {
            this.merchant_customs_code = merchant_customs_code.trim();
        }
    }
    public void setAmount(String amount) {
        if (amount != null) {
            this.amount = amount.trim();
        }
    }
    public void setCustomsPlace(String customs_place) {
        if (customs_place != null) {
            this.customs_place = customs_place.trim();
        }
    }
    public void setMerchantCustomsName(String merchant_customs_name) {
        if (merchant_customs_name != null) {
            this.merchant_customs_name = merchant_customs_name.trim();
        }
    }
    public void setIsSplit(String is_split) {
        if (is_split != null) {
            this.is_split = is_split.trim();
        }
    }
    public void setSubOutBizNo(String sub_out_biz_no) {
        if (sub_out_biz_no != null) {
            this.sub_out_biz_no = sub_out_biz_no.trim();
        }
    }
    public void setBuyerName(String buyer_name) {
        if (buyer_name != null) {
            this.buyer_name = buyer_name.trim();
        }
    }
    public void setBuyerIdNo(String buyer_id_no) {
        if (buyer_id_no != null) {
            this.buyer_id_no = buyer_id_no.trim();
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

    public String getOutRequestNo() {
        return out_request_no;
    }

    public String getTradeNo() {
        return trade_no;
    }

    public String getMerchantCustomsCode() {
        return merchant_customs_code;
    }

    public String getAmount() {
        return amount;
    }

    public String getCustomsPlace() {
        return customs_place;
    }

    public String getMerchantCustomsName() {
        return merchant_customs_name;
    }

    public String getIsSplit() {
        return is_split;
    }

    public String getSubOutBizNo() {
        return sub_out_biz_no;
    }

    public String getBuyerName() {
        return buyer_name;
    }

    public String getBuyerIdNo() {
        return buyer_id_no;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (amount != null && !amount.equals("") && !amount.equals("null")) {
            para.put("amount", amount);
        }
        if (buyer_id_no != null && !buyer_id_no.equals("") && !buyer_id_no.equals("null")) {
            para.put("buyer_id_no", buyer_id_no);
        }
        if (buyer_name != null && !buyer_name.equals("") && !buyer_name.equals("null")) {
            para.put("buyer_name", buyer_name);
        }
        if (customs_place != null && !customs_place.equals("") && !customs_place.equals("null")) {
            para.put("customs_place", customs_place);
        }
        if (is_split != null && !is_split.equals("") && !is_split.equals("null")) {
            para.put("is_split", is_split);
        }
        if (merchant_customs_code != null && !merchant_customs_code.equals("") && !merchant_customs_code.equals("null")) {
            para.put("merchant_customs_code", merchant_customs_code);
        }
        if (merchant_customs_name != null && !merchant_customs_name.equals("") && !merchant_customs_name.equals("null")) {
            para.put("merchant_customs_name", merchant_customs_name);
        }
        if (out_request_no != null && !out_request_no.equals("") && !out_request_no.equals("null")) {
            para.put("out_request_no", out_request_no);
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
        if (sub_out_biz_no != null && !sub_out_biz_no.equals("") && !sub_out_biz_no.equals("null")) {
            para.put("sub_out_biz_no", sub_out_biz_no);
        }
        if (trade_no != null && !trade_no.equals("") && !trade_no.equals("null")) {
            para.put("trade_no", trade_no);
        }

        return para;
    }
}
