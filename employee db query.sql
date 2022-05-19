CREATE SCHEMA `mydb` ;

USE mydb;

DROP TABLE IF EXISTS employees; 


CREATE TABLE employees(
UID INT NOT NULL,
fname VARCHAR(50) NOT NULL,
mname VARCHAR(50),
lname VARCHAR(50) NOT NULL,
dob DATE NOT NULL,
position VARCHAR(100) NOT NULL,
UNIQUE (fname, mname, lname, dob),
 date_created datetime NOT NULL DEFAULT CURRENT_TIMESTAMP /* used to check if dob <= cur date */
);

/*constraint that dob cannot be greater than current time*/
 ALTER TABLE employees ADD CONSTRAINT 
 chk_date CHECK (dob <= date_created);

DELIMITER $$

CREATE TRIGGER UIDgen BEFORE INSERT ON employees
FOR EACH ROW BEGIN
	SET NEW.UID = (
		SELECT IFNULL(MAX(UID), 0)+1
        FROM employees
	);
END $$

DELIMITER ;

       
        
      

/*test queries*/
select * from employees;

INSERT INTO employees (fname, mname, lname, dob, position) 
VALUES ("Tiffany", "Marie", "Cross", '2022-05-13', "Associate Application Developer");

INSERT INTO employees (fname, mname, lname, dob, position) 
VALUES ("Tiffany", "Marie", "Cross", '2022-05-12', "Associate Application Developers");

INSERT INTO employees (fname, mname, lname, dob, position)
VALUES ("", "", "Cross", '1992-06-04', "Associate Application Developer");

INSERT INTO employees (uid, fname, lname, dob, position)
VALUES (7, "Tiffany", "Cross", '1992-06-05', "Associate Application Developer");


INSERT INTO employees (fname, lname, dob, position)
VALUES ( "Ryan", "Cross", '1992-06-04', "Associate Application Developer");

SELECT * FROM employees;
DROP TABLE employees;

truncate table employees;




