// 클래스 멤버와 인스턴스 멤버의 활용

package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

// 여러 개의 데이터를 다룰 때 문제점
public class Test4 {
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println(message);
        String response = keyScan.nextLine().trim().toLowerCase();
        
        if (response.equals("y") || response.equals("yes")) {
            return true;
        }        
        return false;
    }
    
    
    public static void main (String[] args) {
        while(true) {
            Score1.inputScore();
            Score1.computeScore();
            Score1.printScore();
            
            if (!confirm("계속하시겠습니까?")) {
                break;
            }
        }
    }
}
