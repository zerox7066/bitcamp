package java100.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 
public class App {
    
    static Scanner keyScan = new Scanner(System.in);
    
    static String prompt(String message) {
        System.out.print(message);
        return keyScan.nextLine();
    }
    
    static boolean confirm(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().trim().toLowerCase();
        
        if (response.equals("y") || response.equals("yes") || response.equals("")) {
            return true;
        }        
        return false; 
    }
    
    static boolean confirm2(String message) {   
        System.out.print(message);
        String response = keyScan.nextLine().trim().toLowerCase();
        
        if (response.equals("n") || response.equals("no") || response.equals("")) {
            return false;
        }        
        return true; 
    }
    
    public static void main(String[] args) {
        
        ArrayList<Score> list = new ArrayList<>();
        Iterator<Score> iterator;
        
        loop :
        while(true) {
            String name;
            Score score = null;
            
            System.out.print("성적관리> ");
            String input = keyScan.nextLine().trim();

            if (input.equals("add")) {
                System.out.printf("[학생 정보 등록]\n");
                while(true) {
                    score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
                    score.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.
                    
                    list.add(score);
                    if (!confirm("학생 등록 계속하시겠습니까?(Y/n) ")){
                        break;
                    }

                    System.out.println("-----------------------------------------------");
                }
                
            } else if (input.equals("list")) {
                System.out.printf("[학생 정보 목록]\n");
                
                iterator = list.iterator();
                
                while (iterator.hasNext()) {
                    iterator.next().print();
                }
                
            } else if (input.equals("view")) {
                System.out.println("[학생 정보 조회]");
                name = prompt("이름? ");

                iterator = list.iterator();
                while (iterator.hasNext()) {
                    Score temp = iterator.next();
                    if (temp.name.equals(name)) {
                        score = temp;
                        break;
                    }
                }
                
                if (score == null) {
                    System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
                } else {
                    score.printDetail();
                }
                
            } else if (input.equals("delete")) { 
                System.out.println("[학생 정보 삭제]");
                name = prompt("이름? ");
                
                iterator = list.iterator();
                while (iterator.hasNext()) {
                    Score temp = iterator.next();
                    if (temp.name.equals(name)) {
                        score = temp;
                        break;
                    }
                }
                if (score == null) {
                    System.out.println(name + "의 성적 정보가 없습니다.");
                } else {
                    if (confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                        list.remove(score);
                        System.out.println("삭제하였습니다.");
                    } else {
                        System.out.println("삭제 취소하였습니다.");
                    }       
                }
            } else if (input.equals("update")) {
                System.out.println("[학생 정보 수정]");
                name = prompt("이름? ");
                
                iterator = list.iterator();
                while (iterator.hasNext()) {
                    Score temp = iterator.next();
                    if (temp.name.equals(name)) {
                        score = temp;
                        break;
                    }
                }
                if (score == null) {
                    System.out.println(name + "의 성적 정보가 없습니다.");
                } else {
                    score.update();
                }
            } else if (input.equals("quit")) {
                break loop;

            } else {
                System.out.println("실행할 수 없는 명령입니다.");
            }

            System.out.println("-----------------------------------------------");
            if (!confirm("계속하시겠습니까?(Y/n) ")){
                break;
            }
            System.out.println("");
        }
        
    }
}












