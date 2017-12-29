package step10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisDelete {
    
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("step10/application-context.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
        int count = boardDao.delete(38);
        
        System.out.printf("%d 개가 삭제되었습니다.", count);
        
        iocContainer.close();
    }

}
