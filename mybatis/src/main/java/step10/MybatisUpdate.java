package step10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisUpdate {
    
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("step10/application-context.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
        Board board = new Board();
        board.setNo(39);
        board.setTitle("제목 변경39!");
        board.setContents("내용 변경");
        
        int count = boardDao.update(board);
        
        System.out.printf("%d 개가 변경되었습니다.", count);
        
        iocContainer.close();
    }

}
