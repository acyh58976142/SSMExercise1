/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50143
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50143
File Encoding         : 65001

Date: 2017-11-25 13:01:30
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `invitation`
-- ----------------------------
DROP TABLE IF EXISTS `invitation`;
CREATE TABLE `invitation` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 NOT NULL,
  `summary` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `author` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `createdate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of invitation
-- ----------------------------
INSERT INTO `invitation` VALUES ('1', 'newest BMW photo', 'welcome this newest BMW car', 'little he', '2013-11-08');
INSERT INTO `invitation` VALUES ('2', 'hengda three gun!', 'wonderful fun', 'god', '2013-10-12');
INSERT INTO `invitation` VALUES ('3', 'plane 31 fly', 'china flight', 'army god', '2013-10-01');
INSERT INTO `invitation` VALUES ('4', 'beijing marathon', 'run run run!', 'run', '2013-09-27');

-- ----------------------------
-- Table structure for `reply_detail`
-- ----------------------------
DROP TABLE IF EXISTS `reply_detail`;
CREATE TABLE `reply_detail` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `invid` int(10) NOT NULL,
  `content` varchar(200) CHARACTER SET utf8 NOT NULL,
  `author` varchar(20) CHARACTER SET utf8 DEFAULT '匿名用户',
  `createdate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `invid` (`invid`),
  CONSTRAINT `reply_detail_ibfk_1` FOREIGN KEY (`invid`) REFERENCES `invitation` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of reply_detail
-- ----------------------------
INSERT INTO `reply_detail` VALUES ('1', '1', 'when to buy', 'finally', '2013-11-11');
INSERT INTO `reply_detail` VALUES ('2', '1', '16W controller', 'MINI', '2013-11-09');
INSERT INTO `reply_detail` VALUES ('3', '1', 'what's this？', 'dragon', '2013-11-20');
INSERT INTO `reply_detail` VALUES ('4', '2', 'good!', 'unti', '2013-10-30');
