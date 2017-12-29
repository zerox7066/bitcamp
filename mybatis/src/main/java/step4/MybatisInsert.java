package step4;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisInsert {
    
    public static void main(String[] args) throws Exception {
        InputStream inputStream = 
                Resources.getResourceAsStream("step4/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = 
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Map<String,Object> data = new HashMap<>();
        data.put("title", "오호라!! 제목");
        data.put("contents", "내용입니다");
        
        int count = sqlSession.insert("jdbcTestMapper.insert", data);
        
        sqlSession.commit();
        
        System.out.printf("%d 개가 입력되었습니다.", count);
        
        sqlSession.close();
    }

}
