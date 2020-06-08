CREATE TABLE category (
	idCategorie INT AUTO_INCREMENT,
	nomCategorie VARCHAR(50),
	desigCat VARCHAR(255),
	image_url VARCHAR(50),
	active BOOLEAN,
	CONSTRAINT pk_category_id PRIMARY KEY (idCategorie ) 

);

INSERT INTO category(nomCategorie,desigCat ,image_url,active) VALUES ('solons du cheval','categrie du salon du cheval ' , 'cat_05.png',true);
INSERT INTO category(nomCategorie,desigCat ,image_url,active) VALUES ('formations','categrie formations ' , 'cat_05.png',true);
INSERT INTO category(nomCategorie,desigCat ,image_url,active) VALUES ('visite','categrie visite ' , 'cat_05.png',true);

CREATE TABLE user_detail (
	idUser INT AUTO_INCREMENT,
	nom VARCHAR(50),
	prenom VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(60),
	email VARCHAR(100),
	contact_number VARCHAR(15),	
	CONSTRAINT pk_user_id PRIMARY KEY(idUser)
);
INSERT INTO user_detail 
(nom, prenom, role, enabled, password, email, contact_number) 
VALUES ('bounzaha', 'soukaina', 'ADMIN', true, 'soukaina', 'bs@gmail.com', '8888888888');
INSERT INTO user_detail 
(nom, prenom, role, enabled, password, email, contact_number) 
VALUES ('houari', 'abdou', 'testeur', true, '123', 'ha@gmail.com', '9999999999');
INSERT INTO user_detail 
(nom, prenom, role, enabled, password, email, contact_number) 
VALUES ('houari', 'nadine', 'testeur', true, '1234', 'hn@gmail.com', '7777777777');
INSERT INTO user_detail 
(nom, prenom, role, enabled, password, email, contact_number) 
VALUES ('souka', 'souka', 'USER', true, 'souka', 'ss@gmail.com', '7777777777');



CREATE TABLE evenement (
	idEvenement INT AUTO_INCREMENT,
	desigEven VARCHAR(50),
	refeEven VARCHAR(50),
	dateEven DATETIME,
	is_active BOOLEAN,
	category_id INT,
	CONSTRAINT pk_evenement_id PRIMARY KEY (idEvenement),
 	CONSTRAINT fk_evenement_category_id FOREIGN KEY (category_id) REFERENCES category (idCategorie)

);	



INSERT INTO evenement (desigEven,refeEven,dateEven,is_active,category_id)
VALUES ('mama','125h','2005-04-8 2:00:00.000', true, 1);

INSERT INTO evenement (desigEven,refeEven,dateEven,is_active,category_id)
VALUES ('baba','125h','2006-04-8 5:00:00.000', true, 3);

INSERT INTO evenement (desigEven,refeEven,dateEven,is_active,category_id)
VALUES ('dodo','125h','2006-04-9 00:00:00.000', true, 2);