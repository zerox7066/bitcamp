import java.util.Scanner;

//: ## ver 08
//: - 클래스를 관리하기 쉽도록 별도의 파일로 분리하다. 
//: - 메서드를 사용하여 반복 코드를 분리한다.
//: 
//: 여러 명의 성적을 저장하고 다음과 같이 출력하라!
//:
//: 출력내용:
//: ```
//: 홍길동, 100,  90,  80, 270,  90.0
//: 임꺽정,  80,  80,  80, 240,  80.0
//: 유관순, 100, 100, 100, 300, 100.0
//: ```
 
public class App {
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println(message);
        String response = keyScan.nextLine().trim().toLowerCase();
        
        if (response.equals("y") || response.equals("yes")) {
            return true;
        }        
        return false;
    }
    
    public static void main(String[] args) {
        ScoreDao scoreDao = new ScoreDao();
        //Score[] scores = new Score[100];
        //int cursor = 0;
        

        while(true) {
            Score score = new Score();
            
            score.input();
            
            scoreDao.add(score);;
            
            if (!confirm("계속하시겠습니까?"))
                break;
        }
        
        //: 학생 성적을 출력한다.
        for (int i = 0; i < scoreDao.size(); i++) {
            scoreDao.get(i).print();
        }
    }
}





