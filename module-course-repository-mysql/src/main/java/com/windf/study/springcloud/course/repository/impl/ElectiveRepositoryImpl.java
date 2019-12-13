package com.windf.study.springcloud.course.repository.impl;

import com.windf.study.springcloud.course.domain.Course;
import com.windf.study.springcloud.course.domain.Elective;
import com.windf.study.springcloud.course.repository.ElectiveRepository;
import com.windf.study.springcloud.course.repository.impl.po.ElectivePO;
import com.windf.study.springcloud.user.domain.User;
import com.windf.study.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ElectiveRepositoryImpl implements ElectiveRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserService userService;

    @Override
    public void addUser(final Integer courseId, final Long userId) {

        jdbcTemplate.execute("INSERT INTO t_elective (fk_course_id, fk_user_id) VALUES (?, ?);",
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
    public List<Elective> listAllByCourseId(Integer courseId) {

        List<ElectivePO> electivePOs = jdbcTemplate.query(
                "SELECT " +
                        "  e.id, " +
                        "  e.fk_user_id as userId, " +
                        "  e.fk_course_id as courseId " +
                        "  FROM " +
                        "t_elective e " +
                        "where e.fk_course_id = '" + courseId + "' ",
                new BeanPropertyRowMapper<ElectivePO>(ElectivePO.class));

        List<Elective> result = new ArrayList<>();
        for (ElectivePO electivePO : electivePOs) {
            Elective elective = electivePO.toElective();

            elective.setUser(userService.getUserById(elective.getUser().getId()));

            result.add(elective);
        }

        return result;
    }

    @Override
    public List<Elective> listAllByUserId(Long userId) {

        List<Elective> courses = jdbcTemplate.query(
                "SELECT" +
                        "  e.id as id, " +
                        "  c.id as `course.id`, " +
                        "  c.CODE as `course.code`," +
                        "  c.NAME as `course.name` " +
                        "FROM " +
                        "  t_elective e " +
                        "INNER JOIN t_course c ON e.fk_course_id = c.id " +
                        "where e.fk_user_id = '" + userId + "'",
                (rs, i) -> {
                    Elective elective = new Elective();
                    elective.setId(rs.getLong("id"));
                    elective.setUser(new User(userId));

                    Course course = new Course();
                    course.setId(rs.getInt("course.id"));
                    course.setCode(rs.getString("course.code"));
                    course.setName(rs.getString("course.name"));
                    elective.setCourse(course);
                    return elective;
                });
        return courses;
    }
}
