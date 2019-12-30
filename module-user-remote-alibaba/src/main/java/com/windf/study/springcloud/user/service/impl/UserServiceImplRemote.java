package com.windf.study.springcloud.user.service.impl;

import com.windf.study.springcloud.user.domain.User;
import com.windf.study.springcloud.user.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImplRemote implements UserService {

    // mock = "com.gupaoedu.dubbo.dubboclient.SayHelloServiceMock"
    @Reference(loadbalance = "roundrobin", timeout = 1,cluster ="failfast",check = false)
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
