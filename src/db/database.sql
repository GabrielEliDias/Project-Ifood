/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Hugo
 * Created: 9 de dez. de 2024
 */

create database cadastro
default character set utf8mb4
default collate utf8mb4_general_ci;

use cadastro;

create table usuarios (
	id int not null auto_increment primary key,
    email varchar(50) not null unique,
    senha varchar(100) not null
) character set = utf8mb4;

create table clientes (
	id int not null auto_increment primary key,
    usuario_id int not null,
    nome varchar(50) not null,
    cpf char(11) not null unique,
    sexo enum('Masculino', 'Feminino', 'Não falar', 'Outro') not null,
    cep varchar(8) not null,
    endereço varchar(100) not null,
    complemento varchar(100),
    telefone varchar(11) not null unique,
    data_nascimento date not null,
    foreign key (usuario_id) references usuarios(id)
) character set = utf8mb4;

create table restaurantes (
	id int not null auto_increment primary key,
    nome varchar(50) not null,
    cnpj varchar(14) not null unique,
    cep varchar(8) not null,
    endereço varchar(100) not null,
    complemento varchar(100),
    telefone varchar(11) not null unique
) character set = utf8mb4;

create table produtos (
	id int not null auto_increment primary key,
    nome varchar(50) not null,
    descrição varchar(100) not null,
    preço decimal(5,2) not null,
    tempo_de_preparo tinyint not null
) character set = utf8mb4;

create table comidas (
	id int not null auto_increment primary key,
    produto_id int not null,
    tipo_de_cozinha varchar(20) not null,
    vegetariano bit not null,
    vegano bit not null,
    foreign key (produto_id) references produtos(id)
) character set = utf8mb4;

create table bebidas (
	id int not null auto_increment primary key,
    produto_id int not null,
    tamanho_ml smallint not null,
    alcoólica bit not null,
    foreign key (produto_id) references produtos(id)
) character set = utf8mb4;

create table restaurante_produto (
	restaurante_id int not null,
    produto_id int not null,
    primary key (restaurante_id, produto_id),
    foreign key (restaurante_id) references restaurantes(id) on delete cascade,
    foreign key (produto_id) references produtos(id) on delete cascade
) character set = utf8mb4;

create table donosderestaurante (
	id int not null auto_increment primary key,
    usuario_id int not null,
    restaurante_id int not null,
    foreign key (usuario_id) references usuarios(id),
    foreign key (restaurante_id) references restaurantes(id)
) character set = utf8mb4;

# rename table clientes to usuarios;

# drop table clientes;