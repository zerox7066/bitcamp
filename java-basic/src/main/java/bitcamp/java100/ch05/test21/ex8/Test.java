package bitcamp.java100.ch05.test21.ex8;

import java.io.Console;

public class Test {

    public static void main(String[] args) {
        // 콘솔 객체를 준비한다.
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        
        String[] names = new String[3];
        String[] emails = new String[3];
        String[] tels = new String[3];
        
        int cursor = 0;
        
        while(cursor < names.length) {
            names[cursor] = console.readLine("이름? ");
            emails[cursor] = console.readLine("이메일? ");
            tels[cursor] = console.readLine("전화? ");
            
            String response = console.readLine("저장하시겠습니까?(y/n) ");
            if (response.equals("y")) {
                System.out.println("저장하였습니다.");
                cursor++;
            } else if (response.equals("n")) {
                System.out.println("저장을 취소하였습니다.");
            }
            
            response = console.readLine("계속 입력하시겠습니까?(y/n) ");
            if (!(response.toLowerCase().equals("y") || 
                  response.toLowerCase().equals("yes"))) {
                System.out.println("종료합니다.");
                break;
            }
        }
        
        for (int i = 0; i < cursor; i++) {
            System.out.println(names[i]);
            System.out.println(emails[i]);
            System.out.println(tels[i]);
        }
        
    }

}
