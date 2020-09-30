-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2020 a las 21:42:55
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_dulceria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `apellidos` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nombre`, `apellidos`, `telefono`) VALUES
(1, 'Francisco', 'Marquez Lugo', '3312238890'),
(4, 'Luis Fra.', 'Quikin Fonseca', '2124354334'),
(5, 'Samuel', 'Montes', '3344556123'),
(6, 'Andrea', 'Flores', '3331233456'),
(7, 'Rosa', 'Lunares', '1233455678'),
(8, 'German', 'Lopez', '7779123456'),
(9, 'Janette ', 'Garcia ', '3333112231'),
(10, 'Omar', 'Muñiz ', '3311344356'),
(11, 'Elsa', 'Espinoza Rosales', '3333119004');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `codigo_producto` int(11) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `marca` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `decripcion` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `compania` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`codigo_producto`, `nombre`, `marca`, `decripcion`, `precio`, `stock`, `id_usuario`, `compania`) VALUES
(54, 'Sushi', 'Molde', 'Dulces', 77.3, 50, 2, 'Mi alegria'),
(55, 'Manzanitas', 'Mix', 'Gomitas de diferentes sabores ', 30, 37, 2, 'Guaguitas'),
(56, 'Pulparindo', 'Mix', 'Barrita sabor tamarindo con chile', 23.5, 17, 2, 'Guaguitas'),
(57, 'Gomis', 'Mix', 'Gomitas rellenas de chocolate', 23.99, 30, 2, 'Guaguitas'),
(58, 'Palelitas', 'Delmon', 'Paletas de diferentes sabores', 12.5, 40, 2, 'bimbo'),
(59, 'Rosixs', 'Delmon', 'Caramelos sabor chocolate', 30, 4, 2, 'bimbo'),
(60, 'Maizitos', 'Delmon', 'Paletas en forma de elote', 25.7, 22, 2, 'bimbo'),
(61, 'Gudu Pop', 'Sonrics', 'Paletas de sabor fresa', 35, 13, 2, 'Sonrics'),
(62, 'Maguito', 'Sonrics', 'Polvo sabor chicle picante 1pz.', 7, 100, 2, 'Sonrics'),
(63, 'Piñata', 'Sonrics', 'Dulces varios  40pz.', 45, 8, 2, 'Sonrics'),
(64, 'Tix Tix', 'Sonrics', 'Paletas con polvo picante 6pz.', 20, 9, 2, 'Sonrics'),
(65, 'Abejitas', 'Six', 'Chicles sabor piña 30 pz.', 30, 14, 2, 'Mi alegria'),
(66, 'Bola', 'Six', 'Bolas rellenas de mermelada de Fresa 35 pz.', 60, 7, 2, 'Mi alegria'),
(67, 'InspireKa', 'Six', 'Chocolates 15 pz.', 37.9, 30, 2, 'Mi alegria'),
(68, 'Solit', 'Wels', 'Chicles sabor menta 50 pz.', 45, 10, 2, 'Giants'),
(69, 'Muxi', 'Wels', 'Bombones de chocolate 25 pz.', 42.3, 17, 2, 'Giants'),
(70, 'Gelix', 'Del', 'Chocolate negro 6 pz.', 60, 10, 2, 'Giants'),
(71, 'Panditas', 'Frutics', 'Panditas de difrentes sabores 20 pz.', 20, 30, 2, 'Frunas'),
(72, 'Frutitas', 'Selli', 'Caramelo en forma de frutas 15 pz.', 25.1, 45, 2, 'Frunas'),
(73, 'Mi Chocolate', 'Frutics', 'Barras de chocolate 25 pz.', 38.5, 13, 2, 'Frunas'),
(74, 'MisDulces', 'Dulces', 'Dulces varios 50 pz.', 38.5, 80, 2, 'Frunas');

--
-- Disparadores `productos`
--
DELIMITER $$
CREATE TRIGGER `Actualiza_productos` BEFORE UPDATE ON `productos` FOR EACH ROW INSERT INTO productos_actualizados( 
 anterior_decripcion, anterior_marca,anterior_nombre, anterior_precio, anterior_stock, 
 nuevo_decripcion, nuevo_marca, nuevo_nombre, nuevo_precio,nuevo_stock, f_modif)
 VALUES(
OLD.decripcion, OLD.marca,OLD.nombre, OLD.precio, OLD.stock,
NEW.decripcion, NEW.marca,NEW.nombre, NEW.precio, NEW.stock, NOW())
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proovedores`
--

