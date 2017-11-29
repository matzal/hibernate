CREATE TABLE CarExtended (
     owner varchar(50) NOT NULL,
     registration varchar(50) NOT NULL,
     model varchar(50) DEFAULT NULL,
     production_year DATETIME DEFAULT NULL,
     color enum('BLACK', 'RED', 'WHITE') DEFAULT NULL,
    PRIMARY KEY(owner, registration)
    );