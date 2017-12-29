package step9;

public class MybatisInsert {
    
    public static void main(String[] args) throws Exception {
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
        
        Board board = new Board();
        board.setTitle("오호라!! 제목4");
        board.setContents("내용입니다2");
        
        int count = boardDao.insert(board);
                
        System.out.printf("%d 개가 입력되었습니다.", count);
    }

}
