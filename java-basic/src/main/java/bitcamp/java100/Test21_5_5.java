// ## 키보드로부터 입력 받기 - 연습1
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

// 5단계: 정교하게 예외처리 하기
public class Test21_5_5 {
    
    // 클래스 변수
    // => 클래스를 실행하기 위해 HDD에서 메모리로 로딩할 때 생성되는 변수이다.
    // => new 명령으로 생성되는 변수가 아니다.
    static Console console;
    
    static void prepareInput() {
        console = System.console();

        if (console == null) {
            throw new RuntimeException("콘솔 생성 오류입니다!");
        }
    }
    
    static int promptGugudan() {
        int value;
        value = Integer.parseInt(console.readLine("구구단? "));
        
        if (value < 0 || value == 1 || value >= 10) {
            // 예외 상황을 만나면 호출자에게 알린다.
            throw new RuntimeException("구구단의 범위를 초과했습니다.");
        }        
        
        return value;
    }
    
    static void printGugudan(int value) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", value, i, value * i);
        }
    }
    
    public static void main(String[] args) {
        // 메서드를 실행하다가 예외 상황을 보고하면 처리한다.
        try {
            prepareInput();
        } catch (RuntimeException e) {
            System.err.println("콘솔 입력을 지원하지 않습니다.");
            System.exit(1);
        }
        
        while (true) {
            int value = 0;
            try {
                value = promptGugudan();
                
                if (value == 0) break;
                if (value == 1 || value >= 10) continue;
                
                printGugudan(value);
            } catch (RuntimeException e) {
                System.err.println("구구단의 범위가 아닙니다.");
            }
        }
            
        System.out.println("프로그램을 종료합니다.");
    }
}








