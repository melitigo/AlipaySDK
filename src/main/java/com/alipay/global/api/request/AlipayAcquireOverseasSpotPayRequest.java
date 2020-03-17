package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayAcquireOverseasSpotPayRequest extends AlipayRequest {

    /**
     * 字段描述：服务名
     * Description: service name
     * Example: alipay.acquire.overseas.spot.pay
     * alipay.acquire.overseas.spot.pay
     */
    private String service = "alipay.acquire.overseas.spot.pay";


    /**
     * 字段描述：签名值
     * Description: Signature value
     * Example: e5815a4556db338ed237f7d3fd222184
     * 
     */
    private String sign;


    /**
     * 字段描述：签名算法
     * Description: Signature algorithm
     * Example: MD5
     * RSA RSA2 MD5
     */
    private String sign_type;


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 2088021966388155
     * 
     */
    private String partner;


    /**
     * 字段描述：字符集，推荐UTF-8
     * Description: N
basic
2088021966388155
5
_input_charset
     * Example: UTF-8
     * UTF-8 GBK gbk utf-8
     */
    private String _input_charset;


    /**
     * 字段描述：填卖家PID，该值和partner ID保持一致。
     * Description: Alipay seller ID, with the same value of partner ID.
     * Example: 2088021966388155
     * 
     */
    private String alipay_seller_id;


    /**
     * 字段描述：商品总量。
     * Description: The sum of quantities.It is optional parameter ，
but if uyou pass this parameter, you must meet the rule: price * quantity = total_fee.
Otherwise, it returns INVALID_PARAMETER
     * Example: 
     * 
     */
    private String quantity;


    /**
     * 字段描述：商品说明，会显示在买家手机app的账单列表中。
     * Description: The name of the transaction, which is to be shown in the transaction record list of Alipay app.
     * Example: Mika's coffee shop
     * 
     */
    private String trans_name;


    /**
     * 字段描述：外部交易号
     * Description: Merchant transaction number
     * Example: TRADE_#auto#
     * 
     */
    private String partner_trans_id;


    /**
     * 字段描述：商户签约的结算币种。必须大写英文字母。
     * Description: 
     * Example: USD
     * 
     */
    private String currency;


    /**
     * 字段描述：异步通知地址
     * Description: 异步通知地址
     * Example: 
     * 
     */
    private String notify_url;


    /**
     * 字段描述：同total_fee，交易金额，范围：0.01-100000000.00。 取小数点后两位。日元，韩元取整数。
     * Description: 同total_fee
     * Example: 0.01
     * 
     */
    private String trans_amount;


    /**
     * 字段描述：支付宝动态付款码，扫码枪扫的25, 26, 27, 28, 29, 或 30开头的16-24位数字串。
     * Description: 支付宝动态付款码，扫码枪扫的28开头的数字串。
     * Example: 
     * 
     */
    private String buyer_identity_code;


    /**
     * 字段描述：付款码类型。默认barcode。
     * Description: Identity code type. The default value is barcode.
     * Example: barcode
     * barcode
     */
    private String identity_code_type;


    /**
     * 字段描述：商户系统创建订单的时间。格式为 yyyyMMddHHmmss
     * Description: The time that the partner system creates the transaction, which is in a format of yyyyMMddHHmmss.
     * Example: #now{yyyyMMddHHmmss}#
     * 
     */
    private String trans_create_time;


    /**
     * 字段描述：交易信息备注。
     * Description: Transaction notes.
     * Example: 
     * 
     */
    private String memo;


    /**
     * 字段描述：当面付条形码产品固定名称，固定值为OVERSEAS_MBARCODE_PAY。
     * Description: Product name of Barcode payment , with a default value of OVERSEAS_MBARCODE_PAY.
     * Example: OVERSEAS_MBARCODE_PAY
     * OVERSEAS_MBARCODE_PAY
     */
    private String biz_product;


    /**
     * 字段描述：附加信息，填二级商户信息以及店铺信息。
     * Description: Extended information, which contains secondary merchnat information and store information.
     * Example: 
     * 
     */
    private String extend_info;


    /**
     * 字段描述：填详细的交易商品信息或行业内容信息。
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
    public void setSign(String sign) {
        if (sign != null) {
            this.sign = sign.trim();
        }
    }
    public void setSignType(String sign_type) {
        if (sign_type != null) {
            this.sign_type = sign_type.trim();
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
    public void setAlipaySellerId(String alipay_seller_id) {
        if (alipay_seller_id != null) {
            this.alipay_seller_id = alipay_seller_id.trim();
        }
    }
    public void setQuantity(String quantity) {
        if (quantity != null) {
            this.quantity = quantity.trim();
        }
    }
    public void setTransName(String trans_name) {
        if (trans_name != null) {
            this.trans_name = trans_name.trim();
        }
    }
    public void setPartnerTransId(String partner_trans_id) {
        if (partner_trans_id != null) {
            this.partner_trans_id = partner_trans_id.trim();
        }
    }
    public void setCurrency(String currency) {
        if (currency != null) {
            this.currency = currency.trim();
        }
    }
    public void setNotifyUrl(String notify_url) {
        if (notify_url != null) {
            this.notify_url = notify_url.trim();
        }
    }
    public void setTransAmount(String trans_amount) {
        if (trans_amount != null) {
            this.trans_amount = trans_amount.trim();
        }
    }
    public void setBuyerIdentityCode(String buyer_identity_code) {
        if (buyer_identity_code != null) {
            this.buyer_identity_code = buyer_identity_code.trim();
        }
    }
    public void setIdentityCodeType(String identity_code_type) {
        if (identity_code_type != null) {
            this.identity_code_type = identity_code_type.trim();
        }
    }
    public void setTransCreateTime(String trans_create_time) {
        if (trans_create_time != null) {
            this.trans_create_time = trans_create_time.trim();
        }
    }
    public void setMemo(String memo) {
        if (memo != null) {
            this.memo = memo.trim();
        }
    }
    public void setBizProduct(String biz_product) {
        if (biz_product != null) {
            this.biz_product = biz_product.trim();
        }
    }
    public void setExtendInfo(String extend_info) {
        if (extend_info != null) {
            this.extend_info = extend_info.trim();
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

    public String getSign() {
        return sign;
    }

    public String getSignType() {
        return sign_type;
    }

    public String getPartner() {
        return partner;
    }

    public String getInputCharset() {
        return _input_charset;
    }

    public String getAlipaySellerId() {
        return alipay_seller_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getTransName() {
        return trans_name;
    }

    public String getPartnerTransId() {
        return partner_trans_id;
    }

    public String getCurrency() {
        return currency;
    }

    public String getNotifyUrl() {
        return notify_url;
    }

    public String getTransAmount() {
        return trans_amount;
    }

    public String getBuyerIdentityCode() {
        return buyer_identity_code;
    }

    public String getIdentityCodeType() {
        return identity_code_type;
    }

    public String getTransCreateTime() {
        return trans_create_time;
    }

    public String getMemo() {
        return memo;
    }

    public String getBizProduct() {
        return biz_product;
    }

    public String getExtendInfo() {
        return extend_info;
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
        if (alipay_seller_id != null && !alipay_seller_id.equals("") && !alipay_seller_id.equals("null")) {
            para.put("alipay_seller_id", alipay_seller_id);
        }
        if (biz_product != null && !biz_product.equals("") && !biz_product.equals("null")) {
            para.put("biz_product", biz_product);
        }
        if (buyer_identity_code != null && !buyer_identity_code.equals("") && !buyer_identity_code.equals("null")) {
            para.put("buyer_identity_code", buyer_identity_code);
        }
        if (currency != null && !currency.equals("") && !currency.equals("null")) {
            para.put("currency", currency);
        }
        if (extend_info != null && !extend_info.equals("") && !extend_info.equals("null")) {
            para.put("extend_info", extend_info);
        }
        if (identity_code_type != null && !identity_code_type.equals("") && !identity_code_type.equals("null")) {
            para.put("identity_code_type", identity_code_type);
        }
        if (memo != null && !memo.equals("") && !memo.equals("null")) {
            para.put("memo", memo);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (partner_trans_id != null && !partner_trans_id.equals("") && !partner_trans_id.equals("null")) {
            para.put("partner_trans_id", partner_trans_id);
        }
        if (quantity != null && !quantity.equals("") && !quantity.equals("null")) {
            para.put("quantity", quantity);
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
        if (trade_information != null && !trade_information.equals("") && !trade_information.equals("null")) {
            para.put("trade_information", trade_information);
        }
        if (trans_amount != null && !trans_amount.equals("") && !trans_amount.equals("null")) {
            para.put("trans_amount", trans_amount);
        }
        if (trans_create_time != null && !trans_create_time.equals("") && !trans_create_time.equals("null")) {
            para.put("trans_create_time", trans_create_time);
        }
        if (trans_name != null && !trans_name.equals("") && !trans_name.equals("null")) {
            para.put("trans_name", trans_name);
        }

        return para;
    }
}
