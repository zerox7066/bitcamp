package step3;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectCondition {
    
    public static void main(String[] args) throws Exception {
        InputStream inputStream = 
                Resources.getResourceAsStream("step3/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = 
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Map<String,Object> data = new HashMap<>();
        data.put("vwcnt", "0");
        data.put("sdate", "2017-12-01");
        data.put("edate", "2017-12-30");
        
        List<Map<String,Object>> records = sqlSession.selectList("jdbcTestMapper.findByCondition", data);
        
        for(Map<String,Object> record : records) {
            System.out.printf("%d,%s,%s,%s\n", 
                    record.get("no"),
                    record.get("title"),
                    record.get("regdt"),
                    record.get("vwcnt"));
        }
        
        sqlSession.close();
    }

}
