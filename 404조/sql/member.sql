create table member(

name varchar(100),
id  varchar(100),
pw  varchar(100),
mail varchar(100),
mailaddress	varchar(100),
zipcode	varchar(100),
address	varchar(100),
address2 varchar(100),
mobile varchar(100),
phone varchar(100),
phone2 varchar(100),
phone3 varchar(100),
point number default 0,
grade varchar(100),
reg_date date default sysdate
);

desc member
select * from member
drop table member