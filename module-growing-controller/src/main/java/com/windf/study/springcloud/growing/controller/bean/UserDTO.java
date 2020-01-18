package com.windf.study.springcloud.growing.controller.bean;

public class UserDTO {
    private String site;    // 必填项，区分站点
    private String sid;     // 用户的会话标识
    private String uid;     // 用户的登录ID
    private String ip;      // 访问的ip
    private String ua;      // 用户访问信息
    private String l;       // 请求的语言
}
