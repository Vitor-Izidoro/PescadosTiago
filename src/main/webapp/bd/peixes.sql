CREATE DATABASE IF NOT EXISTS peixaria;

-- Conecta-se ao banco de dados peixaria
USE peixaria;

-- Cria a tabela peixe com os campos nome e tamanho
CREATE TABLE IF NOT EXISTS peixe (
                                     id INT AUTO_INCREMENT PRIMARY KEY,
                                     nome VARCHAR(255) NOT NULL,
    tamanho VARCHAR(255) NOT NULL
    );

INSERT INTO peixe (nome, tamanho) VALUES
                                      ('Piranha', 15.3),
                                      ('Tucunaré', 30.7),
                                      ('Dourado', 50.2),
                                      ('Pescada', 40.5);