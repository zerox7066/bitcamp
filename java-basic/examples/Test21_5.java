// ## 키보드로부터 입력 받기(scanner)
// - 다음과 같이 사용자로부터 구구단 번호를 입력 받아 출력하라!
// - 실행 예) 
// 구구단? 2
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// ...
// 2 * 9 = 18
// --------------------------
// 구구단? 10
// 2에서 9단까지만 가능합니다!
// 구구단? 1
// 2에서 9단까지만 가능합니다!
// 구구단? 0    <===== 0이하의 수를 입력하면 종료하라!
// 다음에 또 봐요!
// > 

package bitcamp.java100;

import java.io.Console;

public class Test21_5 {
    static class ConsoleCreationException extends RuntimeException {
        // 특별하게 새 기능을 추가하지는 않는다.
        // 다만 이름으로 예외를 구분하기 위해 새 클래스를 만든 것이다.
    }
    
    static class InvalidGugudanException extends RuntimeException {
        // 특별하게 새 기능을 추가하기 위해 만든 클래스가 아니라,
        // 단지 예외를 구분하기 위해 만든 클래스이다.
    }
    
    // 클래스 변수
    static Console console;
    
    static void prepareInput() {
        console = System.console();
        
        if (console == null) {
            throw new RuntimeException("콘솔 생성 오류!");
        }
    }
    
    static int promptGugudan() {            
        int num = Integer.parseInt(console.readLine("구구단? "));
        System.out.println("--------------------------------------------------");
        
        if (num == 1 || num >= 10) {
            throw new RuntimeException("구구단의 범위를 초과했습니다.");
        } else if (num <= 0) {
            System.out.println("다음에 만나요.");
            System.out.println("--------------------------------------------------");
            System.exit(1);
        }
        
        return num;
    }
    
    static void printGugudan(int i) {
        for(int j = 1; j < 10; j++) {
            System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
        System.out.println("--------------------------------------------------");
        
    }
    
    // entry point
    public static void main(String[] args) {
        // 메서드를 실행하다가 예외 상황을 보고하면 처리한다.
        try {
            prepareInput();

            while (true) {
                int i = 0;
                try {
                    i = promptGugudan();
                    if (i == 0) break;
                    printGugudan(i);
                } catch (InvalidGugudanException e) {
                    System.err.println("구구단의 범위가 아닙니다.");
                }
            }

            System.out.println("다시 또 오세요!");
            
        } catch (ConsoleCreationException e) {
            System.err.println("콘솔 입력을 지원하지 않습니다.");
        }
    }
}






















