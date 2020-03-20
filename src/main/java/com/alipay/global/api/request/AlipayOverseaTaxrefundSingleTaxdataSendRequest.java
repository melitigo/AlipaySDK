package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayOverseaTaxrefundSingleTaxdataSendRequest extends AlipayRequest {

    /**
     * 字段描述：接口名称
     * Description: Name of the interface
     * Example: alipay.oversea.taxrefund.single.taxdata.send
     * alipay.oversea.taxrefund.single.taxdata.send
     */
    private String service = "alipay.oversea.taxrefund.single.taxdata.send";


    /**
     * 字段描述：支付宝ID，2088开头的16位数字
     * Description: 签约的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
     * Example: 
     * 
     */
    private String partner;


    /**
     * 字段描述：字符集，推荐UTF-8
     * Description: Charset of this request, it's recommended to use UTF-8
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
     * Description: 此参数表明接口的调用时间,支付宝会在一定时间内失效此调用,默认半小时,此时间目前以北京时间为准。
格式：yyyy-MM-dd HH:mm:ss
     * Example: #now{yyyy-MM-dd HH:mm:ss}#
     * 
     */
    private String timestamp;


    /**
     * 字段描述：支付宝处理成功或失败后会异步通知商户结果，它是以post的方式提交
     * Description: 支付宝处理成功或失败后会异步通知商户结果，它是以post的方式提交
     * Example: 
     * 
     */
    private String notify_url;


    /**
     * 字段描述：
     * Description: 退税机构的业务唯一流水号。英文字符数字构成且长度要求不能小于3且不能大于64。
     * Example: ORDER_#auto#
     * 
     */
    private String out_order_no;


    /**
     * 字段描述：
     * Description: 退税单的流水号，一般由退税公司给出，可与外部流水号相同。英文字符数字构成且长度要求不能小于3且不能大于64。
     * Example: 
     * 
     */
    private String doc_id;


    /**
     * 字段描述：
     * Description: 用户购物时间，此时间以北京时间为准。必须早于接口调用时间.
格式：yyyy-MM-dd HH:mm:ss
     * Example: 
     * 
     */
    private String sales_date;


    /**
     * 字段描述：
     * Description: 退税打印时间，此时间以北京时间为准。必须早于接口调用时间
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
     * Description: 用户最终确认放款至支付宝账户的时间，此时间以北京时间为准。必须早于接口调用时间
格式：yyyy-MM-dd HH:mm:ss
     * Example: 
     * 
     */
    private String confirm_date;


    /**
     * 字段描述：
     * Description: ISO标准alpha-2国家代码。
     * Example: 
     * 
     */
    private String country_code;


    /**
     * 字段描述：
     * Description: ISO标准购物国家alpha-3币种代码
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
     * Description: 实际退税国家币种，目前仅支持CNY
     * Example: 
     * 
     */
    private String final_refund_currency;


    /**
     * 字段描述：
     * Description: 实际退税金额，为数字格式，最多小数点后两位。不能超过100万
     * Example: 
     * 
     */
    private String final_refund_amount;


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
     * Description: 退税机构扫用户钱包条形码读取到的18位动态数字ID。refund_scene_type为03或者06时，phone_no和barcode_no不能同时非空
     * Example: 
     * 
     */
    private String barcode_no;


    /**
     * 字段描述：
     * Description: 用户支付宝账户绑定的手机号码。refund_scene_type为03或者06时，phone_no和barcode_no不能同时非空
     * Example: 
     * 
     */
    private String phone_no;


    /**
     * 字段描述：
     * Description: 用户确认的支付宝事先发给退税公司对应的alipay_user_id。
担保退税只能通过alipay_user_id退税，不支持barcode_no和phone_no退税
。refund_scene_type为01或者02或者07时，参数非空
     * Example: 
     * 
     */
    private String alipay_user_id;


    /**
     * 字段描述：
     * Description: 退税数据的有效天数，为数字格式，15<= available_day <=30，超过该天数未被处理的，则作为退税失败的数据。
     * Example: 
     * 
     */
    private String available_day;


    /**
     * 字段描述：
     * Description: 以备新增字段使用。
     * Example: 
     * 
     */
    private String memo;


    /**
     * 字段描述：
     * Description: 出境口岸
     * Example: 
     * 
     */
    private String departure_point;


    /**
     * 字段描述：
     * Description: 必须为01，02，03，06 ，07, 08 五者之一。01 市区退税，需要使用接口1+接口2+接口3
02 机场退税KOISK机器退税，可使用接口1+接口3
03 机场实时退税，使用接口3
06  mailbox退税，使用接口3
07  担保退税，使用接口3
（注：接口1与接口3已进行了解绑）
08 市区预约-手机退税 使用接口3
     * Example: 
     * 
     */
    private String refund_scene_type;


    /**
     * 字段描述：
     * Description: 退税单所属公司
     * Example: 
     * 
     */
    private String refund_company_name;


    /**
     * 字段描述：
     * Description: 支付宝的资金授权订单号。支付宝的资金授权订单号，担保退税（退税类型为07）该字段必传
     * Example: 
     * 
     */
    private String auth_no;

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
    public void setNotifyUrl(String notify_url) {
        if (notify_url != null) {
            this.notify_url = notify_url.trim();
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
    public void setConfirmDate(String confirm_date) {
        if (confirm_date != null) {
            this.confirm_date = confirm_date.trim();
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
    public void setFinalRefundCurrency(String final_refund_currency) {
        if (final_refund_currency != null) {
            this.final_refund_currency = final_refund_currency.trim();
        }
    }
    public void setFinalRefundAmount(String final_refund_amount) {
        if (final_refund_amount != null) {
            this.final_refund_amount = final_refund_amount.trim();
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
    public void setAlipayUserId(String alipay_user_id) {
        if (alipay_user_id != null) {
            this.alipay_user_id = alipay_user_id.trim();
        }
    }
    public void setAvailableDay(String available_day) {
        if (available_day != null) {
            this.available_day = available_day.trim();
        }
    }
    public void setMemo(String memo) {
        if (memo != null) {
            this.memo = memo.trim();
        }
    }
    public void setDeparturePoint(String departure_point) {
        if (departure_point != null) {
            this.departure_point = departure_point.trim();
        }
    }
    public void setRefundSceneType(String refund_scene_type) {
        if (refund_scene_type != null) {
            this.refund_scene_type = refund_scene_type.trim();
        }
    }
    public void setRefundCompanyName(String refund_company_name) {
        if (refund_company_name != null) {
            this.refund_company_name = refund_company_name.trim();
        }
    }
    public void setAuthNo(String auth_no) {
        if (auth_no != null) {
            this.auth_no = auth_no.trim();
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

    public String getNotifyUrl() {
        return notify_url;
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

    public String getConfirmDate() {
        return confirm_date;
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

    public String getFinalRefundCurrency() {
        return final_refund_currency;
    }

    public String getFinalRefundAmount() {
        return final_refund_amount;
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

    public String getAlipayUserId() {
        return alipay_user_id;
    }

    public String getAvailableDay() {
        return available_day;
    }

    public String getMemo() {
        return memo;
    }

    public String getDeparturePoint() {
        return departure_point;
    }

    public String getRefundSceneType() {
        return refund_scene_type;
    }

    public String getRefundCompanyName() {
        return refund_company_name;
    }

    public String getAuthNo() {
        return auth_no;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (alipay_user_id != null && !alipay_user_id.equals("") && !alipay_user_id.equals("null")) {
            para.put("alipay_user_id", alipay_user_id);
        }
        if (auth_no != null && !auth_no.equals("") && !auth_no.equals("null")) {
            para.put("auth_no", auth_no);
        }
        if (available_day != null && !available_day.equals("") && !available_day.equals("null")) {
            para.put("available_day", available_day);
        }
        if (barcode_no != null && !barcode_no.equals("") && !barcode_no.equals("null")) {
            para.put("barcode_no", barcode_no);
        }
        if (confirm_date != null && !confirm_date.equals("") && !confirm_date.equals("null")) {
            para.put("confirm_date", confirm_date);
        }
        if (country_code != null && !country_code.equals("") && !country_code.equals("null")) {
            para.put("country_code", country_code);
        }
        if (departure_point != null && !departure_point.equals("") && !departure_point.equals("null")) {
            para.put("departure_point", departure_point);
        }
        if (doc_expire_date != null && !doc_expire_date.equals("") && !doc_expire_date.equals("null")) {
            para.put("doc_expire_date", doc_expire_date);
        }
        if (doc_id != null && !doc_id.equals("") && !doc_id.equals("null")) {
            para.put("doc_id", doc_id);
        }
        if (final_refund_amount != null && !final_refund_amount.equals("") && !final_refund_amount.equals("null")) {
            para.put("final_refund_amount", final_refund_amount);
        }
        if (final_refund_currency != null && !final_refund_currency.equals("") && !final_refund_currency.equals("null")) {
            para.put("final_refund_currency", final_refund_currency);
        }
        if (memo != null && !memo.equals("") && !memo.equals("null")) {
            para.put("memo", memo);
        }
        if (nationality != null && !nationality.equals("") && !nationality.equals("null")) {
            para.put("nationality", nationality);
        }
        if (notify_url != null && !notify_url.equals("") && !notify_url.equals("null")) {
            para.put("notify_url", notify_url);
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
        if (refund_company_name != null && !refund_company_name.equals("") && !refund_company_name.equals("null")) {
            para.put("refund_company_name", refund_company_name);
        }
        if (refund_currency != null && !refund_currency.equals("") && !refund_currency.equals("null")) {
            para.put("refund_currency", refund_currency);
        }
        if (refund_print_date != null && !refund_print_date.equals("") && !refund_print_date.equals("null")) {
            para.put("refund_print_date", refund_print_date);
        }
        if (refund_scene_type != null && !refund_scene_type.equals("") && !refund_scene_type.equals("null")) {
            para.put("refund_scene_type", refund_scene_type);
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
