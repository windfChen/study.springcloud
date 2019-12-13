package com.windf.study.springcloud.course.domain;

import com.windf.study.springcloud.user.domain.User;

/**
 * 选课的信息
 */
public class Elective {
    private long id;
    private Course course;
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
