

CREATE DATABASE DELIVERYDB;
CREATE TABLE USUARIO(ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT, FECHA TIMESTAMP, NOMBRE VARCHAR(30) NOT NULL, APELLIDO VARCHAR(30),
                      PASSWORD VARCHAR(50) NOT NULL, TARJETA VARCHAR(20) NOT NULL);
