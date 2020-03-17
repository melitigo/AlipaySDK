package com.alipay.global.api.response;


import java.util.*;

public class AlipayResponse {
    String is_success;
    String error;
    Map<String, String> request;
    Map<String, Map<String, String>> response;
    String sign;
    String sign_type;

    public boolean isSuccess() {
        return is_success != null && is_success.equals("T");
    }

    public String getIsSuccess() {
        return is_success;
    }

    public void setIsSuccess(String is_success) {
        this.is_success = is_success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Map<String, String> getRequest() {
        return request;
    }

    public void setRequest(Map<String, String> request) {
        this.request = request;
    }

    public Map<String, String> getResponse() {
        return response.entrySet().iterator().next().getValue();
    }

    public void setResponse(Map<String, Map<String, String>> response) {
        this.response = response;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSignType() {
        return sign_type;
    }

    public void setSignType(String sign_type) {
        this.sign_type = sign_type;
    }


    public String getPreSignString() {
        if (response == null) {
            return "error=" + getError();
        }
        Map<String, String> response = getResponse();
        List<String> keys = new ArrayList<>(response.keySet());
        Collections.sort(keys);
        StringBuilder preSignString = new StringBuilder();
        for (String key : keys) {
            preSignString.append(key).append("=").append(response.get(key)).append("&");
        }

        if (preSignString.toString().endsWith("&")) {
            preSignString = new StringBuilder(preSignString.substring(0, preSignString.length() - 1));
        }
        return preSignString.toString();
    }

    @Override
    public String toString() {
        return "AlipayResponse{" +
                "is_success='" + is_success + '\'' +
                ", error='" + error + '\'' +
                ", request=" + request +
                ", response=" + response +
                ", sign='" + sign + '\'' +
                ", sign_type='" + sign_type + '\'' +
                '}';
    }
}
