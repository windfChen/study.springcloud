package com.windf.study.springcloud.course.repository;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.user.domain.User;

import java.util.List;

public interface ElectiveRepository {
    void addUser(Integer courseId, Long userId);
    List<User> listAllUserByCourseId(Integer courseId);
    List<Course> listAllCourseByUserId(Long userId);
}
