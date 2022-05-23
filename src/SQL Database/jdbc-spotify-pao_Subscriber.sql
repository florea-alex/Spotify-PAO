-- MySQL dump 10.13  Distrib 8.0.29, for macos12 (x86_64)
--
-- Host: localhost    Database: jdbc-spotify-pao
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `Subscriber`
--

DROP TABLE IF EXISTS `Subscriber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Subscriber` (
  `id` int NOT NULL AUTO_INCREMENT,
  `emailAddress` varchar(40) DEFAULT NULL,
  `lastName` varchar(50) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `cardNumber` int DEFAULT NULL,
  `cardEmitter` varchar(45) DEFAULT NULL,
  `cvv` int DEFAULT NULL,
  `ownerName` varchar(100) DEFAULT NULL,
  `fullAddress` varchar(100) DEFAULT NULL,
  `description` varchar(45) NOT NULL,
  `price` float DEFAULT NULL,
  `numberOfAccounts` int DEFAULT NULL,
  `numberOfDevices` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Subscriber`
--

LOCK TABLES `Subscriber` WRITE;
/*!40000 ALTER TABLE `Subscriber` DISABLE KEYS */;
INSERT INTO `Subscriber` VALUES (1,'dani.holland@gmail.com','Holland','Danielle','pass123456',58975643,'MasterCard',221,'Holland Emma','Flowers Avenue 34 UK','Student',2.49,1,1),(2,'carlos.vasq@yahoo.com','Vasquez','Carlos','123456pass',98741265,'Visa',973,'Vasquez Carlos','Congress Street 109 USA','Family',7.99,5,8),(3,'spencers@yahoo.com','Smith','Spencer','pass987654',12345678,'Maestro',849,'Smith Mary','Court Street 31 France','Duo',6.49,2,4),(4,'alexandra.ber@gmail.com','Berry','Alex','987654pass',98431234,'Visa',172,'Berry Alex','Creek Street 22 Belgium','Individual',4.99,1,1),(5,'oly2003@gmail.com','Smith','Olivia','123456pass',12876789,'MasterCard',309,'Smith Isabella','Lustgasse Street 22 Austria','Individual',4.99,1,2),(6,'fitzmia@yahoo.com','Fitzgerald','Mia','password123',98760123,'MasterCard',119,'Fitzgerald Mia','Via Roma 98 Italy','Student',2.49,1,1);
/*!40000 ALTER TABLE `Subscriber` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-22 15:29:00
