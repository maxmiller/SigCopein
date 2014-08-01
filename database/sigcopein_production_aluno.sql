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
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aluno` (
  `aluno_id` int(11) NOT NULL AUTO_INCREMENT,
  `habilitado` tinyint(1) NOT NULL DEFAULT '1',
  `matricula` varchar(25) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `email` varchar(80) NOT NULL,
  `lattes` varchar(255) NOT NULL,
  PRIMARY KEY (`aluno_id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `lattes_UNIQUE` (`lattes`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (64,1,'20131104010164','DÉBORA CAROLINE DE AZEVEDO PEREIRA','016.680.844-06','deboraazevedo98@hotmail.com','http://lattes.cnpq.br/1014422699627878'),(65,1,'20111104090597','FERNANDO IGOR DANTAS','017.488.014-65','fernando_id.7@hotmail.com','http://lattes.cnpq.br/6066609006324653'),(66,1,'20111104090198','MATHEUS HENRIQUE ARAòJO DE MEDEIROS','103.069.834-19','mham.cie@gmail.com','http://lattes.cnpq.br/7464024048143492'),(67,1,'20111104090040','Emanoel Dantas Pereira','106.250.274-42','Emanoel-252011@hotmail.com','http://lattes.cnpq.br/0309087503435339'),(68,1,'20111104090619','ALAN DE MEDEIROS TAVARES','017.548.264-07','alan_tj@hotmail.com.br','http://lattes.cnpq.br/4019510144773921'),(69,1,'20131104010415','Jeanderson Medeiros da Silva','102.874.844-24','jeanderson.mdrs@hotmail.com',' http://lattes.cnpq.br/5649826404681243'),(70,1,'20131102010051','THALIS DA COSTA GUEDES','018.078.524-90','thalisjp@gmail.com','http://lattes.cnpq.br/3506844294621585'),(71,1,'20141102010270','Leticia do Carmo Souza','701.221.074-54','leticia.souz@outlook.com','http://lattes.cnpq.br/8039538278302623'),(72,1,'20101104090387','Jéssica Crislanny Vale de Lima','016.691.024-40','jessica.crislanny@hotmail.com','http://lattes.cnpq.br/8900774560050801'),(73,1,'20121104010272','Brunno Ravelly de Medeiros Macdo','075.456.744-30','Brunnoravelly.ifrn@gmail.com	','http://lattes.cnpq.br/5953590359850251'),(74,1,'20131106010145','Jose Joelson de Oliveira Brito ','106.842.444-38','JOELSONBEZERRA_2011@HOTMAIL.COM','http://lattes.cnpq.br/0274099497778014'),(75,1,'20131104010245','AMANDA SOUSA DE MEDEIROS','115.838.974-45','amandacarry99@hotmail.com','http://lattes.cnpq.br/6513924432898718'),(76,1,'20111104090023','BRENO PABLO VALLE DE MEDEIROS','700.274.894-77','breno-pablo10@hotmail.com','http://lattes.cnpq.br/2917008512740921'),(77,1,'20131104010113','Lucas de Medeiros Nunes Fernandes','703.285.074-07','blogcpvoriginal@hotmail.com','http://lattes.cnpq.br/1868054343793146'),(78,1,'20111104090309','LUMA MIRELLE FERREIRA DA SILVA','080.408.524-20','	luma_mirelle2007@hotmail.com','http://buscatextual.cnpq.br/buscatextual/visualizacv.do?metodo=apresentar&id=K8155027T7'),(79,1,'20131102010345','BEATRIZ ALVES DOS SANTOS','118.481.054-01','beatriza163@gmail.com',' http://lattes.cnpq.br/6845690887341289'),(80,1,'20141102010318','Maria de Lourdes Araœjo de Medeiros','121.175.424-33','mariaa.lourdes@outlook.com','http://lattes.cnpq.br/7418064296304598'),(81,1,'20111104090457','Islane Any de Brito Silva','109.796.104-43','islannebritto@hotmail.com','http://lattes.cnpq.br/0317790185835890'),(82,1,'20121102010305','Talita do Patrocínio Dantas dos Santos ','017.724.104-70','talyta.2010@gmail.com','http://lattes.cnpq.br/9134778893857252'),(83,1,'20131106010366','GABRIEL DA SILVA MELO JòNIOR','069.739.104-32','FRED_GABRIEL@HOTMAIL.COM','http://lattes.cnpq.br/0977456294817337'),(84,1,'20131102010310','Moises Morais de Oliveira','700.786.064-89','moisesmorais14@gmail.com','http://lattes.cnpq.br/2246911293427044'),(85,1,'20111104090090','FRANCISCO LUCAS VIEIRA DO NASCIMENTO','016.708.254-00','lucasvieira.parelhas02@gmail.com','http://lattes.cnpq.br/1786421693761236'),(86,1,'20111104090180','Maria Luísa de Assis Braga','109.017.754-28','marialuisaabraga@hotmail.com','http://lattes.cnpq.br/4027504895103709'),(87,1,'20111104100010','SAVIO GORGONIO PAES DE BULHOES','105.758.564-59','	saviopaes@live.com','http://buscatextual.cnpq.br/buscatextual/visualizacv.do?id=K8155078A8'),(88,1,'20141102010083','Everton Cleyton Macdo da Cruz','017.369.534-51','evertoncleyton9@gmail.com','http://lattes.cnpq.br/4508807852250301'),(89,1,'20111104090600','Nalyanna Costa de Medeiros	','016.699.244-59','nalyannacosta@hotmail.com','http://lattes.cnpq.br/5813381177673633'),(90,1,'20121104010205','Felipe de Oliveira Lucio Tavares','016.904.794-69','felipe.oltavares@gmail.com','http://lattes.cnpq.br/2736794011848462'),(91,1,'20121104010175','SORAYA ROBERTA DOS SANTOS MEDEIROS','098.210.764-16','sorayaroberta2009@hotmail.com','http://lattes.cnpq.br/3120204826432609'),(92,1,'20111104090430','Flávia Taline Silva de Medeiros','052.602.654-59','taline_flavia@hotmail.com','http://lattes.cnpq.br/7907453139395999'),(93,1,'20111104090546','INACIA JORDANA DE OLIVEIRA SANTOS','017.421.684-00','	jordana.oliveira@outlook.com','http://buscatextual.cnpq.br/buscatextual/visualizacv.do?id=K8155234J3'),(94,1,'20141102010300','Alison Fernandes Brito de Frana','018.120.834-24','alisonestudante507@gmail.com','N/A'),(95,1,'20111104090082','Hanna Letécia Medeiros Farias','017.256.694-04','hannasjs@hotmail.com','http://buscatextual.cnpq.br/buscatextual/visualizacv.do?id=K8155098J5');
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
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
