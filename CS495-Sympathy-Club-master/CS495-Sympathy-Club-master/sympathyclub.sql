DROP DATABASE IF EXISTS club_memebers;

CREATE DATABASE club_memebers;

USE club_memebers;

CREATE TABLE Club_Members
(
   MemberID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   FirstName varchar(30) NOT NULL,
   LastName varchar(30) NOT NULL,
   Address varchar(50) NOT NULL,
   Balance int NOT NULL,
   LinkedAccounts FOREIGN Key
    
)                 ;
