package com.windf.study.springcloud.course.service;

import com.windf.study.springcloud.course.domain.Course;

import java.util.List;

public interface CourseService {
    void create(Course course);
    List<Course> listAll();
}
