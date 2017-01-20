create table review(

num number primary key,
writer varchar(100),
subject  varchar(100),
email  varchar(100),
content varchar(3000),
passwd	varchar(100),
reg_date date default sysdate,
readcount number default 0,
ip varchar(100),
ref number,
re_step number,
re_level number,
item_number varchar(100)
);

desc review
select * from review
drop table review