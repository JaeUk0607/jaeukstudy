/*
18.02.26
[1���� ����]
1.����Ŭ ����Ʈ���� �ٿ�ε�
>>http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html

2.11g express ���� (�������) ��ġ

3.��ġ(������ ���� : SYSTEM, SYS���� : ��ȣ���� >> 1004

4.sqlplus �⺻ ���α׷� ����Ȯ��

5.SqlDeveloper �������� ��ġ
>>������ > ���, ������, sqlgate

6.TOol�� ���ؼ� Oracle ����
  >>HR ���� ��ȣ 1004>>unlock
  >>BITUSER,1004>>���� ����
  
  -- USER SQL
CREATE USER kosta IDENTIFIED BY 1004 
DEFAULT TABLESPACE "USERS"
TEMPORARY TABLESPACE "TEMP";

-- QUOTAS
ALTER USER kosta QUOTA UNLIMITED ON USERS;

-- ROLES
GRANT "CONNECT" TO bituser ;
GRANT "RESOURCE" TO bituser ;

////////////////////////////////////////////////////////////////////////////////
CREATE TABLE EMP
(EMPNO number not null,
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
MGR number ,
HIREDATE date,
SAL number ,
COMM number ,
DEPTNO number );
--alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';

INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,200,30);
INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,'1981-04-02',2975,30,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,300,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,'1981-04-01',2850,null,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,'1981-06-01',2450,null,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,'1982-10-09',3000,null,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',null,'1981-11-17',5000,3500,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,'1983-01-12',1100,null,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,'1981-10-03',950,null,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,'1981-10-3',3000,null,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);

COMMIT;

CREATE TABLE DEPT
(DEPTNO number,
DNAME VARCHAR2(14),
LOC VARCHAR2(13) );

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

COMMIT;



CREATE TABLE SALGRADE
( GRADE number,
LOSAL number,
HISAL number );

INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);
COMMIT;


*/
/*
SELECT [DISTINCT]  {*, column [alias], . . .}   
FROM  table_name   [WHERE  condition]   
[ORDER BY {column, expression} [ASC | DESC]];
*/
--1.������̺��� ��� ������ ����ϼ���
select * from EMP;
SELECT * FROM EMP; --�������� ��ҹ��� �������� �ʾƿ�

--2.Ư�� �÷� ������ �����ϱ�
select empno , ename, job, sal from emp;
select empno from emp;
select hiredate, sal, comm from emp;

--3 �÷��� ����Ī(alias) �ο��ϱ�
SELECT empno "��   ��", ename "��    ��" 
from emp;

--����(ansi ����) >> ����
SELECT empno as"��   ��", ename as "��   ��" 
from emp;

--Oracle : ���ڿ� (���� ������ �����ϰ� ��ҹ��� ����)
--�ҹ��� : a, �빮�� A �ٸ� ���� 

select * from emp where ename = 'king';--�ȵ�
select * from emp where ename = 'KING';
select * from emp where ename = 'King'; --�ȵ�

--Oracle : ������ (���� ������)>>|| >> 'hello' || 'world' >> 'hello world"
--Java : + ������ (����+���� ����)
--Java : + ������ (����+���� ����)
--TIP) ms-sql : + ����, ����

select '����̸���' ||ename||'�Դϴ�'as "ename"
from emp;

select '����̸���' ||sal||'�Դϴ�'as "ename"
from emp;

--���̺��� ������ �÷��� �⺻ Ÿ��
SELECT emp + ename from emp;

--1POINT ���̺����� Į���� �⺻Ÿ��
--�÷��� ����Ÿ���ϱ�, �����ϱ�
desc emp; --���� �⺻����

select emp || ename as "����" --������ �ڵ� ����ȯ (����-->����) to_char()
from emp;

SELECT empno, ename as "����" --���� ���� �۾� Error> "invalid number"
from emp;

--����� �츮 ȸ�翡 ������ ��� �ֳ�
--�ߺ� ������ ���� : Ű���� (distict)
select DISTINCT job from emp;

select DISTINCT DEPTNO from emp;

--distinct �� ���� (�÷��� 1�� �̻�)...grouping
select distinct job, deptno from emp order by job;
select distinct deptno, job from emp order by deptno;
--------------------------------------------------------------------------------
--����Ŭ ���(SQL)
--Java�� ���� ���� (������)
--Java���� ���� (%������) >> ����Ŭ % �˻� �������� ��� >> ������ �Լ� ������ Mod() �Լ�
--���(+,-,*,/.....)Mod() �Լ�
--������̺��� ����� �޿��� 100�޷� �λ��� ����� ����ϼ���
--1. �÷��� Ÿ�� (Type)>>nomber
desc emp;
select empno, ename , sal, sal+ 100 as "�λ�޿�"
from emp;

--^^
select 100 + 100 from dual; -- ������ TEST �ӽ� dual
select 100 || 100 from dual; -- ���� ���ڷ� �ڵ� ����ȯ (����)
select '100' + 100 from dual; -- ���� ���� ����ȯ
select 'A100' + 100 from dual; --Error

--�񱳿�����
-- >,<,<=...
--Java ����(==), �Ҵ�(=)
--Oracle (=)����, (!=)���� �ʴ�

--�� ������
--AND, OR, NOT

--������ (���ϴ� row ������ ���ڴ�)
select * 
from emp 
where sal>=3000;

select empno,sal 
from emp 
where sal>=3000;

--�̻�, ���� (=����)
--�ʰ�, �̸�

--����� 7788���� ����� ���, �̸�, ����, �Ի����� ����ϼ���

select empno, ename, job, hiredate
from emp
where empno=7788;

--����� �̸��� king�� ����� ���, �̸�, �޿� ����ϼ���

select empno, ename, sal from emp where ename = 'KING';--��ҹ��� �����ϰ� ����(varchar2(20)...)

--�޿��� 2000�޷� �̻��̸鼭 ������ manager �λ���� ��� ������ ����ϼ���
SELECT * FROM emp where sal>=2000 and job = 'MANAGER';

--�޿��� 2000�޷� �̻��̰ų� ������ manager �λ��� �ӵ� ������ ����ϼ���
SELECT * FROM emp where sal>=2000 or job = 'MANAGER';

--Ʃ�� �⺻(�������)
--select    3  
--from      1  
--where     2
--------------------------------------------------------------------------------
--����Ŭ ��¥
--������ ��¥
--�ý��� (������Ʈ) ���� : ��¥ >> sysdate
--�Խ��� : insert into board(writer, title, content, regdate)
--        values('ȫ�浿','�氡�氡','�ǰ��ؿ�',sysdate)
--TIP)ms-sql>>select getdate()...
SELECT Sysdate from dual;


select hiredate from emp;
desc emp; 

--����Ŭ �ý��� ������ ��� ���̺�
SELECT * from SYS.NLS_SESSION_PARAMETERS; --ȯ������

--NLS_DATE_FORMAT >> RR/MM/DD
--NLS_DATE_LANGUAGE >> KOREAN
--NLS_TIME_FORMAT >> HH24:MI:SSXFF
SELECT * from SYS_NLS_SESSION_PARAMETRS where parameters='NLS_DATE_FORMAT';
--���� ������ �����(session)�������� ����
--���� ������ �����ϰ� �ٽ� �����ϸ� >> NLS_DATE_FORMAT >> RR/MM/DD ����
--�ٸ� ������ bituser�� �ٸ� ����ڰ� �����ϸ� >>NLS_DATE_FORMAT ->RR/MM/DD
alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';

--NLS_DATE_FORMAT >> YYYY-MM-DD HH24:MI:SS

SELECT sysdate from dual;
select hiredate from emp;

--����Ŭ ��¥ ǥ�� :'��¥'
SELECT * from emp
where hiredate = '1980-12-17'; --��¥ ���� ����

SELECT * from emp
where HIREDATE = '1980/12/17'; --��¥ ���� ����

SELECT * from emp
where HIREDATE = '80/12/17'; --���� �ȵǿ� : YYYY
--RR-MM-DD

--����� �޿��� 2000�̻��̰� 4000�޶� ������ ��� ����� ���� ���
SELECT * FROM emp
where sal>=2000 and sal<=4000;

--������ :�÷��� between A and B
SELECT * FROM emp
where sal between 2000 and 4000;

--����� �޿��� 2000�ʰ��̰� 4000�޶� �̸��� ��� ����� ���� ���
SELECT * FROM emp
where sal>2000 and sal<4000;

--�μ� ��ȣ�� 10�� �Ǵ� 20�� �Ǵ� 30���� ����� ���, �̸�, �޿�, �μ���ȣ�� ����ϼ���.
select empno, ename,sal,deptno
from emp
where deptno =10 or deptno = 20 or deptno = 30;

--IN ������ (���� or ���� or...)
select empno, ename,sal,deptno
from emp
where deptno in(10,20,30);

--�μ� ��ȣ�� 10�� �Ǵ� 20�� �ƴ� ����� ���, �̸�, �޿�, �μ���ȣ�� ����ϼ���.
--����  !=
select empno, ename,sal,deptno
from emp
where deptno !=10 and deptno != 20;

--NOT IN ������ (and ������ and ������)
select empno, ename,sal,deptno
from emp
where deptno not in(10,20);

--POINT : ���� ����(������ ����)>>null
--�ʿ��>>null
create table member(
userid varchar2(20) not null,
name varchar2(20) not null,
hobby varchar2(20) --default (null���� ����ϰڴ�) : �ʼ� �Է»��� �ƴϾ�
);

SELECT * FROM member;
insert into member(userid,hobby) values('hong','��');
insert into member(userid,name) values('hong','ȫ�浿'); --hobby ���� ���� ������ null
insert into member(userid,name,hobby) values('hong','ȫ�浿','�߱�');
--ORA-01400: cannot insert NULL into ("BITUSER"."MEMBER"."NAME")
commit; --���� �ݿ�(��ũ�� ����)

delete from emp;
select * from emp;
rollback;

--������ ���� �ʴ� ��� ����� ������ ����ϼ���

SELECT * FROM emp;
--select * from emp where comm = null; -- �������� �ʾƿ� (x)

select * from emp where comm is null; --comm �÷� null ���� �������ִ� ������

--������ �޴� ��� ����� ������ ����ϼ���(null �� �ƴ� ���)
select * from emp where comm is not null;

--��� ���̺��� ���, �̸�, �޿�, ����, �ѱ޿��� ����ϼ���
--�ѱ޿�(�޿� + ����)
SELECT empno, ename, sal+comm as "�ѱ޿�"  
FROM emp;

SELECT empno, ename, sal, comm, sal + nvl(comm,0) as "�ѱ޿�"  
FROM emp;
--POINT null
--null ���� ��� ������ �װ���� : null
--�� ������ �ذ� null ó�� �Լ� : nvl(), nvl2()
--ms-sql:convert()
--my-sql:IFNULL()

select 1000 + null from dual;

select 1000 + nvl(null,0)from dual;

select comm,nvl(comm,o)from empl;

--����� �޿��� 1000 �̻��̰� ������ ���� �ʴ� ����� ���, �̸�, ����, �޿�, ������ ����ϼ���
select empno, ename, job, sal, comm  from emp
where sal>1000 and comm is null;

--------------------------------------------------------------------------------
--DQL(data query language) : SELECT
--DDL(������ ���Ǿ�) : create, alter, drop : ��ü����, ����, ����
--class Board{private int numberid;}
create table board(
boardid number not null, --�ʼ� �Է�(����)
title varchar2(20) not null, -- �ѱ����� 2byte >> 10��, ������ Ư�� ����>>20��
content varchar2(2000) not null,
hp varchar2(20)
);

desc board;

--insert, updatem delete �۾��ÿ��� rollback, commit) �ݵ�� ����
insert into board(boardid, title, content)
values(200,'�ڹ�','�׸���....');

select * from board;
--�ǹݿ� : commit
--��� :  rollback
--�߸��Ǿ��µ�
rollback;
commit;

insert into board(boardid, title, content,hp)
values(200,'�ڹ�','�׸���....','010...');
SELECT*from board;
commit;

select boardid, nvl(hp,'EMPTY')as "hp" from board;
--nvl() �Լ��� ����, ��¥, ���� ��� ���밡���ϴ�
--------------------------------------------------------------------------------
--���ڿ� �˻�
--�ּҰ˻� : '����' �˻��ϸ� �����̶� ���ڰ� ����ִ� ��� ����
--���ڿ� ���� �˻�(like ������)

