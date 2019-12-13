package com.windf.study.springcloud.user.service.impl;

import com.windf.study.springcloud.user.domain.User;
import com.windf.study.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImplRemote implements UserService {

    private static final String PROVIDER_SERVER_URL_PREFIX = "http://localhost:8080";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean save(User user) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", user.getName());

        User returnValue =
                restTemplate.postForObject(PROVIDER_SERVER_URL_PREFIX + "/user", params, User.class);
        return returnValue != null;
    }

    @Override
    public Collection<User> findAll() {
        return restTemplate.getForObject(PROVIDER_SERVER_URL_PREFIX + "/users", Collection.class);
    }

    @Override
    public User getUserById(Long id) {
        return restTemplate.getForObject(PROVIDER_SERVER_URL_PREFIX + "/user/" + id, User.class);
    }
}
