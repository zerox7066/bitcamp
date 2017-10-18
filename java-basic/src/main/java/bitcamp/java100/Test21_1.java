// ## 키보드로부터 입력 받기(scanner)

package bitcamp.java100;

import java.util.Scanner;

public class Test21_1 {
    
    // entry point
    public static void main(String[] args) {
        // System.in 키보드 정보가 들어있는 객체
        
        // 1) Scanner 객체 생성
        Scanner keyScan = new Scanner(System.in);  // System.in : 키보드 정보
        
        // 2) 데이터를 읽음
        System.out.printf("입력하세요:");
        String line = keyScan.nextLine();  // blocking I/O   / non-blocking I/O
        
        System.out.println(line);
        
        // 3) 사용 완료 후 자원 해제
        // 자원 해제가 필요한 클래스는 close() 메서드가 정의되어 있다.
        keyScan.close();
        
        
        System.out.println("--------------------------------------------------");
    }
}






















