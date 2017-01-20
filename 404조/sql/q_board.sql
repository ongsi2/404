create table q_board(

    num number primary key,
    writer varchar(100),
    subject  varchar(100),
    email  varchar(100),
    content  varchar(100),
    passwd  varchar(100),
    reg_date date default sysdate,
    readcount number default 0,
    ip  varchar(100),
    ref number,
    re_step number,
    re_level number
);

desc q_board
select * from q_board
drop table q_board