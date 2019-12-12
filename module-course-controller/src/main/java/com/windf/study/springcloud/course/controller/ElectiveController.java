package com.windf.study.springcloud.course.controller;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.course.domain.Elective;
import com.windf.study.springcloud.course.service.CourseService;
import com.windf.study.springcloud.course.service.ElectiveService;
import com.windf.study.springcloud.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class ElectiveController {

    @Autowired
    private ElectiveService electiveService;


    @PostMapping("/elective")
    public String addUser(@RequestParam("courseId") Integer courseId, @RequestParam("userId") Long userId) {
        electiveService.addUser(courseId, userId);
        return "success";
    }

    @GetMapping("/elective/course/{courseId}")
    public List<Elective> listAllByCourseId(@PathVariable("courseId") Integer courseId) {
        return electiveService.listAllByCourseId(courseId);
    }

    @GetMapping("/elective/user/{userId}")
    public List<Elective> listAllByUserId(@PathVariable("userId") Long userId) {
        return electiveService.listAllByUserId(userId);
    }
}
