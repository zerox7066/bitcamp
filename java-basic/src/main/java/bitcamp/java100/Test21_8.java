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

public class Test21_8 {   
    class PersonInfo {
        String name;
        String email;
        String tel_no;
    }

    public static void main(String[] args) {
        // 콘솔 객체를 준비한다.
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        
        ArrayList name = new ArrayList();
        ArrayList email = new ArrayList();
        ArrayList tel_no = new ArrayList();
        
        int idx = 0;
        
        while(true) {
            name.add(console.readLine("이름? "));
            email.add(console.readLine("이메일? "));
            tel_no.add(console.readLine("전화? "));
            

            if (console.readLine("저장하시겠습니까?(y/n) ").equals("y")) {
                System.out.println("저장하였습니다.");
                idx++;
            } else {
                name.remove(idx);
                email.remove(idx);
                tel_no.remove(idx);
                System.out.println("저장 취소하였습니다.");
            }
            
            if (console.readLine("계속입력하시겠습니까?(y/n) ").equals("n")) {
                break;
            }
        }
        
        for (int i = 0; i < idx ; i++) {
            System.out.printf("%-10s", name.get(i));
            System.out.printf("%-20s", email.get(i));
            System.out.printf("%-20s", tel_no.get(i));
            System.out.println();
        }
        
    }
}











