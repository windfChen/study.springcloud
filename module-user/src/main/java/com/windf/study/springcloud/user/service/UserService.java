package com.windf.study.springcloud.user.service;

import com.windf.study.springcloud.user.entity.User;

import java.util.Collection;

public interface UserService {
    boolean save(User user);

    Collection<User> findAll();

    User getUserById(Long id);
}
