CREATE DATABASE IF NOT EXISTS library;
USE library;

CREATE TABLE books (
    id INT PRIMARY KEY,
    title VARCHAR(50),
    author VARCHAR(50)
);



SELECT * FROM books;

