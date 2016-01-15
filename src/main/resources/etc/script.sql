CREATE DATABASE alpha;
use alpha;

CREATE TABLE usuario (
  id SERIAL PRIMARY KEY,
  login VARCHAR (200),
  senha VARCHAR (200)
);
