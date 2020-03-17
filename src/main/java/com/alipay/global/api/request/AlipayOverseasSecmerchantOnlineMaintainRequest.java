package com.alipay.global.api.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;

public class AlipayOverseasSecmerchantOnlineMaintainRequest extends AlipayRequest {

    /**
     * 字段描述：服务名
     * Description: service name
     * Example: alipay.overseas.secmerchant.online.maintain
     * alipay.overseas.secmerchant.online.maintain
     */
    private String service = "alipay.overseas.secmerchant.online.maintain";


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
     * 字段描述：服务商发送请求的时间戳
     * Description: 
     * Example: 
     * 
     */
    private String timestamp;


    /**
     * 字段描述：
     * Description: 
     * Example: Mika's coffee shop
     * 
     */
    private String secondary_merchant_name;


    /**
     * 字段描述：
     * Description: 
     * Example: MID_#auto#
     * 
     */
    private String secondary_merchant_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 5499
     * 
     */
    private String secondary_merchant_industry;


    /**
     * 字段描述：
     * Description: 
     * Example: US
     * 
     */
    private String register_country;


    /**
     * 字段描述：
     * Description: 
     * Example: 3 Old Concord Rd, Burlington, MA 01803美国
     * 
     */
    private String register_address;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String site_infos;


    /**
     * 字段描述：
     * Description: 
     * Example: INDIVIDUAL
     * INDIVIDUAL ENTERPRISE
     */
    private String secondary_merchant_type;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String registration_no;


    /**
     * 字段描述：
     * Description: 
     * Example: mika
     * 
     */
    private String shareholder_name;


    /**
     * 字段描述：
     * Description: 
     * Example: 3428000000000000
     * 
     */
    private String shareholder_id;


    /**
     * 字段描述：
     * Description: 如果是ENTERPRISE可以不填
     * Example: 
     * 
     */
    private String representative_name;


    /**
     * 字段描述：
     * Description: 如果是ENTERPRISE可以不填
     * Example: 
     * 
     */
    private String representative_id;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String settlement_no;


    /**
     * 字段描述：
     * Description: 
     * Example: 18688888888
     * 
     */
    private String contact_no;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String contact_email;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String cs_no;


