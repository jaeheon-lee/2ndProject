USE scott;
CREATE TABLE person(
    id varchar(20) primary key, 
    name varchar(30), 
    bankname varchar(30), 
    balance int(10));
    
CREATE TABLE place(
    id varchar(20) primary key, 
    name varchar(30), 
    bankname varchar(30), 
    balance int(10));
    
CREATE TABLE visits(
    id varchar(20) primary key, 
    name varchar(30), 
    bankname varchar(30), 
    balance int(10));
    
CREATE TABLE hospital(
    id varchar(20) primary key, 
    name varchar(30), 
    bankname varchar(30), 
    balance int(10));
    
CREATE TABLE infectee(
    id varchar(20) primary key, 
    name varchar(30), 
    bankname varchar(30), 
    balance int(10));