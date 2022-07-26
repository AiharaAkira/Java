create table cal(
	c_no number(5) primary key,
	c_income_type varchar2(500char),
	c_income_ammount number(37) ,
	c_income_memo varchar2(500char),
	c_expense_type varchar2(500char),
	c_expense_ammount number(37),
	c_expense_memo varchar2(500char)
);

create sequence cal_seq;

insert into cal values(cal_seq.nextval, '수입타입', 0, '수입메모','지출타입',0,'지출메모');

select * from cal;

