/* 성적 정보 테이블 */

alter table ex_board
  add column mno int not null;
  
  
alter table ex_board
  add constraint foreign key (mno) references ex_memb(no);
  
insert into ex_board(title, conts, regdt,mno)
               values('aaa', 'aaaa', now(), 24);

select no, title, regdt, vwcnt, mno
from ex_board;

select no, name
from ex_memb;

select b.no, b.title, b.regdt, b.vwcnt, b.mno, m.no, m.name
from ex_board b, ex_memb m;

select b.no, b.title, b.regdt, b.vwcnt, m.no, m.name
from ex_board b join ex_memb m
on b.mno = m.no;



drop table ex_score;
drop table ex_board;
drop table ex_memb;
drop table ex_room;
drop table ex_file;


create table ex_file (
    no int not null,
    filename varchar(255) not null,
    bno int not null
);

alter table ex_file
  add constraint primary key(no);

alter table ex_file
  modify column no int not null auto_increment;
  
alter table ex_file
  add constraint foreign key (bno)  references ex_board(no);



create table ex_score (
    no int not null,
    name varchar(30) not null,
    kor int not null,
    eng int not null,
    math int not null
);

alter table ex_score
    add constraint primary key (no);

alter table ex_score
    modify column no int not null auto_increment;
    
alter table ex_score
    add fulltext (name);
    

create table ex_memb (
    no int not null,
    name varchar(30) not null,
    email varchar(50) not null,
    pwd varchar(100) not null,
    regdt datetime not null
);

alter table ex_memb
    add constraint primary key (no);

alter table ex_memb
    modify column no int not null auto_increment;
    
alter table ex_memb
    add fulltext index (name);
    
alter table ex_memb
    add constraint unique (email);
    
create table ex_board (
    no int not null,
    title varchar(200) not null,
    conts text,
    regdt datetime not null,
    vwcnt int default 0 
);

alter table ex_board
  add constraint primary key (no);

alter table ex_board
  modify column no int not null auto_increment;    
    
    
create table ex_room (
    no int not null,
    loc varchar(20) not null,
    name varchar(20) not null,
    capacity int not null
);    
    
alter table ex_room
    add constraint primary key (no);

alter table ex_room
    modify column no int not null auto_increment;
    
alter table ex_room
    add unique (loc, name);