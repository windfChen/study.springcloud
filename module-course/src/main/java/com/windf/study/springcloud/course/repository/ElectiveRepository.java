package com.windf.study.springcloud.course.repository;

import com.windf.study.springcloud.course.domain.Elective;

import java.util.List;

public interface ElectiveRepository {
    void addUser(Integer courseId, Long userId);

    /**
     * 根据课程查询选课信息
     * 查出来的选课对象 @see Elective,user信息是基本完整的，但是其中的course是不完整的，只有Id字段
     * @param courseId
     * @return
     */
    List<Elective> listAllByCourseId(Integer courseId);

    /**
     * 根据用户Id查询选课信息
     * 查出来的选课对象 @see Elective,course信息是基本完整的，但是其中的user是不完整的，只有Id字段
     * @param userId
     * @return
     */
    List<Elective> listAllByUserId(Long userId);
}
