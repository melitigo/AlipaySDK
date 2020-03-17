package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class CreateForexTradeRequest extends AlipayRequest {

    /**
     * 字段描述：服务名
     * Description: service name
     * Example: create_forex_trade
     * create_forex_trade
     */
    private String service = "create_forex_trade";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 2088021017666931
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
     * 字段描述：异步通知地址
     * Description: 异步通知地址
     * Example: #now#
     * 
     */
    private String notify_url;


    /**
     * 字段描述：同步跳转地址
     * Description: 同步跳转地址
     * Example: 
     * 
     */
    private String return_url;


    /**
     * 字段描述：订单名称
     * Description: 
     * Example: Mika's coffee shop
     * 
     */
    private String subject;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String body;


    /**
     * 字段描述：外部交易号，自定义设置，不能包含除中文、英文、数字以外的字符，且需要保证在商户端不重复。
     * Description: 
     * Example: TRADE_#auto#
     * 
     */
    private String out_trade_no;


    /**
     * 字段描述：商户签约的结算币种。必须大写英文字母。
     * Description: 
     * Example: USD
     * 
     */
    private String currency;


    /**
     * 字段描述：
     * Description: 
     * Example: 0.01
     * 
     */
    private String total_fee;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String rmb_fee;


    /**
     * 字段描述：
     * Description: 默认12h，其他值需要后台配置过。
     * Example: 12h
     * 5m 10m 15m 30m 1h 2h 3h 5h 10h 12h 1d 3d 7d 15d
     */
    private String timeout_rule;


    /**
     * 字段描述：
     * Description: 与order_valid_time共用。用于表达订单有效时间段。
     * Example: 
     * 
     */
    private String order_gmt_create;


    /**
     * 字段描述：
     * Description: 与order_gmt_create共用。用于表达订单有效时间段。单位：秒。
     * Example: 
     * 
     */
    private String order_valid_time;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String supplier;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String secondary_merchant_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String secondary_merchant_name;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String secondary_merchant_industry;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String refer_url;


    /**
     * 字段描述：
     * Description: 
     * Example: NEW_OVERSEAS_SELLER
     * NEW_OVERSEAS_SELLER
     */
    private String product_code;


    /**
     * 字段描述：分账信息参数
     * Description: If it requires the fund to be received by several merchant's accounts, fill this parameter.
* JSONArray format.
* 10 accounts at most.
* Sum of amount should be less or equal to the payment's total_fee or rmb_fee.
     * Example: 
     * 
     */
    private String split_fund_info;


    /**
     * 字段描述：订单信息
     * Description: A JSON format string to describe the items contained in this payment.
     * Example: 
     * 
     */
    private String trade_information;

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
    public void setReturnUrl(String return_url) {
        if (return_url != null) {
            this.return_url = return_url.trim();
        }
    }
    public void setSubject(String subject) {
        if (subject != null) {
            this.subject = subject.trim();
        }
    }
    public void setBody(String body) {
        if (body != null) {
            this.body = body.trim();
        }
    }
    public void setOutTradeNo(String out_trade_no) {
        if (out_trade_no != null) {
            this.out_trade_no = out_trade_no.trim();
        }
    }
    public void setCurrency(String currency) {
        if (currency != null) {
            this.currency = currency.trim();
        }
    }
    public void setTotalFee(String total_fee) {
        if (total_fee != null) {
            this.total_fee = total_fee.trim();
        }
    }
    public void setRmbFee(String rmb_fee) {
        if (rmb_fee != null) {
            this.rmb_fee = rmb_fee.trim();
        }
    }
    public void setTimeoutRule(String timeout_rule) {
        if (timeout_rule != null) {
            this.timeout_rule = timeout_rule.trim();
        }
    }
    public void setOrderGmtCreate(String order_gmt_create) {
        if (order_gmt_create != null) {
            this.order_gmt_create = order_gmt_create.trim();
        }
    }
    public void setOrderValidTime(String order_valid_time) {
        if (order_valid_time != null) {
            this.order_valid_time = order_valid_time.trim();
        }
    }
    public void setSupplier(String supplier) {
        if (supplier != null) {
            this.supplier = supplier.trim();
        }
    }
    public void setSecondaryMerchantId(String secondary_merchant_id) {
        if (secondary_merchant_id != null) {
            this.secondary_merchant_id = secondary_merchant_id.trim();
        }
    }
    public void setSecondaryMerchantName(String secondary_merchant_name) {
        if (secondary_merchant_name != null) {
            this.secondary_merchant_name = secondary_merchant_name.trim();
        }
    }
    public void setSecondaryMerchantIndustry(String secondary_merchant_industry) {
        if (secondary_merchant_industry != null) {
            this.secondary_merchant_industry = secondary_merchant_industry.trim();
        }
    }
    public void setReferUrl(String refer_url) {
        if (refer_url != null) {
            this.refer_url = refer_url.trim();
        }
    }
    public void setProductCode(String product_code) {
        if (product_code != null) {
            this.product_code = product_code.trim();
        }
    }
    public void setSplitFundInfo(String split_fund_info) {
        if (split_fund_info != null) {
            this.split_fund_info = split_fund_info.trim();
        }
    }
    public void setTradeInformation(String trade_information) {
        if (trade_information != null) {
            this.trade_information = trade_information.trim();
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

    public String getReturnUrl() {
        return return_url;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getOutTradeNo() {
        return out_trade_no;
    }

    public String getCurrency() {
        return currency;
    }

    public String getTotalFee() {
        return total_fee;
    }

    public String getRmbFee() {
        return rmb_fee;
    }

    public String getTimeoutRule() {
        return timeout_rule;
    }

    public String getOrderGmtCreate() {
        return order_gmt_create;
    }

    public String getOrderValidTime() {
        return order_valid_time;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getSecondaryMerchantId() {
        return secondary_merchant_id;
    }

    public String getSecondaryMerchantName() {
        return secondary_merchant_name;
    }

    public String getSecondaryMerchantIndustry() {
        return secondary_merchant_industry;
    }

    public String getReferUrl() {
        return refer_url;
    }

    public String getProductCode() {
        return product_code;
    }

    public String getSplitFundInfo() {
        return split_fund_info;
    }

    public String getTradeInformation() {
        return trade_information;
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
        if (currency != null && !currency.equals("") && !currency.equals("null")) {
            para.put("currency", currency);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (order_gmt_create != null && !order_gmt_create.equals("") && !order_gmt_create.equals("null")) {
            para.put("order_gmt_create", order_gmt_create);
        }
        if (order_valid_time != null && !order_valid_time.equals("") && !order_valid_time.equals("null")) {
            para.put("order_valid_time", order_valid_time);
        }
        if (out_trade_no != null && !out_trade_no.equals("") && !out_trade_no.equals("null")) {
            para.put("out_trade_no", out_trade_no);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (product_code != null && !product_code.equals("") && !product_code.equals("null")) {
            para.put("product_code", product_code);
        }
        if (refer_url != null && !refer_url.equals("") && !refer_url.equals("null")) {
            para.put("refer_url", refer_url);
        }
        if (return_url != null && !return_url.equals("") && !return_url.equals("null")) {
            para.put("return_url", return_url);
        }
        if (rmb_fee != null && !rmb_fee.equals("") && !rmb_fee.equals("null")) {
            para.put("rmb_fee", rmb_fee);
        }
        if (secondary_merchant_id != null && !secondary_merchant_id.equals("") && !secondary_merchant_id.equals("null")) {
            para.put("secondary_merchant_id", secondary_merchant_id);
        }
        if (secondary_merchant_industry != null && !secondary_merchant_industry.equals("") && !secondary_merchant_industry.equals("null")) {
            para.put("secondary_merchant_industry", secondary_merchant_industry);
        }
        if (secondary_merchant_name != null && !secondary_merchant_name.equals("") && !secondary_merchant_name.equals("null")) {
            para.put("secondary_merchant_name", secondary_merchant_name);
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
        if (split_fund_info != null && !split_fund_info.equals("") && !split_fund_info.equals("null")) {
            para.put("split_fund_info", split_fund_info);
        }
        if (subject != null && !subject.equals("") && !subject.equals("null")) {
            para.put("subject", subject);
        }
        if (supplier != null && !supplier.equals("") && !supplier.equals("null")) {
            para.put("supplier", supplier);
        }
        if (timeout_rule != null && !timeout_rule.equals("") && !timeout_rule.equals("null")) {
            para.put("timeout_rule", timeout_rule);
        }
        if (total_fee != null && !total_fee.equals("") && !total_fee.equals("null")) {
            para.put("total_fee", total_fee);
        }
        if (trade_information != null && !trade_information.equals("") && !trade_information.equals("null")) {
            para.put("trade_information", trade_information);
        }

        return para;
    }
}
