package step9;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BoardDao {
    SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    
    public List<Board> findAll(Map<String,Object> data) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return sqlSession.selectList(
                    "jdbcTestMapper.findAll", data);
        }
    }
    
    public Board findByNo(int no) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return sqlSession.selectOne("jdbcTestMapper.findByNo", no);
        }
    }
    
    public int insert(Board board) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            int count = sqlSession.insert("jdbcTestMapper.insert", board);
            sqlSession.commit();
            return count;
        }
    }
    
    public int update(Board board) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            int count = sqlSession.update("jdbcTestMapper.update", board);
            sqlSession.commit();
            return count;
        }
    }
    
    public int delete(int no) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            int count = sqlSession.delete("jdbcTestMapper.delete", no);
            sqlSession.commit();
            return count;
        }
    }

}
