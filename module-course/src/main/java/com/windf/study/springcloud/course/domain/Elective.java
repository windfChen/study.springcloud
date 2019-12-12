package com.windf.study.springcloud.course.domain;

import com.windf.study.springcloud.user.domain.User;

public class Elective {
    private long id;
    private Course clazz;
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Course getClazz() {
        return clazz;
    }

    public void setClazz(Course clazz) {
        this.clazz = clazz;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
