package java100.app.domain;

public class Book {
    protected int no;
    protected String bookName;
    protected String publisher;
    protected String publishDate;
    protected int price;
    protected String comment;
    protected String photo;
    
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
    
    

/*
    no int not null,
    bookname varchar(255) not null,
    publisher varchar(255) not null,
    pubishdt datetime not null,
    price int default 0,
    comment varchar(255),
    photo varchar(255)
    */
    
    
    
    
    
    
    
    
    
}
