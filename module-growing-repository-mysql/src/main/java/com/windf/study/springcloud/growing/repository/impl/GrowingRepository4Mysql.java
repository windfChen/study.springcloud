package com.windf.study.springcloud.growing.repository.impl;

import com.windf.study.springcloud.growing.domain.Log;
import com.windf.study.springcloud.growing.repository.GrowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class GrowingRepository4Mysql implements GrowingRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Log log) {
        StringBuffer insertSQL = new StringBuffer();
        insertSQL.append(" INSERT INTO `log` ( ");
        insertSQL.append(" 	`site_code`, ");
        insertSQL.append(" 	`session_id`, ");
        insertSQL.append(" 	`login_id`, ");
        insertSQL.append(" 	`ip`, ");
        insertSQL.append(" 	`user_agent`, ");
        insertSQL.append(" 	`accept_language`, ");
        insertSQL.append(" 	`page_title`, ");
        insertSQL.append(" 	`referrer_uri`, ");
        insertSQL.append(" 	`request_uri`, ");
        insertSQL.append(" 	`event_code`, ");
        insertSQL.append(" 	`event_name`, ");
        insertSQL.append(" 	`event_description`, ");
        insertSQL.append(" 	`event_begin_datetime`, ");
        insertSQL.append(" 	`event_end_datetime`, ");
        insertSQL.append(" 	`event_load_time`, ");
        insertSQL.append(" 	`event_duration_time`, ");
        insertSQL.append(" 	`screen_height`, ");
        insertSQL.append(" 	`screen_width`, ");
        insertSQL.append(" 	`screen_window_height`, ");
        insertSQL.append(" 	`screen_window_width`, ");
        insertSQL.append(" 	`device_os`, ");
        insertSQL.append(" 	`device_code`, ");
        insertSQL.append(" 	`device_name`, ");
        insertSQL.append(" 	`device_mac`, ");
        insertSQL.append(" 	`device_description`, ");
        insertSQL.append(" 	`app_code`, ");
        insertSQL.append(" 	`app_type`, ");
        insertSQL.append(" 	`app_name`, ");
        insertSQL.append(" 	`app_version`, ");
        insertSQL.append(" 	`app_description`  ");
        insertSQL.append(" ) ");
        insertSQL.append(" VALUES ");
        insertSQL.append(" 	( ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?, ");
        insertSQL.append(" 		?  ");
        insertSQL.append(" )  ");

        jdbcTemplate.execute(insertSQL.toString(),
                new PreparedStatementCallback<Boolean>() {

                    @Nullable
                    @Override
                    public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                        // 设置用户信息
                        preparedStatement.setString(1, log.getUser().getSiteCode());
                        preparedStatement.setString(2, log.getUser().getSessionId());
                        preparedStatement.setString(3, log.getUser().getLoginId());
                        preparedStatement.setString(4, log.getUser().getIp());
                        preparedStatement.setString(5, log.getUser().getUserAgent());

                        // 设置事件信息
                        preparedStatement.setString(6, log.getEvent().getPageTitle());
                        preparedStatement.setString(7, log.getEvent().getRequestURI());
                        preparedStatement.setString(8, log.getEvent().getCode());
                        preparedStatement.setString(9, log.getEvent().getDescription());
                        preparedStatement.setDate(10, new Date(log.getEvent().getBeginDateTime().getTime()));
                        preparedStatement.setDate(11, new Date(log.getEvent().getEndDateTime().getTime()));
                        preparedStatement.setInt(12, log.getEvent().getLoadTime());
                        preparedStatement.setInt(13, log.getEvent().getDurationTime());

                        // 设置屏幕信息
                        preparedStatement.setInt(14, log.getScreen().getHeight());
                        preparedStatement.setInt(15, log.getScreen().getWidth());
                        preparedStatement.setInt(16, log.getScreen().getWindowHeight());
                        preparedStatement.setInt(17, log.getScreen().getWindowWidth());

                        // 设置应用信息
                        preparedStatement.setString(18, log.getDevice().getOs());
                        preparedStatement.setString(19, log.getDevice().getCode());
                        preparedStatement.setString(20, log.getDevice().getName());
                        preparedStatement.setString(21, log.getDevice().getMac());
                        preparedStatement.setString(22, log.getDevice().getDescription());

                        // 设置设备信息
                        preparedStatement.setString(23, log.getApp().getCode());
                        preparedStatement.setString(24, log.getApp().getType());
                        preparedStatement.setString(25, log.getApp().getName());
                        preparedStatement.setString(26, log.getApp().getVersion());
                        preparedStatement.setString(27, log.getApp().getDescription());

                        return preparedStatement.executeUpdate() > 0;
                    }
                });
    }
}
