package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayOverseasForexOrderPayRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: alipay.overseas.forex.order.pay
     * alipay.overseas.forex.order.pay
     */
    private String service = "alipay.overseas.forex.order.pay";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 2088101141338400
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
     * Example: RSA
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
     * 字段描述：同步跳转地址
     * Description: 
     * Example: https://www.google.com
     * 
     */
    private String return_url;


    /**
     * 字段描述：商户端订单ID
     * Description: ID of the trade at merchant side
     * Example: TRADE_#auto#
     * 
     */
    private String partner_trans_id;


    /**
     * 字段描述：
     * Description: 
     * Example: Mika Lines - to Mika's coffee shop
     * 
     */
    private String goods_title;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String goods_description;


    /**
     * 字段描述：
     * Description: 
     * Example: 2088101141338400
     * 
     */
    private String seller_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 520.00
     * 
     */
    private String total_fee;


    /**
     * 字段描述：
     * Description: 
     * Example: USD
     * 
     */
    private String currency;


    /**
     * 字段描述：
     * Description: 
     * Example: CNY
     * CNY
     */
    private String pricing_currency;


    /**
     * 字段描述：
     * Description: 
     * Example: 100
     * 100
     */
    private String service_type;


    /**
     * 字段描述：
     * Description: 
     * Example: {"VCN_ORG":"UATP"}
     * 
     */
    private String ext_params;

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
    public void setPartnerTransId(String partner_trans_id) {
        if (partner_trans_id != null) {
            this.partner_trans_id = partner_trans_id.trim();
        }
    }
    public void setGoodsTitle(String goods_title) {
        if (goods_title != null) {
            this.goods_title = goods_title.trim();
        }
    }
    public void setGoodsDescription(String goods_description) {
        if (goods_description != null) {
            this.goods_description = goods_description.trim();
        }
    }
    public void setSellerId(String seller_id) {
        if (seller_id != null) {
            this.seller_id = seller_id.trim();
        }
    }
    public void setTotalFee(String total_fee) {
        if (total_fee != null) {
            this.total_fee = total_fee.trim();
        }
    }
    public void setCurrency(String currency) {
        if (currency != null) {
            this.currency = currency.trim();
        }
    }
    public void setPricingCurrency(String pricing_currency) {
        if (pricing_currency != null) {
            this.pricing_currency = pricing_currency.trim();
        }
    }
    public void setServiceType(String service_type) {
        if (service_type != null) {
            this.service_type = service_type.trim();
        }
    }
    public void setExtParams(String ext_params) {
        if (ext_params != null) {
            this.ext_params = ext_params.trim();
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

    public String getPartnerTransId() {
        return partner_trans_id;
    }

    public String getGoodsTitle() {
        return goods_title;
    }

    public String getGoodsDescription() {
        return goods_description;
    }

    public String getSellerId() {
        return seller_id;
    }

    public String getTotalFee() {
        return total_fee;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPricingCurrency() {
        return pricing_currency;
    }

    public String getServiceType() {
        return service_type;
    }

    public String getExtParams() {
        return ext_params;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (currency != null && !currency.equals("") && !currency.equals("null")) {
            para.put("currency", currency);
        }
        if (ext_params != null && !ext_params.equals("") && !ext_params.equals("null")) {
            para.put("ext_params", ext_params);
        }
        if (goods_description != null && !goods_description.equals("") && !goods_description.equals("null")) {
            para.put("goods_description", goods_description);
        }
        if (goods_title != null && !goods_title.equals("") && !goods_title.equals("null")) {
            para.put("goods_title", goods_title);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (partner_trans_id != null && !partner_trans_id.equals("") && !partner_trans_id.equals("null")) {
            para.put("partner_trans_id", partner_trans_id);
        }
        if (pricing_currency != null && !pricing_currency.equals("") && !pricing_currency.equals("null")) {
            para.put("pricing_currency", pricing_currency);
        }
        if (return_url != null && !return_url.equals("") && !return_url.equals("null")) {
            para.put("return_url", return_url);
        }
        if (seller_id != null && !seller_id.equals("") && !seller_id.equals("null")) {
            para.put("seller_id", seller_id);
        }
        if (service != null && !service.equals("") && !service.equals("null")) {
            para.put("service", service);
        }
        if (service_type != null && !service_type.equals("") && !service_type.equals("null")) {
            para.put("service_type", service_type);
        }
        if (sign != null && !sign.equals("") && !sign.equals("null")) {
            para.put("sign", sign);
        }
        if (sign_type != null && !sign_type.equals("") && !sign_type.equals("null")) {
            para.put("sign_type", sign_type);
        }
        if (total_fee != null && !total_fee.equals("") && !total_fee.equals("null")) {
            para.put("total_fee", total_fee);
        }

        return para;
    }
}
