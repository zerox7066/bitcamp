// try...[catch]...finally

package bitcamp.java100.ch13.ex6;

import java.util.Scanner;

public class Test1 {
    
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("입력> ");
        String str = keyScan.nextLine().toLowerCase();
        
        try {
            System.out.println("try 블록 실행");
        } finally {
            // catch 블록 없이 사용할 수 있다.
            // 사용한 자원을 해제할 때 사용
            System.out.println("finally 블록 실행");
        }
    }

}
