package java100.app.control;

import java.util.Iterator;
import java.util.Scanner;

import java100.app.Prompts;
import java100.app.domain.Score;

public class ScoreController extends GenericController<Score> {    
    
    public void execute() {
        loop:
        while (true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();
            
            // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
            switch (input) {
            case "add": this.doAdd(); break;
            case "list": this.doList(); break;
            case "view": this.doView(); break;
            case "update": this.doUpdate(); break;
            case "delete": this.doDelete(); break;
            case "main": break loop;
            default: 
                System.out.println("해당 명령이 없습니다.");
            }
        }
    }
 
    private void doDelete() {
        System.out.println("[성적 삭제]");
        
        String name = Prompts.inputString("이름? ");
        Score score = findByName(name);
        
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", score.getName());
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(score);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }

    private void doUpdate() {
        System.out.println("[성적 변경]");
        
        String name = Prompts.inputString("이름? ");
        Score score = findByName(name);
        
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
            return;
        }

        Scanner keyScan = new Scanner(System.in);

        int kor = score.getKor();
        System.out.printf("국어?(%d) ", kor);
        try {
            kor = Integer.parseInt(keyScan.nextLine());
        } catch(Exception e) {}

        int eng = score.getEng();
        System.out.printf("영어?(%d) ", eng);
        try {
            eng = Integer.parseInt(keyScan.nextLine());
        } catch(Exception e) {}

        int math = score.getMath();
        System.out.printf("수학?(%d) ",math);
        try {
            math = Integer.parseInt(keyScan.nextLine());
        } catch(Exception e) {}

        if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
            score.setKor(kor);
            score.setEng(eng);
            score.setMath(math);
            System.out.println("변경하였습니다.");

        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }

    private void doView() {
        System.out.println("[성적 상세 정보]");
        String name = Prompts.inputString("이름? ");
        
        Score score = findByName(name);
        
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",
                    score.getName(),
                    score.getKor(),
                    score.getEng(),
                    score.getMath(),
                    score.getSum(),
                    score.getAver());
        }
    }

    private void doList() {
        System.out.println("[성적 목록]");
        
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();            

            System.out.printf("%-4s, %4d, %6.1f\n",
                    score.getName(),
                    score.getSum(),
                    score.getAver());
        }
    }

    private void doAdd() {
        System.out.println("[성적 등록]");

        while (true) {
            Scanner keyScan = new Scanner(System.in);
            
            Score score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
            
            score.setName(Prompts.inputString("이름? "));
            score.setKor(Prompts.inputInt("국어점수? "));
            score.setEng(Prompts.inputInt("영어점수? "));
            score.setMath(Prompts.inputInt("수학점수? "));
            
            list.add(score);
            
            if (!Prompts.confirm("계속하시겠습니까?(Y/n) "))
                break;
        }
        
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