--like ������ (���ϵ� ī�� ����(% : ��� ��, _ : �ѹ���) ����....

select *
from emp
where ename like '%A%'; --A�� ����ִ� ��� �˻�

select *
from emp
where ename like 'A%'; --��ҹ��� ����

select *
from emp
where ename like '��%';

select *
from emp
where ename like '%S';

select *
from emp
where ename like '%LL%';
select *
from emp
where ename like '%A%A%'; --A ���� 2��


select ename
from emp
where ename like '_A%'; --_�ѹ��� �ι��� �ܾ A�̸�

select ename
from emp
where ename like '___A%';

--����Ŭ ���� (regesp_like

--select * from emp where REGEXP_LIKE(ename,'[A_C]');
--���� ǥ���� (ǥ�� : java, oracle, script...)
--���� ���͵� (�߰� ������Ʈ : ���� (����ǥ�� ����)

--------------------------------------------------------------------------------

--������ �����ϱ�
--order by �÷���:����, ���� ��¥
--�������� : asc : ������ (default)
--�������� : desc : ������

select * from emp order by sal; --�޿��� ���� ������ asc
select * from emp order by sal asc;

--�޿��� ���� �޴� ������ �����ؼ� ����ϼ���
select * from emp order by  sal desc;

SELECT ename from emp order by ename asc;

--�Ի����� ���� ���� ������ �����ؼ� ���, �̸�, �޿�, �Ի����� ����ϼ���
select empno, ename, sal, hiredate
from emp
order by hiredate desc;

/*
�������
select   3
from     1
where    2
order by 4 (select ����� ����)
*/

--����
select empno,ename, sal, job, hiredate
from emp
where jop = 'MANAGER'
order by hiredate desc;

--����
select deptno,job
from emp
order by deptno desc, job asc;
--grouping

select job, deptno
from emp
order by job asc, deptno desc;
--------------------------------------------------------------------------------
--������
--������(union) : ���̺�� ���̺��� �����͸� ��ġ�� �� (�ߺ����� ����)
--������(union all) : �ߺ��� ���

create table UTA (name varchar2(20));
insert into uta(name) values('AAA');
insert into uta(name) values('BBB');
insert into uta(name) values('CCC');
insert into uta(name) values('DDD');
commit;
select * from uta;

create table UT (name varchar2(20));
insert into ut(name) values('AAA');
insert into ut(name) values('BBB');
insert into ut(name) values('CCC');
commit;
select * from ut;


select * from ut
union -- �ߺ��� ����
select * from uta;

select * from ut
union all-- �ߺ���
select * from uta;

--union ��Ģ
--1. ������� �÷��� Ÿ���� ����
select empno, ename from emp
union
select dname, deptno from dept; --(x)

select empno, ename from emp
union
select deptno, dname from dept;

-->�ǹ� >subquery ����ؼ� union �����̺� �������̺� ó�� ���
select empno, ename
from (
select empno, ename from emp
union
select deptno, dname from dept
)order by empno desc;

--2.������� �÷��� ������ ���� (null ������)
select empno, ename, job, sal from emp
union
select deptno, dname,loc,null from dept;
--������� �ʺ� �����ڰ� �ǹ������� (���� ���̺�) �������
--------------------------------------------------------------------------------
--����Ŭ �Լ�(����Ŭ.pdf 49 page)
/*
1.2.2 ���� �� �Լ��� ���� 1) ������ �Լ� : ���ڸ� �Է� �ް� ���ڿ� ���� �� ��θ� RETURN �� �� �ִ�. 
2) ������ �Լ� : ���ڸ� �Է� �ް� ���ڸ� RETURN �Ѵ�. 
3) ��¥�� �Լ� : ��¥���� ���� �����ϰ� ���ڸ� RETURN �ϴ� MONTHS_BETWEEN �Լ��� �����ϰ� ��� ��¥ ���������� ���� RETURN �Ѵ�. 
4) ��ȯ�� �Լ� : � ���������� ���� �ٸ� ������������ ��ȯ�Ѵ�. (to_char(), to_number(), to_date()
5) �Ϲ����� �Լ� : NVL(), DECODE() 
*/

--���ڿ� �Լ�
select initcap('the super man') from dual; --The Super Man

select lower('AAA'), upper('aaaa') from dual;

select ename, lower(ename)as "ename" from emp;

select * from emp where lower(ename) = 'king';

--������ ����(length)
select length('abcd') from dual;
select length('ȫ�浿') from dual;
select length(' ȫa�浿 ') from dual;

--���� ������ ||
--concat()
select 'a' || 'b' from dual;

select concat('a','b') from dual;

select concat(ename,job) from emp;

select ename || ' ' || job from emp;

--�κ� ���ڿ� ����
--java (substring)
--orcle(substr)
select substr('ABCDE',2,3)from dual; --BCD
select substr('ABCDE',1,1)from dual; --�ڱ��ڽ� : A
select substr('ABCDE',3,1)from dual; --�ڱ��ڽ� : C

select substr('ABCDE',3)from dual;
select substr('ABCDE',-2,1)from dual;
select substr('ABCDE',-2,2)from dual;

--Quiz
/*
������̺��� ename �÷� �����Ϳ� ���ؼ� ù���ڴ� �ҹ��ڷ�
������ ���ڴ� �빮�ڷ� ����ϵ� �ϳ��� �÷������ͷ� ���
--�÷��� ����Ī�� : fullname
--ù���ڿ� ������ ���� ���̿� �����ϳ� �־��
--ex)SMITH -> s MITH
*/
select substr(lower(ename),1,1) ||' '||substr(ename,2) as "fullname" from emp;

--lpad, rpad(ä���)
select lpad('ABC',10,'*')from dual;

select lpad('ABC',10,'#')from dual;

--Quiz
--����� ��� : hong1006
--ȭ�� : ho****** ����ϰ� �;�� (���࿡ 1004>>10**)
select rpad(substr('hoong1006',1,2),length('hoong1006'),'*') as "passward" from dual;

--emp ���̺��� ename �÷��� ������ ����ϴµ� ù���ڸ� ����ϰ� �������� *����ϼ���
select rpad(substr(ename,1,1),length(ename),'*') from emp;
create table member2(
id number,
jumin varchar2(14)
);
insert into member2(id,jumin)values(100,'123456-1234567');
insert into member2(id,jumin)values(200,'234567-1234567');

rollback;
commit;

--Quiz
--��°��
--�ϳ��� ���� ������
--100 : 123456 - *******
--200 : 234567 - *******
--����Ī "jumin"

select * from member2;

select id || ' : ' || rpad(substr(jumin,1,7),length(jumin),'*')as "jumon"
from member2;

--rtrim �Լ�
--[������ ����] ������
select rtrim('MILLER','ER')from dual;

--ltrim �Լ�
select ltrim('MILLLLLLLLLLLER','MIL')from dual; --����

--ġȯ�Լ�
select ename, replace(ename,'A','�Ϳ�')from emp;

------------------------------[���ڿ� �Լ� END]-----------------------------------
--[���� �Լ�]
--round(�ݿø� �Լ�)
--trunc(�����Լ�)
--������ ���ϴ� �Լ� mod()

--    -3 -2 -1 0(����) 1 2 3
SELECT round(12.345,0) as "r" from dual; --�����θ� ���ܶ� 12
SELECT round(12.567,0) as "r" from dual; --13

select round(12.345,1) as "r" from dual; --12.3
select round(12.567,1) as "r" from dual; --12.6

select round(12.345,-1) as "r" from dual; --10
select round(15.345,-1) as "r" from dual; --20
select round(12.345,-2) as "r" from dual; --0

--trunc (�ݿø� ���� �ʰ� ������)
SELECT trunc(12.345,0) as "r" from dual; --�����θ� ���ܶ� 12
SELECT trunc(12.567,0) as "r" from dual; --12

select trunc(12.345,1) as "r" from dual; --12.3
select trunc(12.567,1) as "r" from dual; --12.5

select trunc(12.345,-1) as "r" from dual; --10
select trunc(15.345,-1) as "r" from dual; --10
select trunc(12.345,-2) as "r" from dual; --0

--������
SELECT 12/10 from dual;
select mod(12,10) from dual; --������ 2��
select mod(0,0) from dual;

----------------------------[���� �Լ� END]---------------------------------------
--��¥ �Լ� : sysdate
--��¥ ��� : (POINT)
--DATE + Number >> Date
--Date - Number >> Date
--Date - Date >> Number (����)

--��¥ round, trunc 
SELECT * from SYS_NLS_SESSION_PARAMETRS where parameters='NLS_DATE_FORMAT';

select sysdate from dual;
select hiredate from emp;
select MONTHS_BETWEEN('2018-02-27','2010-02-27') from dual; --������ �� 96����

select round(MONTHS_BETWEEN(sysdate,'2010-01-01'),1) from dual;       
select trunc(MONTHS_BETWEEN(sysdate,'2010-01-01'),1) from dual;

select to_date('2015-04-25') + 1000 from dual; --���� ��¥ >> to_date()

select sysdate + 100 from dual;

--Quiz
/*
 1.������̺��� ������� �Ի��Ͽ��� ���糯¥(sysdate)������ �ټ� ������ ���ϼ���
   �� �ټӿ����� �����θ� �����⼼��
 2.�Ѵ��� 31�� �̶�� �����ϰ� �ټӿ����� ���ϼ���
*/
select trunc(MONTHS_BETWEEN(sysdate,hiredate),0)as"�ټӿ�" from emp;
select trunc((sysdate-hiredate)/31,0) as "�ټӿ�2"from emp; 

------------------------------[��¥ �Լ� END]------------------------------------
--����
--����
--��¥

--------------------------------------------------------------------------------
--[��ȯ�Լ�]POINT
--ORACLE : ����, ����, ��¥
--to_char() : ���� -> ����($1000.000), ��¥ -> ����(18��12��12��)   (��������) 60%
--to_date() : ���� -> ��¥ >> select '2018-12-12' + 1000 >> select to_date('2018-12-12)..
--to_number() : ���� -> ���� (�ڵ�����ȯ)
--select '100' + 100 from dual;
--select to_number('100') + 100 from dual;

/*
����Ŭ �⺻ Ÿ��(������ Ÿ��)
create table ���̺�� (�÷��� Ÿ��);
create table member(age number); 100�� ������ insert
--Java> class member{int age;} >> member m = new member(); 1��
--java>List<member> list = new ArrayList<>(); list,add(new member()); ������

���� Ÿ��
--char(20) >> 20byte >> ������ 10��, ������, Ư������, ���� 20�� >> �������� ���ڿ�
--varchar2(20)>> 20byte >> ������ 10��, ������, Ư������, ���� 20�� >> �������̹��ڿ�

char(20) 'ȫ�浿' >> 20byte ��� ���
varchar2(20) >> 'ȫ�浿' >> ������ ũ�� >> 6byte

�����ȵ����� : ��, �� >> ó�� >> char(2)
�ᱹ>>varchar2(2)

���� ���� ����)
char().....varchar2()���� �˻��� �켱...

�ᱹ ������ �ѱ�
unicode (2byte) : �ѱ�, ������, Ư������, ���� >> 2byte
nchar(20)>>�� ������ ���� >> ���� byte *2 >> 40byte
nvarchar2(20) >> 20���� ����

�ѱ� 20�� , ������ 20��

*/
--------------------------------------------------------------------------------
--1.to_number() : ���ڸ� ���ڷ�
select 1 + 1 from dual;

select '1' + 1 from dual; --�ڵ� ����ȯ

select to_number('1') + 1 from dual;

select '1' + '1' from dual; --�ڵ� ����ȯ

select '1A' + '1' from dual;
--------------------------------------------------------------------------------
--2. to_char() : ���� -> ����(���Ĺ���), ��¥ -> ����(���Ĺ���)
select sysdate from dual;
--YYYY YY MM DD.... ���ǵǾ� �־��

select sysdate || '��' from dual; --�ڵ� ����ȯ (��¥ �� ���ڰ� ����>>����)
--��Ģ
select to_char(sysdate)||'��'from dual;

select sysdate,
to_char(sysdate,'YYYY')||'��'as"YYYY",
to_char(sysdate,'YEAR'),
to_char(sysdate,'MM'),
to_char(sysdate,'DD'),
to_char(sysdate,'DAY'),
to_char(sysdate,'DY')
from dual;

--Quiz
--�Ի����� 12���� ������� ���, �̸�, �Ի���, �Ի�⵵, �Ի���� ����ϼ���
select empno, ename, hiredate, 
to_char(hiredate,'YYYY')  as "�Ի�⵵",
to_char(hiredate,'MM')  as "�Ի��"
 from emp 
 where to_char(hiredate,'MM')=12;
 
 select to_char(hiredate,'YYYY MM DD')as "����" from emp;
 
 select to_char(hiredate,'YYYY"��"MM"��"DD"��"')as "����"  from emp;
 -------------------------------------------------------------------------------
 --to-char() : ����->����
 --why : 100000000 -> $1,000,000,000�̷� ������ ���ڵ����� to_char()
 select '>'||to_char(12345,'9999999999999')||'<' from dual;
 select '>'||to_char(12345,'9999999999999')||'<' from dual;
 select '>'||to_char(12345,'0000000000000')||'<' from dual;
 
 select '>' || to_char(12345,'$9,999,999,999,999') || '<' from dual;
 
 select to_char(sal,'$999,999')as "sal"
 from emp;
/*
[[[[[   HR �������� �����ؼ�  ]]]]]
������̺��� ����� �̸��� last_name , first_name ���ļ� fullname ��Ī �ο��ؼ� ����ϰ�
�Ի�����  YYYY-MM-DD �������� ����ϰ� ����(�޿� *12)�� ���ϰ� ������ 10%(���� * 1.1)�λ��� ���� 
����ϰ� �� ����� 1000���� �޸� ó���ؼ� ����ϼ���
�� 2005�� ���� �Ի��ڵ鸸 ����ϼ��� �׸��� ������ ���� ������  ����ϼ���

select employee_id , first_name , last_name , hire_date , salary 
from employees;

select employee_id,
           first_name || last_name as "fullname",
           to_char(hire_date,'YYYY-MM-DD') as "hire_date",
           salary,
           salary * 12 as "����",
           to_char((salary * 12)*1.1,'$9,999,999,999') as "�λ��",
           hire_date
from employees
where to_char(hire_date,'YYYY') >= '2005'
order by "����" desc; -- order by �� select ����� ������ ����  ����Ī ��� ����           

*/
--------------------------------------------------------------------------------
--to_date () ���ڸ� ��¥��

select to_date('2018-12-12','YYYY-MM-DD')from dual; --2018-12-12 00:00:00
select '2018-12-12' + 100 from dual;--error
select to_date('2018-12-12') + 100 from dual;
-------------------------------[��ȯ�Լ� : to_number(),to_char(), to_date()]-----
--����
--����
--��¥
--��ȯ(to, char...)
--------------------------------------------------------------------------------
--[�Ϲ��Լ�]
--���α׷����� ������ ���ϴ�..
--nvl(), nvl2() --> null ó���Լ�
--decode()�Լ� --> java if...
--case()�Լ� --> java switch....

select comm, nvl(comm,0) from emp;

create table t_emp(
  id number(6),
  job varchar2(20)
);
insert into t_emp(id,job) values(100,'IT');
insert into t_emp(id,job) values(200,'SALES');
insert into t_emp(id,job) values(300,'MGR');
insert into t_emp(id) values(400);
insert into t_emp(id,job) values(500,'MGR');
commit;

select * from t_emp;

--1.nvl()
select id, job, nvl(job,'Empty...') from t_emp;

--2.nvl2(), null �ΰ��, �ƴ� ���
select id, job, nvl2(job,'AAA','BBB')from t_emp; --job null�� �ƴϸ� �� null�̸� ��

select id, job, nvl2(job,job||'�Դϴ�','empty')from t_emp;

--3.decode POINT (�Ϲ� SQL, ����� ���� if, switch)
--decode(ǥ����, ����1 , ���1, ���� 2, ��� 2, ����3, ���3......)
--��赥���� ����
select id, job, decode(id , 100,'IT....',
                            200,'SALES....',
                            300,'MGR......',
                            'ETC.........')as "decodejob"
from t_emp;

select job, decode(job,'IT',1) from T_emp;
--Ȱ��(���)
select count(decode(job,'IT',1))as "job" , count(decode(job,'SALES',1))as "SALES",
 count(decode(job,'MGR',1))as "MGR"
from t_emp;
--------------------------------------------------------------------------------
/*
emp ���̺��� �μ���ȣ�� 10�̸� '�λ��', 20'������', 30'ȸ���' �������μ���ȣ�� 
'��Ÿ�μ�' ��� ����ϴ� �������� ���弼��
decode �� ����ؼ�
*/
select decode(deptno, '10', '�λ��','20', '������','30', 'ȸ���','��Ÿ�μ�')as "�μ���"
from emp
order by deptno;

--Quiz
create table t_emp2(
 id number(2),
 jumin char(7)
);
insert into t_emp2(id, jumin) values(1,'1234567');
insert into t_emp2(id, jumin) values(2,'2234567');
insert into t_emp2(id, jumin) values(3,'3234567');
insert into t_emp2(id, jumin) values(4,'4234567');
insert into t_emp2(id, jumin) values(5,'9234567');
commit;
/*
 
  t_emp2 ���̺��� id , jumin �����͸� ����ϵ� jumin �÷��� ���ڸ����� 1�̸� ����
  2�̸� ���� , 3�̸� �߼� �� �ܴ� ��Ÿ�� ����ϼ���
  ��µǴ� �÷����� gender �� �ϼ���
  */
select id, jumin, decode(substr(jumin,1,1),1,'����', 2,'����', 3,'�߼�','��Ÿ') as "gender"
from t_emp2;


  
--���̵� �߱�
--java if() {   if(){}  } ��ø if��
--oracle : decode(decode())
/*
�μ���ȣ�� 20���� ����߿��� SMITH ��� �̸��� ���� ����̶�� HELLO ���� ����ϰ�
�μ���ȣ�� 20���� ����߿��� SMITH ��� �̸��� ���� ����� �ƴ϶�� WORLD ���� ����ϰ�
�μ���ȣ�� 20���� ����� �ƴ϶�� ETC ��� ���ڸ� ����ϼ���

*/
select decode(deptno, 20, decode(ename, 'SMITH', 'HELLO','WORLD'),'ETC') as "decode"
from emp;

--CASE��
/*
CASE ���� WHEN ���1 THEN ���1
                 WHEN ���2 THEN ���2
                 WHEN ���3 THEN ���3
                 WHEN ���4 THEN ���4
                 ELSE ���5
END "�÷���"                 
*/
create table t_zip(
  zipcode number(10)
);

insert into t_zip(zipcode) values(2);
insert into t_zip(zipcode) values(31);
insert into t_zip(zipcode) values(32);
insert into t_zip(zipcode) values(33);
insert into t_zip(zipcode) values(41);
commit;

select * from t_zip;

select '0' || to_char(zipcode),
case zipcode when 2 then '����'
             when 31 then '���'
             when 32 then '����'
             when 41 then '����'
             else '��Ÿ����'
end "regionname"
from t_zip;

/*
������̺��� ����޿��� 1000�޷� ���ϸ� 4��
1001 �޷� 2000�޷� ���ϸ� 3��
2001 �޷� 3000�޷� ���ϸ� 2��
3001 �޷� 4000�޷� ���ϸ� 1��
4001 �޷� �̻��̸� Ư���� �ο��ϴ� �����͸� ����ϼ���

1. case �÷��� when ��� then ��� (=)
2. case when �÷��� ���Ǻ񱳱��� then    (ex: sal < 2000 )

*/

select case when sal<=1000 then '4��'
            when sal between 1001 and 2000 then '3��'
            when  sal between 2001 and 3000 then '2��'
            when  sal between 3001 and 4000 then '1��'
            else 'Ư��'
       end "�޿����" , empno, ename, sal
from emp;
--------------------------------------------------------------------------------
--����>>����>>��¥>>��ȯ(to_char(),to_number(),to_date())>>�Ϲ��Լ� (nvl(), ~case)>>
--�����Լ�

--����Ŭ.pdf(75Page)

--[�����Լ�]
--1. count(*), count(�÷���) >>������ ����
--2. sum()
--3. avg()
--4. max()
--5. min()
--���

/*
1. ���� �Լ��� �ݵ�� group by ���� ���� ���
2. POINT : ��� �����Լ��� null���� ����
3. POINT : select ���� �����Լ� �ܿ� �ٸ� �÷��� ���� �ݵ�� group by ���� ��õǾ�� �Ѵ�
*/

select count(*) from emp;

select count(empno) from emp; --empno ������ ��� ���� (�� null ����)

select count(comm) from emp; --null ���� >> 6��

select comm from emp;

--
select count(nvl(comm, 0))from emp; --nvl �Լ��� ����ϸ� >>null ó��

--�޿��� ��
select sum(sal) from emp; --29025
--��� �޿� (�޿���/�Ǽ�)
select round(avg(sal),0) from emp; --2073 ��ձ޿�

--������� ȸ�� ������ �� �󸶰� ���޵���?(���)
select sum(comm) as"sum" from emp; --4330
select trunc(avg(comm),0) as"avg" from emp; --721

--ȸ�� ������...(��ü ������� ������...309
--ȸ�� ������...(�޴� ����� �����´�...721 

select (300+200+30+300+3500+0) /14 from dual;
--�Ǽ�(null)����>>6
--����
select comm from emp;
select (300+200+30+300+3500+0) /14 from dual; --309
select sum(comm)/14 from emp;
select sum(comm)/count(*)from emp;
--����
select avg(nvl(comm,0)) from emp;

select count(*) from emp where comm is null;

--------------------------------------------------------------------------------
select max(sal) from emp;

select min(sal) from emp;

--POINT : �����Լ��� ����� [�÷�1��]

select sum(sal), avg(sal), max(sal), min(sal), count(sal),count(*) from emp;
-------------------------------------------------------------------------------
--�μ��� ��� �޿��� ����ϼ���
select deptno,avg(sal)
from emp
group by deptno;
--
select deptno,avg(sal) from emp; --(x)

select avg(sal)
from emp
group by deptno;  --������ ������ ��ȣ(�˼� �����)
--------------------------------------------------------------------------------
--������ ��ձ޿�, �޿���, �ִ�޿�, �ּұ޿�, �Ǽ��� ����ϼ���
select job ,avg(sal), sum(sal), max(sal), min(sal), count(job)
from emp
group by job;

/*
grouping ���� (���� �߿�)
--distinct �÷��� 1, �÷��� 2
--order by �÷��� 1, �÷��� 2
--group by �÷��� 1, �÷��� 2
*/

--�μ���,������ �޿��� ���� ���ϼ���

select deptno, job, sum(sal), count(sal)
from emp
group by deptno, job
order by deptno;

/*
select        5
from          1
where         2
group by      3
having        4
order by      6
*/

--������ ��� �޿��� 3000�޷� �̻��� ����� ������ ��ձ޿���  ����ϼ���
--��ձ޿� >=3000 ���������� >> ��ձ޿� >> group by...
--where ��ձ޿� ������ ��� �� �� �� �����
--�� > group by ����
--group by  ���� : having ��

select job, avg(sal)
from emp
group by job
having avg(sal) >=3000;

/*
������̺��� ������ �޿����� ����ϵ� ������ ���� �ް� �޿��� ���� 5000�̻��� ������� ����� ����ϼ���
--�޿��� ���� ������
*/
select job, sum(sal) "summal"
from emp
where comm is not null
group by job
having  sum(sal)>=500
order by "summal" asc;
/*
������̺��� �μ��ο��� 4���� ���� �μ��� �μ���ȣ �ο��� �޿��� ���� ����ϼ���
*/
select deptno, count(*) as "�μ����ο�", sum(sal) as "�μ��� �޿��� ��"
from emp
group by deptno
having count(*)>4;

/*
������̺��� ������ �޿��� ���� 5000�� �ʰ��ϴ� ������ �޿��� ���� ����ϼ���
�� �Ǹ�����(salesman)�� ����ϰ� �޿������� �������� �����ϼ���
*/
select job, sum(sal)
from emp
where job != 'SALESMAN'
group by job
having sum(sal)>5000
order by sum(sal) desc;

-------------------------------------------------------------
--[����(JOIN)] : �������̺��� �����͸� �˻��ϴ� ���
--Oracle.pdf(p85)
--����
--1. �����(equi join) => 70%
--�����̺�� ������� ���̺� �ִ� �÷��� �����͸� 1:1 ����
--[ANSI  ����]
--���� : join  on ~������
--���� : [inner] join on ~������ ������


--2. ������(non-equi join) => �ǹ̸� ���� => ���� �����
--�����̺�� ������� ���̺� �ִ� �÷��� 1:1 ���ε��� �ʴ� ���
--ex) emp , salgrade : ����� ��� �˻� �÷� 2�� ��� (losal , hisal)  


--3.outer join(equi join + null) => equi join null ó�� �ȵǿ�
--outer join (�ΰ��� ���̺��� �� , �� ���� �ľ�)
--���� : left outer join  (���� �� , ������ ��)
--      right outer join  (������ �� , ���� ��)
--      full outer join   (left , right join > union �ϸ�)


--4. self join (�ڱ�����) => �ǹ̸� ���� => ���� �����
--ex) emp ���̺��� smith ������ �̸��� �����Դϱ�
--�ϳ��� ���̺�ȿ��� �÷��� �ٸ� �÷��� �����ϴ� ���
---------------------------------------------------------------------
--���� �ǽ� ���̺� ����

create table M (M1 char(6) , M2 char(10));
create table S (S1 char(6) , S2 char(10));
create table X (X1 char(6) , X2 char(10));

insert into M values('A','1');
insert into M values('B','1');
insert into M values('C','3');
insert into M values(null,'3');
commit;

insert into S values('A','X');
insert into S values('B','Y');
insert into S values(null,'Z');
commit;

insert into X values('A','DATA');
commit;

select * from m;
select * from s;
select * from x;
--------------------------------------------------------------------------------
select * from emp;
select * from dept;
select * from salgrade;

select *
from m, s
where m.m1 = s.s1;

--oracle join ����, (ANSI ���� x)
select m.m1,m.m2,s.s2
from m, s
where m.m1 = s.s1;
--��� join �������̰� ����� from ���������� ��ȣ�ϴ�...
select m.m1,m.m2,s.s2
from m, s
where m.m1 = s.s1 and m.m1= 'A';

--ANSI ���� ����
select m.m1,m.m2,s.s2
from m join s
on m.m1 = s.s1;

--���� ���(select *...) �ʿ��� �÷��� ����
select emp.empno,
       emp.ename,
       emp.deptno,
       dept.dname
from emp join dept
on emp.DEPTNO = dept.DEPTNO;

--���̺� ����Ī �ο�(���� ���̺��̸��� �� ����....��Ī ���)
select e.empno,
       e.ename,
       e.deptno,
       d.dname
from emp e join dept d
on e.DEPTNO = d.DEPTNO;

select s.s1,x.x2
from s join x
on s.s1 = x.x1;

--------------------------------------------------------------------------------
--join �Ѱ� �̻��� ���̺�
--orcle sql join ����
select m.m1,m.M2,s.s2,x.x2
from m,s,x
where m.m1=s.s1 and s.s1=x.x1;
--A=B , B=C > A=C

--ANSI ����
select m.m1,m.M2,s.s2,x.x2
from m join s on m.m1 = s.s1
       join x on s.s1 = x.x1;
--���, �̸�, �μ���ȣ,�μ���, �޿�, �޿����

--------------------------------------------------------------------------------
--1.HR �������� �̵�
select * from employees;
select * from departments;
select * from locations;

--employees, departments
--1.���, �̸�(last_name),�μ���ȣ, �μ��̸��� ����ϼ���

select e.EMPLOYEE_ID, e.LAST_NAME, e.DEPARTMENT_ID, d.DEPARTMENT_NAME
from EMPLOYEES e join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
order by e.EMPLOYEE_ID;

--������ ����� 107�� >> 106��(������ ����)
--��������δ� �ذ��� �ȵǿ�.....outer join �ذ�

--2.���, �̸�, �μ���ȣ, �μ���, �����ڵ�, ���ø� �� ����ϼ���
select e.EMPLOYEE_ID,
       e.LAST_NAME,
       e.DEPARTMENT_ID,
       d.department_name,
       d.LOCATION_ID,
       l.CITY
from EMPLOYEES e join departments d on e.DEPARTMENT_ID = d.DEPARTMENT_ID
                 join locations l on d.LOCATION_ID = l.location_id;



select * from EMPLOYEES where department_id is null;

--------------------------------------------------------------------------------
--�� (1:1 ���� �Ǵ� �÷��� �����)
select * from emp;
select * from salgrade;

--���, �̸�, �޿�, �޿������ ����ϼ���
select e.EMPNO,e.ENAME,e.sal,s.GRADE
from emp e join salgrade s
on e.sal between s.LOSAL and s.HISAL;

--���, �̸� �μ���ȣ, �μ���, �޿�, �޿����
--joib �ϴ� ���̺� 3��

select e.empno ,e.ENAME, e.deptno, d.dname, e.sal, s.grade
from emp e join dept d on e.DEPTNO = d.DEPTNO
           join salgrade s on e.sal between s.losal and s.hisal;
--         join
--         join


--------------------------------------------------------------------------------
/*
outer join(equi join + null(���� ������)) => equi join  null ó�� �ȵǿ�
outer join (�ΰ��� ���̺��� �� , �� ���� �ľ�)

���� : 
left outer join  (���� �� , ������ ��)
right outer join  (������ �� , ���� ��)
full outer join   (left , right join > union �ϸ�)

���������� ������� �����ϰ� (�� ,��) ���踦 �ľ��ؼ�
���� �Ǵ� ���̺��ִ� ���� �����͸� ������ ���� ��

*/

select *
from m join s
on m.m1 = s.s1;


select * 
from m left outer join s
on m.m1 = s.s1;

select * 
from m right outer join s
on m.m1 = s.s1;


select * 
from m full outer join s
on m.m1 = s.s1;

--employees, departments
--1.���, �̸�(last_name),�μ���ȣ, �μ��̸��� ����ϼ���

select e.EMPLOYEE_ID, e.LAST_NAME, e.DEPARTMENT_ID, d.DEPARTMENT_NAME
from EMPLOYEES e join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
order by e.EMPLOYEE_ID;

--������ ����� 107�� >> 106��(������ ����)
--��������δ� �ذ��� �ȵǿ�.....outer join �ذ�

select * from employees where department_id is null;

--107���� �������� �ϼ���
select *
from  employees e left outer join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
order by e.EMPLOYEE_ID;
--------------------------------------------------------------------------------
--self join (�ڱ�����) -> ���� >> �����
--�ϳ��� ���̺��� �÷��� �ٸ� �÷��� �����ϴ� ���
select * from emp;

select e.empno, e.ename, m.empno, m.ename
from emp e join emp m
on e.mgr = m.empno;
--��� 14�� >> ��� 13�� >>�����
SELECT * FROM emp where mgr is null;
select e.empno, e.ename, m.empno, m.ename
from emp e left outer join emp m --self join �ϳ��� ���̺��� 2�� ó��(���̺� ����Ī �ο�)
on e.mgr = m.empno;

--------------------------------------------------------------------------------

select *
from m,s;
--where m.m1 = s.s1;
--------------------------------------------------------------------------------
-- 1. ������� �̸�, �μ���ȣ, �μ��̸��� ����϶�.
select e.ENAME, e.DEPTNO, d.DNAME
from emp e join dept d
on e.DEPTNO = d.DEPTNO;

SELECT E.ENAME, E.DEPTNO, D.DNAME
FROM EMP E  join DEPT D on E.DEPTNO=D.DEPTNO;


-- 2. DALLAS���� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸���
-- ����϶�.
select e.ENAME, e.job, e.deptno, d.DNAME 
from dept d join emp e
on d.DEPTNO = e.DEPTNO
where d.LOC = 'DALLAS';

SELECT E.ENAME, E.JOB, D.DEPTNO, D.DNAME
FROM EMP E  join DEPT D on E.DEPTNO=D.DEPTNO
WHERE  D.LOC='DALLAS';


 
-- 3. �̸��� 'A'�� ���� ������� �̸��� �μ��̸��� ����϶�.
SELECT e.ename, d.DNAME 
FROM emp e join dept d
on e.DEPTNO = d.DEPTNO
where e.ENAME like '%A%';

SELECT E.ENAME, D.DNAME
FROM EMP E  join DEPT D  on D.DEPTNO=E.DEPTNO
WHERE  E.ENAME LIKE '%A%';
--WHERE Regexp_like(E.ENAME,'^A');

-- 4. ����̸��� �� ����� ���� �μ��� �μ���, �׸��� ������
--����ϴµ� ������ 3000�̻��� ����� ����϶�.
SELECT e.ename, d.DNAME
FROM emp e join dept d
on e.DEPTNO = d.DEPTNO
where e.SAL >=3000;

SELECT E.ENAME, D.DNAME, E.SAL ,D.DNAME
FROM EMP E  join DEPT D on E.DEPTNO=D.DEPTNO
WHERE E.SAL>=3000;

 
-- 5. ����(����)�� 'SALESMAN'�� ������� ������ �� ����̸�, �׸���
-- �� ����� ���� �μ� �̸��� ����϶�.
SELECT e.job, e.ename, d.DNAME
FROM emp e join dept d
on e.DEPTNO = d.DEPTNO
where e.job = 'SALESMAN';
 
SELECT E.JOB, E.ENAME, D.DNAME
FROM EMP E  join DEPT D on E.DEPTNO=D.DEPTNO
WHERE E.JOB='SALESMAN';
-- 6. Ŀ�̼��� å���� ������� �����ȣ, �̸�, ����, ����+Ŀ�̼�,
-- �޿������ ����ϵ�, ������ �÷����� '�����ȣ', '����̸�',
-- '����','�Ǳ޿�', '�޿����'���� �Ͽ� ����϶�.
--(�� ) 1 : 1 ���� ��� �÷��� ����
SELECT e.EMPNO as "�����ȣ", 
       e.ENAME as "����̸�", 
       e.SAL*12 as "����",
       (e.sal*12) + e.COMM as "�Ǳ޿�",
       s.GRADE as "�޿����"
FROM emp e join salgrade s
on e.SAL BETWEEN s.losal and s.HISAL
where  e.comm is not null;

SELECT E.EMPNO AS "�����ȣ",
               E.ENAME AS "����̸�",
               E.SAL*12 AS "����",
           --E.SAL*12+NVL(COMM,0) AS "�Ǳ޿�",
               E.SAL*12+COMM AS "�Ǳ޿�",
               S.GRADE AS "�޿����"
FROM EMP E inner join SALGRADE S on E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE E.Comm is not null;

select * from salgrade;
 
-- 7. �μ���ȣ�� 10���� ������� �μ���ȣ, �μ��̸�, ����̸�,
-- ����, �޿������ ����϶�.
SELECT e.DEPTNO, d.DNAME, e.ENAME, e.sal, s.GRADE
FROM emp e join dept d on  e.DEPTNO = d.DEPTNO
           join salgrade s on e.SAL BETWEEN s.losal and s.hisal
where e.DEPTNO = 10;

SELECT E.DEPTNO, D.DNAME, E.ENAME, E.SAL, S.GRADE
FROM EMP E   join DEPT D on E.DEPTNO=D.DEPTNO
             join SALGRADE S on E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE E.DEPTNO=10;
 
SELECT * FROM SALGRADE;
 
 
-- 8. �μ���ȣ�� 10��, 20���� ������� �μ���ȣ, �μ��̸�,
-- ����̸�, ����, �޿������ ����϶�. �׸��� �� ��µ�
-- ������� �μ���ȣ�� ���� ������, ������ ���� ������
-- �����϶�.
SELECT e.DEPTNO, d.DNAME, e.ENAME, e.sal, s.GRADE
FROM emp e join dept d on  e.DEPTNO = d.DEPTNO
           join salgrade s on e.SAL BETWEEN s.losal and s.hisal
where e.DEPTNO = 10 or e.DEPTNO = 20
order by e.DEPTNO, e.sal desc;
 
 SELECT E.DEPTNO, D.DNAME, E.ENAME, E.SAL, S.GRADE
FROM EMP E  join DEPT D on E.DEPTNO=D.DEPTNO
            join SALGRADE s on E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE  E.DEPTNO<=20 --WHERE E.DEPTNO IN (10,20)  -- e.deptno = 10 or 
ORDER BY E.DEPTNO ASC,  E.SAL DESC;
 
 
-- 9. �����ȣ�� ����̸�, �׸��� �� ����� �����ϴ� ��������
-- �����ȣ�� ����̸��� ����ϵ� ������ �÷����� '�����ȣ',
-- '����̸�', '�����ڹ�ȣ', '�������̸�'���� �Ͽ� ����϶�.
--SELF JOIN (�ڱ� �ڽ����̺��� �÷��� ���� �ϴ� ���)
SELECT e.empno as "�������̸�", e.ename as "�������̸�", m.EMPNO as "�����ȣ", m.ENAME as "����̸�"  
FROM emp e left outer join emp m
on e.mgr = m.Empno;

SELECT E.EMPNO, E.ENAME , M.EMPNO, M.ENAME
FROM EMP E  left outer join EMP M
on e.MGR = m.EMPNO;


--[subquery] ����Ŭ.pdf (100page)
--sql �� �̶� �θ��� >> sql�� ���� �ذ��

--������̺��� ������� ��� ���޺��� �� ���� �޿��� �޴� ����� ���, �̸�, �޿��� ���

--����
select avg(sal) from emp; -- 2073
--����
select *
from emp where sal >2073;

select empno, ename, sal
from emp
where SAL > (select avg(sal) from emp);

--------------------------------------------------------------------------------
--���� �ۼ� ����
--�Լ� >> ���� >> subquery(������ ����)
/*
subquery
����
1. single row subquery : ���������� ����� 1���� row(������) : �Ѱ��� �� (���� �÷�)

2. multi row subquery : ���������� ����� 1�� �̻��� row(������) : �������� �� (�����÷�)

�����ϴ� ����(���Ǵ� �����ڰ� ����)
--������ (in, not in) any, all) >>���� ������
--multi row
--all : sal > 1000 and sal > 2000 and....
--any : sal > 1000 or sal > 2000 or.....

����(����)
1.subquery�� ��ȣ�ȿ� �־�� �Ѵ� > (select sal from emp)
2.subquery�� ���� �÷����� ���� > (select sal, deptno from emp)>>(x)
3.subquery�� �ܵ����� ���డ���ؾ� �Ѵ�.

subquery�� ������ �ִ� sql����
1.subquery ���� ����
2.subquery�� ������� ������ main ������ ����ȴ�
*/

--������̺��� jones�� �޿����� �� ���� �޿��� �޴� ����� ���, �̸�, �޿��� ����ϼ���

select sal from emp
where ename = 'JONES'; --2975

select empno, ename, sal
from emp
where sal>(select sal from emp where ename = 'JONES'); --2975;

select *
from emp
--where sal = (select sal from emp where sal>2000);
where sal in (select sal from emp where sal>2000);
--where sal = 2975 or sal = 2850 or sal = 2450 or sal=3000 or sal = 5000

select *
from emp
where sal not in (select sal from emp where sal>2000);
--where sal != 2975 and sal != 2850 and sal != 2450 and != ........

--���������� �ִ� ����� ����� �̸��� ����ϼ���
select *
from emp
where empno in(select mgr from emp);
--empno = 7839 or empno = 7566 or empno is null or ...
--or �����ڿ��� null(x)

--���������� ���� �ڿ��� ����� �̸��� ����ϼ���
select *
from emp
where empno not in (select nvl(mgr,0) from emp);
--enpno !=7839 and empno!=7566 and empno is null and....>>������� null

--king ���� �����ϴ� �� ���ӻ���� king �� ����� ���, �̸�, ����, ������ ����� ����ϼ���
select empno from emp
where ename = 'KING';--7839

select empno, ename, job, mgr
from emp where mgr = (select empno from emp where ename = 'KING');

--20�� �μ��� ����߿��� ���� ���� �޿��� �޴� ������� �� ���� �޿��� �޴� �����
--���, �̸�, �޿�, �μ���ȣ�� ����ϼ���

select max(sal) from emp where deptno = 20;

select *
from emp
where sal > (select max(sal) from emp where deptno = 20);

--�����Լ��� subquery Ȱ��....
select *
from emp
where deptno in (select deptno from emp where job='SALESMAN')
and sal in(select sal from emp where job = 'SALESMAN');

--QUIZ) ��ǰ : 15�� >> hint 5�� >> hint 5�� (3��)
--�߱�
/*
�ڱ� �μ��� ��� ���޺��� �� ���� ������ �޴� ����� ��� �̸� �μ���ȣ �μ��� ��� ������ ����ϼ���
*/
SELECT deptno, avg(sal) FROM emp group by deptno;

select e.empno, e.ename, e.deptno, e.sal, trunc(e1."��տ���",0)
from emp e join (SELECT deptno, avg(sal)as "��տ���" FROM emp group by deptno) e1
on e.deptno = e1.deptno
where e.sal > e1."��տ���";


--1. 'SMITH'���� ������ ���� �޴� ������� �̸��� ������ ����϶�.
SELECT sal FROM emp where ename = 'SMITH';

select ename, sal
from emp
where sal > (SELECT sal FROM emp where ename = 'SMITH');
 
--2. 10�� �μ��� ������ ���� ������ �޴� ������� �̸�, ����,
-- �μ���ȣ�� ����϶�.
select sal from emp where deptno = 10;

select ename, sal, deptno
from emp
where sal in(select sal from emp where deptno = 10);
 
--3. 'BLAKE'�� ���� �μ��� �ִ� ������� �̸��� ������� �̴µ�
-- 'BLAKE'�� ���� ����϶�.
select deptno from emp where ename = 'BLAKE'; 

select * 
from emp
where deptno = (select deptno from emp where ename = 'BLAKE')
      and ename != 'BLAKE';


--4. ��ձ޿����� ���� �޿��� �޴� ������� �����ȣ, �̸�, ������
-- ����ϵ�, ������ ���� ��� ������ ����϶�.
SELECT avg(sal) FROM emp;

select empno, ename, sal
from emp
where sal > (SELECT avg(sal) FROM emp); 

 
--5. �̸��� 'T'�� �����ϰ� �ִ� ������ ���� �μ����� �ٹ��ϰ�
-- �ִ� ����� �����ȣ�� �̸��� ����϶�.
select deptno from emp where ename like '%T%';

select empno, ename
from emp
where deptno in (select deptno from emp where ename like '%T%');

--6. 30�� �μ��� �ִ� ����� �߿��� ���� ���� ������ �޴� �������
-- ���� ������ �޴� ������� �̸�, �μ���ȣ, ������ ����϶�.
--(��, ALL(and) �Ǵ� ANY(or) �����ڸ� ����� ��)
select max(sal) from emp where deptno = 30;
 
 select ename, empno, deptno, sal
 from emp
 where sal > all (select sal from emp where deptno = 30);
 
--7. 'DALLAS'���� �ٹ��ϰ� �ִ� ����� ���� �μ����� ���ϴ� �����
-- �̸�, �μ���ȣ, ������ ����϶�.
select e.ename, e.deptno, e.job 
from emp e join dept d on e.DEPTNO = d.DEPTNO
where d.LOC = 'DALLAS';


--8. SALES �μ����� ���ϴ� ������� �μ���ȣ, �̸�, ������ ����϶�.
select e.ename, e.deptno, e.job 
from emp e join dept d on e.DEPTNO = d.DEPTNO
where d.dname = 'SALES';

select * from dept;
 
--9. 'KING'���� �����ϴ� ��� ����� �̸��� �޿��� ����϶�
--king �� ����� ��� (mgr �����Ͱ� king ���)
SELECT e.ename, e.sal
FROM emp e left outer join emp m 
on e.mgr = m.EMPNO
where m.ename = 'KING';

 
--10. �ڽ��� �޿��� ��� �޿����� ����, �̸��� 'S'�� ����
-- ����� ������ �μ����� �ٹ��ϴ� ��� ����� �����ȣ, �̸�,
-- �޿��� ����϶�.
select avg(sal) from emp;

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT AVG(SAL)FROM EMP)
AND DEPTNO IN(SELECT DEPTNO FROM EMP WHERE ENAME LIKE '%S%');

 
--11. Ŀ�̼��� �޴� ����� �μ���ȣ, ������ ���� �����
-- �̸�, ����, �μ���ȣ�� ����϶�.
select deptno from emp where comm is not null;


select *
from emp
where deptno in (select deptno from emp where comm is not null)
and  sal in (select sal from emp where  comm is not null);

--12. 30�� �μ� ������ ���ް� Ŀ�̼��� ���� ����
-- ������� �̸�, ����, Ŀ�̼��� ����϶�.
select sal from emp where deptno = 30;
select comm from emp where deptno = 30;

select *
from emp
where sal not in(select sal from emp where deptno = 30)
and   comm not in(select nvl(comm,0) from emp where deptno = 30);

--------------------------------------------------------------------------------
--[INSERT, UPDATE, DELETE]
/*
����Ŭ ����
DDL(������ ���Ǿ�) : create, alter, drop, (rename, modify)
DML(������ ���۾�) : insert, update, delete
DQL(������ ���Ǿ�) : select
DCL(������ �����) : ����(grant, revoke)
TCL(Ʈ������) : commit, rollback, savepoint

*/
--DML �۾�
--Ʈ������ (transection) : �ϳ��� ������ �۾� ����
--����������...(A��� ���¿��� ���� ���� B��� ���¿� ��ü)
--[A ��� ------------------- B ��ü]�ϳ��� ���� : ��� > ����, ����
--commit(A ~ B ���ܾ��� ����Ǹ�), rollback(A ~ B ������ ���� �߻��ϸ�)

/*
A��� ���� (100���� ���) : update .....
...
...
B��� ���� (100���� �Ա�) : update ....
*/

--���̺� �⺻ ����
desc emp;
--����Ŭ (system table ���ؼ� �پ��� ���� ����)
select * from tab; -- ���� ������ ���� (bituser) ���� �ִ� ���̺� ���

select * from tab where TNAME = 'BOARD'; --���Ժ� ���� ���� �������� Ȯ��

select * from col; --bituser ����ڰ� �����ϴ� ��� Į�� ����

select * from col where tname = 'EMP'; --Ư�� ���̺��� ������ �÷� ����

select * from user_tables; --������, Ʃ�� ����...
select * from user_tables where table_name = 'DEPT';
--------------------------------------------------------------------------------
--DML(����Ŭ.pdf > 168Page)

/*
INSERT INTO table_name [(column1[, column2, . . . . . ])] 
VALUES  (value1[, value2, . . . . . . ]); 
*/

--���Ἲ : 
create table temp(
id number primary key, -- id �÷��� null(x), �ߺ�������(x), ������ ������ 1�� ���� : where id = 10 -> ������ �Ѱ�
name varchar2(20) -- default null ���
);

--1.���� �Ϲ�����....
insert into temp(id, name)
values(100,'ȫ�浿');

select * from temp;
--�ݿ�
commit;

--2. �÷� ����Ʈ ���� (temp(id, name) > temp ���� >> ��� �÷��� ������ ���Խ�
insert into temp -- �÷�����Ʈ ����
values(200,'������');

select * from temp;
commit;

--1. error
insert into temp(id, name)
values (100, '�ƹ���');
--unique constraint (BITUSER.SYS_C007004) violated --> pk ���� ����

insert into temp(name)
values ('�ƹ���');
--cannot insert NULL into ("BITUSER"."TEMP"."ID") -> pk null �� �ȵǿ�

--------------------------------------------------------------------------------
--insert ������ �������
--�Ϲ� SQL�� ��� �����

--���^^
--pl-sql
create table temp2(id varchar2(20));

/*
BEGIN
FOR i IN 1..1000 LOOP
insert into temp2(id) values('A'|| to_char(i));
END LOOP;
END;
*/
select * from temp2 order by id;
--------------------------------------------------------------------------------
create table temp3(
memberid number(3) not null,
name varchar2(10), --null ���
regdate date default sysdate --�⺻�� �����ϱ� (insert ���� �⺻������ ���� ��¥ ����)
);

select sysdate from dual;

insert into temp3(memberid, name, regdate)
values(100,'ȫ�浿','2018-03-02');


select * from temp3;


--Ư�� �÷��� ������ �ֱ�
insert into temp3(memberid,name)
values(200,'�ƹ���'); --default �� ���� (regdate �÷� >> sysdate ���� insert)

select * from temp3;
commit;

insert into temp3(memberid)
values(300);

select * from temp3;
commit;
--------------------------------------------------------------------------------
--�ɼ� TIP)
--1. �뷮 ������ insert �ϱ�
delete temp5;
create table temp4(id number);
create table temp5(num number);

insert into temp4(id) values(1);
insert into temp4(id) values(2);
insert into temp4(id) values(3);
insert into temp4(id) values(4);
insert into temp4(id) values(5);
insert into temp4(id) values(6);
insert into temp4(id) values(7);
insert into temp4(id) values(8);
insert into temp4(id) values(9);
insert into temp4(id) values(10);

commit;

select * from temp4;

--�䱸���� : temp4 ���̺� �ִ� ��� �����͸� temp5 �� �ְ� �;��
--insert into ���̺��(�÷�����Ʈ) select ���� (values ���� ��ſ�)
--�� �÷����� Ÿ���� ��ġ �Ѵٸ�.....

insert into temp5(num)
select id from temp4;
--values
select *from temp5;
commit;


--2.Insert
--���̺��� ���� ��Ȳ���� [���̺� �ڵ�����][�뷮 ������ ����]
--�� ���� ������ ���簡 �ȵǿ�(PK, FK...)

--emp���̺�� ���� ������ ������ ���� �����͸� ���� �ǽ� ���̺�
create table copyemp
as
select * from emp;

select *from copyemp;
--
create table copyemp2
as
select empno,ename,job,sal from emp where deptno=30;

--����) ����(Ʋ)�� �����ϰ� �����ʹ� �����ϰ� ���� �ʾƿ�
create table copyemp3
as
select * from emp where 1=2;

delete copyemp3;

select * from copyemp3;

--���� ���� (����)
--�ý��� �����͸� ��� (���� ���� Ȯ���ϱ�)
select * from user_constraints where table_name = 'EMP';
select * from user_constraints where table_name = 'COPYEMP';

create table pktest (id number primary key);
insert into pktest(id) values(100);
commit;

create table pktest2
as
select * from pktest;

select * from pktest;
select * from pktest2;
select * from user_constraints where table_name = 'PKTEST'; --���������� ����
select * from user_constraints where table_name = 'PKTEST2'; --���������� ���簡 �ȵ�
--------------------------------------------------------------------------------
--------------------------------[INSERT END]------------------------------------
--UPDATE
/*
UPDATE  table_name 
SET  column1 = value1 [,column2 = value2, . . . . . . .] 
[WHERE  condition];

UPDATE  table_name 
SET  (column1, column2, . . . . ) =       ( SELECT  column1,column2, . . .     
                                            FROM   table_name    
                                            WHERE  coundition) [WHERE  condition]
*/
commit;
select * from copyemp;

update copyemp
set sal = 0;

rollback;
select * from copyemp;

update copyemp
set job='NOT....'
where deptno = 20;

select * from copyemp 
order by deptno;
rollback;

--update (subquery ���) : ������ ����)
update copyemp
set sal = (select sum(sal) from emp);

