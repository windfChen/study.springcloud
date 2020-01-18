package com.windf.study.springcloud.user.controller;


import com.windf.core.entity.ResultData;
import com.windf.plugin.controller.api.controller.BaseController;
import com.windf.study.springcloud.user.controller.util.UserConstant;
import com.windf.study.springcloud.user.entity.LoginVO;
import com.windf.study.springcloud.user.entity.User;
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
        // 登录，并获取用户
        User user = loginService.login(loginVO);

        // 设置
        this.getSession().set(UserConstant.KEY_USER_LOGIN, user);

        // 登录成功
        return response().success();
    }

    /**
     * 用户退出
     * @return
     */
    @GetMapping("/logout")
    public ResultData logout() {
        // 退出操作
        loginService.logout();

        // 销毁session
        this.getSession().invalidate();

        return response().success();
    }

}
