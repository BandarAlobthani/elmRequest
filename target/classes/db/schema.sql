
--DROP TABLE users IF EXISTS;
--DROP TABLE authorities IF EXISTS;
--DROP TABLE user_authority

CREATE TABLE USER (
  ID         INTEGER PRIMARY KEY,
  USER_NAME VARCHAR(30),
  PASSWORD VARCHAR(255),
  FIRST_NAME VARCHAR(50),
  LAST_NAME VARCHAR(50),
  EMAIL  VARCHAR(50),
  ENABLED BOOLEAN,
  LAST_PASSWORD_RESET_DATE DATE
);

CREATE TABLE Role (
	ID INTEGER PRIMARY KEY,
	NAME VARCHAR(50)

);





