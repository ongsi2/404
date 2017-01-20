create table shopping(

id varchar(100),
item_img varchar(100),
item_num number default 0,
item_name varchar(100),
item_type varchar(100),
item_amount	number default 0,
item_price number default 0,
status varchar(100),
zipcode varchar(100),
address varchar(100),
item_cancel	varchar(100),
item_delivery varchar(100),
point number default 0,
item_patment number default 0,
delivery_date date default sysdate,
ordernum varchar(100)
);

desc shopping
select * from shopping
drop table shopping