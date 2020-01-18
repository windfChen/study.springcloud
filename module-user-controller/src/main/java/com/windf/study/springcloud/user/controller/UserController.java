package com.windf.study.springcloud.user.controller;

import com.windf.plugin.controller.api.controller.BaseController;
import com.windf.study.springcloud.user.entity.User;
import com.windf.study.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User save(@RequestParam String name) {
        User user = new User();
        user.setUsername(name);
        userService.save(user);
        return user;
    }

    @GetMapping("/users")
    public Collection<User> list() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable String id) {
        return userService.getUserById(id);
    }

}
