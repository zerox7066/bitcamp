// ## 키보드로부터 입력 받기 - 연습3
// - 다음과 같이 사용자로부터 문자(숫자와 알파벳)를 입력 받아 꺼꾸로 변경하시오!
// - 실행 예) 
// 문자열? AB2CTT980
// 입력한 값: AB2CTT980
// 꺼꾸로 바꾼 값: 089TTC2BA
// > 

package bitcamp.java100;

import java.io.Console;

public class Test21_7 {
    static void arrangeString(String str) {
        System.out.printf("입력한 값 : %s\n", str);
        
        int index = 0;
        System.out.print("출력하는 값 : ");
        for(int i = 0; i < str.length() ; i++ ) {
            System.out.print(str.substring(str.length() - index - 1, str.length() - index));
            index++;
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
            arrangeString(console.readLine("문자열? "));
//            if (console.readLine("구구단? ") == "종료") {
//                System.exit(1);   // JVM 종료
//            }
        //}
        
    }
}











