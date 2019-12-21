package com.windf.study.springcloud.growing.domain;

/**
 * app的信息，可能是浏览器
 */
public class App {
    private String code;         // 应用编号
    private String type;         // 应用类型，浏览器、还是移动应用、小程序
    private String name;         // app名称
    private String version;      // app版本
    private String description;  // app描述

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
