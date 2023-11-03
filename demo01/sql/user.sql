-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
                        `username` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名/账号',
                        `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
                        `email` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '邮箱',
                        `phone` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '手机号',
                        `nickname` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '昵称',
                        PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'zhangsan', '123456', 'zhangsan@qq.com', '13811111111', '张三');
INSERT INTO `user` VALUES (2, 'lisi', '123456', 'lisi@qq.com', '13822222222', '李四');
INSERT INTO `user` VALUES (3, 'wangwu', '123456', 'wangwu@qq.com', '13833333333', '王五');