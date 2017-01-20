create table item(
	item_num number primary key,
	item_name varchar2(100),
	item_price number default 0,
	item_img varchar2(100),
	item_upload varchar2(100),
	item_type varchar2(100),
	item_stock number default 0
);

desc item
select * from item
create sequence item_seq nocache;
drop table item

