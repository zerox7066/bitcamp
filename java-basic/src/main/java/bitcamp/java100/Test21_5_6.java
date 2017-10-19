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

// 6단계: 예외를 구분하기
public class Test21_5_6 {
    
    // 예외를 구분하기 위해 새로운 예외를 만든다.
    // => 이때 기존의 기능을 바탕으로 새 예외를 만든다.
    static class ConsoleCreationException extends RuntimeException {
        // 특별하게 새 기능을 추가하지는 않는다.
        // 다만 이름으로 예외를 구분하기 위해 새 클래스를 만든 것이다.
    }
    
    static class InvalidGugudanException extends RuntimeException {
        // 특별하게 새 기능을 추가하기 위해 만든 클래스가 아니라,
        // 단지 예외를 구분하기 위해 만든 클래스이다.
    }
    
    static Console console;
    
    static void prepareInput() {
        console = System.console();

        if (console == null) {
            // 예외 상황을 만나면 호출자에게 알린다.
            throw new ConsoleCreationException();
        }
    }
    
    static int promptGugudan() {
        int value;
        value = Integer.parseInt(console.readLine("구구단? "));
        
        if (value < 0 || value == 1 || value >= 10) {
            // 예외 상황을 만나면 호출자에게 알린다.
            throw new InvalidGugudanException();
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

            while (true) {
                int value = 0;
                try {
                    value = promptGugudan();
                    
                    if (value == 0) break;
                    if (value == 1 || value >= 10) continue;
                    
                    printGugudan(value);
                } catch (InvalidGugudanException e) {
                    System.err.println("구구단의 범위가 아닙니다.");
                }
            }

            System.out.println("프로그램을 종료합니다.");

        } catch (ConsoleCreationException e) {
            System.err.println("콘솔 입력을 지원하지 않습니다.");
        }

    }
}









