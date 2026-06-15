CREATE DATABASE NGO_Tracker;
USE NGO_Tracker;
CREATE TABLE donor (
id INT primary key AUTO_INCREMENT,
name varchar(50),
amount Double,
Category varchar(30)
);
use  NGO_Tracker;
select  * from donor;
