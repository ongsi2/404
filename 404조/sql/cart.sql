create table cart(

    num number primary key,
    type varchar(100),
    id varchar(100),
    item_img varchar(100),
    item_number varchar(100),
    item_name varchar(100),
    item_type varchar(100),
    item_size varchar(100),
    item_amount number default 0,
    item_price number default 0,
    cz_date date default sysdate
);

desc cart
select * from cart
drop table cart