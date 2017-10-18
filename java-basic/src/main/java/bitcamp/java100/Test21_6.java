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
    static void countNumber(Integer num) {
        int[] cnt = new int[10];
        while(num > 0) {
            cnt[num % 10]++;
            num /= 10;
        }      
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d = %d\n", i, cnt[i]);
        }
    }

    public static void main(String[] args) {
        // 콘솔 객체를 준비한다.
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }     
        
        //while(true) {
            countNumber(Integer.parseInt(console.readLine("숫자? ")));
//            if (console.readLine("구구단? ") == "종료") {
//                System.exit(1);   // JVM 종료
//            }
        //}
        
    }
}











