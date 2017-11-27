package java100.app.control;

import java.io.PrintWriter;
import java.util.List;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;

public class ScoreController implements Controller {
    
    ScoreDao scoreDao = new ScoreDao();
    
    @Override
    public void destroy() {}
    
    @Override
    public void init()  {}
    
    // 실제 이 클래스가 오버라이딩 하는 메서드는 
    // GenericController가 따른다고 한 Controller 인터페이스의 
    // 추상 메서드이다.
    @Override
    public void execute(Request request, Response response) {
            
        // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
        switch (request.getMenuPath()) {
        case "/score/add": this.doAdd(request, response); break;
        case "/score/list": this.doList(request, response); break;
        case "/score/view": this.doView(request, response); break;
        case "/score/update": this.doUpdate(request, response); break;
        case "/score/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doDelete(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        System.out.println("[성적 삭제]");

        try {
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (scoreDao.delete(no) > 0) {
                out.println("삭제하였습니다.");
            } else {
                out.printf("%d의 성적 정보가 없습니다.\n", no);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }        
    }

    private void doUpdate(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[성적 변경]");

        try {
            Score score = new Score();
            score.setNo(Integer.parseInt(request.getParameter("no")));
            score.setName(request.getParameter("name"));
            score.setKor(Integer.parseInt(request.getParameter ("kor")));
            score.setEng(Integer.parseInt(request.getParameter("eng")));
            score.setMath(Integer.parseInt(request.getParameter("math")));
            
            
            if (scoreDao.update(score) > 0) {
                out.println("변경하였습니다.");
            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", score.getNo());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doView(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[성적 상세 정보]");

        try {
            int no = Integer.parseInt(request.getParameter("no"));
            Score score = scoreDao.selectOne(no);
            
            if (score != null) {
                out.printf("번호 : %d\n", score.getNo());
                out.printf("이름 : %s\n", score.getName());
                out.printf("국어 : %d\n", score.getKor());
                out.printf("영어 : %d\n", score.getEng());
                out.printf("수학 : %d\n", score.getMath());
                out.printf("합계 : %d\n", score.getSum());
                out.printf("평균 : %.1f\n", score.getAver());
                
            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", no);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }        
        
    }

    private void doList(Request request, Response response) {

        PrintWriter out = response.getWriter();
        out.println("[성적 목록]");
        
        try { 
            List<Score> list = scoreDao.selectList();
            
            for (Score score : list) {
                out.printf("%4d, %-4s, %3d, %6.1f\n", 
                        score.getNo(),
                        score.getName(),
                        score.getSum(),
                        score.getAver());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }        
    }

    private void doAdd(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[성적 입력]");
        
        try{
            Score score = new Score();
            score.setName(request.getParameter("name"));
            score.setKor(Integer.parseInt(request.getParameter ("kor")));
            score.setEng(Integer.parseInt(request.getParameter("eng")));
            score.setMath(Integer.parseInt(request.getParameter("math")));
                    
            scoreDao.insert(score);
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
}













