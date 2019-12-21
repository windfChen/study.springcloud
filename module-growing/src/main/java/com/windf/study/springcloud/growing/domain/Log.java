package com.windf.study.springcloud.growing.domain;

import java.util.Map;

public class Log {
    private Long id;

    private User user;                  // 用户信息
    private Event event;                // 事件信息

    private Screen screen;              // 屏幕信息
    private App app;                    // 应用信息
    private Device device;              // 设备信息

    private Map<String, Object> extData;// 拓展数据

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Map<String, Object> getExtData() {
        return extData;
    }

    public void setExtData(Map<String, Object> extData) {
        this.extData = extData;
    }
}
