-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.18 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 hotel 的数据库结构
CREATE DATABASE IF NOT EXISTS `hotel` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hotel`;

-- 导出  表 hotel.customer 结构
CREATE TABLE IF NOT EXISTS `customer` (
  `clientno` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) NOT NULL,
  `csex` char(2) DEFAULT '男',
  `cidentity` char(18) NOT NULL,
  `cpnum` char(11) NOT NULL,
  `ctext` text,
  PRIMARY KEY (`clientno`),
  CONSTRAINT `customer_chk_1` CHECK (((`csex` = _utf8mb3'男') or (`csex` = _utf8mb3'女')))
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。
-- 导出  视图 hotel.customerview 结构
-- 创建临时表以解决视图依赖性错误
CREATE TABLE `customerview` (
	`v_clientno` INT(11) NOT NULL,
	`v_cname` VARCHAR(20) NOT NULL COLLATE 'utf8_general_ci',
	`v_csex` CHAR(2) NULL COLLATE 'utf8_general_ci',
	`v_cidentity` CHAR(18) NOT NULL COLLATE 'utf8_general_ci',
	`v_cpnum` CHAR(11) NOT NULL COLLATE 'utf8_general_ci',
	`v_ctext` TEXT NULL COLLATE 'utf8_general_ci'
) ENGINE=MyISAM;

-- 导出  表 hotel.duty 结构
CREATE TABLE IF NOT EXISTS `duty` (
  `deptno` int(11) NOT NULL,
  `dname` varchar(50) NOT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。
-- 导出  表 hotel.employee 结构
CREATE TABLE IF NOT EXISTS `employee` (
  `empno` int(11) NOT NULL,
  `deptno` int(11) NOT NULL,
  `ename` varchar(50) NOT NULL,
  `epswd` varchar(50) NOT NULL,
  `esex` char(2) DEFAULT '男',
  `epnum` varchar(20) NOT NULL,
  `etext` text,
  PRIMARY KEY (`empno`),
  KEY `deptno` (`deptno`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`deptno`) REFERENCES `duty` (`deptno`),
  CONSTRAINT `employee_chk_1` CHECK (((`esex` = _utf8mb4'男') or (`esex` = _utf8mb4'女')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。
-- 导出  视图 hotel.employeeview 结构
-- 创建临时表以解决视图依赖性错误
CREATE TABLE `employeeview` (
	`v_empno` INT(11) NOT NULL,
	`v_deptno` INT(11) NOT NULL,
	`v_ename` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`v_epswd` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`v_esex` CHAR(2) NULL COLLATE 'utf8_general_ci',
	`v_epnum` VARCHAR(20) NOT NULL COLLATE 'utf8_general_ci',
	`v_etext` TEXT NULL COLLATE 'utf8_general_ci'
) ENGINE=MyISAM;

-- 导出  表 hotel.orders 结构
CREATE TABLE IF NOT EXISTS `orders` (
  `orderid` varchar(30) NOT NULL,
  `empno` int(11) DEFAULT NULL,
  `clientno` int(11) DEFAULT NULL,
  `roomid` int(11) DEFAULT NULL,
  `otime` date NOT NULL,
  `ocash` int(11) NOT NULL,
  `otext` text,
  `ocondition` varchar(10) DEFAULT '未完成',
  PRIMARY KEY (`orderid`),
  KEY `empno` (`empno`),
  KEY `clientno` (`clientno`),
  KEY `roomid` (`roomid`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`empno`) REFERENCES `employee` (`empno`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`clientno`) REFERENCES `customer` (`clientno`),
  CONSTRAINT `orders_ibfk_3` FOREIGN KEY (`roomid`) REFERENCES `room` (`roomid`),
  CONSTRAINT `orders_chk_1` CHECK (((`ocondition` = _utf8mb3'未完成') or (`ocondition` = _utf8mb3'已完成')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。
-- 导出  表 hotel.outhistory 结构
CREATE TABLE IF NOT EXISTS `outhistory` (
  `clientno` int(11) NOT NULL AUTO_INCREMENT,
  `roomid` int(11) NOT NULL,
  `empno` int(11) NOT NULL,
  `cotime` datetime DEFAULT CURRENT_TIMESTAMP,
  `cotext` text,
  PRIMARY KEY (`clientno`,`roomid`),
  KEY `empno` (`empno`),
  KEY `roomid` (`roomid`),
  CONSTRAINT `outhistory_ibfk_1` FOREIGN KEY (`empno`) REFERENCES `employee` (`empno`),
  CONSTRAINT `outhistory_ibfk_2` FOREIGN KEY (`clientno`) REFERENCES `customer` (`clientno`),
  CONSTRAINT `outhistory_ibfk_3` FOREIGN KEY (`roomid`) REFERENCES `room` (`roomid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。
-- 导出  表 hotel.room 结构
CREATE TABLE IF NOT EXISTS `room` (
  `roomid` int(11) NOT NULL,
  `typeid` int(11) NOT NULL,
  `rcondition` char(4) DEFAULT '未入住',
  `rtext` text,
  PRIMARY KEY (`roomid`),
  KEY `typeid` (`typeid`),
  CONSTRAINT `room_ibfk_1` FOREIGN KEY (`typeid`) REFERENCES `roomtype` (`typeid`),
  CONSTRAINT `room_chk_1` CHECK (((`rcondition` = _utf8mb4'已入住') or (`rcondition` = _utf8mb4'未入住')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。
-- 导出  表 hotel.roomtype 结构
CREATE TABLE IF NOT EXISTS `roomtype` (
  `typeid` int(11) NOT NULL,
  `tname` char(16) NOT NULL,
  `tprice` int(11) DEFAULT NULL,
  `tcount` int(11) DEFAULT NULL,
  `trcount` int(11) DEFAULT NULL,
  `ttext` text,
  PRIMARY KEY (`typeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。
-- 导出  视图 hotel.customerview 结构
-- 移除临时表并创建最终视图结构
DROP TABLE IF EXISTS `customerview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `customerview` (`v_clientno`,`v_cname`,`v_csex`,`v_cidentity`,`v_cpnum`,`v_ctext`) AS select `customer`.`clientno` AS `clientno`,`customer`.`cname` AS `cname`,`customer`.`csex` AS `csex`,`customer`.`cidentity` AS `cidentity`,`customer`.`cpnum` AS `cpnum`,`customer`.`ctext` AS `ctext` from `customer`;

-- 导出  视图 hotel.employeeview 结构
-- 移除临时表并创建最终视图结构
DROP TABLE IF EXISTS `employeeview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `employeeview` (`v_empno`,`v_deptno`,`v_ename`,`v_epswd`,`v_esex`,`v_epnum`,`v_etext`) AS select `employee`.`empno` AS `empno`,`employee`.`deptno` AS `deptno`,`employee`.`ename` AS `ename`,`employee`.`epswd` AS `epswd`,`employee`.`esex` AS `esex`,`employee`.`epnum` AS `epnum`,`employee`.`etext` AS `etext` from `employee`;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