select * from copyemp;
rollback;

alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';
update copyemp
set ename = 'AAAA', job='BBBB', hiredate = sysdate
where deptno = 10;

select * from copyemp where deptno = 10;
----------------------[UPDATE] END----------------------------------------------
--[DELETE]

delete from copyemp;

select * from copyemp;

rollback;

delete from copyemp where deptno = 20;

select * from copyemp where deptno = 20;

rollback;

-------------------[DELETE END]-------------------------------------------------

/*
APP(JAVA)  --------> JDBC API --------> ORACLE
CRUD�۾�
--Create : insert
--Read : select(��ü��ȸ, ������ȸ (row 1��)
--Uudate : update
--Delete : delete
(Create, Update, Delete) Ʈ������� ����(commit, rollback)

--��ü ��ȸ, ����, ����, ���� (������)
--�Լ� �ּ� 5��
--public List<Emp> getEmpList<>(){ �ȿ� ������ select * from emp)
--public Emp getEmpListByEmpno(int empno){select...)
--public int insertEmp(Emp emp){insert into emp(...)

�� �۾� : JDBC
*/
--------------------------------------------------------------------------------
--[DDL] create, alter, drop (���� ���̺�)
select * from user_tables where lower(table_name) = 'board';


drop table board;

create table board(
 boardid number,
 title varchar2(50),
 content varchar2(2000),
 regdate date
);

