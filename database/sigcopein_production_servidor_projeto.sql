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
-- Table structure for table `servidor_projeto`
--

DROP TABLE IF EXISTS `servidor_projeto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servidor_projeto` (
  `aluno_projeto_id` int(11) NOT NULL AUTO_INCREMENT,
  `bolsista` tinyint(1) NOT NULL,
  `data_inicio` date NOT NULL,
  `data_fim` date DEFAULT NULL,
  `projeto_id` int(11) NOT NULL,
  `carga_horaria` int(11) NOT NULL,
  `habilitado` tinyint(1) DEFAULT NULL,
  `anexo` longblob NOT NULL,
  `nome_anexo` varchar(255) NOT NULL,
  `agencia` varchar(45) DEFAULT NULL,
  `conta` varchar(45) DEFAULT NULL,
  `banco_id` int(11) NOT NULL,
  `servidor_id` int(11) NOT NULL,
  PRIMARY KEY (`aluno_projeto_id`),
  KEY `projeto_aluno_projeto_fk` (`projeto_id`),
  KEY `fk_aluno_projeto_banco1_idx` (`banco_id`),
  KEY `fk_servidor_projeto_servidor1_idx` (`servidor_id`),
  CONSTRAINT `fk_aluno_projeto_banco10` FOREIGN KEY (`banco_id`) REFERENCES `banco` (`banco_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_servidor_projeto_servidor1` FOREIGN KEY (`servidor_id`) REFERENCES `servidor` (`servidor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `projeto_aluno_projeto_fk0` FOREIGN KEY (`projeto_id`) REFERENCES `projeto` (`projeto_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servidor_projeto`
--

LOCK TABLES `servidor_projeto` WRITE;
/*!40000 ALTER TABLE `servidor_projeto` DISABLE KEYS */;
/*!40000 ALTER TABLE `servidor_projeto` ENABLE KEYS */;
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
