package com.windf.study.springcloud.user.controller;


import com.windf.study.springcloud.user.domain.User;
import com.windf.study.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User save(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        userService.save(user);
        return user;
    }

    @GetMapping("/users")
    public Collection<User> list() {
        return userService.findAll();
    }

}
