-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: agroempire
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `credit_rewards`
--

DROP TABLE IF EXISTS `credit_rewards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `credit_rewards` (
  `sponsorId` varchar(45) NOT NULL,
  `creditLimit` int DEFAULT NULL,
  `creditHisotory` varchar(45) DEFAULT NULL,
  `rewards` int DEFAULT NULL,
  `rewards_history` varchar(45) DEFAULT NULL,
  `discount` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sponsorId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit_rewards`
--

LOCK TABLES `credit_rewards` WRITE;
/*!40000 ALTER TABLE `credit_rewards` DISABLE KEYS */;
INSERT INTO `credit_rewards` VALUES ('1',12100,NULL,5000,NULL,'10%'),('10',0,NULL,0,NULL,'10%'),('14',0,NULL,0,NULL,'10%'),('2',10000,NULL,0,NULL,'10%'),('3',10000,NULL,0,NULL,'10%'),('4',0,NULL,0,NULL,'10%'),('5',0,NULL,0,NULL,'10%'),('6',0,NULL,0,NULL,'10%'),('7',0,NULL,0,NULL,'10%'),('8',0,NULL,0,NULL,'10%'),('9',0,NULL,0,NULL,'10%');
/*!40000 ALTER TABLE `credit_rewards` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-09 10:13:35
