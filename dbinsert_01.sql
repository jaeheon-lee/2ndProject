select * from infectee;

delete from infectee;

INSERT INTO infectee(Person_ssn, in_hospital, Hospital_code) VALUES(111, curdate(), 101);