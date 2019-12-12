package com.windf.study.springcloud.course.service.impl;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.course.repository.ElectiveRepository;
import com.windf.study.springcloud.course.service.ElectiveService;
import com.windf.study.springcloud.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectiveServiceImpl implements ElectiveService {

    @Autowired
    private ElectiveRepository electiveRepository;

    @Override
    public void addUser(Integer courseId, Long userId) {
        electiveRepository.addUser(courseId, userId);
    }

    @Override
    public List<User> listAllUserByCourseId(Integer courseId) {
        return electiveRepository.listAllUserByCourseId(courseId);
    }

    @Override
    public List<Course> listAllCourseByUserId(Long userId) {
        return electiveRepository.listAllCourseByUserId(userId);
    }
}
