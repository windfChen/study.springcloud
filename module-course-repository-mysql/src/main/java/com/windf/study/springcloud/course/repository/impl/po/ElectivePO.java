package com.windf.study.springcloud.course.repository.impl.po;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.course.domain.Elective;
import com.windf.study.springcloud.user.domain.User;

public class ElectivePO {
    private long id;
    private long userId;
    private int courseId;

    public Elective toElective() {
        Elective elective = new Elective(id);

        Course course = new Course();
        course.setId(courseId);
        elective.setCourse(course);

        User user = new User();
        user.setId(userId);
        elective.setUser(user);

        return elective;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
