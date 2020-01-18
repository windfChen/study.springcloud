package com.windf.study.springcloud.user.service;

/**
 * 用户登录相关
 */
public interface LoginService {
    /**
     * 用户登录
     * @param username
     * @param password
     * @param verifyCode
     */
    void login(String username, String password, String verifyCode);

    /**
     * 用户登出
     */
    void logout();
}
