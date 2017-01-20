create table salespage(

ordernum varchar(100),
name varchar(100),
money number default 0,
reg_date date default sysdate
);

desc salespage
select * from salespage
drop table salespage