package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class ForexRefundHkRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: forex_refund
     * forex_refund
     */
    private String service = "forex_refund";


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
     * Description: 异步通知地址，同步退款不发异步通知。
若后台配置了异步通知地址，则发后台配置地址，不发请求中地址。
     * Example: 
     * 
     */
    private String notify_url;


    /**
     * 字段描述：商户端退款请求ID
     * Description: ID of the refund request at merchant side
     * Example: REFUND_#auto#
     * 
     */
    private String out_return_no;


    /**
     * 字段描述：商户端订单ID
     * Description: ID of the trade at merchant side
     * Example: TRADE_#auto#
     * 
     */
    private String out_trade_no;


    /**
     * 字段描述：外币退款金额
     * Description: 
     * Example: 0.01
     * 
     */
    private String return_amount;


    /**
     * 字段描述：商户签约的结算币种。必须大写英文字母。（香港产品固定HKD）
     * Description: 
     * Example: HKD
     * 
     */
    private String currency;


    /**
     * 字段描述：退款时间，格式：yyyy-MM-dd HH:mm:ss
     * Description: Refund transaction time, with a format of yyyy-MM-dd HH:mm:ss.
     * Example: #now{yyyy-MM-dd HH:mm:ss}#
     * 
     */
    private String gmt_return;


    /**
     * 字段描述：退款理由
     * Description: Reason for the refund.
     * Example: 买家主动要求退款
     * 
     */
    private String reason;


    /**
     * 字段描述：退款请求处理方式，Y表示同步退款，N表示异步退款。不填默认异步退款。
     * Description: Refund requests are processed synchronously or asynchronously.
Value: Y or N.
Default value: N. Asynchronous processing.
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
    public void setOutReturnNo(String out_return_no) {
        if (out_return_no != null) {
            this.out_return_no = out_return_no.trim();
        }
    }
    public void setOutTradeNo(String out_trade_no) {
        if (out_trade_no != null) {
            this.out_trade_no = out_trade_no.trim();
        }
    }
    public void setReturnAmount(String return_amount) {
        if (return_amount != null) {
            this.return_amount = return_amount.trim();
        }
    }
    public void setCurrency(String currency) {
        if (currency != null) {
            this.currency = currency.trim();
        }
    }
    public void setGmtReturn(String gmt_return) {
        if (gmt_return != null) {
            this.gmt_return = gmt_return.trim();
        }
    }
    public void setReason(String reason) {
        if (reason != null) {
            this.reason = reason.trim();
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

    public String getOutReturnNo() {
        return out_return_no;
    }

    public String getOutTradeNo() {
        return out_trade_no;
    }

    public String getReturnAmount() {
        return return_amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getGmtReturn() {
        return gmt_return;
    }

    public String getReason() {
        return reason;
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
        if (currency != null && !currency.equals("") && !currency.equals("null")) {
            para.put("currency", currency);
        }
        if (gmt_return != null && !gmt_return.equals("") && !gmt_return.equals("null")) {
            para.put("gmt_return", gmt_return);
        }
        if (is_sync != null && !is_sync.equals("") && !is_sync.equals("null")) {
            para.put("is_sync", is_sync);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (out_return_no != null && !out_return_no.equals("") && !out_return_no.equals("null")) {
            para.put("out_return_no", out_return_no);
        }
        if (out_trade_no != null && !out_trade_no.equals("") && !out_trade_no.equals("null")) {
            para.put("out_trade_no", out_trade_no);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (reason != null && !reason.equals("") && !reason.equals("null")) {
            para.put("reason", reason);
        }
        if (return_amount != null && !return_amount.equals("") && !return_amount.equals("null")) {
            para.put("return_amount", return_amount);
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
