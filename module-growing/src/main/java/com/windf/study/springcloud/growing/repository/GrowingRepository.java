package com.windf.study.springcloud.growing.repository;

import com.windf.study.springcloud.growing.domain.Log;

public interface GrowingRepository {
    /**
     * 持久化存储日志
     * @param log
     * @return
     */
    Log save(Log log);
}
