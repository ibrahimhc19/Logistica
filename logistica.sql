-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 18, 2024 at 03:34 AM
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
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nombre`, `apellido`, `telefono`, `correo`, `direccion`) VALUES
(1, 'Juan', 'Pérez', '3001234567', 'juan.perez@example.com', 'Calle 1 #12-34'),
(2, 'María', 'Gómez', '3009876543', 'maria.gomez@example.com', 'Carrera 2 #34-56'),
(3, 'Carlos', 'Ramírez', '3012345678', 'carlos.ramirez@example.com', 'Avenida 3 #45-67'),
(4, 'Ana', 'López', '3018765432', 'ana.lopez@example.com', 'Calle 4 #56-78'),
(5, 'Luis', 'Martínez', '3021234567', 'luis.martinez@example.com', 'Carrera 5 #67-89'),
(6, 'Laura', 'Hernández', '3029876543', 'laura.hernandez@example.com', 'Avenida 6 #78-90'),
(7, 'José', 'García', '3031234567', 'jose.garcia@example.com', 'Calle 7 #89-01'),
(8, 'Lucía', 'Moreno', '3039876543', 'lucia.moreno@example.com', 'Carrera 8 #90-12'),
(9, 'Diego', 'Torres', '3041234567', 'diego.torres@example.com', 'Avenida 9 #12-23'),
(10, 'Sofía', 'Rojas', '3049876543', 'sofia.rojas@example.com', 'Calle 10 #23-34'),
(11, 'Andrés', 'Vargas', '3051234567', 'andres.vargas@example.com', 'Carrera 11 #34-45'),
(12, 'Camila', 'Castro', '3059876543', 'camila.castro@example.com', 'Avenida 12 #45-56'),
(13, 'Miguel', 'Jiménez', '3061234567', 'miguel.jimenez@example.com', 'Calle 13 #56-67'),
(14, 'Isabella', 'Suárez', '3069876543', 'isabella.suarez@example.com', 'Carrera 14 #67-78'),
(15, 'Sebastián', 'Ortiz', '3071234567', 'sebastian.ortiz@example.com', 'Avenida 15 #78-89'),
(16, 'Valeria', 'Mejía', '3079876543', 'valeria.mejia@example.com', 'Calle 16 #89-90'),
(17, 'Gabriel', 'Ruiz', '3081234567', 'gabriel.ruiz@example.com', 'Carrera 17 #90-01'),
(18, 'Paula', 'Navarro', '3089876543', 'paula.navarro@example.com', 'Avenida 18 #01-12'),
(19, 'Fernando', 'Mendoza', '3091234567', 'fernando.mendoza@example.com', 'Calle 19 #12-23'),
(20, 'Daniela', 'Cárdenas', '3099876543', 'daniela.cardenas@example.com', 'Carrera 20 #23-34'),
(21, 'Jorge', 'Paredes', '3101234567', 'jorge.paredes@example.com', 'Avenida 21 #34-45'),
(22, 'Sara', 'Aguilar', '3109876543', 'sara.aguilar@example.com', 'Calle 22 #45-56'),
(23, 'Óscar', 'Quintero', '3111234567', 'oscar.quintero@example.com', 'Carrera 23 #56-67'),
(24, 'Natalia', 'Figueroa', '3119876543', 'natalia.figueroa@example.com', 'Avenida 24 #67-78'),
(25, 'Felipe', 'Velásquez', '3121234567', 'felipe.velasquez@example.com', 'Calle 25 #78-89'),
(26, 'Ángela', 'Pinto', '3129876543', 'angela.pinto@example.com', 'Carrera 26 #89-90'),
(27, 'Iván', 'Carrillo', '3131234567', 'ivan.carrillo@example.com', 'Avenida 27 #90-01'),
(28, 'Elena', 'Barrios', '3139876543', 'elena.barrios@example.com', 'Calle 28 #01-12'),
(29, 'Ricardo', 'Palacios', '3141234567', 'ricardo.palacios@example.com', 'Carrera 29 #12-23'),
(30, 'Andrea', 'Peralta', '3149876543', 'andrea.peralta@example.com', 'Avenida 30 #23-34');

-- --------------------------------------------------------

--
-- Table structure for table `envios`
--

CREATE TABLE `envios` (
  `id_envio` int(11) NOT NULL,
  `tipo_de_producto` varchar(100) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `fecha_de_registro` date DEFAULT NULL,
  `fecha_de_entrega` date DEFAULT NULL,
  `precio_de_envio` decimal(10,2) DEFAULT NULL,
  `numero_de_guia` varchar(50) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `maritima`
--

CREATE TABLE `maritima` (
  `id_envio` int(11) NOT NULL,
  `puerto_de_entrega` varchar(100) DEFAULT NULL,
  `numero_de_flota` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `terrestre`
--

CREATE TABLE `terrestre` (
  `id_envio` int(11) NOT NULL,
  `bodega_de_entrega` varchar(100) DEFAULT NULL,
  `placa_del_vehiculo` varchar(50) DEFAULT NULL
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
-- Indexes for table `envios`
--
ALTER TABLE `envios`
  ADD PRIMARY KEY (`id_envio`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Indexes for table `maritima`
--
ALTER TABLE `maritima`
  ADD PRIMARY KEY (`id_envio`);

--
-- Indexes for table `terrestre`
--
ALTER TABLE `terrestre`
  ADD PRIMARY KEY (`id_envio`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `envios`
--
ALTER TABLE `envios`
  MODIFY `id_envio` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `envios`
--
ALTER TABLE `envios`
  ADD CONSTRAINT `envios_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`);

--
-- Constraints for table `maritima`
--
ALTER TABLE `maritima`
  ADD CONSTRAINT `maritima_ibfk_1` FOREIGN KEY (`id_envio`) REFERENCES `envios` (`id_envio`);

--
-- Constraints for table `terrestre`
--
ALTER TABLE `terrestre`
  ADD CONSTRAINT `terrestre_ibfk_1` FOREIGN KEY (`id_envio`) REFERENCES `envios` (`id_envio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
