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
    
    // 클래스 변수
    static Console console;
    
    static void prepareConsole() {
        console = System.console();
        
        if (console == null) {
            throw new RuntimeException("콘솔 생성 오류!");
        }
    }
    
    static String inputString() {
        return console.readLine("문자열? ");
    }
    
    static String reverseString(String str) {
        StringBuffer buf = new StringBuffer();
        buf.append(str);
        
        int len = buf.length();
        for(int left = 0, right = len - 1; left < len / 2; left++, right--) {
            char ch = buf.charAt(left);
            buf.setCharAt(left, buf.charAt(right));
            buf.setCharAt(right, ch);
        }
        
        return buf.toString();
    }
    
    public static void main(String[] args) {
        prepareConsole();
        
        String str = inputString();
        String rstr = reverseString(str);
        
        System.out.printf("입력한 문자열 : %s\n", str);
        System.out.printf("변경된 문자열 : %s\n", rstr);
    }
}