desc board;

--���ϱ� ��� �Ʒ� 2�� ����.............
select * from user_tables where lower(table_name) = 'board';
select * from user_constraints where lower(table_name) = 'board';

--Oracle 11g �����÷�(���� �÷�)
--�л����� : ����, ����, ����, ���� �÷��� �־��
--����, ����, ���� �����͸� insert �Ǹ� (���� + ���� + ����) �ڵ�ȭ

delete vtable;
create table vtable(
 no1 number,
 no2 number,
 no3 number GENERATED ALWAYS as (no1 + no2) VIRTUAL
);

insert into vtable (no1, no2) values(100, 50);
insert into vtable (no1, no2) values(80, 80);

select * from vtable;

--no3 �÷��� ������ ���� ���� �� ���� ���
--insert into vtable(no1, no2, no3) values(80, 60, 200);--x

select COLUMN_NAME, DATA_TYPE, DATA_DEFAULT
from user_tab_columns where table_name = 'VTABLE';

--�ǹ��� ���Ǵ� ������ �ڵ�
--��ǰ���� (�԰���) �������� �бⵥ���� (4�б�)
--�԰��� : 2018 - 03 - 02 >> 1�б�
create table vtable2(
no number, --����
p_code char(4), --��ǰ�ڵ�(A001, B002..)
p_date char(8), --�԰���(20180202)
p_qty number, --����
p_bungi number(1) -- ���� �÷�
        GENERATED ALWAYS as (
        CASE WHEN substr(p_date,5,2) IN ('01','02','03')THEN 1
             WHEN substr(p_date,5,2) IN ('04','05','06')THEN 2
             WHEN substr(p_date,5,2) IN ('07','08','09')THEN 3
             ELSE 4
        END
        )VIRTUAL

);

