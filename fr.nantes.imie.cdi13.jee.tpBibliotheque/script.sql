------------------------------------------------------------
--        Script Postgre 
------------------------------------------------------------



------------------------------------------------------------
-- Table: bibliotheque
------------------------------------------------------------
CREATE TABLE public2.bibliotheque(
	id SERIAL NOT NULL ,
	CONSTRAINT prk_constraint_bibliotheque PRIMARY KEY (id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Livre
------------------------------------------------------------
CREATE TABLE public2.livre(
	id             SERIAL NOT NULL ,
	titre          VARCHAR (25)  ,
	id_bibliotheque INT   ,
	id_auteur      INT   ,
	CONSTRAINT prk_constraint_livre PRIMARY KEY (id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Auteur
------------------------------------------------------------
CREATE TABLE public2.auteur(
	id     SERIAL NOT NULL ,
	nom    VARCHAR (25)  ,
	prenom VARCHAR (25)  ,
	CONSTRAINT prk_constraint_auteur PRIMARY KEY (id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Administrateur
------------------------------------------------------------
CREATE TABLE public2.administrateur(
	id             SERIAL NOT NULL ,
	login          VARCHAR (25)  ,
	password       VARCHAR (25)  ,
	id_bibliotheque INT   ,
	CONSTRAINT prk_constraint_administrateur PRIMARY KEY (id)
)WITHOUT OIDS;

ALTER TABLE public2.livre ADD CONSTRAINT FK_Livre_id_bibliotheque FOREIGN KEY (id_bibliotheque) REFERENCES public2.bibliotheque(id);
ALTER TABLE public2.livre ADD CONSTRAINT FK_Livre_id_auteur FOREIGN KEY (id_Auteur) REFERENCES public2.auteur(id);
ALTER TABLE public2.administrateur ADD CONSTRAINT FK_administrateur_id_bibliotheque FOREIGN KEY (id_bibliotheque) REFERENCES public2.bibliotheque(id);

INSERT INTO public2.bibliotheque (id) VALUES (1);

INSERT INTO public2.administrateur (id, login, password, id_bibliotheque) VALUES (1, 'babar', 'a', 1);
INSERT INTO public2.administrateur (id, login, password, id_bibliotheque) VALUES (2, 'pif', 'a', 1);
INSERT INTO public2.administrateur (id, login, password, id_bibliotheque) VALUES (3, 'hercule', 'a', 1);

INSERT INTO public2.auteur (id, nom, prenom) VALUES (1, 'Urasawa', 'Naoki');
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (1, '20th Century Boys', 1, 1);
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (2, '21st Century Boys', 1, 1);
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (3, 'Billy Bat', 1, 1);
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (4, 'Monster', 1, 1);

INSERT INTO public2.auteur (id, nom, prenom) VALUES (2, 'Herbert', 'Frank');
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (5, 'Dune', 1, 2);
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (6, 'Les enfants de Dune', 1, 2);

INSERT INTO public2.auteur (id, nom, prenom) VALUES (3, 'Moliere', 'Frank');
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (7, 'L avare', 1, 3);
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (8, 'Le malade imaginaire', 1, 3);

INSERT INTO public2.auteur (id, nom, prenom) VALUES (4, 'Shakespeare', 'William');
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (9, 'Hamlet', 1, 4);
INSERT INTO public2.livre (id, titre, id_bibliotheque, id_auteur) VALUES (10, 'MacBeth', 1, 4);