    /**
     * 字段描述：
     * Description: 
     * Example: 
     * 
     */
    private String cs_email;

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
    public void setSecondaryMerchantName(String secondary_merchant_name) {
        if (secondary_merchant_name != null) {
            this.secondary_merchant_name = secondary_merchant_name.trim();
        }
    }
    public void setSecondaryMerchantId(String secondary_merchant_id) {
        if (secondary_merchant_id != null) {
            this.secondary_merchant_id = secondary_merchant_id.trim();
        }
    }
    public void setSecondaryMerchantIndustry(String secondary_merchant_industry) {
        if (secondary_merchant_industry != null) {
            this.secondary_merchant_industry = secondary_merchant_industry.trim();
        }
    }
    public void setRegisterCountry(String register_country) {
        if (register_country != null) {
            this.register_country = register_country.trim();
        }
    }
    public void setRegisterAddress(String register_address) {
        if (register_address != null) {
            this.register_address = register_address.trim();
        }
    }
    public void setSiteInfos(String site_infos) {
        if (site_infos != null) {
            this.site_infos = site_infos.trim();
        }
    }
    public void setSecondaryMerchantType(String secondary_merchant_type) {
        if (secondary_merchant_type != null) {
            this.secondary_merchant_type = secondary_merchant_type.trim();
        }
    }
    public void setRegistrationNo(String registration_no) {
        if (registration_no != null) {
            this.registration_no = registration_no.trim();
        }
    }
    public void setShareholderName(String shareholder_name) {
        if (shareholder_name != null) {
            this.shareholder_name = shareholder_name.trim();
        }
    }
    public void setShareholderId(String shareholder_id) {
        if (shareholder_id != null) {
            this.shareholder_id = shareholder_id.trim();
        }
    }
    public void setRepresentativeName(String representative_name) {
        if (representative_name != null) {
            this.representative_name = representative_name.trim();
        }
    }
    public void setRepresentativeId(String representative_id) {
        if (representative_id != null) {
            this.representative_id = representative_id.trim();
        }
    }
    public void setSettlementNo(String settlement_no) {
        if (settlement_no != null) {
            this.settlement_no = settlement_no.trim();
        }
    }
    public void setContactNo(String contact_no) {
        if (contact_no != null) {
            this.contact_no = contact_no.trim();
        }
    }
    public void setContactEmail(String contact_email) {
        if (contact_email != null) {
            this.contact_email = contact_email.trim();
        }
    }
    public void setCsNo(String cs_no) {
        if (cs_no != null) {
            this.cs_no = cs_no.trim();
        }
    }
    public void setCsEmail(String cs_email) {
        if (cs_email != null) {
            this.cs_email = cs_email.trim();
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

    public String getSecondaryMerchantName() {
        return secondary_merchant_name;
    }

    public String getSecondaryMerchantId() {
        return secondary_merchant_id;
    }

    public String getSecondaryMerchantIndustry() {
        return secondary_merchant_industry;
    }

    public String getRegisterCountry() {
        return register_country;
    }

    public String getRegisterAddress() {
        return register_address;
    }

    public String getSiteInfos() {
        return site_infos;
    }

    public String getSecondaryMerchantType() {
        return secondary_merchant_type;
    }

    public String getRegistrationNo() {
        return registration_no;
    }

    public String getShareholderName() {
        return shareholder_name;
    }

    public String getShareholderId() {
        return shareholder_id;
    }

    public String getRepresentativeName() {
        return representative_name;
    }

    public String getRepresentativeId() {
        return representative_id;
    }

    public String getSettlementNo() {
        return settlement_no;
    }

    public String getContactNo() {
        return contact_no;
    }

    public String getContactEmail() {
        return contact_email;
    }

    public String getCsNo() {
        return cs_no;
    }

    public String getCsEmail() {
        return cs_email;
    }



    @Override
    public Map<String, String> parameters() {
        Map<String, String> para = other_param == null ? new HashMap<>() : new HashMap<>(other_param);

        
        if (_input_charset != null && !_input_charset.equals("") && !_input_charset.equals("null")) {
            para.put("_input_charset", _input_charset);
        }
        if (contact_email != null && !contact_email.equals("") && !contact_email.equals("null")) {
            para.put("contact_email", contact_email);
        }
        if (contact_no != null && !contact_no.equals("") && !contact_no.equals("null")) {
            para.put("contact_no", contact_no);
        }
        if (cs_email != null && !cs_email.equals("") && !cs_email.equals("null")) {
            para.put("cs_email", cs_email);
        }
        if (cs_no != null && !cs_no.equals("") && !cs_no.equals("null")) {
            para.put("cs_no", cs_no);
        }
        if (partner != null && !partner.equals("") && !partner.equals("null")) {
            para.put("partner", partner);
        }
        if (register_address != null && !register_address.equals("") && !register_address.equals("null")) {
            para.put("register_address", register_address);
        }
        if (register_country != null && !register_country.equals("") && !register_country.equals("null")) {
            para.put("register_country", register_country);
        }
        if (registration_no != null && !registration_no.equals("") && !registration_no.equals("null")) {
            para.put("registration_no", registration_no);
        }
        if (representative_id != null && !representative_id.equals("") && !representative_id.equals("null")) {
            para.put("representative_id", representative_id);
        }
        if (representative_name != null && !representative_name.equals("") && !representative_name.equals("null")) {
            para.put("representative_name", representative_name);
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
        if (secondary_merchant_type != null && !secondary_merchant_type.equals("") && !secondary_merchant_type.equals("null")) {
            para.put("secondary_merchant_type", secondary_merchant_type);
        }
        if (service != null && !service.equals("") && !service.equals("null")) {
            para.put("service", service);
        }
        if (settlement_no != null && !settlement_no.equals("") && !settlement_no.equals("null")) {
            para.put("settlement_no", settlement_no);
        }
        if (shareholder_id != null && !shareholder_id.equals("") && !shareholder_id.equals("null")) {
            para.put("shareholder_id", shareholder_id);
        }
        if (shareholder_name != null && !shareholder_name.equals("") && !shareholder_name.equals("null")) {
            para.put("shareholder_name", shareholder_name);
        }
        if (sign != null && !sign.equals("") && !sign.equals("null")) {
            para.put("sign", sign);
        }
        if (sign_type != null && !sign_type.equals("") && !sign_type.equals("null")) {
            para.put("sign_type", sign_type);
        }
        if (site_infos != null && !site_infos.equals("") && !site_infos.equals("null")) {
            para.put("site_infos", site_infos);
        }
        if (timestamp != null && !timestamp.equals("") && !timestamp.equals("null")) {
            para.put("timestamp", timestamp);
        }

        return para;
    }
}
