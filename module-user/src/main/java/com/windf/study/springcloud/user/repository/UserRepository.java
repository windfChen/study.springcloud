package com.windf.study.springcloud.user.repository;

import com.windf.study.springcloud.user.entity.User;

import java.util.Collection;

public interface UserRepository {
    /**
     * 添加用户
     * @param user
     * @return
     */
    boolean save(User user);

    /**
     * 获取所有用户
     * @return
     */
    Collection<User> findAll();

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User getUserById(String id);

    /**
     * 根据用户名获取用户
     * @param loginId
     * @return
     */
    User getByUsername(String loginId);
}
