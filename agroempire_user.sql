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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userId` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `mobileNo` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `parentId` varchar(45) DEFAULT NULL,
  `referalLink` varchar(255) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('1','Value','1','comman@mail.com',NULL,'DIRECT_MEMBER',NULL,'ACTIVE','CUSTOMER'),('10','Value','10','comman@mail.com',NULL,'3',NULL,'ACTIVE','CUSTOMER'),('14','Value','14','comman@mail.com','1','4',NULL,'ACTIVE','CUSTOMER'),('17','Value','17','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('18','Value','18','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('19','Value','19','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('2','Value','2','comman@mail.com',NULL,'1',NULL,'ACTIVE','CUSTOMER'),('20','Value','20','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('21','Value','21','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('22','Value','22','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('23','Value','23','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('24','Value','24','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('25','Value','25','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('26','Value','26','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('27','Value','27','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('28','Value','28','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('29','Value','29','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('3','Value','3','comman@mail.com',NULL,'1',NULL,'ACTIVE','CUSTOMER'),('30','Value','30','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('31','Value','31','sum','6','DIRECT_MEMBER',NULL,'NON_ACTIVE','CUSTOMER'),('4','Value','4','comman@mail.com',NULL,'1',NULL,'ACTIVE','CUSTOMER'),('5','Value','5','comman@mail.com',NULL,'2',NULL,'ACTIVE','CUSTOMER'),('6','Value','6','comman@mail.com',NULL,'2',NULL,'ACTIVE','CUSTOMER'),('7','Value','7','comman@mail.com',NULL,'2',NULL,'ACTIVE','CUSTOMER'),('8','Value','8','comman@mail.com',NULL,'3',NULL,'ACTIVE','CUSTOMER'),('9','Value','9','comman@mail.com',NULL,'3',NULL,'ACTIVE','CUSTOMER');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-09 10:13:34
