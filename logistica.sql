-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2024 at 05:46 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `logistica`
--

-- --------------------------------------------------------

--
-- Table structure for table `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `maritima`
--

CREATE TABLE `maritima` (
  `id` int(11) NOT NULL,
  `tipo_de_producto` varchar(100) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `fecha_de_registro` date DEFAULT NULL,
  `fecha_de_entrega` date DEFAULT NULL,
  `puerto_de_entrega` varchar(100) DEFAULT NULL,
  `precio_de_envio` decimal(10,2) DEFAULT NULL,
  `numero_de_flota` varchar(10) DEFAULT NULL,
  `numero_de_guia` varchar(50) DEFAULT NULL,
  `cliente` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `terrestre`
--

CREATE TABLE `terrestre` (
  `id` int(11) NOT NULL,
  `tipo_de_producto` varchar(100) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `fecha_de_registro` date DEFAULT NULL,
  `fecha_de_entrega` date DEFAULT NULL,
  `bodega_de_entrega` varchar(100) DEFAULT NULL,
  `precio_de_envio` decimal(10,2) DEFAULT NULL,
  `placa_del_vehiculo` varchar(10) DEFAULT NULL,
  `numero_de_guia` varchar(50) DEFAULT NULL,
  `cliente` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indexes for table `maritima`
--
ALTER TABLE `maritima`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `terrestre`
--
ALTER TABLE `terrestre`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `maritima`
--
ALTER TABLE `maritima`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `terrestre`
--
ALTER TABLE `terrestre`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
