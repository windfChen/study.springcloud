package com.windf.study.springcloud.growing.domain;

import java.util.Date;

/**
 * 事件信息
 */
public class Event {
    private String pageTitle;       // 请求页面的标题
    private String referrerURI;     // 来源地址
    private String requestURI;      // 访问地址
    private String code;            // 事件类型
    private String name;            // 事件名称
    private String description;     // 事件描述
    private Date beginDateTime;     // 事件发生时间
    private Date endDateTime;       // 事件结束时间
    private int loadTime;           // 加载时间，单位ms
    private int durationTime;       // 持续时间，单位ms

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getReferrerURI() {
        return referrerURI;
    }

    public void setReferrerURI(String referrerURI) {
        this.referrerURI = referrerURI;
    }

    public String getRequestURI() {
        return requestURI;
    }

    public void setRequestURI(String requestURI) {
        this.requestURI = requestURI;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(Date beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public int getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(int loadTime) {
        this.loadTime = loadTime;
    }

    public int getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }
}
