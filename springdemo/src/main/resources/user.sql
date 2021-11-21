drop database IF EXISTS test;
CREATE DATABASE test;
use test;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT "",
  `age` int(11) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES (1, '李四', 11);
INSERT INTO `user` VALUES (2, '王五', 11);