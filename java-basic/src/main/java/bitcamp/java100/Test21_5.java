// ## 키보드로부터 입력 받기(scanner)

package bitcamp.java100;

import java.io.Console;

public class Test21_5 {
    static void printGugudan(Integer num) {
        if ( 1 < num && num <= 9) {
            for (int i = 1; i <= 9; i++) {       
                System.out.printf("%d * %d = %d\n",num, i, num*i);
            }
            System.out.println("--------------------------------------------------");
        } else if ( num == 1 || num == 10) {
            System.out.println("2에서 9단까지만 가능합니다!");
        } else if ( num == 0) {
            System.out.println("다음에 또 봐요!");
            System.exit(1);
        }
        
    }
    
    // entry point
    public static void main(String[] args) {
        
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);   // JVM 종료
        }        
        
        while(true) {
            printGugudan(Integer.parseInt(console.readLine("구구단? ")));
//            if (console.readLine("구구단? ") == "종료") {
//                System.exit(1);   // JVM 종료
//            }
        }
    }
}






















