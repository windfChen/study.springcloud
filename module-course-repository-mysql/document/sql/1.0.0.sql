
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
CREATE TABLE `t_course` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(50) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for t_elective
-- ----------------------------
CREATE TABLE `t_elective` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fk_course_id` int(11) unsigned DEFAULT NULL,
  `fk_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `elective_user_id` (`fk_user_id`) USING BTREE,
  KEY `elective_course_id` (`fk_course_id`) USING BTREE,
  CONSTRAINT `t_elective_ibfk_1` FOREIGN KEY (`fk_course_id`) REFERENCES `t_course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
