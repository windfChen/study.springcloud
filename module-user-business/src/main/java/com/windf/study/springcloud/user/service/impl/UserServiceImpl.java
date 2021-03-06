package com.windf.study.springcloud.user.service.impl;

import com.windf.study.springcloud.user.entity.User;
import com.windf.study.springcloud.user.repository.UserRepository;
import com.windf.study.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        return userRepository.getUserById(id);
    }
}
