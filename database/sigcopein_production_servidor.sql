CREATE DATABASE  IF NOT EXISTS `sigcopein_production` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sigcopein_production`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: sigcopein_production
-- ------------------------------------------------------
-- Server version	5.6.15

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
-- Table structure for table `servidor`
--

DROP TABLE IF EXISTS `servidor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servidor` (
  `siape` varchar(7) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(45) NOT NULL,
  `habilitado` tinyint(1) NOT NULL DEFAULT '1',
  `servidor_id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(14) NOT NULL,
  `lattes` varchar(255) NOT NULL,
  PRIMARY KEY (`servidor_id`),
  UNIQUE KEY `siape_UNIQUE` (`siape`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servidor`
--

LOCK TABLES `servidor` WRITE;
/*!40000 ALTER TABLE `servidor` DISABLE KEYS */;
INSERT INTO `servidor` VALUES ('1935921','Max Miller da Silveira','max.silveira@ifrn.edu.br',0,3,'053.787.594-80','http://lattes.cnpq.br/6390627525518012'),('1549884','Marcal Jose de Oliveira Morais II','marcal.morais@ifrn.edu.br',0,4,'047.528.684-74','http://lattes.cnpq.br/6014470278301140'),('1883948','Geam Carlos de Araujo Filgueira','geam.filgueira@ifrn.edu.br',0,5,'038.873.434-50','http://lattes.cnpq.br/1250478845786975'),('1883737','Tiago De Lima Wanderley','tiago.wanderley@ifrn.edu.br',0,6,'008.912.344-11','http://lattes.cnpq.br/3024084624909780'),('2108810','Karlos Thadeu Matias Vital de Oliveira','karlos.oliveira@ifrn.edu.br',0,7,'010.812.184-44','http://lattes.cnpq.br/8911678467476664'),('1721787','Joaildo Maia','joaildo.maia@ifrn.edu.br',0,8,'750.783.094-20','http://lattes.cnpq.br/9501400008776063'),('1814194','ALISSON DIEGO DIAS DE MEDEIROS','alisson.dias@ifrn.edu.br',0,9,'058.335.034-85','http://lattes.cnpq.br/3185652099764816'),('1755897','ITALO BATISTA DA SILVA','italo.batista@ifrn.edu.br',0,10,'044.947.274-40','http://lattes.cnpq.br/1384082578776347'),('2777919','JOSE CARLOS VIEIRA DE SOUZA','jose.souza@ifrn.edu.br',0,11,'785.251.794-34','http://lattes.cnpq.br/0520485784139709'),('1731351','Gleidson Barbosa Palmeira','gleidson.palmeira@ifrn.edu.br',0,12,'035.280.604-41','http://lattes.cnpq.br/1101470201591389'),('1784443','Sebastiao Gilton Dantas','gilton.dantas@ifrn.edu.br',0,13,'428.648.794-68',' http://lattes.cnpq.br/8355446507340141');
/*!40000 ALTER TABLE `servidor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-10 10:55:04