insert into vtable2  (p_date) values('20180101');
insert into vtable2  (p_date) values('20180126');
insert into vtable2  (p_date) values('20180403');
insert into vtable2  (p_date) values('20181101');
insert into vtable2  (p_date) values('20181201');

select * from vtable2;
--------------------------------------------------------------------------------
--DDL ���̺� �ٷ�� ...(��������)...
--����Ŭ.pdf (140 Page)

--1. ���̺� �����ϱ�
create table temp6(id number);

--2.���̺� �����ߴµ� �÷� �߰��ϱ�
--���� ���̺� �÷� �߰��ϱ�
desc temp6;

alter table temp6
add ename varchar2(20);
desc temp6;

--3. ���� ���̺� �ִ� �÷��� �̸� �߸� ǥ��(ename -> username)
--���� ���̺� �ִ� �÷��� �̸� �ٲٱ� (rename)
alter table temp6
rename column ename to username;

desc temp6;

--4. ���� ���̺� �ִ� ���� �÷��� Type ����
--(modify)
alter table temp6
modify(username varchar2(200));

desc temp6;

--5. ���� ���̺� �ִ� ���� �÷� ����
alter table temp6
drop column username;
desc temp6;

--6. ���̺� ������ ���� : delete
--���̺� ó�� ����� ó�� ũ�� >> ������ ������ >> ������ ũ��
--ex)ó�� 1M >> 10���� >> 100M >> 10���� delete >> ���� ���̺� ũ�� 101M
--���̺� ������ ����, ������ ũ�⸦ ���� �� ������
--truncate (where ���� ��� ���ؿ�)
--ex)ó�� 1M >> 10���� >> 100M >> 10���� truncate >> ���� ���̺� ũ�� 1M

