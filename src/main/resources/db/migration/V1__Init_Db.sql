--
-- Table structure for table `trades`
--

DROP TABLE IF EXISTS `trades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trades` (
                          `id` int NOT NULL,
                          `Tradedate` date NOT NULL,
                          `valuedate` date NOT NULL,
                          `qty` int NOT NULL,
                          `buysell` varchar(1) NOT NULL,
                          `price` double NOT NULL,
                          `product_id` int NOT NULL,
                          `downstream` varchar(45) NOT NULL,
                          `traderef` varchar(45) NOT NULL,
                          PRIMARY KEY (`id`),
                          KEY `product_id` (`product_id`),
                          CONSTRAINT `product_id` FOREIGN KEY (`product_id`) REFERENCES `trades` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `producttype` int NOT NULL,
                            `productname` varchar(45) NOT NULL,
                            `denominated` varchar(45) NOT NULL,
                            `cross` varchar(45) DEFAULT NULL,
                            `ISIN` varchar(45) DEFAULT NULL,
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;
