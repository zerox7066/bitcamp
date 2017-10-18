// ## 키보드로부터 입력 받기(scanner)

package bitcamp.java100;

import java.io.Console;

public class Test21_2 {
    
    // entry point
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);   // JVM 종료
        }
        
        String line = console.readLine("입력하세요:");
        System.out.println(line);
        System.out.println("--------------------------------------------------");
    }
}






















