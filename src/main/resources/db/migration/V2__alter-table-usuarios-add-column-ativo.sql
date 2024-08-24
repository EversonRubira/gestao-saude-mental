ALTER TABLE usuarios ADD COLUMN ativo TINYINT;
UPDATE usuarios SET ativo = 1;

