-- ----------------------------------------------------------------------------
-- MySQL Workbench Migration
-- Migrated Schemata: sigcopein_production
-- Source Schemata: sigcopein_production
-- Created: Thu Jul 10 10:53:01 2014
-- ----------------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;;

-- ----------------------------------------------------------------------------
-- Schema sigcopein_production
-- ----------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `sigcopein_production` ;
CREATE SCHEMA IF NOT EXISTS `sigcopein_production` ;

-- ----------------------------------------------------------------------------
-- Table sigcopein_production.aluno
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sigcopein_production`.`aluno` (
  `aluno_id` INT(11) NOT NULL AUTO_INCREMENT,
  `habilitado` TINYINT(1) NOT NULL DEFAULT '1',
  `matricula` VARCHAR(25) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `email` VARCHAR(80) NOT NULL,
  `lattes` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`aluno_id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC),
  UNIQUE INDEX `lattes_UNIQUE` (`lattes` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 96
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table sigcopein_production.aluno_projeto
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sigcopein_production`.`aluno_projeto` (
  `aluno_projeto_id` INT(11) NOT NULL AUTO_INCREMENT,
  `bolsista` TINYINT(1) NOT NULL,
  `data_inicio` DATE NOT NULL,
  `data_fim` DATE NULL DEFAULT NULL,
  `projeto_id` INT(11) NOT NULL,
  `aluno_id` INT(11) NOT NULL,
  `carga_horaria` INT(11) NOT NULL,
  `habilitado` TINYINT(1) NULL DEFAULT NULL,
  `anexo` LONGBLOB NOT NULL,
  `nome_anexo` VARCHAR(255) NOT NULL,
  `agencia` VARCHAR(45) NULL DEFAULT NULL,
  `conta` VARCHAR(45) NULL DEFAULT NULL,
  `banco_id` INT(11) NOT NULL,
  PRIMARY KEY (`aluno_projeto_id`),
  INDEX `aluno_aluno_projeto_fk` (`aluno_id` ASC),
  INDEX `projeto_aluno_projeto_fk` (`projeto_id` ASC),
  INDEX `fk_aluno_projeto_banco1_idx` (`banco_id` ASC),
  CONSTRAINT `aluno_aluno_projeto_fk`
    FOREIGN KEY (`aluno_id`)
    REFERENCES `sigcopein_production`.`aluno` (`aluno_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_aluno_projeto_banco1`
    FOREIGN KEY (`banco_id`)
    REFERENCES `sigcopein_production`.`banco` (`banco_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `projeto_aluno_projeto_fk`
    FOREIGN KEY (`projeto_id`)
    REFERENCES `sigcopein_production`.`projeto` (`projeto_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table sigcopein_production.banco
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sigcopein_production`.`banco` (
  `banco_id` INT(11) NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(3) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`banco_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table sigcopein_production.projeto
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sigcopein_production`.`projeto` (
  `projeto_id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `data_inicio` DATE NOT NULL,
  `data_fim` DATE NOT NULL,
  `projeto` LONGBLOB NOT NULL,
  `habilitado` TINYINT(1) NOT NULL,
  `nome_anexo` VARCHAR(255) NOT NULL,
  `selecionado` TINYINT(1) NULL DEFAULT NULL,
  `edital_id` INT(11) NOT NULL,
  PRIMARY KEY (`projeto_id`),
  INDEX `fk_projeto_Edital1_idx` (`edital_id` ASC),
  CONSTRAINT `fk_projeto_Edital1`
    FOREIGN KEY (`edital_id`)
    REFERENCES `sigcopein_production`.`edital` (`edital_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table sigcopein_production.edital
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sigcopein_production`.`edital` (
  `edital_id` INT(11) NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `habilitado` TINYINT(1) NOT NULL,
  PRIMARY KEY (`edital_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table sigcopein_production.memorando
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sigcopein_production`.`memorando` (
  `memorando_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ano` INT(11) NOT NULL,
  `data` DATE NOT NULL,
  `sequencia` INT(11) NOT NULL,
  `assunto` VARCHAR(255) NOT NULL,
  `texto` TEXT NOT NULL,
  `projeto_id` INT(11) NOT NULL,
  `pagamento` TINYINT(1) NOT NULL,
  `mes_pagamento` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`memorando_id`),
  INDEX `fk_memorando_projeto1_idx` (`projeto_id` ASC),
  CONSTRAINT `fk_memorando_projeto1`
    FOREIGN KEY (`projeto_id`)
    REFERENCES `sigcopein_production`.`projeto` (`projeto_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table sigcopein_production.servidor
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sigcopein_production`.`servidor` (
  `siape` VARCHAR(7) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `habilitado` TINYINT(1) NOT NULL DEFAULT '1',
  `servidor_id` INT(11) NOT NULL AUTO_INCREMENT,
  `cpf` VARCHAR(14) NOT NULL,
  `lattes` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`servidor_id`),
  UNIQUE INDEX `siape_UNIQUE` (`siape` ASC),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table sigcopein_production.servidor_projeto
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sigcopein_production`.`servidor_projeto` (
  `aluno_projeto_id` INT(11) NOT NULL AUTO_INCREMENT,
  `bolsista` TINYINT(1) NOT NULL,
  `data_inicio` DATE NOT NULL,
  `data_fim` DATE NULL DEFAULT NULL,
  `projeto_id` INT(11) NOT NULL,
  `carga_horaria` INT(11) NOT NULL,
  `habilitado` TINYINT(1) NULL DEFAULT NULL,
  `anexo` LONGBLOB NOT NULL,
  `nome_anexo` VARCHAR(255) NOT NULL,
  `agencia` VARCHAR(45) NULL DEFAULT NULL,
  `conta` VARCHAR(45) NULL DEFAULT NULL,
  `banco_id` INT(11) NOT NULL,
  `servidor_id` INT(11) NOT NULL,
  PRIMARY KEY (`aluno_projeto_id`),
  INDEX `projeto_aluno_projeto_fk` (`projeto_id` ASC),
  INDEX `fk_aluno_projeto_banco1_idx` (`banco_id` ASC),
  INDEX `fk_servidor_projeto_servidor1_idx` (`servidor_id` ASC),
  CONSTRAINT `fk_aluno_projeto_banco10`
    FOREIGN KEY (`banco_id`)
    REFERENCES `sigcopein_production`.`banco` (`banco_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_servidor_projeto_servidor1`
    FOREIGN KEY (`servidor_id`)
    REFERENCES `sigcopein_production`.`servidor` (`servidor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `projeto_aluno_projeto_fk0`
    FOREIGN KEY (`projeto_id`)
    REFERENCES `sigcopein_production`.`projeto` (`projeto_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table sigcopein_production.setor
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `sigcopein_production`.`setor` (
  `setor_id` INT(11) NOT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `servidor_id` INT(11) NOT NULL,
  PRIMARY KEY (`setor_id`),
  INDEX `fk_setor_servidor1_idx` (`servidor_id` ASC),
  CONSTRAINT `fk_setor_servidor1`
    FOREIGN KEY (`servidor_id`)
    REFERENCES `sigcopein_production`.`servidor` (`servidor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
SET FOREIGN_KEY_CHECKS = 1;;
