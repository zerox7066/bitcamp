// ## 키보드로부터 입력 받기 - 연습4
// - 다음과 같이 사용자로부터 이름, 이메일, 전화를 입력받아 출력하시오!
// - 실행 예) 
// 이름? 홍길동
// 이메일? hong@test.com
// 전화? 1111-1111
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 임꺽정
// 이메일? leem@test.com
// 전화? 1111-1112
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 유관순
// 이메일? yoo@test.com
// 전화? 1111-1113
// 저장하시겠습니까?(y/n) n
// 저장 취소하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 안중근
// 이메일? ahn@test.com
// 전화? 1111-1114
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) n
// ------------------------------
// 홍길동     hong@test.com 1111-1111
// 임꺽정     leem@test.com 1111-1112
// 안중근      ahn@test.com 1111-1114
// > 

package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;

public class Test21_9 {
    
    // 클래스 변수
    static Console console;
    
    static void prepareConsole() {
        console = System.console();
        
        if (console == null) {
            throw new RuntimeException("콘솔 생성 오류!");
        }
    }
    
    static void inputInfo() {
    }

    public static void main(String[] args) {
        String saveflag = "n";
        String progressflag = "n";

        int idx = 0;
        String[] name = new String[10];
        String[] email = new String[10];
        String[] tel_no = new String[10];
        
        while(true) {
            
            name[idx] = console.readLine("이름? ");
            email[idx] = console.readLine("이메일? ");
            tel_no[idx] = console.readLine("전화? ");
            
            while(true) {
                saveflag = console.readLine("저장하시겠습니까?(y/n) ");
                if (saveflag.equals("y")) {
                    System.out.println("저장하였습니다.");
                    idx++;
                    break;
                } else if (saveflag.equals("n")){
                    System.out.println("저장 취소하였습니다.");
                    break;
                } else {
                    System.out.println("y 와 n 만 가능합니다.");
                }
            }

            while(true) {
                progressflag = console.readLine("계속입력하시겠습니까?(y/n) ");
                if (progressflag.equals("y")) {
                    System.out.println("계속 진행합니다.");
                    break;
                } else if (progressflag.equals("n")) {
                    System.out.println("종료합니다.");
                    break;
                } else {
                    System.out.println("y 와 n 만 가능합니다.");
                }
            }
            if (progressflag.equals("n")) break;
        }
        
        for (int i = 0; i < idx ; i++) {
            System.out.printf("%-10s", name[i]);
            System.out.printf("%-20s", email[i]);
            System.out.printf("%-20s", tel_no[i]);
            System.out.println();
        }
    }
}











