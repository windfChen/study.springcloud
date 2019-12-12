package com.windf.study.springcloud.course.service;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.user.domain.User;

import java.util.List;

public interface ElectiveService {
    void addUser(Integer courseId, Long userId);
    List<User> listAllUserByCourseId(Integer courseId);
    List<Course> listAllCourseByUserId(Long userId);
}
