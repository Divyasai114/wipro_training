CREATE DATABASE IF NOT EXISTS sampledb;
USE sampledb;
CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);
USE sampledb;
INSERT INTO users (username, email) VALUES ('Alice', 'alice@example.com');
USE sampledb;
SELECT * FROM Users;
SHOW DATABASES;
