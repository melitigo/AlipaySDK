package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayAcquireOverseasSpotRefundRequest extends AlipayRequest {

    /**
     * 字段描述：服务名
     * Description: service name
     * Example: alipay.acquire.overseas.spot.refund
     * alipay.acquire.overseas.spot.refund
     */
    private String service = "alipay.acquire.overseas.spot.refund";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 2088021966388155
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
     * 字段描述：异步通知地址，同步退款不发异步通知。
若后台配置了异步通知地址，则发后台配置地址，不发请求中地址。
     * Description: 异步通知地址
     * Example: 
     * 
     */
    private String notify_url;


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


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String partner_refund_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String refund_amount;


    /**
     * 字段描述：商户签约的结算币种。必须大写英文字母。退款时请保持和交易时传的一致。
     * Description: 
     * Example: USD
     * 
     */
    private String currency;


    /**
     * 字段描述：退款理由。
     * Description: Reason for the refund.
     * Example: 买家主动要求退款
     * 
     */
    private String refund_reason;


    /**
     * 字段描述：退款请求同步或异步处理。
取值：Y或N。
默认值：N，异步处理，当首次退款失败时，支付宝会做轮训退款处理。
且当面付隔日异步退款仅在23:00-5:00（北京时间）执行处理。
如果该值为Y，则仅有同步返回，表示同步退款，不会有轮训退款处理。
     * Description: Refund requests are processed synchronously or asynchronously.
Value: Y or N.
Default value: N. Asynchronous processing. When the first refund fails, Alipay will do a round-trip refund process.
For in-store payment, if the refund and transaction time are not the same day, refunds will be processed only at 23: 00-5: 00 (Beijing time).
If the value is Y, there is only asynchronous return, which means that the refund will be synchronized, and there is no round-trip process.
     * Example: 
     * Y N
     */
    private String is_sync;

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
    public void setPartnerRefundId(String partner_refund_id) {
        if (partner_refund_id != null) {
            this.partner_refund_id = partner_refund_id.trim();
        }
    }
    public void setRefundAmount(String refund_amount) {
        if (refund_amount != null) {
            this.refund_amount = refund_amount.trim();
        }
    }
    public void setCurrency(String currency) {
        if (currency != null) {
            this.currency = currency.trim();
        }
    }
    public void setRefundReason(String refund_reason) {
        if (refund_reason != null) {
            this.refund_reason = refund_reason.trim();
        }
    }
    public void setIsSync(String is_sync) {
        if (is_sync != null) {
            this.is_sync = is_sync.trim();
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

    public String getPartnerTransId() {
        return partner_trans_id;
    }

    public String getAlipayTransId() {
        return alipay_trans_id;
    }

    public String getPartnerRefundId() {
        return partner_refund_id;
    }

    public String getRefundAmount() {
        return refund_amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getRefundReason() {
        return refund_reason;
    }

    public String getIsSync() {
        return is_sync;
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
        if (currency != null && !currency.equals("") && !currency.equals("null")) {
            para.put("currency", currency);
        }
        if (is_sync != null && !is_sync.equals("") && !is_sync.equals("null")) {
            para.put("is_sync", is_sync);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (partner_refund_id != null && !partner_refund_id.equals("") && !partner_refund_id.equals("null")) {
            para.put("partner_refund_id", partner_refund_id);
        }
        if (partner_trans_id != null && !partner_trans_id.equals("") && !partner_trans_id.equals("null")) {
            para.put("partner_trans_id", partner_trans_id);
        }
        if (refund_amount != null && !refund_amount.equals("") && !refund_amount.equals("null")) {
            para.put("refund_amount", refund_amount);
        }
        if (refund_reason != null && !refund_reason.equals("") && !refund_reason.equals("null")) {
            para.put("refund_reason", refund_reason);
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
