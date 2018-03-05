/*
SQLyog Ultimate v9.02 
MySQL - 5.0.24-community-nt : Database - onetomany
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`onetomany` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `onetomany`;

/*Table structure for table `certificate` */

DROP TABLE IF EXISTS `certificate`;

CREATE TABLE `certificate` (
  `ID` int(11) NOT NULL,
  `CERTIFICATE_NAME` varchar(255) default NULL,
  `EMPLOYEE_ID` int(11) default NULL,
  PRIMARY KEY  (`ID`),
  KEY `FKF4B2D5775C66F281` (`EMPLOYEE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `certificate` */

insert  into `certificate`(`ID`,`CERTIFICATE_NAME`,`EMPLOYEE_ID`) values (1,'IMS',1),(2,'REC',1),(3,'DATACOMM',1),(4,'SCJP',2),(5,'CLOUD COMPUTING',2),(6,'OCJP',2);

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `ID` int(11) NOT NULL,
  `FIRST_NAME` varchar(255) default NULL,
  `LAST_NAME` varchar(255) default NULL,
  `SALARY` varchar(255) default NULL,
  `LOCATION` varchar(255) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert  into `employee`(`ID`,`FIRST_NAME`,`LAST_NAME`,`SALARY`,`LOCATION`) values (1,'Tarun','Jadhav','50000','Indore'),(2,'Cris','Gopikrishnan','100000','Mysore');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
