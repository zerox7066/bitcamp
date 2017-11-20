package java100.app.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import java100.app.domain.Score;

public class ScoreController extends GenericController<Score> {
    
    private String dataFilePath;
    
    public ScoreController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
    
    // ArrayList에 보관된 데이터를 score.csv 파일에 저장한다.
    // 저장하는 형식은 CSV(Comma Separated Value) 방식을 사용한다.
    // 예) 홍길동,100,100,100,300,100.0
    @Override
    public void destroy() {
        
        try ( 
                PrintWriter out = new PrintWriter(
                                    new BufferedWriter(
                                        new FileWriter(this.dataFilePath))); 
        ) {
            for (Score score : this.list) {
                out.println(score.toCSVString());
            }
            
            out.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
    
    // CSV 형식으로 저장된 파일에서 성적 데이터를 읽어 
    // ArrayList에 보관한다.
    @Override
    public void init() {
        
        try (
                BufferedReader in = new BufferedReader(new FileReader(this.dataFilePath)); 
        ) {
            
            String csv = null;
            while((csv = in.readLine()) != null) {
                try {
                    list.add(new Score(csv));
                } catch (CSVFormatException e) {
                    System.err.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
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
        
        String name = request.getParameter("name");
        
        System.out.println("[성적 삭제]");
                       
        Score score = findByName(name);
        
        if (score == null) {
            out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            list.remove(score);
            out.println("삭제하였습니다.");
        }
    }

    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        
        out.println("[성적 변경]");
        Score score = findByName(name);
        
        if (score == null) {
            out.printf("'%s'의 성적 정보가 없습니다.\n", name);
            return;
        }
        
        score.setKor(Integer.parseInt(request.getParameter("kor")));
        score.setEng(Integer.parseInt(request.getParameter("eng")));
        score.setMath(Integer.parseInt(request.getParameter("math")));
        
        out.println("변경하였습니다.!");
    }

    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        
        Score score = findByName(name);
        
        out.println("[성적 상세 정보]");
        
        if (score == null) {
            out.printf("'%s'의 성적 정보가 없습니다.\n", name);
            return;
        }
        
        out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                score.getName(),
                score.getKor(),
                score.getEng(),
                score.getMath(),
                score.getSum(), 
                score.getAver());
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[성적 목록]");
        
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();
            out.printf("%-4s, %4d, %6.1f\n",  
                    score.getName(), 
                    score.getSum(), 
                    score.getAver());
        }
    }

    private void doAdd(Request request, Response response) {
        //PrintWriter out = response.getWriter();
        
        //out.println("[성적 등록]");
        
        Score score = new Score();
        
        score.setName(request.getParameter("name"));
        score.setKor(Integer.parseInt(request.getParameter("kor")));
        score.setEng(Integer.parseInt(request.getParameter("eng")));
        score.setMath(Integer.parseInt(request.getParameter("math")));
        
        list.add(score);
        
        PrintWriter out = response.getWriter();
        out.println("저장하였습니다.");
        
    }
    
    private Score findByName(String name) {
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();
            if (score.getName().equals(name)) {
                return score;
            }
        }
        return null;
    }
}













