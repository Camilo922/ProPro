-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 04-Jul-2024 às 23:12
-- Versão do servidor: 10.4.32-MariaDB
-- versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `girassol`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `consulta`
--

CREATE TABLE `consulta` (
  `codigo` int(11) NOT NULL,
  `data` varchar(30) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `paciente` varchar(40) NOT NULL,
  `medico` int(11) NOT NULL,
  `sala` varchar(50) NOT NULL,
  `hora` varchar(30) NOT NULL,
  `resultado` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `especialidade`
--

CREATE TABLE `especialidade` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `descricao` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `especialidade`
--

INSERT INTO `especialidade` (`codigo`, `nome`, `descricao`) VALUES
(25, 'Dermatologia', 'D'),
(26, 'Cardiologia', ''),
(27, 'dermatologia', 'e uma area funamental');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `bi` varchar(14) NOT NULL,
  `cargo` varchar(100) NOT NULL,
  `horario` varchar(100) NOT NULL,
  `utilizador` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`codigo`, `nome`, `bi`, `cargo`, `horario`, `utilizador`) VALUES
(1, 'Quinai', '0900jkgskas', 'Atendente', 'Segunda', 'admin');

-- --------------------------------------------------------

--
-- Estrutura da tabela `medicamento`
--

CREATE TABLE `medicamento` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `medicamento`
--

INSERT INTO `medicamento` (`codigo`, `nome`) VALUES
(15, 'Paracetamol');

-- --------------------------------------------------------

--
-- Estrutura da tabela `medico`
--

CREATE TABLE `medico` (
  `numero` int(11) NOT NULL,
  `funcionario` int(11) NOT NULL,
  `especialidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `paciente`
--

CREATE TABLE `paciente` (
  `numeroDoc` varchar(40) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `dataNascimento` varchar(30) NOT NULL,
  `telefone` varchar(16) DEFAULT NULL,
  `provincia` varchar(50) DEFAULT NULL,
  `municipio` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `paciente`
--

INSERT INTO `paciente` (`numeroDoc`, `nome`, `dataNascimento`, `telefone`, `provincia`, `municipio`, `bairro`) VALUES
('008891944', 'sebastiao', '2024-07-08', '(   )   -   -   ', 'Bengo', 'Dande', 'mulefo'),
('ds', 'dsvv', '2024-06-05', '(941)089-997-800', 'Benguela', 'Baía Farta', 'dvdsv');

-- --------------------------------------------------------

--
-- Estrutura da tabela `preescricao`
--

CREATE TABLE `preescricao` (
  `codigo` int(11) NOT NULL,
  `consulta` int(11) NOT NULL,
  `medicamento` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `dosagem` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `sala`
--

CREATE TABLE `sala` (
  `numero` varchar(50) NOT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  `estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `sala`
--

INSERT INTO `sala` (`numero`, `descricao`, `estado`) VALUES
('A1', '', 'Livre'),
('A2', '', 'Livre'),
('MINHA NOVA SALA', 'SALA BIG', 'Ocupado'),
('Sacrinor', 'Colegio pediatrico', 'Ocupado');

-- --------------------------------------------------------

--
-- Estrutura da tabela `utilizador`
--

CREATE TABLE `utilizador` (
  `codigo` int(11) NOT NULL,
  `nomeUtilizador` varchar(100) NOT NULL,
  `palavraPasse` varchar(50) NOT NULL,
  `nivel` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `utilizador`
--

INSERT INTO `utilizador` (`codigo`, `nomeUtilizador`, `palavraPasse`, `nivel`) VALUES
(4, 'admin', 'admin', 'superior');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `paciente` (`paciente`),
  ADD KEY `medico` (`medico`),
  ADD KEY `sala` (`sala`);

--
-- Índices para tabela `especialidade`
--
ALTER TABLE `especialidade`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `utilizador` (`utilizador`);

--
-- Índices para tabela `medicamento`
--
ALTER TABLE `medicamento`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `funcionario` (`funcionario`),
  ADD KEY `especialidade` (`especialidade`);

--
-- Índices para tabela `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`numeroDoc`);

--
-- Índices para tabela `preescricao`
--
ALTER TABLE `preescricao`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `consulta` (`consulta`),
  ADD KEY `medicamento` (`medicamento`);

--
-- Índices para tabela `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`numero`);

--
-- Índices para tabela `utilizador`
--
ALTER TABLE `utilizador`
  ADD PRIMARY KEY (`codigo`),
  ADD UNIQUE KEY `nomeUtilizador` (`nomeUtilizador`),
  ADD KEY `nomeUtilizador_2` (`nomeUtilizador`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `consulta`
--
ALTER TABLE `consulta`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `especialidade`
--
ALTER TABLE `especialidade`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `medicamento`
--
ALTER TABLE `medicamento`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `preescricao`
--
ALTER TABLE `preescricao`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `utilizador`
--
ALTER TABLE `utilizador`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `consulta_ibfk_1` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`numeroDoc`),
  ADD CONSTRAINT `consulta_ibfk_2` FOREIGN KEY (`medico`) REFERENCES `medico` (`numero`),
  ADD CONSTRAINT `consulta_ibfk_3` FOREIGN KEY (`sala`) REFERENCES `sala` (`numero`);

--
-- Limitadores para a tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`utilizador`) REFERENCES `utilizador` (`nomeUtilizador`);

--
-- Limitadores para a tabela `medico`
--
ALTER TABLE `medico`
  ADD CONSTRAINT `medico_ibfk_1` FOREIGN KEY (`funcionario`) REFERENCES `funcionario` (`codigo`),
  ADD CONSTRAINT `medico_ibfk_2` FOREIGN KEY (`especialidade`) REFERENCES `especialidade` (`codigo`);

--
-- Limitadores para a tabela `preescricao`
--
ALTER TABLE `preescricao`
  ADD CONSTRAINT `preescricao_ibfk_1` FOREIGN KEY (`consulta`) REFERENCES `consulta` (`codigo`),
  ADD CONSTRAINT `preescricao_ibfk_2` FOREIGN KEY (`medicamento`) REFERENCES `medicamento` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
