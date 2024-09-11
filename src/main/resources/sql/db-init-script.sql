CREATE TABLE tb_books (
id                  BIGINT AUTO_INCREMENT PRIMARY KEY,
title               VARCHAR(255) NOT NULL,
author              VARCHAR(255) NOT NULL,
publication_year    INT
);

INSERT INTO tb_books (title, author, publication_year) VALUES ('Effective Java', 'Joshua Bloch', 2018);
INSERT INTO tb_books (title, author, publication_year) VALUES ('Clean Code', 'Robert C. Martin', 2008);
INSERT INTO tb_books (title, author, publication_year) VALUES ('Java Concurrency in Practice', 'Brian Goetz', 2006);
INSERT INTO tb_books (title, author, publication_year) VALUES ('Head First Java', 'Kathy Sierra', 2005);
INSERT INTO tb_books (title, author, publication_year) VALUES ('Spring in Action', 'Craig Walls', 2016);