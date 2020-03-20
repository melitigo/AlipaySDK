package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayAcquireCreateRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: alipay.acquire.create
     * alipay.acquire.create
     */
    private String service = "alipay.acquire.create";


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
     * 字段描述：异步通知地址
     * Description: 异步通知地址
     * Example: 
     * 
     */
    private String notify_url;


    /**
     * 字段描述：服务商发送请求的时间戳
     * Description: 
     * Example: #now{yyyy-MM-dd HH:mm:ss}#
     * 
     */
    private String timestamp;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String terminal_timestamp;


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
     * Example: Mika's coffee shop
     * 
     */
    private String subject;


    /**
     * 字段描述：产品代码
     * Description: 
     * Example: OVERSEAS_MBARCODE_PAY
     * OVERSEAS_MBARCODE_PAY
     */
    private String product_code;


    /**
     * 字段描述：
     * Description: 
     * Example: 0.01
     * 
     */
    private String total_fee;


    /**
     * 字段描述：
     * Description: 填卖家PID
     * Example: 2088021966388155
     * 
     */
    private String seller_id;


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
    private String buyer_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String buyer_email;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String body;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String show_url;


    /**
     * 字段描述：商户签约的结算币种。必须大写英文字母。
     * Description: 
     * Example: USD
     * 
     */
    private String currency;


    /**
     * 字段描述：
     * Description: 可以不填，但填了需要满足：price * quantity = total_fee 。
否则会返回INVALID_PARAMETER
     * Example: 
     * 
     */
    private String price;


    /**
     * 字段描述：商品总量。可以不填，但填了需要满足：price * quantity = total_fee 。
否则会返回INVALID_PARAMETER
     * Description: The sum of quantities.It is optional parameter ，
but if uyou pass this parameter, you must meet the rule: price * quantity = total_fee.
Otherwise, it returns INVALID_PARAMETER
     * Example: 
     * 
     */
    private String quantity;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String goods_detail;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String extend_params;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String it_b_pay;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String passback_parameters;


    /**
     * 字段描述：
     * Description: 
     * Example: USD
     * 
     */
    private String trans_currency;

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
    public void setTimestamp(String timestamp) {
        if (timestamp != null) {
            this.timestamp = timestamp.trim();
        }
    }
    public void setTerminalTimestamp(String terminal_timestamp) {
        if (terminal_timestamp != null) {
            this.terminal_timestamp = terminal_timestamp.trim();
        }
    }
    public void setOutTradeNo(String out_trade_no) {
        if (out_trade_no != null) {
            this.out_trade_no = out_trade_no.trim();
        }
    }
    public void setSubject(String subject) {
        if (subject != null) {
            this.subject = subject.trim();
        }
    }
    public void setProductCode(String product_code) {
        if (product_code != null) {
            this.product_code = product_code.trim();
        }
    }
    public void setTotalFee(String total_fee) {
        if (total_fee != null) {
            this.total_fee = total_fee.trim();
        }
    }
    public void setSellerId(String seller_id) {
        if (seller_id != null) {
            this.seller_id = seller_id.trim();
        }
    }
    public void setSellerEmail(String seller_email) {
        if (seller_email != null) {
            this.seller_email = seller_email.trim();
        }
    }
    public void setBuyerId(String buyer_id) {
        if (buyer_id != null) {
            this.buyer_id = buyer_id.trim();
        }
    }
    public void setBuyerEmail(String buyer_email) {
        if (buyer_email != null) {
            this.buyer_email = buyer_email.trim();
        }
    }
    public void setBody(String body) {
        if (body != null) {
            this.body = body.trim();
        }
    }
    public void setShowUrl(String show_url) {
        if (show_url != null) {
            this.show_url = show_url.trim();
        }
    }
    public void setCurrency(String currency) {
        if (currency != null) {
            this.currency = currency.trim();
        }
    }
    public void setPrice(String price) {
        if (price != null) {
            this.price = price.trim();
        }
    }
    public void setQuantity(String quantity) {
        if (quantity != null) {
            this.quantity = quantity.trim();
        }
    }
    public void setGoodsDetail(String goods_detail) {
        if (goods_detail != null) {
            this.goods_detail = goods_detail.trim();
        }
    }
    public void setExtendParams(String extend_params) {
        if (extend_params != null) {
            this.extend_params = extend_params.trim();
        }
    }
    public void setItBPay(String it_b_pay) {
        if (it_b_pay != null) {
            this.it_b_pay = it_b_pay.trim();
        }
    }
    public void setPassbackParameters(String passback_parameters) {
        if (passback_parameters != null) {
            this.passback_parameters = passback_parameters.trim();
        }
    }
    public void setTransCurrency(String trans_currency) {
        if (trans_currency != null) {
            this.trans_currency = trans_currency.trim();
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

    public String getTimestamp() {
        return timestamp;
    }

    public String getTerminalTimestamp() {
        return terminal_timestamp;
    }

    public String getOutTradeNo() {
        return out_trade_no;
    }

    public String getSubject() {
        return subject;
    }

    public String getProductCode() {
        return product_code;
    }

    public String getTotalFee() {
        return total_fee;
    }

    public String getSellerId() {
        return seller_id;
    }

    public String getSellerEmail() {
        return seller_email;
    }

    public String getBuyerId() {
        return buyer_id;
    }

    public String getBuyerEmail() {
        return buyer_email;
    }

    public String getBody() {
        return body;
    }

    public String getShowUrl() {
        return show_url;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getGoodsDetail() {
        return goods_detail;
    }

    public String getExtendParams() {
        return extend_params;
    }

    public String getItBPay() {
        return it_b_pay;
    }

    public String getPassbackParameters() {
        return passback_parameters;
    }

    public String getTransCurrency() {
        return trans_currency;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (body != null && !body.equals("") && !body.equals("null")) {
            para.put("body", body);
        }
        if (buyer_email != null && !buyer_email.equals("") && !buyer_email.equals("null")) {
            para.put("buyer_email", buyer_email);
        }
        if (buyer_id != null && !buyer_id.equals("") && !buyer_id.equals("null")) {
            para.put("buyer_id", buyer_id);
        }
        if (currency != null && !currency.equals("") && !currency.equals("null")) {
            para.put("currency", currency);
        }
        if (extend_params != null && !extend_params.equals("") && !extend_params.equals("null")) {
            para.put("extend_params", extend_params);
        }
        if (goods_detail != null && !goods_detail.equals("") && !goods_detail.equals("null")) {
            para.put("goods_detail", goods_detail);
        }
        if (it_b_pay != null && !it_b_pay.equals("") && !it_b_pay.equals("null")) {
            para.put("it_b_pay", it_b_pay);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (out_trade_no != null && !out_trade_no.equals("") && !out_trade_no.equals("null")) {
            para.put("out_trade_no", out_trade_no);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (passback_parameters != null && !passback_parameters.equals("") && !passback_parameters.equals("null")) {
            para.put("passback_parameters", passback_parameters);
        }
        if (price != null && !price.equals("") && !price.equals("null")) {
            para.put("price", price);
        }
        if (product_code != null && !product_code.equals("") && !product_code.equals("null")) {
            para.put("product_code", product_code);
        }
        if (quantity != null && !quantity.equals("") && !quantity.equals("null")) {
            para.put("quantity", quantity);
        }
        if (seller_email != null && !seller_email.equals("") && !seller_email.equals("null")) {
            para.put("seller_email", seller_email);
        }
        if (seller_id != null && !seller_id.equals("") && !seller_id.equals("null")) {
            para.put("seller_id", seller_id);
        }
        if (service != null && !service.equals("") && !service.equals("null")) {
            para.put("service", service);
        }
        if (show_url != null && !show_url.equals("") && !show_url.equals("null")) {
            para.put("show_url", show_url);
        }
        if (sign != null && !sign.equals("") && !sign.equals("null")) {
            para.put("sign", sign);
        }
        if (sign_type != null && !sign_type.equals("") && !sign_type.equals("null")) {
            para.put("sign_type", sign_type);
        }
        if (subject != null && !subject.equals("") && !subject.equals("null")) {
            para.put("subject", subject);
        }
        if (terminal_timestamp != null && !terminal_timestamp.equals("") && !terminal_timestamp.equals("null")) {
            para.put("terminal_timestamp", terminal_timestamp);
        }
        if (timestamp != null && !timestamp.equals("") && !timestamp.equals("null")) {
            para.put("timestamp", timestamp);
        }
        if (total_fee != null && !total_fee.equals("") && !total_fee.equals("null")) {
            para.put("total_fee", total_fee);
        }
        if (trans_currency != null && !trans_currency.equals("") && !trans_currency.equals("null")) {
            para.put("trans_currency", trans_currency);
        }

        return para;
    }
}
