package com.windf.study.springcloud.growing.domain;

/**
 * 设备信息
 */
public class Device {
    private String os;          // 操作系统信息
    private String code;        // 设备编号
    private String name;        // 设备名称
    private String mac;         // 设备的mac地址
    private String description; // 设备描述

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
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

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
