create database testdb;
USE testdb;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50),
    status VARCHAR(20)
);

INSERT INTO users (username, password, status) VALUES
('testuser', 'Test@123', 'active');
