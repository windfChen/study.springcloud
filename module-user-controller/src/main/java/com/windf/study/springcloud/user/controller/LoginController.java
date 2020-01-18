package com.windf.study.springcloud.user.controller;


import com.windf.core.entity.ResultData;
import com.windf.plugin.controller.api.controller.BaseController;
import com.windf.study.springcloud.user.entity.LoginVO;
import com.windf.study.springcloud.user.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     * @param loginVO
     * @return
     */
    @PostMapping("/login")
    public ResultData login(@RequestBody LoginVO loginVO) {

        loginService.login(loginVO);

        return response().success();
    }

    /**
     * 用户退出
     * @return
     */
    @GetMapping("/logout")
    public ResultData logout() {

        loginService.logout();

        return response().success();
    }

}
