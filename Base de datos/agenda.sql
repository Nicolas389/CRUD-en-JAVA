CREATE DATABASE Agenda;

USE Agenda;

CREATE TABLE agenda(
Id int primary key auto_increment,
Nombre varchar(20),
Apellido varchar(20));

insert into agenda (id,Nombre,Apellido) values (1,"Nicolas","Gonzalez");


select * from agenda;