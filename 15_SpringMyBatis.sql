create table product02(

p_no number(3) primary key,
p_name varchar2(20 char) not null,
p_img varchar2(200 char) not null,
p_price number(7) not null,
p_exp date not null
);

create sequence product02_seq;

insert into product02 values(product02_seq.nextval, '테스트', 'aa.jpg', 1000, sysdate);
insert into product02 values(product02_seq.nextval, '테스트', 'aaa.jpg', 1000, sysdate);

select * from PRODUCT02;