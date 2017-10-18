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
    static void printGugudan(Integer num) {
        if ( 1 < num && num <= 9) {
            for (int i = 1; i <= 9; i++) {       
                System.out.printf("%d * %d = %d\n",num, i, num*i);
            }
            System.out.println("--------------------------------------------------");
        } else if ( num == 1 || num == 10) {
            System.out.println("2에서 9단까지만 가능합니다!");
        } else if ( num <= 0) {
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
            //printGugudan(Integer.parseInt(console.readLine("구구단? ")));
            
            
            Integer num = Integer.parseInt(console.readLine("구구단 ? "));
            System.out.println("-----------------------------------");
            
            if (num > 1 && num < 10) {
                for (int i = 1; i < 10; i++) {
                    System.out.printf("%d * %d = %d\n", num, i, num * i);
                }
                System.out.println("-----------------------------------");
            } else if (num == 1 || num == 10) {
                System.out.println("2단 부터 9단까지만 가능합니다.");
                System.out.println("-----------------------------------");
            } else if (num < 1) {
                System.out.println("다음에 다시 만나요.");
                System.out.println("-----------------------------------");
                //break;
            }
        }
    }
}





















