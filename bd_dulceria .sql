-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_dulceria
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `apellidos` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Francisco','Marquez Lugo','3312238890'),(4,'Luis Fra.','Quikin Fonseca','2124354334'),(5,'Samuel','Montes','3344556123'),(6,'Andrea','Flores','3331233456'),(7,'Rosa','Lunares','1233455678'),(8,'German','Lopez','7779123456'),(9,'Janette ','Garcia ','3333112231'),(10,'Omar','Muñiz ','3311344356'),(11,'Elsa','Espinoza Rosales','3333119004');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `codigo_producto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `marca` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `decripcion` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `precio` double NOT NULL,
  `stock` int NOT NULL,
  `id_usuario` int NOT NULL,
  `compania` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`codigo_producto`),
  KEY `FK_Pro_Usu` (`id_usuario`),
  KEY `Fk_Prov_prod` (`compania`),
  CONSTRAINT `FK_Pro_Usu` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON UPDATE CASCADE,
  CONSTRAINT `Fk_Prov_prod` FOREIGN KEY (`compania`) REFERENCES `proovedores` (`compania`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (54,'Sushi','Molde','Dulces',77.3,30,2,'Mi alegria'),(55,'Manzanitas','Mix','Gomitas de diferentes sabores ',30,37,2,'Guaguitas'),(56,'Pulparindo','Mix','Barrita sabor tamarindo con chile',23.5,16,2,'Guaguitas'),(57,'Gomis','Mix','Gomitas rellenas de chocolate',23.99,30,2,'Guaguitas'),(58,'Palelitas','Delmon','Paletas de diferentes sabores',12.5,40,2,'bimbo'),(59,'Rosixs','Delmon','Caramelos sabor chocolate',30,4,2,'bimbo'),(60,'Maizitos','Delmon','Paletas en forma de elote',25.7,22,2,'bimbo'),(61,'Gudu Pop','Sonrics','Paletas de sabor fresa',35,13,2,'Sonrics'),(62,'Maguito','Sonrics','Polvo sabor chicle picante 1pz.',7,100,2,'Sonrics'),(63,'Piñata','Sonrics','Dulces varios  40pz.',45,8,2,'Sonrics'),(64,'Tix Tix','Sonrics','Paletas con polvo picante 6pz.',20,9,2,'Sonrics'),(65,'Abejitas','Six','Chicles sabor piña 30 pz.',30,14,2,'Mi alegria'),(66,'Bola','Six','Bolas rellenas de mermelada de Fresa 35 pz.',60,7,2,'Mi alegria'),(67,'InspireKa','Six','Chocolates 15 pz.',37.9,30,2,'Mi alegria'),(68,'Solit','Wels','Chicles sabor menta 50 pz.',45,10,2,'Giants'),(69,'Muxi','Wels','Bombones de chocolate 25 pz.',42.3,17,2,'Giants'),(70,'Gelix','Del','Chocolate negro 6 pz.',60,10,2,'Giants'),(71,'Panditas','Frutics','Panditas de difrentes sabores 20 pz.',20,30,2,'Frunas'),(72,'Frutitas','Selli','Caramelo en forma de frutas 15 pz.',25.1,45,2,'Frunas'),(73,'Mi Chocolate','Frutics','Barras de chocolate 25 pz.',38.5,13,2,'Frunas'),(74,'MisDulces','Dulces','Dulces varios 50 pz.',38.5,80,2,'Frunas');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proovedores`
--

DROP TABLE IF EXISTS `proovedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proovedores` (
  `id_proveedor` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `correo` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `compania` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`id_proveedor`),
  KEY `FK_Pro_prod` (`compania`),
  KEY `Fk_Prov_usu` (`id_usuario`),
  CONSTRAINT `Fk_Prov_usu` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proovedores`
--

LOCK TABLES `proovedores` WRITE;
/*!40000 ALTER TABLE `proovedores` DISABLE KEYS */;
INSERT INTO `proovedores` VALUES (9,'Lucas','Welsons@','12335667','Welsons',2),(10,'Luis EF','Welsons','12435465','Coriitas',2),(12,'Florinda Mes','SoloMon@hot.com','34566577','Solomn',2),(13,'Hernandez','Cauas','232353','Lenovo',2),(27,'Peter Recs','Alegria@dulces.com','331112344','Mi alegria',2),(28,'Chao Tzin','SushiDulces@hot.com','990012347','Sushitas',2),(31,'Juan N. Hernandez','Veros@hotmail.com','5551234567','Dulces Vero',22),(32,'Antonienta','Ricolin@hot.com','5556671890','Ricolino',22),(33,'Fernando Lucas','BIMBOes.@hot.com','5555788901','BIMBO',22),(34,'Eduardo Miñon','Frun@hotlive.com','3312157709','Frunas',22),(35,'Luis Angel','Coronadoes.@hotlive.com','3331234550','Coronado',22),(36,'Miguel','Wbers@hotmail.com','5588091234','Webers',22),(37,'Angel Daniel','Sonrics@hotmail.com','5533008912','Sonrics',22),(38,'Jaime Torres','Giants_es.@hot.com','4466881223','Giants',22),(39,'Marianna Sanchez','SourPath_@live.com','8890123345','Guaguitas',2);
/*!40000 ALTER TABLE `proovedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `apellidos` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `edad` varchar(3) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `sexo` char(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `puesto` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `usuario` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (2,'Jesús','Magallanes Millar','24','M','333333600','Jefe','edux','123'),(5,'Francisco Javier','Contreras Selon','29','M','233543636','Empleado','Estelar','es123'),(19,'Daniel','Ramirez Villalvazo','26','M','3344335690','Empleado','DanielVil','123456789'),(20,'Itzel','Frausto Lopez','22','F','3333363839','Empleado','Itzl123','123'),(21,'Marianna','Castillo Furel','30','F','3314157902','Empleado','Marianna_3','123456789'),(22,'Roman','Calapiz Real','37','M','3312334230','Jefe','Romanns','1234567'),(23,'Jonathan','Castillo Fills','28','M','3334337011','Empleado','Jonys','1234567');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta_productos`
--

DROP TABLE IF EXISTS `venta_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta_productos` (
  `id_ventas_productos` int NOT NULL AUTO_INCREMENT,
  `codigo_producto` int NOT NULL,
  `cantidad` int NOT NULL,
  `precio_venta` double NOT NULL,
  PRIMARY KEY (`id_ventas_productos`),
  KEY `FK_venpro_ventas` (`codigo_producto`),
  CONSTRAINT `FK_venpro_ventas` FOREIGN KEY (`codigo_producto`) REFERENCES `productos` (`codigo_producto`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta_productos`
--

LOCK TABLES `venta_productos` WRITE;
/*!40000 ALTER TABLE `venta_productos` DISABLE KEYS */;
INSERT INTO `venta_productos` VALUES (66,54,2,77.3),(67,54,1,77.3),(69,54,3,77.3),(70,54,1,77.3),(71,54,3,77.3),(72,54,30,77.3),(73,64,5,20),(74,55,3,30),(75,63,1,45),(76,74,2,38.5),(77,74,1,38.5),(78,56,2,23.5),(79,74,4,38.5),(80,55,2,30),(81,57,1,23.99),(82,54,1,77.3),(83,54,1,77.3),(84,54,3,77.3),(85,54,3,77.3),(86,54,1,77.3),(87,54,5,77.3),(88,54,1,77.3),(89,54,1,77.3),(90,54,2,77.3),(91,54,1,77.3),(92,54,1,77.3),(93,57,2,23.99),(94,57,1,23.99),(95,57,1,23.99),(96,55,1,30),(97,55,1,30),(98,55,1,30),(99,55,2,30),(100,55,1,30),(101,54,1,77.3),(102,54,1,77.3),(103,55,1,30),(104,54,1,77.3),(105,54,1,77.3),(106,57,2,23.99),(107,54,1,77.3),(108,54,1,77.3),(109,54,1,77.3),(110,54,1,77.3),(111,54,1,77.3),(112,54,2,77.3),(113,54,2,77.3),(114,54,2,77.3),(115,54,2,77.3),(116,54,1,77.3),(117,54,1,77.3),(118,54,3,77.3),(119,56,1,23.5),(120,56,1,23.5),(121,54,3,77.3),(122,54,2,77.3),(123,54,2,77.3),(124,54,6,77.3);
/*!40000 ALTER TABLE `venta_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `id_venta` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int NOT NULL,
  `id_usuario` int NOT NULL,
  `fecha_venta` date NOT NULL,
  `total` double NOT NULL,
  PRIMARY KEY (`id_venta`),
  KEY `FK_Vent_usu` (`id_usuario`),
  KEY `Fk_Vent_clien` (`id_cliente`),
  CONSTRAINT `Fk_Vent_clien` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`) ON UPDATE CASCADE,
  CONSTRAINT `FK_Vent_usu` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=126 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (67,1,2,'2020-04-11',154.6),(68,4,2,'2020-04-11',77.3),(71,1,2,'2020-04-11',231.89999999999998),(72,4,2,'2020-04-11',463.79999999999995),(73,1,2,'2020-04-11',2319),(74,8,2,'2020-04-13',485),(75,4,2,'2020-04-13',110),(76,1,2,'2020-04-14',45),(77,1,2,'2020-04-14',122),(78,4,2,'2020-04-14',115.5),(79,1,2,'2020-04-14',94),(80,8,20,'2020-04-14',154),(81,1,5,'2020-08-22',60),(82,1,5,'2020-08-22',83.99),(83,1,5,'2020-08-22',161.29),(84,1,5,'2020-08-22',77.3),(85,1,5,'2020-08-22',309.2),(86,1,2,'2020-09-02',231.89999999999998),(87,1,2,'2020-09-02',77.3),(88,1,2,'2020-09-02',386.5),(89,1,2,'2020-09-02',231.89999999999998),(90,1,2,'2020-09-02',77.3),(91,1,2,'2020-09-06',154.6),(92,1,2,'2020-09-06',77.3),(93,1,2,'2020-09-06',77.3),(94,1,2,'2020-09-06',125.28),(95,1,2,'2020-09-06',101.28999999999999),(96,1,2,'2020-09-06',101.28999999999999),(97,1,2,'2020-09-06',107.3),(98,1,2,'2020-09-06',107.3),(99,1,2,'2020-09-06',107.3),(100,1,2,'2020-09-06',137.3),(101,1,2,'2020-09-06',107.3),(102,1,2,'2020-09-06',77.3),(103,1,2,'2020-09-06',77.3),(104,1,2,'2020-09-06',107.3),(105,1,2,'2020-09-06',77.3),(106,1,2,'2020-09-06',77.3),(107,1,2,'2020-09-06',125.28),(108,1,2,'2020-09-06',77.3),(109,1,2,'2020-09-06',77.3),(110,1,2,'2020-09-06',77.3),(111,1,2,'2020-09-06',77.3),(112,1,2,'2020-09-06',77.3),(113,1,2,'2020-09-06',154.6),(114,1,2,'2020-09-06',154.6),(115,1,2,'2020-09-06',154.6),(116,1,2,'2020-09-06',154.6),(117,1,2,'2020-09-06',77.3),(118,1,2,'2020-09-06',77.3),(119,1,2,'2020-09-06',231.89999999999998),(120,4,2,'2020-09-06',177.8),(121,4,2,'2020-09-06',130.8),(122,1,2,'2020-09-08',231.89999999999998),(123,1,2,'2020-09-09',154.6),(124,1,2,'2020-09-09',309.2),(125,1,2,'2020-09-09',773);
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-27  9:31:58
