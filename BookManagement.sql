CREATE DATABASE BOOK_MANAGEMENT_SYSTEM
GO

--- CREATE TABLE BOOK
CREATE TABLE Book(
	book_id int PRIMARY KEY,
	book_title varchar(255) NOT NULL,
	author varchar(255),
	brief varchar(255),
	publisher varchar(255),
	content ntext,
	category varchar(255)
)
--- Role chi giu 2 gia tri la : 1 - admin va 2 - user
CREATE TABLE Role(
	role_id int PRIMARY KEY,
	authority varchar(10)
)

USE BOOK_MANAGEMENT_SYSTEM
GO;

CREATE TABLE User(
	user_id INT IDENTITY(1,1) PRIMARY KEY,
	user_name varchar(20) NOT NULL,
	password varchar(20) NOT NULL,	
	role_id int FOREIGN KEY REFERENCES Role(role_id)
)


--- 
CREATE TABLE BookCase(
	book_case_id int IDENTITY(1,1) PRIMARY KEY,
	book_case_name varchar(255),
	user_id INT FOREIGN KEY REFERENCES User(user_id)
)



CREATE TABLE Contain(
	book_case_id int REFERENCES BookCase(book_case_id),
	book_id int REFERENCES Book(book_id)
	CONSTRAINT PK_CONTAIN PRIMARY KEY (book_case_id,book_id)
)
