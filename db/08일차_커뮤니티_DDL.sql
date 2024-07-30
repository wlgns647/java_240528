DROP DATABASE IF EXISTS COMMUNITY;

CREATE DATABASE COMMUNITY;

USE COMMUNITY;

DROP TABLE IF EXISTS `MEMBER`;

CREATE TABLE `member` (
    `me_id` varchar(13) PRIMARY KEY NOT NULL,
    `me_pw` varchar(255) NOT NULL,
    `me_email` varchar(50) UNIQUE NOT NULL,
    `me_authority` varchar(5) NOT NULL DEFAULT 'USER',
    `me_fail` int NOT NULL DEFAULT 0,
    `me_cookie` varchar(255) NULL,
    `me_limit` datetime NULL,
    `me_report` int NOT NULL DEFAULT 0,
    `ms_name` varchar(10) NOT NULL,
    `me_stop` datetime NULL
);

DROP TABLE IF EXISTS `community`;

CREATE TABLE `community` (
    `co_num` int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `co_name` varchar(50) UNIQUE NULL,
    `Field` varchar(255) NULL
);

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
    `po_num` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `po_co_num` INT NOT NULL,
    `po_me_id` VARCHAR(13) NOT NULL,
    `po_title` VARCHAR(50) NULL,
    `po_content` LONGTEXT NOT NULL,
    `po_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `po_view` INT NOT NULL DEFAULT 0,
    `po_report` INT NOT NULL DEFAULT 0,
    FOREIGN KEY (`po_co_num`)
        REFERENCES `community` (`co_num`),
    FOREIGN KEY (`po_me_id`)
        REFERENCES `member` (`me_id`)
);

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
    `fi_num` int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `fi_ori_name` varchar(255) 	NOT NULL,
    `fi_name` varchar(255) 		NOT NULL,
    `po_num` int 				NOT NULL,
    FOREIGN KEY (`po_num`) REFERENCES `post` (`po_num`)
);

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
    `cm_num` int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `cm_content` varchar(200)NOT  NULL,
    `cm_ori_num` int NOT  NULL,
    `po_num` int NOT NULL,
    `cm_date` datetime NOT  NULL default current_timestamp,
    `cm_me_id` varchar(13) NOT NULL,
    `cm_state` int NOT  NULL default 0,
    `cm_num2` int NOT NULL default 0,
    FOREIGN KEY (`po_num`) REFERENCES `post` (`po_num`),
    FOREIGN KEY (`cm_me_id`) REFERENCES `member` (`me_id`)
);

DROP TABLE IF EXISTS `recommend`;

CREATE TABLE `recommend` (
    `re_num` int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `re_state` int NOT NULL,
    `re_me_id` varchar(13) NOT NULL,
    `re_po_num` int NOT NULL,
    FOREIGN KEY (`me_id`) REFERENCES `member` (`me_id`),
    FOREIGN KEY (`po_num`) REFERENCES `post` (`po_num`)
);

DROP TABLE IF EXISTS `report_type`;

CREATE TABLE `report_type` (
    `rt_name` varchar(15) PRIMARY KEY NOT NULL
);

DROP TABLE IF EXISTS `report`;

CREATE TABLE `report` (
    `rp_num` int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `rp_table` varchar(10)  NOT NULL,
    `rp_target` int  NOT NULL,
    `re_me_id` varchar(13) NOT NULL,
    `rt_name` varchar(15) NOT NULL,
    FOREIGN KEY (`re_me_id`) REFERENCES `member` (`me_id`),
    FOREIGN KEY (`rt_name`) REFERENCES `report_type` (`rt_name`)
);

DROP TABLE IF EXISTS `member_state`;

CREATE TABLE `member_state` (
    `ms_name` varchar(10) PRIMARY KEY NOT NULL,
    `Field` varchar(255) NULL
);
ALTER TABLE `member` ADD CONSTRAINT `FK_member_state_TO_member_1` FOREIGN KEY (
    `ms_name`
)
REFERENCES `member_state` (
    `ms_name`
);
