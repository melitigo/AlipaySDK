package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayOverseaTaxrefundSingleAccountQueryRequest extends AlipayRequest {

    /**
     * 字段描述：服务名
     * Description: service name
     * Example: alipay.oversea.taxrefund.single.account.query
     * alipay.oversea.taxrefund.single.account.query
     */
    private String service = "alipay.oversea.taxrefund.single.account.query";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: Merchant ID in Alipay system, a 16 digits number starting with 2088
     * Example: 
     * 
     */
    private String partner;


    /**
     * 字段描述：字符集，推荐UTF-8
     * Description: 
     * Example: 
     * 
     */
    private String _input_charset;


    /**
     * 字段描述：签名算法
     * Description: Signature algorithm
     * Example: RSA
     * RSA2 RSA
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
     * 字段描述：服务商发送请求的时间戳
     * Description: 
     * Example: #now{yyyy-MM-dd HH:mm:ss}#
     * 
     */
    private String timestamp;


    /**
     * 字段描述：
     * Description: 退税机构的业务唯一流水号，英文字母数字构成，长度要求不能小于3且不大于64。
     * Example: 
     * 
     */
    private String out_order_no;


    /**
     * 字段描述：
     * Description: 退税单的流水号，一般由退税公司给出，可与外部流水号相同,英文字母数字构成，长度要求不能小于3且不大于64。
     * Example: 
     * 
     */
    private String doc_id;


    /**
     * 字段描述：
     * Description: 用户购物时间，此时间以北京时间为准。且时间必须早于接口调用时间.yyyy-MM-dd HH:mm:ss
     * Example: 
     * 
     */
    private String sales_date;


    /**
     * 字段描述：
     * Description: 退税打印时间，此时间以北京时间为准，且该时间必须早于接口调用时间。
格式：yyyy-MM-dd HH:mm:ss
     * Example: 
     * 
     */
    private String refund_print_date;


    /**
     * 字段描述：
     * Description: 退税单过期时间，此时间以北京时间为准，必须晚于接口调用时间。格式：yyyy-MM-dd HH:mm:ss
     * Example: 
     * 
     */
    private String doc_expire_date;


    /**
     * 字段描述：
     * Description: ISO标准alpha-2国家代码。
     * Example: 
     * 
     */
    private String country_code;


    /**
     * 字段描述：
     * Description: ISO标准购物国家alpha-3币种代码。
     * Example: 
     * 
     */
    private String sales_currency;


    /**
     * 字段描述：
     * Description: 退税单上的购物金额，为数字格式，最多小数点后两位。
     * Example: 
     * 
     */
    private String sales_amount;


    /**
     * 字段描述：
     * Description: ISO标准退税国家alpha-3币种代码
     * Example: 
     * 
     */
    private String refund_currency;


    /**
     * 字段描述：
     * Description: 退税金额，为数字格式，最多小数点后两位。
     * Example: 
     * 
     */
    private String refund_amount;


    /**
     * 字段描述：
     * Description: 用户护照上的姓名，英文。
     * Example: 
     * 
     */
    private String passport_name;


    /**
     * 字段描述：
     * Description: 用户的护照号。
     * Example: 
     * 
     */
    private String passport_no;


    /**
     * 字段描述：
     * Description: 用户护照上的国籍，英文。
     * Example: 
     * 
     */
    private String nationality;


    /**
     * 字段描述：
     * Description: 退税机构扫用户钱包条形码读取到的18位动态数字ID，与支付宝绑定手机号码不可同时为空
     * Example: 
     * 
     */
    private String barcode_no;


    /**
     * 字段描述：
     * Description: 用户支付宝账户绑定的手机号码，与钱包条形码读取ID不可同时为空
     * Example: 
     * 
     */
    private String phone_no;


    /**
     * 字段描述：
     * Description: 用户支付宝登录号,与钱包条形码读取ID,手机号码不可同时为空
     * Example: 
     * 
     */
    private String logon_id;


    /**
     * 字段描述：
     * Description: 以备新增字段使用。
     * Example: 
     * 
     */
    private String memo;

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
    public void setTimestamp(String timestamp) {
        if (timestamp != null) {
            this.timestamp = timestamp.trim();
        }
    }
    public void setOutOrderNo(String out_order_no) {
        if (out_order_no != null) {
            this.out_order_no = out_order_no.trim();
        }
    }
    public void setDocId(String doc_id) {
        if (doc_id != null) {
            this.doc_id = doc_id.trim();
        }
    }
    public void setSalesDate(String sales_date) {
        if (sales_date != null) {
            this.sales_date = sales_date.trim();
        }
    }
    public void setRefundPrintDate(String refund_print_date) {
        if (refund_print_date != null) {
            this.refund_print_date = refund_print_date.trim();
        }
    }
    public void setDocExpireDate(String doc_expire_date) {
        if (doc_expire_date != null) {
            this.doc_expire_date = doc_expire_date.trim();
        }
    }
    public void setCountryCode(String country_code) {
        if (country_code != null) {
            this.country_code = country_code.trim();
        }
    }
    public void setSalesCurrency(String sales_currency) {
        if (sales_currency != null) {
            this.sales_currency = sales_currency.trim();
        }
    }
    public void setSalesAmount(String sales_amount) {
        if (sales_amount != null) {
            this.sales_amount = sales_amount.trim();
        }
    }
    public void setRefundCurrency(String refund_currency) {
        if (refund_currency != null) {
            this.refund_currency = refund_currency.trim();
        }
    }
    public void setRefundAmount(String refund_amount) {
        if (refund_amount != null) {
            this.refund_amount = refund_amount.trim();
        }
    }
    public void setPassportName(String passport_name) {
        if (passport_name != null) {
            this.passport_name = passport_name.trim();
        }
    }
    public void setPassportNo(String passport_no) {
        if (passport_no != null) {
            this.passport_no = passport_no.trim();
        }
    }
    public void setNationality(String nationality) {
        if (nationality != null) {
            this.nationality = nationality.trim();
        }
    }
    public void setBarcodeNo(String barcode_no) {
        if (barcode_no != null) {
            this.barcode_no = barcode_no.trim();
        }
    }
    public void setPhoneNo(String phone_no) {
        if (phone_no != null) {
            this.phone_no = phone_no.trim();
        }
    }
    public void setLogonId(String logon_id) {
        if (logon_id != null) {
            this.logon_id = logon_id.trim();
        }
    }
    public void setMemo(String memo) {
        if (memo != null) {
            this.memo = memo.trim();
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

    public String getTimestamp() {
        return timestamp;
    }

    public String getOutOrderNo() {
        return out_order_no;
    }

    public String getDocId() {
        return doc_id;
    }

    public String getSalesDate() {
        return sales_date;
    }

    public String getRefundPrintDate() {
        return refund_print_date;
    }

    public String getDocExpireDate() {
        return doc_expire_date;
    }

    public String getCountryCode() {
        return country_code;
    }

    public String getSalesCurrency() {
        return sales_currency;
    }

    public String getSalesAmount() {
        return sales_amount;
    }

    public String getRefundCurrency() {
        return refund_currency;
    }

    public String getRefundAmount() {
        return refund_amount;
    }

    public String getPassportName() {
        return passport_name;
    }

    public String getPassportNo() {
        return passport_no;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBarcodeNo() {
        return barcode_no;
    }

    public String getPhoneNo() {
        return phone_no;
    }

    public String getLogonId() {
        return logon_id;
    }

    public String getMemo() {
        return memo;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (barcode_no != null && !barcode_no.equals("") && !barcode_no.equals("null")) {
            para.put("barcode_no", barcode_no);
        }
        if (country_code != null && !country_code.equals("") && !country_code.equals("null")) {
            para.put("country_code", country_code);
        }
        if (doc_expire_date != null && !doc_expire_date.equals("") && !doc_expire_date.equals("null")) {
            para.put("doc_expire_date", doc_expire_date);
        }
        if (doc_id != null && !doc_id.equals("") && !doc_id.equals("null")) {
            para.put("doc_id", doc_id);
        }
        if (logon_id != null && !logon_id.equals("") && !logon_id.equals("null")) {
            para.put("logon_id", logon_id);
        }
        if (memo != null && !memo.equals("") && !memo.equals("null")) {
            para.put("memo", memo);
        }
        if (nationality != null && !nationality.equals("") && !nationality.equals("null")) {
            para.put("nationality", nationality);
        }
        if (out_order_no != null && !out_order_no.equals("") && !out_order_no.equals("null")) {
            para.put("out_order_no", out_order_no);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (passport_name != null && !passport_name.equals("") && !passport_name.equals("null")) {
            para.put("passport_name", passport_name);
        }
        if (passport_no != null && !passport_no.equals("") && !passport_no.equals("null")) {
            para.put("passport_no", passport_no);
        }
        if (phone_no != null && !phone_no.equals("") && !phone_no.equals("null")) {
            para.put("phone_no", phone_no);
        }
        if (refund_amount != null && !refund_amount.equals("") && !refund_amount.equals("null")) {
            para.put("refund_amount", refund_amount);
        }
        if (refund_currency != null && !refund_currency.equals("") && !refund_currency.equals("null")) {
            para.put("refund_currency", refund_currency);
        }
        if (refund_print_date != null && !refund_print_date.equals("") && !refund_print_date.equals("null")) {
            para.put("refund_print_date", refund_print_date);
        }
        if (sales_amount != null && !sales_amount.equals("") && !sales_amount.equals("null")) {
            para.put("sales_amount", sales_amount);
        }
        if (sales_currency != null && !sales_currency.equals("") && !sales_currency.equals("null")) {
            para.put("sales_currency", sales_currency);
        }
        if (sales_date != null && !sales_date.equals("") && !sales_date.equals("null")) {
            para.put("sales_date", sales_date);
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
        if (timestamp != null && !timestamp.equals("") && !timestamp.equals("null")) {
            para.put("timestamp", timestamp);
        }

        return para;
    }
}
