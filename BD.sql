CREATE DATABASE MY_APP;
USE MY_APP;
CREATE TABLE user_tbl (
  user_id INT primary KEY NOT NULL,
  user_firstname VARCHAR(40) NOT NULL,
  user_lastname VARCHAR(40) NOT NULL,
  user_emaill VARCHAR(60) NOT NULL,
  user_password VARBINARY(256) NOT NULL
);


select * from user_tbl;

INSERT INTO MY_APP.user_tbl (user_id, user_firstname, user_lastname, user_email, user_password) 
VALUES (UPPER(1), UPPER('Andres'), UPPER('Sarmiento'), 'sarmientokrlos@gmail.com',
AES_ENCRYPT('a&m1305mjh', 
'$2a$12$NI5AboyH/AhXsH8tzHqsvOzNDvaMo6hPgoCIjWww/hqWDtkpPSABS'));

SELECT *, 
 CAST(AES_DECRYPT(user_password, 
'$2a$12$NI5AboyH/AhXsH8tzHqsvOzNDvaMo6hPgoCIjWww/hqWDtkpPSABS') AS CHAR(50)) 
end_data FROM user_tbl WHERE user_id = 1;

drop table user_tbl;