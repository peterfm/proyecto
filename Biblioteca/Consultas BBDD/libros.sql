DROP TABLE libro;
CREATE TABLE libro
(
	id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	isbn VARCHAR(13) NOT NULL,
	titulo varchar(100) NOT NULL
);

INSERT INTO libro ( isbn, titulo) VALUES ('1','e');
INSERT INTO libro ( isbn, titulo) VALUES ('2','f');
INSERT INTO libro ( isbn, titulo) VALUES ('5','c');
INSERT INTO libro ( isbn, titulo) VALUES ('4','d');
INSERT INTO libro ( isbn, titulo) VALUES ('3','b');
INSERT INTO libro ( isbn, titulo) VALUES ('9','t');
INSERT INTO libro ( isbn, titulo) VALUES ('8','k');
INSERT INTO libro ( isbn, titulo) VALUES ('7','j');
INSERT INTO libro ( isbn, titulo) VALUES ('6','x');
