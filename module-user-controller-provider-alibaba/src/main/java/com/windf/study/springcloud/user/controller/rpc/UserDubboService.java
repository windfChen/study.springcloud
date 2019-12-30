package com.windf.study.springcloud.user.controller.rpc;


import com.windf.study.springcloud.user.domain.User;
import com.windf.study.springcloud.user.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Service(loadbalance = "random",timeout = 50000,cluster = "failsafe")
public class UserDubboService implements UserService {

    @Autowired
    private UserService userService;

    @Override
    public boolean save(User user) {
        return userService.save(user);
    }

    @Override
    public Collection<User> findAll() {
        return userService.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }
}
