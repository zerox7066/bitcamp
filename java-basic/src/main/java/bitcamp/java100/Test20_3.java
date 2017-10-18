// ## 래퍼(wrapper) 클래스 사용법 - 래퍼 객체의 활용

package bitcamp.java100;

import java.io.File;

public class Test20_3 {
    static void print1(String value) {
        System.out.println(value);
    }
    
    static void print2(int value) {
        System.out.println(value);
    }

    static void print3(float value) {
        System.out.println(value);
    }
    
    // Object의 레퍼런스는 자바의 모든 객체의 주소를 저장할 수 있다.
    static void print4(Object value) {
        System.out.println(value);
    }
    
    // entry point
    public static void main(String[] args) {
        print1("문자열");
        print2(300);
        print3(3.14f);        
        
        System.out.println("--------------------------------------------------");
        
        String v1 = "홍길동";
        StringBuffer v2 = new StringBuffer("임꺽정");
        File v3 = new File(".");
        
        print1(v1);    // OK!
        //print1(v2);  // 컴파일 오류!
        //print1(v3);  // 컴파일 오류!
        
        print4(v1);    // OK!
        print4(v2);    // OK!
        print4(v3);    // OK! 
        
        System.out.println("--------------------------------------------------");
        
        print4(new Integer(100));    // OK!
        print4(new Float(3.14f));    // OK!
        print4(new Boolean(true));    // OK! 
        
        System.out.println("--------------------------------------------------");
        
        // primitive 오토박싱
        print4(100);    // 오토박싱을 수행하여 new Integer(100)으로 바뀜
        print4(3.14f);
        print4(true);
        
        
        
        System.out.println("--------------------------------------------------");
    }
}






















