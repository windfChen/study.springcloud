package com.windf.study.springcloud.course.controller;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.course.domain.Elective;
import com.windf.study.springcloud.course.service.CourseService;
import com.windf.study.springcloud.course.service.ElectiveService;
import com.windf.study.springcloud.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ElectiveController {

    @Autowired
    private ElectiveService electiveService;


    @PostMapping("/elective")
    public String addUser(@RequestParam("courseId") Integer courseId, @RequestParam("userId") Long userId) {
        electiveService.addUser(courseId, userId);
        return "success";
    }

    @PostMapping("/elective/user/{courseId}")
    public List<User> listAllUserByCourseId(@PathVariable("courseId") Integer courseId) {
        return electiveService.listAllUserByCourseId(courseId);
    }

    @PostMapping("/elective/course/{userId}")
    public List<Course> listAllCourseByUserId(@PathVariable("userId") Long userId) {
        return electiveService.listAllCourseByUserId(userId);
    }
}
