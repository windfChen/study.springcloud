/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : cloud_user

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 21/12/2019 16:41:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` bigint(20) NOT NULL,
  `site_code` varchar(50) NOT NULL COMMENT '站点编号',
  `session_id` varchar(50) NOT NULL COMMENT '用户的会话id，（自动生成）',
  `login_id` varchar(50) DEFAULT NULL COMMENT '用户的登录id，（如果有）',
  `ip` varchar(50) NOT NULL COMMENT '用户的ip描述',
  `user_agent` varchar(500) DEFAULT NULL COMMENT '用户的描述信息',
  `accept_language` varchar(50) DEFAULT NULL COMMENT '用户的语言信息',
  `page_title` varchar(255) DEFAULT NULL COMMENT '事件发生的页面标题',
  `referrer_uri` varchar(500) DEFAULT NULL COMMENT '事件发生的页面地址',
  `request_uri` varchar(500) DEFAULT NULL COMMENT '事件请求的资源地址',
  `event_code` varchar(50) DEFAULT NULL COMMENT '事件类型',
  `event_name` varchar(50) DEFAULT NULL COMMENT '事件名',
  `event_description` varchar(500) DEFAULT NULL COMMENT '事件描述',
  `event_begin_datetime` datetime DEFAULT NULL COMMENT '事件发生的开始时间',
  `event_end_datetime` datetime DEFAULT NULL COMMENT '事件发生的结束时间',
  `event_load_time` int(11) DEFAULT NULL COMMENT '事件的加载时间',
  `event_duration_time` int(11) DEFAULT NULL COMMENT '事件的持续时间',
  `screen_height` int(11) DEFAULT NULL COMMENT '屏幕高度',
  `screen_width` int(11) DEFAULT NULL COMMENT '屏幕宽度',
  `screen_window_height` int(11) DEFAULT NULL COMMENT '屏幕中窗口高度',
  `screen_window_width` int(11) DEFAULT NULL COMMENT '屏幕中窗口宽度',
  `device_os` varchar(50) DEFAULT NULL COMMENT '设备的操作系统',
  `device_code` varchar(50) DEFAULT NULL COMMENT '设备的类型',
  `device_name` varchar(50) DEFAULT NULL COMMENT '设备名称',
  `device_mac` varchar(50) DEFAULT NULL COMMENT '设备的mac地址，唯一标识',
  `device_description` varchar(500) DEFAULT NULL COMMENT '设备的描述信息',
  `app_code` varchar(50) DEFAULT NULL COMMENT 'app的编号',
  `app_type` varchar(0) DEFAULT NULL COMMENT 'app的类型，浏览器、还是移动应用、小程序',
  `app_name` varchar(50) DEFAULT NULL COMMENT 'app的名称',
  `app_version` varchar(50) DEFAULT NULL COMMENT 'app的版本信息',
  `app_descript` varchar(500) DEFAULT NULL COMMENT 'app的描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
