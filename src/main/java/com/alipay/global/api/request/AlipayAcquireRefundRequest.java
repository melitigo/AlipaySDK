package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayAcquireRefundRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: alipay.acquire.refund
     * alipay.acquire.refund
     */
    private String service = "alipay.acquire.refund";


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
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String alipay_ca_request;


    /**
     * 字段描述：异步通知地址，同步退款不发异步通知。
若后台配置了异步通知地址，则发后台配置地址，不发请求中地址。
     * Description: 异步通知地址
     * Example: 
     * 
     */
    private String notify_url;


    /**
     * 字段描述：商户端订单ID
     * Description: ID of the trade at merchant side
     * Example: TRADE_#auto#
     * 
     */
    private String out_trade_no;


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
    private String trans_currency;


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
    private String sync_flag;


    /**
     * 字段描述：商户端请求ID
     * Description: ID of the request at merchant side
     * Example: REQUEST_#auto#
     * 
     */
    private String out_request_no;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String operator_type;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String operator_id;


    /**
     * 字段描述：退款理由。
     * Description: Reason for the refund.
     * Example: 买家主动要求退款
     * 
     */
    private String refund_reason;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String ref_ids;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String extend_params;

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
    public void setAlipayCaRequest(String alipay_ca_request) {
        if (alipay_ca_request != null) {
            this.alipay_ca_request = alipay_ca_request.trim();
        }
    }
    public void setNotifyUrl(String notify_url) {
        if (notify_url != null) {
            this.notify_url = notify_url.trim();
        }
    }
    public void setOutTradeNo(String out_trade_no) {
        if (out_trade_no != null) {
            this.out_trade_no = out_trade_no.trim();
        }
    }
    public void setRefundAmount(String refund_amount) {
        if (refund_amount != null) {
            this.refund_amount = refund_amount.trim();
        }
    }
    public void setTransCurrency(String trans_currency) {
        if (trans_currency != null) {
            this.trans_currency = trans_currency.trim();
        }
    }
    public void setTradeNo(String trade_no) {
        if (trade_no != null) {
            this.trade_no = trade_no.trim();
        }
    }
    public void setSyncFlag(String sync_flag) {
        if (sync_flag != null) {
            this.sync_flag = sync_flag.trim();
        }
    }
    public void setOutRequestNo(String out_request_no) {
        if (out_request_no != null) {
            this.out_request_no = out_request_no.trim();
        }
    }
    public void setOperatorType(String operator_type) {
        if (operator_type != null) {
            this.operator_type = operator_type.trim();
        }
    }
    public void setOperatorId(String operator_id) {
        if (operator_id != null) {
            this.operator_id = operator_id.trim();
        }
    }
    public void setRefundReason(String refund_reason) {
        if (refund_reason != null) {
            this.refund_reason = refund_reason.trim();
        }
    }
    public void setRefIds(String ref_ids) {
        if (ref_ids != null) {
            this.ref_ids = ref_ids.trim();
        }
    }
    public void setExtendParams(String extend_params) {
        if (extend_params != null) {
            this.extend_params = extend_params.trim();
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

    public String getAlipayCaRequest() {
        return alipay_ca_request;
    }

    public String getNotifyUrl() {
        return notify_url;
    }

    public String getOutTradeNo() {
        return out_trade_no;
    }

    public String getRefundAmount() {
        return refund_amount;
    }

    public String getTransCurrency() {
        return trans_currency;
    }

    public String getTradeNo() {
        return trade_no;
    }

    public String getSyncFlag() {
        return sync_flag;
    }

    public String getOutRequestNo() {
        return out_request_no;
    }

    public String getOperatorType() {
        return operator_type;
    }

    public String getOperatorId() {
        return operator_id;
    }

    public String getRefundReason() {
        return refund_reason;
    }

    public String getRefIds() {
        return ref_ids;
    }

    public String getExtendParams() {
        return extend_params;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (alipay_ca_request != null && !alipay_ca_request.equals("") && !alipay_ca_request.equals("null")) {
            para.put("alipay_ca_request", alipay_ca_request);
        }
        if (extend_params != null && !extend_params.equals("") && !extend_params.equals("null")) {
            para.put("extend_params", extend_params);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (operator_id != null && !operator_id.equals("") && !operator_id.equals("null")) {
            para.put("operator_id", operator_id);
        }
        if (operator_type != null && !operator_type.equals("") && !operator_type.equals("null")) {
            para.put("operator_type", operator_type);
        }
        if (out_request_no != null && !out_request_no.equals("") && !out_request_no.equals("null")) {
            para.put("out_request_no", out_request_no);
        }
        if (out_trade_no != null && !out_trade_no.equals("") && !out_trade_no.equals("null")) {
            para.put("out_trade_no", out_trade_no);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (ref_ids != null && !ref_ids.equals("") && !ref_ids.equals("null")) {
            para.put("ref_ids", ref_ids);
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
        if (sync_flag != null && !sync_flag.equals("") && !sync_flag.equals("null")) {
            para.put("sync_flag", sync_flag);
        }
        if (trade_no != null && !trade_no.equals("") && !trade_no.equals("null")) {
            para.put("trade_no", trade_no);
        }
        if (trans_currency != null && !trans_currency.equals("") && !trans_currency.equals("null")) {
            para.put("trans_currency", trans_currency);
        }

        return para;
    }
}
