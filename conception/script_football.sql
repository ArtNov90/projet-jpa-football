
DROP DATABASE IF EXISTS football;

CREATE DATABASE IF NOT EXISTS football;

USE football; 



CREATE TABLE team(
 country VARCHAR(50),
 PRIMARY KEY(country) );
 
 CREATE TABLE tournoi(
 nom_tournoi VARCHAR(50), 
 PRIMARY KEY(nom_tournoi) );

CREATE TABLE joueur(
   id_joueur INT AUTO_INCREMENT,
   prenom VARCHAR(50),
   nom VARCHAR(50),
   country VARCHAR(50) NOT NULL,
   PRIMARY KEY(id_joueur),
   FOREIGN KEY(country) REFERENCES team(country)
);

CREATE TABLE matchs(
   id_match INT AUTO_INCREMENT,
   date_match VARCHAR(50) NOT NULL,
   city VARCHAR(50),
   neutral BOOLEAN,
   home_score VARCHAR(50),
   away_score VARCHAR(50),
   country VARCHAR(50) NOT NULL,
   country_1 VARCHAR(50) NOT NULL,
   nom_tournoi VARCHAR(50) NOT NULL,
   PRIMARY KEY(id_match),
   FOREIGN KEY(country) REFERENCES team(country),
   FOREIGN KEY(country_1) REFERENCES team(country),
   FOREIGN KEY(nom_tournoi) REFERENCES tournoi(nom_tournoi)
);

CREATE TABLE tir_au_but(
   id_tir_au_but INT AUTO_INCREMENT,
   winner_country BOOLEAN,
   first_shooter VARCHAR(50),
   id_match INT NOT NULL,
   country VARCHAR(50) NOT NULL,
   PRIMARY KEY(id_tir_au_but),
   FOREIGN KEY(id_match) REFERENCES matchs(id_match),
   FOREIGN KEY(country) REFERENCES team(country)
);

CREATE TABLE buts(
   id_but INT AUTO_INCREMENT,
   minute_but_marque VARCHAR(50),
   is_penalty BOOLEAN,
   own_goal BOOLEAN,
   id_joueur INT NOT NULL,
   id_match INT NOT NULL,
   PRIMARY KEY(id_but),
   FOREIGN KEY(id_joueur) REFERENCES joueur(id_joueur),
   FOREIGN KEY(id_match) REFERENCES matchs(id_match)
);
