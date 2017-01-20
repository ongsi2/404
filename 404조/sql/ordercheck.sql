create table ordercheck(
    order_num varchar(100),
    name varchar(100),
    phone varchar(100),
    zipcode  varchar(100),
    address  varchar(100),
    s_name  varchar(100),
    s_zipcode  varchar(100),
    s_address date default sysdate,
    add_phone number default 0,
    memo1  varchar(100),
    memo2 varchar(100),
    item_info varchar(200),
    price number default 0,
    money number default 0,
    select_bank varchar(100),
    reg_date date default sysdate
);

desc ordercheck
select * from ordercheck
drop table ordercheck