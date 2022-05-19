USE mydb;

 DROP TABLE IF EXISTS empComp;

CREATE TABLE empComp(
UID int,
type ENUM ('Salary', 'Bonus', 'Commission', 'Allowance', 'Adjustment'),
amt INT,
description CHAR, /* 8000 char limit */
 Date date /* only day and month needed so when storing and displaying put arbitrary year */
);


/* search by UID to find employee compensation details if not exists add UID */

INSERT INTO empComp (type, amt) 
VALUES ('Salary', 51000);

INSERT INTO empComp (type, amt) 
VALUES ('salary', 61000);

INSERT INTO empComp (type, amt) 
VALUES ('SALARY', 100000);

/* need constraints for each type and if type is != to types given don't accept*/