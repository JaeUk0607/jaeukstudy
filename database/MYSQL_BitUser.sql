select* from dmlemp;
rollback;

--------------------------------------------------------------------------------
create table trans_A(
num number,
name varchar2(20)
);

create table trans_B(
num number constraint pk_trans_B_num primary key,
name varchar2(20)

);

SELECT * FROM trans_A;

SELECT * FROM dept;

