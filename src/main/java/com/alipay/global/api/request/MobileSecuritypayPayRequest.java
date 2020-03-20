package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class MobileSecuritypayPayRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: mobile.securitypay.pay
     * mobile.securitypay.pay
     */
    private String service = "mobile.securitypay.pay";


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
     * Example: RSA
     * RSA
     */
    private String sign_type;


    /**
     * 字段描述：签名值
     * Description: Signature value
     * Example: lBBK%2F0w5LOajrMrji7DUgEqNjIhQbidR13GovA5r3TgIbNqv231yC1NksLdw%2Ba3JnfHXoXuet6XNNHtn7VE%2BeCoRO1O%2BR1KugLrQEZMtG5jmJIe2pbjm%2F3kb%2FuGkpG%2BwYQYI51%2BhA3YBbvZHVQBYveBqK%2Bh8mUyb7GM1HxWs9k4%3D
     * 
     */
    private String sign;


    /**
     * 字段描述：
     * Description: 同步跳转地址
     * Example: 
     * 
     */
    private String return_url;


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
     * Example: system=android^version=3.0.1.2
     * 
     */
    private String appenv;


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
     * 字段描述：
     * Description: 
     * Example: 1
     * 1
     */
    private String payment_type;


    /**
     * 字段描述：
     * Description: 填卖家PID
     * Example: 2088021017666931
     * 
     */
    private String seller_id;


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
     * Description: 
     * Example: test
     * 
     */
    private String body;


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
     * Example: FP
     * FP
     */
    private String forex_biz;


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
    private String extern_token;


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
     * 字段描述：产品代码
     * Description: 
     * Example: NEW_WAP_OVERSEAS_SELLER
     * NEW_WAP_OVERSEAS_SELLER
     */
    private String product_code;


    /**
     * 字段描述：
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
    public void setReturnUrl(String return_url) {
        if (return_url != null) {
            this.return_url = return_url.trim();
        }
    }
    public void setNotifyUrl(String notify_url) {
        if (notify_url != null) {
            this.notify_url = notify_url.trim();
        }
    }
    public void setenv(String appenv) {
        if (appenv != null) {
            this.appenv = appenv.trim();
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
    public void setPaymentType(String payment_type) {
        if (payment_type != null) {
            this.payment_type = payment_type.trim();
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
    public void setRmbFee(String rmb_fee) {
        if (rmb_fee != null) {
            this.rmb_fee = rmb_fee.trim();
        }
    }
    public void setBody(String body) {
        if (body != null) {
            this.body = body.trim();
        }
    }
    public void setCurrency(String currency) {
        if (currency != null) {
            this.currency = currency.trim();
        }
    }
    public void setForexBiz(String forex_biz) {
        if (forex_biz != null) {
            this.forex_biz = forex_biz.trim();
        }
    }
    public void setItBPay(String it_b_pay) {
        if (it_b_pay != null) {
            this.it_b_pay = it_b_pay.trim();
        }
    }
    public void setExternToken(String extern_token) {
        if (extern_token != null) {
            this.extern_token = extern_token.trim();
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

    public String getReturnUrl() {
        return return_url;
    }

    public String getNotifyUrl() {
        return notify_url;
    }

    public String getenv() {
        return appenv;
    }

    public String getOutTradeNo() {
        return out_trade_no;
    }

    public String getSubject() {
        return subject;
    }

    public String getPaymentType() {
        return payment_type;
    }

    public String getSellerId() {
        return seller_id;
    }

    public String getTotalFee() {
        return total_fee;
    }

    public String getRmbFee() {
        return rmb_fee;
    }

    public String getBody() {
        return body;
    }

    public String getCurrency() {
        return currency;
    }

    public String getForexBiz() {
        return forex_biz;
    }

    public String getItBPay() {
        return it_b_pay;
    }

    public String getExternToken() {
        return extern_token;
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
        if (appenv != null && !appenv.equals("") && !appenv.equals("null")) {
            para.put("appenv", appenv);
        }
        if (body != null && !body.equals("") && !body.equals("null")) {
            para.put("body", body);
        }
        if (currency != null && !currency.equals("") && !currency.equals("null")) {
            para.put("currency", currency);
        }
        if (extern_token != null && !extern_token.equals("") && !extern_token.equals("null")) {
            para.put("extern_token", extern_token);
        }
        if (forex_biz != null && !forex_biz.equals("") && !forex_biz.equals("null")) {
            para.put("forex_biz", forex_biz);
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
        if (payment_type != null && !payment_type.equals("") && !payment_type.equals("null")) {
            para.put("payment_type", payment_type);
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
        if (seller_id != null && !seller_id.equals("") && !seller_id.equals("null")) {
            para.put("seller_id", seller_id);
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
        if (total_fee != null && !total_fee.equals("") && !total_fee.equals("null")) {
            para.put("total_fee", total_fee);
        }
        if (trade_information != null && !trade_information.equals("") && !trade_information.equals("null")) {
            para.put("trade_information", trade_information);
        }

        return para;
    }
}
