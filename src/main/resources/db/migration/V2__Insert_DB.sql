--
-- Dumping data for table `trades`
--

LOCK TABLES `trades` WRITE;
/*!40000 ALTER TABLE `trades` DISABLE KEYS */;
INSERT INTO `trades` VALUES (1,'2020-04-05','2020-04-06',10000,'B',108.5,1,'BrokerA','Fwd1'),(2,'2020-04-05','2020-04-06',10000,'S',70.1223,2,'BrokerA','Fwd2'),(3,'2020-04-05','2020-04-06',10000,'B',1.423,3,'BrokerA','Fwd3'),(4,'2020-04-05','2020-04-07',100000000,'S',99.4,4,'BrokerA','JGB1'),(5,'2020-04-08','2020-04-10',200000000,'B',99.5,5,'BrokerA','JGB2'),(6,'2020-04-08','2020-04-10',10000,'B',109.1,1,'BrokerB','Fwd4'),(7,'2020-04-08','2020-04-10',10000,'S',1.23,6,'BrokerB','Fwd5'),(8,'2020-04-08','2020-04-10',100000000,'B',99.8,4,'BrokerB','JGB3');
/*!40000 ALTER TABLE `trades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,1,'Fwd123','USD','USDJPY',NULL),(2,1,'Fwd234','JPY','AUDJPY',NULL),(3,1,'Fwd345','USD','USDSGD',NULL),(4,2,'JGB10y','JPY',NULL,'JPAAA'),(5,2,'JGB20y','JPY',NULL,'JPBBB'),(6,1,'Fwd456','USD','EURUSD',NULL);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
