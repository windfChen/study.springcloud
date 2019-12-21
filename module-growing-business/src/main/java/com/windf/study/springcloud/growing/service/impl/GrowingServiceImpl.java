package com.windf.study.springcloud.growing.service.impl;

import com.windf.study.springcloud.growing.domain.Log;
import com.windf.study.springcloud.growing.repository.GrowingRepository;
import com.windf.study.springcloud.growing.service.GrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrowingServiceImpl implements GrowingService {
    @Autowired
    private GrowingRepository growingRepository;

    @Override
    public void log(Log log) {
        growingRepository.save(log);
    }
}