drop table temp6;

desc temp6;
--------------------------------------------------------------------------------
--[���̺� ���� �����ϱ�]
--����Ŭ.pdf (144)
--�����ͺ��̽� ���Ἲ Ȯ��
--���� (constraint) : insert, update �ַ� ����

/*
*NOT NULL(NN) ���� NULL ���� ������ �� �����ϴ�. 

*UNIQUE key(UK) ���̺��� ��� ���� �����ϰ� �ϴ� ���� ���� ��(NULL �� ���)
--unique ������ null ���� ���� �� �ִ� >> null ���� �������� �ҷ��� (not null ����)

*PRIMARY KEY(PK) �����ϰ� ���̺��� ������ �ĺ�(NOT NULL �� UNIQUE ������ ����) 
--not null �ϰ� unique �� ���� (���������� index �� �ڵ� ����)
index �˻��ӵ�(�� ������ ����)�� ������ ����(exå �ǵ� -> ã�ƺ���) ->insert delete update ���� select��!!

*FOREIGN KEY(FK) ���� ������ �� ������ �ܷ�Ű ���踦 �����ϰ� �����մϴ�. 
(��������) [���̺�]�� [���̺�]���� ���� ����

*CHECK(CK) ���̾�� �ϴ� ������ ������(��κ� ���� ��Ģ�� ����) 
������ ���� ���� ���� �Է¹ްڴ� (gender : �÷��� '��' �Ǵ� '��' ��� �����͸� �Է�)
ex)where gender in('��','��')

������ ����� ����
1.���̺� ����鼭 �ٷ� ���� (creat table...)
2.���̺� ���� ���� (alter table... add constraint...) >> �ڵ� ���� ��(exerd)
*/

select * from user_constraints where table_name='EMP';
----------------------------------------------------------

create table temp7
(
  --���� ǥ��
  --id number primary key, --�������� �ʾƿ�  -- ������ �̸��� �ڵ� ���  >> SYS_C006997(�����̸�)
  id number constraint pk_temp7_id primary key, --������ ǥ�� : pk_���̺��_�÷���
  name varchar2(20) not null,
  addr varchar2(50)
);

select * from user_constraints where table_name='TEMP7';

insert into temp7 (name, addr) values('ȫ�浿','����� ������'); --(x)

insert into temp7 (id , name, addr) values(10, 'ȫ�浿','����� ������'); --(0)

insert into temp7 (id , name, addr) values(10, '������','����� ������'); -- �ߺ�Ű�� error

commit;
-----------------------------------------------------------------
create table temp8
(
  id number constraint pk_temp8_id primary key , --PK�� ���̺� �� �Ѱ�(�ߺ�Ű ���� :  ��� �Ѱ�)
  name varchar2(20) not null,
  jumin char(6) constraint uk_temp8_jumin unique , -- null ���
  --jumin char(6) not null constraint uk_temp8_jumin unique (not null �ϰ� unique) �� ����
  addr varchar2(20)
);

select * from user_constraints where table_name='TEMP8';

insert into temp8(id,name,jumin, addr)
values(10,'ȫ�浿','123456','��⵵');

commit;

select * from temp8;
insert into temp8(id,name,jumin, addr)
values(100,'������','123456','��⵵'); --
--unique constraint (BITUSER.UK_TEMP8_JUMIN) violated

insert into temp8(id, jumin) values(200,'223456'); --���� �߻�

--null �� ����ұ�� ^^
select * from temp8;
insert into temp8(id,name,addr) values(200,'235467','����� ������'); 

------------------------------------------------------------------------

--------------------------------------------------------------------------------
--���̺� ���� �Ŀ� ���� �ɱ�
create table temp9 (id number);
--���� ���̺� ���� �߰��ϱ�
--����)�Էµ� �����Ͱ� �ִٸ� >> 10, 10 �ΰ�, pk ����(x) >>������ ����>>����
alter table temp9
add constraint pk_temp9_id primary key(id);

select * from user_constraints where table_name = 'TEMP9';

select * from temp9;

alter table temp9
add ename varchar2(20);
--���̺� �⺻ ����
desc temp9;
--���̺� ���� ����
select * from user_constraints where table_name = 'TEMP9';

--not null ���� �߰��ϱ�
alter table temp9
modify(ename not null);

desc temp9;
--------------------------------------------------------------------------------
--[check]
--where ���� �� ������ ���� >> where gender in('��','��')
create table temp10(
id number constraint pk_temp10_id primary key, --pk�� ���̺�� 1��(��� �Ѱ�)
name varchar2(20) not null,--�ʼ� �Է�
jumin char(6) constraint uk_temp10_jumin unique, --�ʿ��ϴٸ� not null �߰�����
addr varchar2(20), --�߰� �Է�
age number constraint ck_temp10_age check(age >=19)
);
desc temp10;
select * from user_constraints where table_name = 'TEMP10';

insert into temp10(id,name,jumin,addr,age)
VALUES(100,'ȫ�浿','123456','����� ������', 25);

select * from temp10;

insert into temp10(id,name,jumin,addr,age)
VALUES(200,'ȫ�浿','123457','����� ������', 25);

insert into temp10(id,name,jumin,addr,age)
VALUES(300,'ȫ�浿','123458','����� ������', 18); --check(x)

commit;

select * from temp10;

--------------------------------------------------------------------------------
--[��������]>>���̺�� ���̺���� ���� >> ���� (RDB)
create table c_emp
as
  select empno, ename,deptno from emp where 1=2;

create table c_dept
as
  select deptno, dname from dept where 1=2;

SELECT * FROM c_emp;
select * from c_dept;

--����Ű (c_emp(deptno)fk -> c_dept(deptno) �÷��� �����ϵ���...
--������ ���ҷ��� [������ ���� �� ����] >> �ſ� >> �ּ��� unique �Ǵ� primary key Ȯ��
--2�� ����)
alter table c_emp
add constraint fk_emp_deptno foreign key(deptno)references c_dept(deptno);

--����(c_dept (deptno) pk �ɰ�
--�׸��� c_emp (deptno) ����

--1�� ����)
alter table c_dept
add constraint pk_dept_deptno primary key(deptno);

insert into c_dept(deptno, dname) values(100,'�λ���');
insert into c_dept(deptno, dname) values(200,'������');
insert into c_dept(deptno, dname) values(300,'ȸ����');
commit;

select * from c_dept;
SELECT * FROM c_emp;

