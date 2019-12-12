package com.windf.study.springcloud.course.repository;

import com.windf.study.springcloud.course.domain.Course;

import java.util.List;

public interface CourseRepository {
    void create(Course course);
    List<Course> listAll();
}
