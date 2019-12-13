package com.windf.study.springcloud.course.service.impl;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.course.repository.CourseRepository;
import com.windf.study.springcloud.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void create(Course course) {
        courseRepository.create(course);
    }

    @Override
    public List<Course> listAll() {
        return courseRepository.listAll();
    }
}
