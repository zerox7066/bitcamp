package step3;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectOne {
    
    public static void main(String[] args) throws Exception {
        InputStream inputStream = 
                Resources.getResourceAsStream("step3/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = 
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Map<String,Object> record = sqlSession.selectOne("jdbcTestMapper.findByNo", 34);
        
        System.out.printf("번호: %d\n", record.get("no"));
        System.out.printf("제목: %s\n", record.get("title"));
        System.out.printf("내용: %s\n", record.get("conts"));
        System.out.printf("날짜: %s\n", record.get("regdt"));
        System.out.printf("조회수: %d\n", record.get("vwcnt"));
        
        sqlSession.close();
    }

}
