CREATE TABLE customer(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	email VARCHAR(50) NOT NULL,
	cellphone VARCHAR(50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO customer (name, email, cellphone) VALUES ('Maria', 'maria@gmail.com', '169998-8877');


