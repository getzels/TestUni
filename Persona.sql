CREATE DATABASE  IF NOT EXISTS `unisigma` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `unisigma`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: unisigma
-- ------------------------------------------------------
-- Server version	5.6.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `idpersona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `correo_electronico` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpersona`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Edgar','Garcia','M','2016-07-18','Respaldo simon Bolivar','get.delossantos@gmail.com'),(2,'hola','hola','m',NULL,'klsldkfjaklj','alskjdflakdsjfa'),(3,'Getzels','De Los Santos ssss','M','2019-12-01','Respaldo simon Bolivar','get.delossantos@gmail.com'),(5,'Getzels','De Los Santos','M','2016-07-15','Respaldo simon Bolivar','get.delossantos@gmail.com'),(6,'Getzels','De Los Santos','M','2016-07-16','Respaldo simon Bolivar','get.delossantos@gmail.com'),(8,'Getzels Nicolas','Cabrera Batista','s','2016-07-17','Francisco del rosario sachez ','keyzels@gmail.com'),(9,'nueva informacion','aja','m','2016-04-05','',''),(10,'Xarels','De Los Santos','M','2016-07-15','',''),(11,'Gezel','DAKLSDJF','m',NULL,'asdfasdf','asdfasdfa'),(12,'liham jacob','de los santos cabrera','m','2014-12-15','fco del rosario 56','keyzels@gmail.com'),(13,'elvis','almonte','M','2015-12-05','bonao, aja','ddddd');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-18 14:35:12
