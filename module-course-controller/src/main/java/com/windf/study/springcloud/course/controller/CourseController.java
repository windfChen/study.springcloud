package com.windf.study.springcloud.course.controller;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.course.service.CourseService;
import com.windf.study.springcloud.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public Course create(@RequestParam("code") String code, @RequestParam("name") String name) {
        Course course = new Course();
        course.setName(name);
        course.setCode(code);
        courseService.create(course);
        return course;
    }

    @GetMapping("/courses")
    public List<Course> listAll() {
        return courseService.listAll();
    }
}
