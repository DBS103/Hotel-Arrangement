--数据库名：hotel
--1.
--部门表

create table duty (
deptno  int primary key ,
dname  varchar(50)  not null
);

insert into duty values(1,'管理员');
insert into duty values(2,'房管');
insert into duty values(3,'前台');
insert into duty values(4,'收银员');

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

insert into roomtype values('1','单人间',168,20,20,'有wifi温暖舒适');
insert into roomtype values('2','双人标准间',268,20,20,'有wifi温暖舒适');
insert into roomtype values('3','豪华双人间',288,20,20,'有wifi温暖舒适');
insert into roomtype values('4','豪华三人间',368,20,20,'有wifi温暖舒适');
insert into roomtype values('5','总统套房',568,20,20,'有wifi温暖舒适');
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
clientno int primary key auto_increment,
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
clientno int not null auto_increment,
roomid int not null,
empno  int not null,
cotime datetime default now(),
cotext text,
primary key(clientno,roomid，datetime),
foreign key (empno) references employee(empno),
foreign key (clientno) references customer (clientno),
foreign key (roomid) references room (roomid)
);




