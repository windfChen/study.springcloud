package com.windf.study.springcloud.course.service.impl;

import com.windf.study.springcloud.course.domain.Elective;
import com.windf.study.springcloud.course.repository.ElectiveRepository;
import com.windf.study.springcloud.course.service.ElectiveService;
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
    public List<Elective> listAllByCourseId(Integer courseId) {
        return electiveRepository.listAllByCourseId(courseId);
    }

    @Override
    public List<Elective> listAllByUserId(Long userId) {
        return electiveRepository.listAllByUserId(userId);
    }
}
