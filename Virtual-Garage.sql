/*
SQLyog Community v12.4.0 (64 bit)
MySQL - 5.6.26-log : Database - online_garage
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`online_garage` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `online_garage`;

/*Table structure for table `garage_details` */

DROP TABLE IF EXISTS `garage_details`;

CREATE TABLE `garage_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  `latitude` varchar(255) DEFAULT NULL,
  `longitude` varchar(255) DEFAULT NULL,
  `openAt` varchar(255) DEFAULT NULL,
  `closedAt` varchar(255) DEFAULT NULL,
  `address` varchar(1000) DEFAULT NULL,
  `rate` varchar(255) DEFAULT NULL,
  `service` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `garage_details` */

insert  into `garage_details`(`id`,`name`,`owner`,`latitude`,`longitude`,`openAt`,`closedAt`,`address`,`rate`,`service`) values 
(11,'Akshay Garage','Akshay','70.30','71.20','9AM','9PM','Viman Nagar, Pune','4','ALL'),
(13,'Nikhil Garage','Nikhil','72.65','75.63','9AM','9PM','Kalyani Nagar,Pune','3','ALL'),
(14,'Sanket garage','Sanket Pawar','72.30','72.40','9AM','6PM','Viman nagar','4','ALL');

/*Table structure for table `user_table` */

DROP TABLE IF EXISTS `user_table`;

CREATE TABLE `user_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `First_Name` varchar(255) DEFAULT NULL,
  `Last_Name` varchar(255) DEFAULT NULL,
  `Code` varchar(255) DEFAULT NULL,
  `User_Role` varchar(255) DEFAULT NULL,
  `Contact_Number` varchar(255) DEFAULT NULL,
  `Mail_ID` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `profile` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `user_table` */

insert  into `user_table`(`id`,`login`,`password`,`First_Name`,`Last_Name`,`Code`,`User_Role`,`Contact_Number`,`Mail_ID`,`city`,`profile`) values 
(1,'admin','admin','Admin','Admin','AD-MiN','admin','8369225184','etsAdmin@gmail.com','Pune','admin'),
(2,'amar','pwd','Amardip','Naik',NULL,'USER','8369225184','amardipsnaik@gmail.com',NULL,NULL),
(3,'Pooja','pwd','Pooja','Pooja',NULL,'USER','8365845144','pooja@gmail.com',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
