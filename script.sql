CREATE DATABASE treina_recife;

CREATE TABLE tb_alunos ([
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    data_nascimento DATE NOT NULL
]);

INSERT INTO treina_recife.tb_alunos 
(id, nome, email, data_nascimento) 
VALUES
(1, 'João Silva', 'joao.silva@example.com', TIMESTAMP '2000-01-01');