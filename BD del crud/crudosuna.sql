-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-08-2022 a las 03:35:34
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `crudosuna`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aprendiz1`
--

CREATE TABLE `aprendiz1` (
  `tipo_documento` varchar(40) NOT NULL,
  `num_documento` int(12) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Genero` varchar(50) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Celular` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `aprendiz1`
--

INSERT INTO `aprendiz1` (`tipo_documento`, `num_documento`, `Nombres`, `Genero`, `Direccion`, `Celular`) VALUES
('cedula de ciudadania', 1111122054, 'Juan David osuna', 'Masculino', 'Calle 40 N° 6-18', 222697875),
('pasaporte', 1234556789, 'Milena Rodriguez', 'Femenino', 'Calle 40 N° 6-18', 1568272664);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `id_empresa` int(11) NOT NULL,
  `Nom_empresa` varchar(50) NOT NULL,
  `Direcion_empresa` varchar(60) NOT NULL,
  `Cargo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aprendiz1`
--
ALTER TABLE `aprendiz1`
  ADD PRIMARY KEY (`num_documento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
