CREATE DATABASE alpha;
use alpha;

CREATE TABLE usuario (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  login VARCHAR (200),
  senha VARCHAR (200)
);
