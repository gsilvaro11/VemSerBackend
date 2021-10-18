

CREATE TABLE VEM_SER.Estudante(
	id NUMBER NOT NULL,
	nome varchar2(200) NOT NULL,
	data_nascimento DATE NOT NULL,
	nr_matricula NUMBER(10) UNIQUE NOT NULL,
	ativo char(1)
)

CREATE SEQUENCE seq_estudante
	START WITH 1
	INCREMENT BY 1
	NOCACHE
	NOCYCLE;


INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Guilherme Silva', TO_DATE('24-08-1999', 'dd-mm-yyyy'), 
	101, 'S')
INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Laura Guidugli', TO_DATE('03-10-2000', 'dd-mm-yyyy'), 
	102, 'S')
INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Bruna Silva', TO_DATE('03-10-2007', 'dd-mm-yyyy'), 
	103, 'N')
INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Bruno Augusto', TO_DATE('14-03-1978', 'dd-mm-yyyy'), 
	104, 'S')
INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Barbara Barbierig', TO_DATE('10-05-1998', 'dd-mm-yyyy'), 
	105, 'N')
INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Jorge Silva', TO_DATE('05-04-1959', 'dd-mm-yyyy'), 
	106, 'S')
INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Maria Eduarda', TO_DATE('17-07-2003', 'dd-mm-yyyy'), 
	107, 'N')
INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Maicon Silva', TO_DATE('30-01-1978', 'dd-mm-yyyy'), 
	108, 'S')
INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Alisson Manica', TO_DATE('02-02-2000', 'dd-mm-yyyy'), 
	109, 'S')
INSERT INTO VEM_SER.Estudante VALUES(seq_estudante.nextval, 'Matheus Roberto', TO_DATE('25-12-1950', 'dd-mm-yyyy'), 
	110, 'N')

SELECT * FROM VEM_SER.ESTUDANTE ORDER BY nome;
