CREATE TABLE usuarios (

    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    data_nascimento DATE NOT NULL,
    estado_emocional VARCHAR(50) NOT NULL,
    atividade_realizada VARCHAR(255),
    observacoes_gerais TEXT,

    PRIMARY KEY(id)

);