--��� �Ի� (�μ� ������ �ʰ�)
insert into c_emp(empno, ename)
VALUES(100,'ȫ�浿');--[k not null�� �������� �ʾƿ� (null)

select * from c_emp;

insert into c_emp(empno, ename, deptno) --���� (�μ��� 100,200,300)�� ���µ� 500 ����
VALUES(200,'������',500);--(x)

insert into c_emp(empno, ename, deptno) 
VALUES(200,'������',300);

select * from c_emp;
SELECT * FROM c_dept;
--deptno ��� ���迡�� (c_dept(�θ�:master) - c_emp(�ڽ�:detail))
commit;

delete from c_dept where deptno = 300;--(x) c_emp�� �����ϰ� �־
delete from c_dept where deptno = 200;--(o)
--300�� ���� >> �����ϰ��ִ� �� (c_emp ���� �����ϰ�)>>c_dept >> 300���μ� ����
--------------------------------------------------------------------------------
--����Ŭ.pdf 
/*
(column datatype [CONSTRAINT constraint_name]       
REFERENCES table_ name (column1[,column2,..] [ON DELETE CASCADE]) 

column datatype, . . . . . . . , 
[CONSTRAINT constraint_name] FOREIGN KEY (column1[,column2,..])        
REFERENCES table_name  (column1[,column2,..] [ON DELETE CASCADE]) 
*/
--[ON DELETE CASCADE] �θ����̺�� ������ ���� �ϰڴ�.
--300 ���� �� �� �ֳ���? ��
--delete from c_dept where deptno = 300;
--�����ϴ� �ڽ� ������ ���� ����
--delete from c_emp where deptno=300; ���� ����

alter table c_emp
add constraint fk_emp_deptno foreign key(deptno)references c_dept(deptno) ON DELETE CASCADE;
--------------------------------------------------------------------------------
--[���� END]---------------------------------------------------------------------

--QUIZ
--�л� ���� ���̺�
--�й��� �����ʹ� �ߺ��ǰų� NULL ���� ����ϸ� �ȵȴ�
--�̸� NULL ���� ������� �ʴ´�
--����
--����
--���� ���� �÷��� ���� Ÿ���̰� NULL ���� ���
--�� ���� �Է����� ������  default�� 0���� ���´�
--���� ,��� �÷��� �����÷�����(�����÷�) �����Ѵ�
--�а��ڵ�� �а� ���̺� �а��ڵ带 �����Ѵ�
--�й� , �̸� , ���� , ���� , ���� , ���� , ��� , �а��ڵ�

--�а� ���̺�
--�а��ڵ� �����ʹ� �ߺ��ǰų� NULL ���� ����ϸ� �ȵȴ�,
--�а��� �� null���� ������� �ʴ´�

--�а��ڵ� , �а���

--�׸��� select �����
--�й� , �̸�  ����, ��� , �а��ڵ� , �а��� �� ����ϼ���
drop table s_grade;
drop table department;

--�л� ���̺� ����
create table s_grade(
studentno number not null,
sname varchar2(10) not null,
korean number default 0,
english number default 0,
math number default 0,
score number GENERATED always as (korean + english + math) virtual,
avg number GENERATED always as ((korean + english + math)/3) virtual,
Deptno NUMBER
);

--�л���ȣ�� �⺻Ű�� ����
alter table s_grade
add CONSTRAINT pk_s_grade_studentno PRIMARY KEY(studentno);

--�л����̺� ������ ����
insert into s_grade (studentno, sname, korean, english, math,deptno)
VALUES(100,'������',10,20,30,100);
insert into s_grade (studentno, sname, korean, english, math, deptno)
VALUES(200,'�ڹν�',50,60,70,200);
insert into s_grade (studentno, sname, korean, english, math, deptno)
VALUES(300,'�����',30,40,50,300);

--�а� ���̺� ����
create table department(
deptno number not null,
dname varchar2(50) not null
);
insert into department (deptno, dname)
VALUES(100,'���а�');

insert into department (deptno, dname)
VALUES(300,'�����');

insert into department (deptno, dname)
VALUES(200,'�����');

select * from department;

--�а����̺� �а��ڵ带 �⺻Ű�� ����
alter table department
add CONSTRAINT pk_s_department_deptno PRIMARY KEY(deptno);

--�л����̺� �а��ڵ带 �ܷ�Ű�� ����
alter table s_grade
add constraint fk_s_grade_deptno foreign key(deptno)references department(deptno);--���߿� �ɰų�(���̺� ���� �Ŀ�)



SELECT * FROM s_grade;

delete from s_grade where studentno = 200;

select * from user_constraints where table_name = 'S_GRADE';
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--VIEW (�������̺�) ����Ŭ.pdf(192Page)
--�������̺�
--View ��ü (create...)
--create view ���̸� as view ���� ��� (select ����)
--view�� ���̺�ó�� ��� ���� (���� ���̺�) -> ���� emp, dept���� �������� ���̺��� �ƴϴ�
--view�� �޸𸮻󿡸� �����ϴ� ���� ���̺� (subquery -> in line view -> from (select...)
--view�� sql���� ���


--view ���� ���̺�
--���� : �Ϲ� ���̺�� ������ ���� from �� where...
--DML(insert, update, delete) -> view�� ���ؼ� DML ����->���� view�� ���� ���� �ִ� �������̺� ������ ����

--view ���
--�������� ���� (join, subquery) ���� ���� ��� (���� ���̺�)
--������ ���� �ܼ�ȭ
--���� (���� ���� ó��) -> �����ϰ� ���� �����͸� ��Ƽ� view ���� -> ����

create view v_001
as
  select empno,ename from emp;

select * from v_001;
select * from v_001 where empno = 7788;

create view v_002
as
select e.empno, e.ename, e.sal, e.deptno, d.dname
from emp e join dept d
on e.deptno = d.deptno; --������ ���� �ܼ�ȭ

create view v_003
as
select deptno, avg(sal) as avgsal
from emp
group by deptno;

select * from v_003;

select *
from emp e join v_003 s
on e.deptno = s.deptno
where e.sal > s.avgsal;

--���� ���ϴ� �����Ͱ� ���̺�� �����Ѵٸ�
--JOIN �ϱ� �����ٵ� >> in

/*
CREATE  [OR  REPLACE]  [FORCE | NOFORCE]  VIEW view_name [(alias[,alias,...])] 
AS Subquery  
[WITH  CHECK  OPTION  [CONSTRAINT  constraint ]] 
[WITH  READ  ONLY] 

OR  REPLACE  �̹� �����Ѵٸ� �ٽ� �����Ѵ�. 
FORCE   Base Table ������ ������� VIEW �� �����. 
NOFORCE  �⺻ ���̺��� ������ ��쿡�� VIEW �� �����Ѵ�. 
view_name  VIEW �� �̸� 
Alias   Subquery �� ���� ���õ� ���� ���� Column ���� �ȴ�. 
Subquery  SELECT ������ ����Ѵ�. 
WITH CHECK OPTION VIEW �� ���� �׼��� �� �� �ִ� �ุ�� �Է�,���ŵ� �� �ִ�.  
Constraint  CHECK OPTON ���� ���ǿ� ���� ������ �̸��̴�. 
WITH READ ONLY  �� VIEW ���� DML �� ����� �� ���� �Ѵ�. 
*/

--1.create or replace v_007 as ����.... (����,override)


create or replace view v_emp
as
  select empno, ename, deptno from emp where deptno = 20;

select * from v_emp;
SELECT * FROM v_emp where deptno = 10; --���� ����

--view ���� ���̺� >> DML (insert, update, delete....)
--view [����] �ٶ� �� �ִ� �����Ϳ� ���ؼ� DML ����
--���� ���̺� (DML) >> view�� ���ؼ�...

select * from v_emp;

delete from v_emp;
--�����δ� emp ���̺� >> deptno ��ȣ�� 20�� ����

select * from emp where deptno = 20;
rollback;

select * from v_emp;

--------------------------------------------------------------------------------

--1. 30�� �μ� ������� ����, �̸�, ������ ��� VIEW�� ������.

create view v_004
as
  select job, ename, sal from emp where deptno = 3;
 
 
--2. 30�� �μ� �������  ����, �̸�, ������ ��� VIEW�� ����µ�,
-- ������ �÷����� ����, ����̸�, �������� ALIAS�� �ְ� ������
-- 300���� ���� ����鸸 �����ϵ��� �϶�.
-- create or replace view view001 (�÷���, �÷���, .....)  

create view v_005(����, ����̸�, ����)
as
  select job, ename, sal
  from emp where sal > 300;

 
--3. �μ��� �ִ����, �ּҿ���, ��տ����� ��� VIEW�� ������.
create view v_006
as 
  select deptno, max(sal) as "�ִ����", min(sal) as "�ּҿ���", avg(sal) as "��տ���"
  from emp
  group by deptno;

select * from v_006;
       
--4. �μ��� ��տ����� ��� VIEW�� �����, ��տ����� 2000 �̻���
-- �μ��� ����ϵ��� �϶�.
create or replace view v_007
as
select deptno, avg(sal) as "��տ���"
from emp
group by deptno
having avg(sal) >= 2000 ;
 
select * from v_007;
 
--5. ������ �ѿ����� ��� VIEW�� �����, ������ MANAGER��
-- ������� �����ϰ� �ѿ����� 3000�̻��� ������ ����ϵ��� �϶�.

create view v_008
as
select job, sum(sal) as "�ѿ���"
from emp
group by job
having sum(sal) >= 3000 and job != 'MANAGER';

select * from v_008;


--------------------------------------------------------------------------------
/*
����Ŭ.pdf  185Page

������ ��ü 
���� ���� (ä����)
�ڵ����� ��ȣ�� �����ϴ� ��ü

CREATE  SEQUENCE  sequence_name  
[INCREMENT  BY  n]  
[START  WITH  n]  
[{MAXVALUE n | NOMAXVALUE}]  
[{MINVALUE n | NOMINVALUE}]  
[{CYCLE | NOCYCLE}]  
[{CACHE | NOCACHE}];

sequence_name  SEQUENCE �� �̸��Դϴ�. 
INCREMENT  BY  n ���� ���� n ���� SEQUENCE ��ȣ ������ ������ ����. 
�� ���� �����Ǹ� SEQUENCE �� 1 �� ����. 
START  WITH  n  �����ϱ� ���� ù��° SEQUENCE �� ����. 
�� ���� �����Ǹ� SEQUENCE �� 1 �� ����. 
MAXVALUE n  SEQUENCE �� ������ �� �ִ� �ִ� ���� ����. 
NOMAXVALUE   ���������� 10^27 �ִ밪�� ����������-1 �� �ּҰ��� ����. 
MINVALUE n  �ּ� SEQUENCE ���� ����. 
NOMINVALUE  ���������� 1 �� ����������-(10^26)�� �ּҰ��� ����. 
CYCLE | NOCYCLE  �ִ� �Ǵ� �ּҰ��� ������ �Ŀ� ��� ���� ������ ���� ���θ� 
    ����. NOCYCLE �� ����Ʈ. 
CACHE | NOCACHE  �󸶳� ���� ���� �޸𸮿� ����Ŭ ������ �̸� �Ҵ��ϰ� ���� 
    �ϴ°��� ����. ����Ʈ�� ����Ŭ ������ 20 �� CACHE.  

*/

--�Խ���
/*
create table board(
  hostid number primary key,
  title varchar2(50)....
);
boardid >> �ߺ���, null ���� (x)
������ : �����͸� insert �ߺ����� �ƴ϶�� �Ϳ� ���� ����...

where boardid = 10; �ϳ��� row�� return �ϴ� ���� ����

�Խ��ǿ� �۾���
insert into board (....) values(,'ȫ�浿','�氡�氡')

*/
create table kboard(
num number constraint pk_kboard_num primary key,
title varchar2(50)
);
--ó�� ���� ���� 1�̶�� ����, �״������� ���� ���� 2, 3, 4, �������� ����....
--JDBC : insert into kboard(num,tilte) values(7);

--ó���� >> 1
insert into kboard(num,title)
values((select count(num) + 1 from kboard),'ó��');
--������ >> 2,3,4...
insert into kboard(num,title)
values((select count(num) + 1 from kboard),'�ι�°');

insert into kboard(num,title)
values((select count(num) + 1 from kboard),'����°');

select * from kboard;
commit;
drop table kboard;
--DML �ۼ�
delete from kboard where num =1;

select * from kboard;

insert into kboard(num,title)
values((select count(num) + 1 from kboard),'�׹�°');

--delete ����....
--insert �ߺ�(pk) ����....
--------------------------------------------------------------------------------
drop table kboard;
commit;

--�ٸ� ���

insert into kboard(num,title)
values((select nvl(max(num),0) + 1 from kboard),'�׹�');

--------------------------------------------------------------------------------
--��ȣ�� ���� �ߺ����� �ȳ����� �������� ��
--------------------------------------------------------------------------------
--sequnce ��ü
create sequence board_num;

select * from user_sequences;
/*
1.4.1 NEXTVAL �� CURRVAL �ǻ翭
��) Ư¡ 
1) NEXTVAL �� ���� ��� ������ SEQUENCE ���� ��ȯ �Ѵ�. 
2) SEQUENCE �� ������ �� ����, �ٸ� ����ڿ��� ������ ������ ���� ��ȯ�Ѵ�. 
3) CURRVAL �� ���� SEQUENCE ���� ��´�. 
4) CURRVAL �� �����Ǳ� ���� NEXTVAL �� ���Ǿ�� �Ѵ�.   
*/

--��ü��
select board_num.nextval from dual;

--���簪...(ü�� ���� �ʰ� ������)
select board_num.currval from dual;

create table tboard(
  num number constraint pk_tboard_num primary key,
  title varchar2(50)
);

create sequence tboard_num;

select tboard_num.CURRVAL from dual; --ü���� ��� ���� ���� ����

insert into tboard(num, title) values(tboard_num.nextval,'�۾���');

select tboard_num.CURRVAL from dual;

select * from tboard;

delete from tboard where num = 5;

insert into tboard(num, title) values(tboard_num.nextval,'5�� ���� �� ����');

rollback;

--�ٽ� insert �ϸ� �� ��ȣ�� (sequence rollback �Ǵ� �ڿ��� �ƴϿ���)

--�Խ���(10��)
--��ǰ �Խ���, ������ �Խ���, ȸ�� �Խ���.....)
--���̺� 10�� ������ sequence ��ü �ϳ��� ����ص� �ȴ�...
--TIP
--ms-sql : create table board(boardnum int identity(1,1) , title varchar(20))
--         insert into board(title) values('����')

--2012 �������� : ����Ŭ ó�� sequence

--my-sql : create table board(board num int auto_increment,title carchar(20))
--         insert into board(title) values('����')

create sequence seq_num
start with 10
increment by 2;

select seq_num.nextval from dual;
select * from user_sequences;

--����Ŭ sequence
--100�� insert -> sequence -> 100�� ü�� -> 50�� ���� -> insert �ϸ� 101�� ����
--1,2,3,4,5,6......50,101 > 51��

--��ȸ (�Խ���)
--�ֽű��� ����....���߿� �� ���� ����
--�۹�ȣ (����)

--�ֽűۼ����� ���� �ּ���
--select * from board order by boardnum desc;

--       (ȭ�� ���)
--101  --51
--50   --50
--49   --49
--48.....
--------------------------------------------------------------------------------
--������(sequence, rownum)
--rownum �ǻ��÷� : ���� ���������� �����ϴ� �÷��� �ƴϰ� ������ ����

--ROWNUM : ������ ���̺� �������� �ʴ� �÷�(�� ��ȣ �ο�)
--ROWID  : �ּҰ� (���� ������ ����Ǵ� ���� �ּҰ�) > �ε��� ����� ���� ���....

select empno, ename from emp;

select rownum as ����, empno from emp;

--Top-n ����
--���̺��� ���ǿ� �´� ����(TOP) ���ڵ忡 n�� ���� ...
--�ٰ� : ���� (����)

--ms-sql : select top 10 --> select top 10,* from emp order by sal desc;

--oracle : rownum (ġ���÷�) : ������ �ʿ��ϴ�

--1. ���������� �����
--2. ������ ������ �ο��ϰ� ������ ����

--1�ܰ�
select e.*
from(
     select *
     from emp order by sal desc
     ) e;
--2�ܰ�
select rownum, e.*
from(
     select *
     from emp order by sal desc
     ) e
where rownum <= 10;

--------------------------------------------------------------------------------
select * 
from 
(
  select  rownum as n ,e.*
  from (
            select *
            from emp order by sal desc
           ) e
) n 
where  n  > 10;

-----------------------------
--select e.*
--from (
--          select rownum as n , empno , sal
--          from emp order by sal desc
--         ) e 


select rownum as n , empno , sal  --2
from emp                                        --1
order by sal desc;                          --3

select  e.*      --select �� ����� ������ ���̴� ��
from (
                select empno, sal from emp
                order by sal desc
        ) e
where  rownum  <  5 ; --�������� ó�� ���� ������  ũ�ٴ� ǥ�� (rownum �ٽ� ����)

--------------------------------------------------------------------------------
--�Խ��� (����¡ ó�� ����)
--100��(row)

--�� 100��
--pagesize = 10 ���� (ȭ�� ���������� �� �� �ִ� ������ �Ǽ� 10��)
--�Ǽ�/pagesize > page���� > 10
--pagecount => 10ro
--1~100
/*
  1~10        11~20         ....       91~100
  1page       2page                    10page
*/
--------------------------------------------------------------------------------
--HR ��������....
select * from employees;

select *
from(
          select rownum  num, e.*
          from(
              select * from employees order by employee_id asc
              ) e
          where rownum <= 50
     )s
     where num >= 40;

--1 ~ 10,     11 ~ 20,    21 ~ 30,     31 ~ 40,    41 ~ 50
--                                                 5�� ������
select *
from(
          select rownum  num, e.*
          from(
              select * from employees order by employee_id asc
              ) e
          where rownum <= 10
     )s
     where num > 0;  
     
--between A and B > where rownum between 10 and 20
--------------------------------------------------------------------------------
--SQL 1�� �н� END
--------------------------------------------------------------------------------

--SQL 2�� �н� (3�� ������Ʈ ��)
--row���� (����)
--PL-SQL
--����, ���, Ŀ��, �Լ�, ���ν���, Ʈ����, ������
    
--------------------------------------------------------------------------------
--1> �μ����̺��� ��� �����͸� ����϶�.
select * from dept;
 
--2> EMP���̺��� �� ����� ����, �����ȣ, �̸�, �Ի����� ����϶�.
select job, empno, ename, hiredate from emp; 
--3> EMP���̺��� ������ ����ϵ�, �� �׸�(ROW)�� �ߺ����� �ʰ�
-- ����϶�.
select DISTINCT job from emp; 
 
--4> �޿��� 2850 �̻��� ����� �̸� �� �޿��� ����϶�.
 select ename, sal
 from emp
 where sal >= 2850;
 
--5> �����ȣ�� 7566�� ����� �̸� �� �μ���ȣ�� ����϶�.
select ename, deptno from emp
where empno = 7566; 
 
--6> �޿��� 1500�̻� ~ 2850������ ������ ������ �ʴ� ��� ����� �̸�
-- �� �޿��� ����϶�.
select ename, SAL
from emp
where sal<1500 or sal>2850;
 
--7> 1981�� 2�� 20�� ~ 1981�� 5�� 1�Ͽ� �Ի��� ����� �̸�,���� �� 
--�Ի����� ����϶�. �Ի����� �������� �ؼ� ������������ �����϶�.

select ename, job, hiredate from emp
where hiredate between '1981-02-20' and '1981-05-01';

 
--8> 10�� �� 30�� �μ��� ���ϴ� ��� ����� �̸��� �μ� ��ȣ��
-- ����ϵ�, �̸��� ���ĺ������� �����Ͽ� ����϶�.
select * from emp
where deptno in(10,30)
order by ename;
--9> 10�� �� 30�� �μ��� ���ϴ� ��� ��� �� �޿��� 1500�� �Ѵ�
-- ����� �̸� �� �޿��� ����϶�.
--(�� �÷����� ���� employee �� Monthly Salary�� �����Ͻÿ�)
select ename as "employee", sal as "Monthly Salary" 
from emp
where deptno in(10,30) and sal >= 1500;

 
--10> �����ڰ� ���� ��� ����� �̸� �� ������ ����϶�.
select ename, job from emp
where mgr is null;
 
--11> Ŀ�̼��� �޴� ��� ����� �̸�, �޿� �� Ŀ�̼��� ����ϵ�, 
-- �޿��� �������� ������������ �����Ͽ� ����϶�.
SELECT ename, sal, COMM FROM emp
where comm is not null
order by sal desc;

 
--12> �̸��� �� ��° ���ڰ� A�� ��� ����� �̸��� ����϶�.
select * from emp
where ename like '__A%';

 
--13> �̸��� L�� �� �� ���� �μ� 30�� �����ִ� ����� �̸��� 
--����϶�.
select ename from emp
where ename like '%L%L%' and deptno = 30;
 
--14> ������ Clerk �Ǵ� Analyst �̸鼭 �޿��� 1000,3000,5000 �� 
-- �ƴ� ��� ����� �̸�, ���� �� �޿��� ����϶�.
 select * from emp
 where job = 'CLERK' or job = 'ANALYST'
 and sal not in(100,3000,5000);
 
 
 
--15> �����ȣ, �̸�, �޿� �׸��� 15%�λ�� �޿��� ������ ǥ���ϵ� 
--�÷����� New Salary�� �����Ͽ� ����϶�.
select empno, ename, sal, sal+(sal*0.15) as "new salary" from emp;

 
--16> 15�� ������ ������ ����Ÿ���� �޿� �λ��(�� �޿����� ���� 
-- �޿��� �� ��)�� �߰��ؼ� ����϶�.(�÷����� Increase�� �϶�). 
select empno, ename, sal, sal+(sal*0.15) as "new salary",(sal+(sal*0.15))-sal as "increase" 
from emp; 
 
 
--18> ��� ����� �̸�(ù ���ڴ� 
-- �빮�ڷ�, ������ ���ڴ� �ҹ��ڷ� ǥ��) �� �̸� ���̸� ǥ���ϴ�
-- ������ �ۼ��ϰ� �÷� ��Ī�� ������ �־ ����϶�.
 select initcap(ename) as "�빮�ڴ�" , length(ename) as "���̴�" from emp;
 
--19> ����� �̸��� Ŀ�̼��� ����ϵ�, Ŀ�̼��� å������ ���� 
-- ����� Ŀ�̼��� 'no commission'���� ����϶�.
select ename, comm, nvl(to_char(comm), 'no commission')  from emp;
 
--20> ��� ����� �̸�,�μ���ȣ,�μ��̸��� ǥ���ϴ� ���Ǹ� �ۼ��϶�.
select e.ename, d.deptno, d.dname
from emp e join dept d on e.deptno = d.deptno;

 
--21> 30�� �μ��� ���� ����� �̸��� �μ���ȣ �׸��� �μ��̸��� ����϶�.
 select e.ename, e.deptno, d.DNAME
 from emp e join dept d
 on d.deptno = e.deptno 
 where e.deptno = 30;
 
--22> 30�� �μ��� ���� ������� ��� ������ �μ���ġ�� ����϶�.
--(��, ���� ����� �ߺ����� �ʰ� �϶�.)
 select distinct e.job, d.loc  
from emp e join dept d
 on d.deptno = e.deptno
 where e.deptno = 30;
--23> Ŀ�̼��� å���Ǿ� �ִ� ��� ����� �̸�, �μ��̸� �� ��ġ�� ����϶�.
select e.ename, d.dname
from emp e join dept d on e.deptno = d.deptno
where e.COMM is not null;
 
--24> �̸��� A�� ���� ��� ����� �̸��� �μ� �̸��� ����϶�.
select e.ename, d.dname
from  emp e join dept d
 on d.deptno = e.deptno
 where e.ENAME like '%A%';
--25> Dallas���� �ٹ��ϴ� ��� ����� �̸�, ����, �μ���ȣ �� �μ��̸��� 
-- ����϶�.
select e.ename, e.job, e.deptno
from emp e join dept d on e.deptno = d.deptno
where d.loc = 'DALLAS';
 
--26> ����̸� �� �����ȣ, �ش� �������̸� �� ������ ��ȣ�� ����ϵ�,
-- �� �÷����� employee,emp#,manager,mgr#���� ǥ���Ͽ� ����϶�.
select e.ename, e.empno, m.ename, m.empno
from emp e left outer join emp m on e.mgr = m.empno;
 
--27> ��� ����� �̸�,����,�μ��̸�,�޿� �� ����� ����϶�.
 select e.ename, e.job, d.dname, e.sal, s.GRADE
 from emp e join dept d on e.deptno = d.deptno
            join salgrade s on e.sal between s.losal and s.HISAL;
 
--28> Smith���� �ʰ� �Ի��� ����� �̸� �� �Ի����� ����϶�.
select * from emp
where HIREDATE >(select hiredate from emp where ename = 'SMITH');
 
--29> �ڽ��� �����ں��� ���� �Ի��� ��� ����� �̸�, �Ի���, 
-- �������� �̸�, �������� �Ի����� ����ϵ� ���� �÷����� 
-- Employee,EmpHiredate, Manager,MgrHiredate�� ǥ���Ͽ� 
-- ����϶�.
SELECT e.ename as "Employee", e.hiredate as "EmpHiredate", m.ename as "Manager", m.hiredate as "MgrHiredate" 
FROM emp e left outer join emp m 
on e.empno = m.MGR
where e.HIREDATE>m.hiredate;

 
--30> ��� ����� �޿� �ְ��,������,�Ѿ� �� ��վ��� ����ϵ� 
-- �� �÷����� Maximum,Minimum,Sum,Average�� �����Ͽ� ����϶�.
select max(sal), min(sal), sum(sal), avg(sal) from emp;

 
--31> �� �������� �޿� ������.�ְ��,�Ѿ� �� ��վ��� ����϶�.
SELECT  min(sal), max(sal), sum(sal), avg(sal) 
FROM emp
GROUP by job; 
--32> ������ ������ ��� ���� ������ ���� ����϶�.
select count(job), job from emp
group by job;
 
--33> �������� ���� ����ϵ�, ������ ��ȣ�� �ߺ����� �ʰ��϶�.
-- �׸���, �÷����� Number of Manager�� �����Ͽ� ����϶�.
select count(DISTINCT(MGR))as "number of manager" from emp;
 
--34> �ְ� �޿��� ���� �޿��� ������ ����϶�.
select max(sal), min(sal), max(sal)-min(sal) from emp;

 
--35> ������ ��ȣ �� �ش� �����ڿ� ���� ������� ���� �޿��� ����϶�.
-- ��, �����ڰ� ���� ��� �� ���� �޿��� 1000 �̸��� �׷��� ���ܽ�Ű�� 
-- �޿��� �������� ��� ����� ������������ �����϶�.
select mgr, min(sal)
from emp
where mgr is not null 
group by mgr
having min(sal) >= 1000
order by min(sal) desc;
 
--36> �μ����� �μ��̸�, �μ���ġ, ��� �� �� ��� �޿��� ����϶�.
-- �׸��� ������ �÷����� �μ���,��ġ,����� ��,��ձ޿��� ǥ���϶�.
select * 
from (select deptno, count(deptno), avg(sal)
      from emp group by deptno) e join dept d on e.deptno = d.deptno;


select d.dname, d.loc, 
select e.deptno, count(e.deptno), avg(sal)
from emp e join dept d on e.deptno = d.deptno
group by e.deptno;
 
--37> Smith�� ������ �μ��� ���� ��� ����� �̸� �� �Ի����� ����϶�.
-- ��, Smith�� �����ϰ� ����Ͻÿ�
select ename, hiredate from emp
where deptno =(SELECT deptno FROM emp where ename = 'SMITH')
and ename != 'SMITH'; 
 
--38> �ڽ��� �޿��� ��� �޿����� ���� ��� ����� ��� ��ȣ, �̸�, �޿��� 
--    ǥ���ϴ� ���Ǹ� �ۼ��ϰ� �޿��� �������� ����� ������������ �����϶�.
select *
from emp
where sal > (select avg(sal) from emp);
 
 
--39> �̸��� T�� ���� ����� ���� �μ����� �ٹ��ϴ� ��� ����� �����ȣ
-- �� �̸��� ����϶�.
select * from emp
where deptno in (select deptno from emp where ename like('%T%'));
 
--40> �μ���ġ�� Dallas�� ��� ����� �̸�,�μ���ȣ �� ������ ����϶�.
 select *
 from emp e join dept d on e.deptno = d.deptno
 where d.loc = 'DALLAS';
 
--41> KING���� �����ϴ� ��� ����� �̸��� �޿��� ����϶�.
select e.ename, e.sal from emp e left outer join emp m on e.mgr = m.empno
where m.ename = 'KING';
 
--42> Sales �μ��� ��� ����� ���� �μ���ȣ, �̸� �� ������ ����϶�.
select * from emp e join dept d on e.deptno = d.deptno
where d.dname = 'SALES';
 
--43> �ڽ��� �޿��� ��� �޿����� ���� �̸��� T�� ���� ����� ������
-- �μ��� �ٹ��ϴ� ��� ����� ��� ��ȣ, �̸� �� �޿��� ����϶�.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT AVG(SAL)
  FROM EMP)
