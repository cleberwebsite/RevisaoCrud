create database produtos;

use produtos;	

create table User(
    id int(11)unsigned not null auto_increment,
    produto varchar(80) unique not null,
	categoria varchar(45) not null,
    primary key(id)
);	