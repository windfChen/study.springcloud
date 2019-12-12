package com.windf.study.springcloud.course.repository.impl;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.course.repository.CourseRepository;
import com.windf.study.springcloud.course.repository.ElectiveRepository;
import com.windf.study.springcloud.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ElectiveRepositoryImpl implements ElectiveRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void addUser(final Integer courseId, final Long userId) {

        jdbcTemplate.execute("INSERT INTO t_elective (code, name) VALUES (?, ?);",
                new PreparedStatementCallback<Boolean>() {

                    @Nullable
                    @Override
                    public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                        preparedStatement.setInt(1, courseId);
                        preparedStatement.setLong(2, userId);
                        return preparedStatement.executeUpdate() > 0;
                    }
                });
    }

    @Override
    public List<User> listAllUserByCourseId(Integer courseId) {

        List<User> users = jdbcTemplate.query(
                "SELECT " +
                        "  u.id, " +
                        "  u.NAME " +
                        "  FROM " +
                        "t_elective e " +
                        "INNER JOIN t_user u ON e.fk_user_id = u.id " +
                        "where e.fk_course_id = '" + courseId + "' ",
                new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public List<Course> listAllCourseByUserId(Long userId) {

        List<Course> courses = jdbcTemplate.query(
                "SELECT" +
                        "  c.id, " +
                        "  c.CODE, " +
                        "  c.NAME " +
                        "FROM " +
                        "  t_elective e " +
                        "INNER JOIN t_course c ON e.fk_course_id = c.id " +
                        "where e.fk_user_id = ' + userId + '",
                new BeanPropertyRowMapper<Course>(Course.class));
        return courses;
    }
}
