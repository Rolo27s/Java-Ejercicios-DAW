CREATE DATABASE  IF NOT EXISTS `biblioteca`;
USE `biblioteca`;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `idusuarios` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `clave` varchar(45) NOT NULL,
  PRIMARY KEY (`idusuarios`)
);

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
INSERT INTO `usuarios` VALUES (1,'Pepe','miclave'),(2,'Maria','clave1234'),(3,'Juan','clavesecreta'),(4,'Ana','miclaveespecial');
UNLOCK TABLES;

-- Dump completed on 2024-05-14 14:17:42
