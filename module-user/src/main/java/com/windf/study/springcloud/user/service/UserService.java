package com.windf.study.springcloud.user.service;


import com.windf.study.springcloud.user.domain.User;

import java.util.Collection;

public interface UserService {
    boolean save(User user);

    Collection<User> findAll();
}