CREATE TABLE `proovedores` (
  `id_proveedor` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `correo` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `compania` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `proovedores`
--

INSERT INTO `proovedores` (`id_proveedor`, `nombre`, `correo`, `telefono`, `compania`, `id_usuario`) VALUES
(9, 'Lucas', 'Welsons@', '12335667', 'Welsons', 2),
(10, 'Luis EF', 'Welsons', '12435465', 'Coriitas', 2),
(12, 'Florinda Mes', 'SoloMon@hot.com', '34566577', 'Solomn', 2),
(13, 'Hernandez', 'Cauas', '232353', 'Lenovo', 2),
(27, 'Peter Recs', 'Alegria@dulces.com', '331112344', 'Mi alegria', 2),
(28, 'Chao Tzin', 'SushiDulces@hot.com', '990012347', 'Sushitas', 2),
(31, 'Juan N. Hernandez', 'Veros@hotmail.com', '5551234567', 'Dulces Vero', 22),
(32, 'Antonienta', 'Ricolin@hot.com', '5556671890', 'Ricolino', 22),
(33, 'Fernando Lucas', 'BIMBOes.@hot.com', '5555788901', 'BIMBO', 22),
(34, 'Eduardo Miñon', 'Frun@hotlive.com', '3312157709', 'Frunas', 22),
(35, 'Luis Angel', 'Coronadoes.@hotlive.com', '3331234550', 'Coronado', 22),
(36, 'Miguel', 'Wbers@hotmail.com', '5588091234', 'Webers', 22),
(37, 'Angel Daniel', 'Sonrics@hotmail.com', '5533008912', 'Sonrics', 22),
(38, 'Jaime Torres', 'Giants_es.@hot.com', '4466881223', 'Giants', 22),
(39, 'Marianna Sanchez', 'SourPath_@live.com', '8890123345', 'Guaguitas', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `apellidos` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `edad` varchar(3) COLLATE utf8_unicode_ci NOT NULL,
  `sexo` char(1) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `puesto` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `usuario` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre`, `apellidos`, `edad`, `sexo`, `telefono`, `puesto`, `usuario`, `password`) VALUES
(2, 'Jesús', 'Magallanes Millar', '24', 'M', '333333600', 'Jefe', 'edux', '123'),
(5, 'Francisco Javier', 'Contreras Selon', '29', 'M', '233543636', 'Empleado', 'Estelar', 'es123'),
(19, 'Daniel', 'Ramirez Villalvazo', '26', 'M', '3344335690', 'Empleado', 'DanielVil', '123456789'),
(20, 'Itzel', 'Frausto Lopez', '22', 'F', '3333363839', 'Empleado', 'Itzl123', '123'),
(21, 'Marianna', 'Castillo Furel', '30', 'F', '3314157902', 'Empleado', 'Marianna_3', '123456789'),
(22, 'Roman', 'Calapiz Real', '37', 'M', '3312334230', 'Jefe', 'Romanns', '1234567'),
(23, 'Jonathan', 'Castillo Fills', '28', 'M', '3334337011', 'Empleado', 'Jonys', '1234567');

--
-- Disparadores `usuarios`
--
DELIMITER $$
CREATE TRIGGER `usuariosall` AFTER INSERT ON `usuarios` FOR EACH ROW INSERT INTO usuarios_historicos(nombre, apellidos, edad, sexo, puesto)
VALUES (NEW.nombre, NEW.apellidos,NEW.edad, NEW.sexo, NEW.puesto)
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id_venta` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `fecha_venta` date NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id_venta`, `id_cliente`, `id_usuario`, `fecha_venta`, `total`) VALUES
(67, 1, 2, '2020-04-11', 154.6),
(68, 4, 2, '2020-04-11', 77.3),
(71, 1, 2, '2020-04-11', 231.89999999999998),
(72, 4, 2, '2020-04-11', 463.79999999999995),
(73, 1, 2, '2020-04-11', 2319),
(74, 8, 2, '2020-04-13', 485),
(75, 4, 2, '2020-04-13', 110),
(76, 1, 2, '2020-04-14', 45),
(77, 1, 2, '2020-04-14', 122),
(78, 4, 2, '2020-04-14', 115.5),
(79, 1, 2, '2020-04-14', 94),
(80, 8, 20, '2020-04-14', 154);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_productos`
--

CREATE TABLE `venta_productos` (
  `id_ventas_productos` int(11) NOT NULL,
  `codigo_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio_venta` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `venta_productos`
--

INSERT INTO `venta_productos` (`id_ventas_productos`, `codigo_producto`, `cantidad`, `precio_venta`) VALUES
(66, 54, 2, 77.3),
(67, 54, 1, 77.3),
(69, 54, 3, 77.3),
(70, 54, 1, 77.3),
(71, 54, 3, 77.3),
(72, 54, 30, 77.3),
(73, 64, 5, 20),
(74, 55, 3, 30),
(75, 63, 1, 45),
(76, 74, 2, 38.5),
(77, 74, 1, 38.5),
(78, 56, 2, 23.5),
(79, 74, 4, 38.5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`codigo_producto`),
  ADD KEY `FK_Pro_Usu` (`id_usuario`),
  ADD KEY `Fk_Prov_prod` (`compania`);

--
-- Indices de la tabla `proovedores`
--
ALTER TABLE `proovedores`
  ADD PRIMARY KEY (`id_proveedor`),
  ADD KEY `FK_Pro_prod` (`compania`),
  ADD KEY `Fk_Prov_usu` (`id_usuario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id_venta`),
  ADD KEY `FK_Vent_usu` (`id_usuario`),
  ADD KEY `Fk_Vent_clien` (`id_cliente`);

--
-- Indices de la tabla `venta_productos`
--
ALTER TABLE `venta_productos`
  ADD PRIMARY KEY (`id_ventas_productos`),
  ADD KEY `FK_venpro_ventas` (`codigo_producto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `codigo_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;

--
-- AUTO_INCREMENT de la tabla `proovedores`
--
ALTER TABLE `proovedores`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=81;

--
-- AUTO_INCREMENT de la tabla `venta_productos`
--
ALTER TABLE `venta_productos`
  MODIFY `id_ventas_productos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `FK_Pro_Usu` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_Prov_prod` FOREIGN KEY (`compania`) REFERENCES `proovedores` (`compania`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `proovedores`
--
ALTER TABLE `proovedores`
  ADD CONSTRAINT `Fk_Prov_usu` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `FK_Vent_usu` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_Vent_clien` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta_productos`
--
ALTER TABLE `venta_productos`
  ADD CONSTRAINT `FK_venpro_ventas` FOREIGN KEY (`codigo_producto`) REFERENCES `productos` (`codigo_producto`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
