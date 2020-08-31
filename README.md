# Spring-security-jpa-Mysql


====================================================================================

##URI##

-> Swagger : http://localhost:8086/swagger-ui.html#/

-> Home : http://localhost:8086/

-> User : http://localhost:8086/user

		Id : user
		
		Password : pass
		
		Info: Only for User Access
		
-> Admin : http://localhost:8086/admin

		Id : admin
		
		Password : pass
		
		Info: Only for Admin Access
		
		**Note : Admin can also access user
		

##Database Details##

Database : springsecurity

Table : user

Create Table :

CREATE TABLE `springsecurity`.`user` (
  `id` INT NOT NULL,
  `user_Name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `active` boolean  NULL,
  `roles` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

Values :

INSERT INTO `springsecurity`.`user` (`id`, `user_Name`, `password`, `active`, `roles`) VALUES ('1', 'user', 'pass', '1', 'ROLE_USER');

INSERT INTO `springsecurity`.`user` (`id`, `user_Name`, `password`, `active`, `roles`) VALUES ('2', 'admin', 'pass', '1', 'ROLE_ADMIN');



