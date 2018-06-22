/*
SQLyog Ultimate v12.14 (64 bit)
MySQL - 5.7.18-log : Database - test_project
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test_project` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test_project`;

/*Table structure for table `even` */

DROP TABLE IF EXISTS `even`;

CREATE TABLE `even` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `even` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `even` */

insert  into `even`(`id`,`even`) values 
(1,5),
(2,2),
(3,4),
(4,8),
(5,22),
(6,44),
(7,5),
(8,5),
(9,5),
(10,4),
(11,6);

/*Table structure for table `odd` */

DROP TABLE IF EXISTS `odd`;

CREATE TABLE `odd` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `odd` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `odd` */

insert  into `odd`(`id`,`odd`) values 
(1,5);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
