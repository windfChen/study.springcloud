package com.windf.study.springcloud.course.repository.impl;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.course.repository.CourseRepository;
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
public class CourseRepositoryImpl implements CourseRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Course course) {
        jdbcTemplate.execute("INSERT INTO t_course (code, name) VALUES (?, ?);",
                new PreparedStatementCallback<Boolean>() {

                    @Nullable
                    @Override
                    public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                        preparedStatement.setString(1, course.getCode());
                        preparedStatement.setString(2, course.getName());
                        return preparedStatement.executeUpdate() > 0;
                    }
                });
    }

    @Override
    public List<Course> listAll() {
        List<Course> courses = jdbcTemplate.query(
                "select id, code, name from t_course",
                new BeanPropertyRowMapper<Course>(Course.class));
        return courses;
    }
}
