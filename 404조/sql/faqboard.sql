create table faqboard(

    num number primary key,
    writer varchar(100),
    subject  varchar(100),
    email  varchar(100),
    content  varchar(3000),
    passwd  varchar(100) not null,
    reg_date date default sysdate,
    readcount number default 0,
    ip  varchar(100),
    ref number,
    re_step number,
    re_level number
);

desc faqboard
select * from faqboard
drop table faqboard
create sequence faqboard_seq nocache;
drop sequence faqboard_seq