package com.windf.study.springcloud.growing.domain;

/**
 * 用户信息
 */
public class User {
    private String siteCode;        // 必填项，区分站点
    private String sessionId;       // 用户的会话标识
    private String loginId;         // 用户的登录ID
    private String ip;              // 访问的ip
    private String userAgent;       // 用户访问信息
    private String acceptLanguage;  // 请求的语言

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }
}
