/* ex_board 테이블 생성 */
create table ex_book (
    no int not null,
    bookname varchar(255) not null,
    publisher varchar(255) not null,
    publishdt date not null,
    price int default 0,
    comment varchar(255),
    photo varchar(255)
);

alter table ex_book
  add constraint primary key (no);

alter table ex_book
  modify column no int not null auto_increment;

/*
    protected int no;
    protected String bookName;
    protected String publisher;
    protected Date publishDate;
    protected int price;
    protected String comment;
    protected String photo;
*/

alter table ex_book
  add column mno int not null;
  
delete from ex_book;
  
alter table ex_book
  add constraint foreign key (mno) references ex_memb(no);
  
insert into ex_book(title, conts, regdt,mno)
               values('aaa', 'aaaa', now(), 24);
               
/* 파일 저장 테이블 */ 
create table ex_file (
  no int not null,
  category varchar(255) not null,
  filename varchar(255) not null,
  bno int
);

alter table ex_file
  add constraint primary key (no);

/* ex_file의 pk 컬럼은 자동증가 컬럼으로 만든다. */
alter table ex_file
  modify column no int not null auto_increment;

/* ex_file의 bno 컬럼을 ex_board의 no 값을 참조하는 외부키로 만든다.*/
alter table ex_file
  add constraint foreign key (bno) references ex_board(no);
  
  
  