AND DEPTNO IN(SELECT DEPTNO

  FROM EMP
  WHERE ENAME LIKE '%T%');
 
--44> Ŀ�̼��� �޴� ����� �޿��� ��ġ�ϴ� ����� �̸�,�μ���ȣ,�޿��� 
-- ����϶�.
select * from emp

where sal in (select sal from emp where comm is not null);

 
 
--45> Dallas���� �ٹ��ϴ� ����� ������ ��ġ�ϴ� ����� �̸�,�μ��̸�,
--     �� �޿��� ����Ͻÿ�
SELECT E.ENAME, D.DNAME, E.SAL
FROM EMP E join DEPT D on E.DEPTNO=D.DEPTNO
AND E.JOB IN(SELECT E.JOB
  FROM EMP E join DEPT D on E.DEPTNO=D.DEPTNO
  AND D.LOC='DALLAS');
 
 SELECT E.ENAME, D.DNAME, E.SAL
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO
AND E.JOB IN(SELECT E.JOB
  FROM EMP E, DEPT D
  WHERE E.DEPTNO=D.DEPTNO
  AND D.LOC='DALLAS');
--46> Scott�� ������ �޿� �� Ŀ�̼��� �޴� ��� ����� �̸�, �Ի��� �� 
-- �޿��� ����Ͻÿ�
select *
from emp
where sal = (select sal from emp where ename = 'SCOTT');
 
 
--47> ������ Clerk �� ����麸�� �� ���� �޿��� �޴� ����� �����ȣ,
-- �̸�, �޿��� ����ϵ�, ����� �޿��� ���� ������ �����϶�.
select empno, ename, sal from emp
where sal> all (select sal from emp where job = 'CLERK')
order by sal desc;
  
--48> �̸��� A�� ���� ����� ���� ������ ���� ����� �̸���
-- ����, �μ���ȣ�� ����϶�.
select *
from emp
where job in (select job from emp where ename like '%A%');
 
 
--49> New  York ���� �ٹ��ϴ� ����� �޿� �� Ŀ�̼��� ���� ����� 
-- ����̸��� �μ����� ����϶�.
select e.ename, d.dname 
from emp e join dept d 
on e.deptno = d.DEPTNO  
          where e.sal in (select e.sal from  emp e join dept d on e.deptno = d.DEPTNO  where d.loc ='NEW YORK')
and nvl(e.comm, 0) in (select nvl(e.comm, 0) from  emp e join dept d on e.deptno = d.DEPTNO  where d.loc ='NEW YORK');
 
 
--50> Dallas���� �ٹ��ϴ� ����� ���� �� �����ڰ� ���� ����� �����ȣ,����̸�,
--    ����,����,�μ���,Ŀ�̼��� ����ϵ� Ŀ�̼��� å������ ���� ����� NoCommission
--    ���� ǥ���ϰ�, Ŀ�̼��� �÷����� Comm���� ������ ����Ͻÿ�.
--    ��, �ְ���޺��� ��µǰ� �Ͻÿ�
select nvl(to_char(comm),'NOCOMMISSION') 
from emp e join dept d on e.deptno = d.DEPTNO
where e.job in(select e.job from emp where d.loc = 'DALLAS')
and e.mgr in(select e.mgr from emp where d.loc = 'DALLAS');
--and nvl(to_char(comm), 'NOCOMMISSION');

    
    
    
    