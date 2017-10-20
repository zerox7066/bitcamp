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

public class Test21_8 {
    static Console console;
    
    // 레퍼런스 100개         객체 100(x)
    static Contact[] contacts = new Contact[100];
    static int cursor = 0;

    // 사용자 정의 데이타 타입
    static class Contact {
        String name;
        String email;
        String tel;
    }
    
    static Contact  inputContact() {
        Contact contact = new Contact();

        contact.name = console.readLine("이름? ");
        contact.email = console.readLine("이메일? ");
        contact.tel = console.readLine("전화번호? ");

        return contact;
    }
    
    static boolean confirm(String message) {
        String input = console.readLine(message + "(y/n) ");
        if (!(input.toLowerCase().equals("y") ||
              input.toLowerCase().equals("yes")))
            return false;
        return true;
    }
    
    static void printContacts() {
        for (int i = 0; i < size(); i++) {
            Contact contact = get(i);
            System.out.printf("%s %s %s\n", 
                    contact.name, 
                    contact.email, 
                    contact.tel);
        }
    }
    
    static void add(Contact contact) {
        contacts[cursor] = contact;
        cursor++;
    }
    
    static Contact get(int index) { 
        return contacts[index];
    }
    
    static int size() {
        return cursor;
    }
    
    public static void main(String[] args) {   
        console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        

        while(cursor < contacts.length) {
            
            Contact contact = inputContact();            
            
            if (confirm("저장하시겠습니까?")) 
                add(contact);
            
            // 계속 입력하지 않겠습니까?
            if (!confirm("계속 입력하시겠습니까?"))
                break;
        }
        
        printContacts();
    }
}











