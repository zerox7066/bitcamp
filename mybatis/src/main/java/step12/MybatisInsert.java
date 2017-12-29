package step12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisInsert {
    
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("step12/application-context.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
        Board board = new Board();
        board.setTitle("제목5");
        board.setContents("내용입니다2");
        
        int count = boardDao.insert(board);
                
        System.out.printf("%d 개가 입력되었습니다.", count);
        
        iocContainer.close();
    }

}
