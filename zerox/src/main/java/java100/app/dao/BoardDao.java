package java100.app.dao;

import java.util.List;
import java.util.Map;

import java100.app.domain.Board;


public interface BoardDao {
    List<Board> findAll(Map<String,Object> params);
    Board findByNo(int no);
    int countAll();
    int insert(Board board);
    int insertFile(Board board);
    int update(Board board);
    int updateViewCount(int no);
    int delete(int no);
}















