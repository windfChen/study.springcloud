package com.windf.study.springcloud.user.repository;

import com.windf.study.springcloud.user.entity.User;

import java.util.Collection;

public interface UserRepository {
    boolean save(User user);

    Collection<User> findAll();

    User getUserById(Long id);
}
