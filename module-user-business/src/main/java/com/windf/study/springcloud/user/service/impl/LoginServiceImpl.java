package com.windf.study.springcloud.user.service.impl;

import com.windf.core.exception.UserException;
import com.windf.core.util.EncryptUtil;
import com.windf.study.springcloud.user.entity.LoginVO;
import com.windf.study.springcloud.user.entity.User;
import com.windf.study.springcloud.user.repository.UserRepository;
import com.windf.study.springcloud.user.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(LoginVO loginVO) {
        User user = userRepository.getByUsername(loginVO.getUsername());

        String inputPassword = EncryptUtil.MD5(loginVO.getPassword());

        if (!inputPassword.equals(user.getPassword())) {
            throw new UserException("用户名不存在，或者密码错误。");
        }

        doLogin(user);

        return user;
    }

    @Override
    public void doLogin(User user) {

    }

    @Override
    public void logout() {

    }
}
