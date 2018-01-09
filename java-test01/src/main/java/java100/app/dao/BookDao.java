package java100.app.dao;

import java.util.List;
import java.util.Map;

import java100.app.domain.Book;


public interface BookDao {
    List<Book> findAll(Map<String,Object> params);
    //Book findByNo(int no);
    Book findByNo2(int no);
    int countAll();
    int insert(Book book);
    int update(Book book);
    int delete(int no);
}















