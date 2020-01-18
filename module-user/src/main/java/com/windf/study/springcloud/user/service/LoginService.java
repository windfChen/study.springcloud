package com.windf.study.springcloud.user.service;

import com.windf.study.springcloud.user.entity.LoginVO;

/**
 * 用户登录相关
 */
public interface LoginService {
    /**
     * 用户登录
     * @param loginVO 登录相关的对象
     */
    void login(LoginVO loginVO);

    /**
     * 用户登出
     */
    void logout();
}
