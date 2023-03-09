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
-- Table structure for table `team_size`
--

DROP TABLE IF EXISTS `team_size`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team_size` (
  `sponsorId` varchar(45) DEFAULT NULL,
  `childId` varchar(45) DEFAULT NULL,
  `childName` varchar(45) DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `childStatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team_size`
--

LOCK TABLES `team_size` WRITE;
/*!40000 ALTER TABLE `team_size` DISABLE KEYS */;
INSERT INTO `team_size` VALUES ('DIRECT_MEMBER','1','Value',1,'ACTIVE'),('1','2','Value',2,'ACTIVE'),('1','3','Value',3,'ACTIVE'),('1','4','Value',4,'ACTIVE'),('2','5','Value',5,'ACTIVE'),('2','6','Value',6,'ACTIVE'),('2','7','Value',7,'ACTIVE'),('3','8','Value',8,'ACTIVE'),('3','9','Value',9,'ACTIVE'),('3','10','Value',10,'ACTIVE'),('4','14','Value',11,'ACTIVE'),('DIRECT_MEMBER','17','Value',12,'NON_ACTIVE'),('DIRECT_MEMBER','18','Value',13,'NON_ACTIVE'),('DIRECT_MEMBER','19','Value',14,'NON_ACTIVE'),('DIRECT_MEMBER','20','Value',15,'NON_ACTIVE'),('DIRECT_MEMBER','21','Value',16,'NON_ACTIVE'),('DIRECT_MEMBER','22','Value',17,'NON_ACTIVE'),('DIRECT_MEMBER','23','Value',18,'NON_ACTIVE'),('DIRECT_MEMBER','24','Value',19,'NON_ACTIVE'),('DIRECT_MEMBER','25','Value',20,'NON_ACTIVE'),('DIRECT_MEMBER','26','Value',21,'NON_ACTIVE'),('DIRECT_MEMBER','27','Value',22,'NON_ACTIVE'),('DIRECT_MEMBER','28','Value',23,'NON_ACTIVE'),('DIRECT_MEMBER','29','Value',24,'NON_ACTIVE'),('DIRECT_MEMBER','30','Value',25,'NON_ACTIVE'),('DIRECT_MEMBER','31','Value',26,'NON_ACTIVE');
/*!40000 ALTER TABLE `team_size` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-09 10:13:33
