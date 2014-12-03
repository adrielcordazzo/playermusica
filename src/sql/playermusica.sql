-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tempo de Geração: Dez 03, 2014 as 09:54 PM
-- Versão do Servidor: 5.1.54
-- Versão do PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Banco de Dados: `playermusica`
--
CREATE DATABASE `playermusica` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `playermusica`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `album`
--

CREATE TABLE IF NOT EXISTS `album` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `album`
--

INSERT INTO `album` (`id`, `nome`) VALUES
(1, 'Where the light is'),
(2, 'Branco');

-- --------------------------------------------------------

--
-- Estrutura da tabela `artista`
--

CREATE TABLE IF NOT EXISTS `artista` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `artista`
--

INSERT INTO `artista` (`id`, `nome`) VALUES
(1, 'John Mayer'),
(2, 'Adriel');

-- --------------------------------------------------------

--
-- Estrutura da tabela `musica`
--

CREATE TABLE IF NOT EXISTS `musica` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_artista` int(11) NOT NULL,
  `id_album` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `diretorio` varchar(100) NOT NULL,
  `avaliacao` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `musica`
--

INSERT INTO `musica` (`id`, `id_artista`, `id_album`, `nome`, `diretorio`, `avaliacao`) VALUES
(4, 1, 1, 'Gravity', 'Gravity.mp3', 5);
