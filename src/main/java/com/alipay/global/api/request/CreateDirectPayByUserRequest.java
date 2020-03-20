package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class CreateDirectPayByUserRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: create_direct_pay_by_user
     * create_direct_pay_by_user
     */
    private String service = "create_direct_pay_by_user";


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
     * Description: 同步跳转地址
     * Example: 
     * 
     */
    private String return_url;


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
     * Description: 
     * Example: 0.01
     * 
     */
    private String total_fee;


    /**
     * 字段描述：
     * Description: 填卖家PID
     * Example: 2088102135220161
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
    private String seller_account_name;


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
    private String body;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String show_url;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String enable_paymethod;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String disable_paymethod;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String anti_phishing_key;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String exter_invoke_ip;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String extra_common_param;


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
    private String token;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String qr_pay_mode;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String qrcode_width;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String need_buyer_realnamed;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String hb_fq_param;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String goods_type;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String ext_user_info;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String extend_param;

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
    public void setSellerAccountName(String seller_account_name) {
        if (seller_account_name != null) {
            this.seller_account_name = seller_account_name.trim();
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
    public void setEnablePaymethod(String enable_paymethod) {
        if (enable_paymethod != null) {
            this.enable_paymethod = enable_paymethod.trim();
        }
    }
    public void setDisablePaymethod(String disable_paymethod) {
        if (disable_paymethod != null) {
            this.disable_paymethod = disable_paymethod.trim();
        }
    }
    public void setAntiPhishingKey(String anti_phishing_key) {
        if (anti_phishing_key != null) {
            this.anti_phishing_key = anti_phishing_key.trim();
        }
    }
    public void setExterInvokeIp(String exter_invoke_ip) {
        if (exter_invoke_ip != null) {
            this.exter_invoke_ip = exter_invoke_ip.trim();
        }
    }
    public void setExtraCommonParam(String extra_common_param) {
        if (extra_common_param != null) {
            this.extra_common_param = extra_common_param.trim();
        }
    }
    public void setItBPay(String it_b_pay) {
        if (it_b_pay != null) {
            this.it_b_pay = it_b_pay.trim();
        }
    }
    public void setToken(String token) {
        if (token != null) {
            this.token = token.trim();
        }
    }
    public void setQrPayMode(String qr_pay_mode) {
        if (qr_pay_mode != null) {
            this.qr_pay_mode = qr_pay_mode.trim();
        }
    }
    public void setQrcodeWidth(String qrcode_width) {
        if (qrcode_width != null) {
            this.qrcode_width = qrcode_width.trim();
        }
    }
    public void setNeedBuyerRealnamed(String need_buyer_realnamed) {
        if (need_buyer_realnamed != null) {
            this.need_buyer_realnamed = need_buyer_realnamed.trim();
        }
    }
    public void setHbFqParam(String hb_fq_param) {
        if (hb_fq_param != null) {
            this.hb_fq_param = hb_fq_param.trim();
        }
    }
    public void setGoodsType(String goods_type) {
        if (goods_type != null) {
            this.goods_type = goods_type.trim();
        }
    }
    public void setExtUserInfo(String ext_user_info) {
        if (ext_user_info != null) {
            this.ext_user_info = ext_user_info.trim();
        }
    }
    public void setExtendParam(String extend_param) {
        if (extend_param != null) {
            this.extend_param = extend_param.trim();
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

    public String getOutTradeNo() {
        return out_trade_no;
    }

    public String getSubject() {
        return subject;
    }

    public String getPaymentType() {
        return payment_type;
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

    public String getSellerAccountName() {
        return seller_account_name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getBody() {
        return body;
    }

    public String getShowUrl() {
        return show_url;
    }

    public String getEnablePaymethod() {
        return enable_paymethod;
    }

    public String getDisablePaymethod() {
        return disable_paymethod;
    }

    public String getAntiPhishingKey() {
        return anti_phishing_key;
    }

    public String getExterInvokeIp() {
        return exter_invoke_ip;
    }

    public String getExtraCommonParam() {
        return extra_common_param;
    }

    public String getItBPay() {
        return it_b_pay;
    }

    public String getToken() {
        return token;
    }

    public String getQrPayMode() {
        return qr_pay_mode;
    }

    public String getQrcodeWidth() {
        return qrcode_width;
    }

    public String getNeedBuyerRealnamed() {
        return need_buyer_realnamed;
    }

    public String getHbFqParam() {
        return hb_fq_param;
    }

    public String getGoodsType() {
        return goods_type;
    }

    public String getExtUserInfo() {
        return ext_user_info;
    }

    public String getExtendParam() {
        return extend_param;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (anti_phishing_key != null && !anti_phishing_key.equals("") && !anti_phishing_key.equals("null")) {
            para.put("anti_phishing_key", anti_phishing_key);
        }
        if (body != null && !body.equals("") && !body.equals("null")) {
            para.put("body", body);
        }
        if (disable_paymethod != null && !disable_paymethod.equals("") && !disable_paymethod.equals("null")) {
            para.put("disable_paymethod", disable_paymethod);
        }
        if (enable_paymethod != null && !enable_paymethod.equals("") && !enable_paymethod.equals("null")) {
            para.put("enable_paymethod", enable_paymethod);
        }
        if (ext_user_info != null && !ext_user_info.equals("") && !ext_user_info.equals("null")) {
            para.put("ext_user_info", ext_user_info);
        }
        if (extend_param != null && !extend_param.equals("") && !extend_param.equals("null")) {
            para.put("extend_param", extend_param);
        }
        if (exter_invoke_ip != null && !exter_invoke_ip.equals("") && !exter_invoke_ip.equals("null")) {
            para.put("exter_invoke_ip", exter_invoke_ip);
        }
        if (extra_common_param != null && !extra_common_param.equals("") && !extra_common_param.equals("null")) {
            para.put("extra_common_param", extra_common_param);
        }
        if (goods_type != null && !goods_type.equals("") && !goods_type.equals("null")) {
            para.put("goods_type", goods_type);
        }
        if (hb_fq_param != null && !hb_fq_param.equals("") && !hb_fq_param.equals("null")) {
            para.put("hb_fq_param", hb_fq_param);
        }
        if (it_b_pay != null && !it_b_pay.equals("") && !it_b_pay.equals("null")) {
            para.put("it_b_pay", it_b_pay);
        }
        if (need_buyer_realnamed != null && !need_buyer_realnamed.equals("") && !need_buyer_realnamed.equals("null")) {
            para.put("need_buyer_realnamed", need_buyer_realnamed);
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
        if (price != null && !price.equals("") && !price.equals("null")) {
            para.put("price", price);
        }
        if (qr_pay_mode != null && !qr_pay_mode.equals("") && !qr_pay_mode.equals("null")) {
            para.put("qr_pay_mode", qr_pay_mode);
        }
        if (qrcode_width != null && !qrcode_width.equals("") && !qrcode_width.equals("null")) {
            para.put("qrcode_width", qrcode_width);
        }
        if (quantity != null && !quantity.equals("") && !quantity.equals("null")) {
            para.put("quantity", quantity);
        }
        if (return_url != null && !return_url.equals("") && !return_url.equals("null")) {
            para.put("return_url", return_url);
        }
        if (seller_account_name != null && !seller_account_name.equals("") && !seller_account_name.equals("null")) {
            para.put("seller_account_name", seller_account_name);
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
        if (token != null && !token.equals("") && !token.equals("null")) {
            para.put("token", token);
        }
        if (total_fee != null && !total_fee.equals("") && !total_fee.equals("null")) {
            para.put("total_fee", total_fee);
        }

        return para;
    }
}
