--1.
--部门表

create table duty (
deptno  int primary key,
dname  varchar(50)  not null
);
----------------------------------------------------------
--2.
--员工表

create table employee (
empno   int primary key,
deptno   int not null,
ename   varchar(50)   not null,
epswd   varchar (50)  not null,
esex   char(2) default '男' check (esex = '男'
or esex = '女'),
epnum   varchar(20) not null,
etext  text,
foreign key (deptno) references duty (deptno)
);

--员工视图

create view employeeview (
v_empno, 
v_deptno, 
v_ename, 
v_epswd, 
v_esex, 
v_epnum,
v_etext
)
as
select empno, deptno, ename, epswd, esex
, epnum,  etext 
from employee
----------------------------------------------------------

--3.
--房间类型表

create table roomtype(
typeid  char(2) primary key,
tname   char(16) not null,
tprice   int,
tcount  int ,
trcount  int ,
ttext  text
);
----------------------------------------------------------

--4.
--房间表

create table room (
roomid int primary key,
typeid  char(2) not null,
rcondition  char(4) default '未入住' check (rcondition = '已入住'
or rcondition = '未入住'),
rtext  text,
foreign key (typeid ) references roomtype (typeid)
);

----------------------------------------------------------
--5.
--顾客表

create table customer (
clientno char(10) primary key,
cname varchar(20) not null,
csex char(2) default '男' check (csex = '男'
or csex = '女'),
cidentity char(18) not null,
cpnum  char(11) not null,
ctext text
);

--顾客视图

create view customerview (
v_clientno, 
v_cname, 
v_csex, 
v_cidentity, 
v_cpnum , 
v_ctext
)
as
select clientno, cname, csex, cidentity , cpnum  
, ctext 
from customer

----------------------------------------------------------
--6.
--订单表

create table orders(
orderid char(10) primary key,
empno int,
clientno char(10),
roomid  int ,
otime  datetime default now(),
ocash  int not null,
otext  text
);

----------------------------------------------------------
--7.
--退房表

create table outhistory (
clientno char(10) not null,
roomid int not null,
empno  int not null,
cotime datetime default now(),
cotext text,
primary key(clientno,roomid),
foreign key (empno) references employee(empno),
foreign key (clientno) references customer (clientno),
foreign key (roomid) references room (roomid)
);




