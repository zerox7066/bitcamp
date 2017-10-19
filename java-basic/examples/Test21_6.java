// ## 키보드로부터 입력 받기 - 연습2
// - 다음과 같이 사용자로부터 숫자를 입력 받아 각 숫자의 개수를 세시오.
// - 실행 예) 
// 숫자? 23347651
// 0 = 0
// 1 = 1
// 2 = 1
// 3 = 2
// 4 = 1
// 5 = 1
// 6 = 1
// 7 = 1
// 8 = 0
// 9 = 0
// > 

package bitcamp.java100;

import java.io.Console;

public class Test21_6 {
    
    static Console console;
    
    static void prepareInput() {
        // 콘솔 객체를 준비한다.
        console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }     
    }
    
    static StringBuffer inputPrompt() {
        StringBuffer buf = new StringBuffer(console.readLine("숫자? "));
        return buf;
    }
    
    static int[] countNumber(StringBuffer value) {
        int[] cnt = new int[50000];
        
        for (int i = 0; i < value.length(); i++) {
            //if (value.charAt(i) >= 0x30 && value.charAt(i) <= 0x39) {
            //    cnt[value.charAt(i)  - '0']++;
            //} else {
                cnt[value.charAt(i)]++;
            //}
            
        }
        return cnt;
    }
    
    static void printNumber(int[] cnt) {
        int x = 0;
        while(x < cnt.length) {
            System.out.printf("%s = %d\n", (char)x, cnt[x]);
            x++;
        }
    }

    public static void main(String[] args) {
        try {
            prepareInput();

            StringBuffer number; 
            number = inputPrompt();

            int[] cnt = countNumber(number);

            printNumber(cnt);

        } catch (Exception e) {
            System.err.println("입력값이 초과하였습니다.");
        }
    }
}











