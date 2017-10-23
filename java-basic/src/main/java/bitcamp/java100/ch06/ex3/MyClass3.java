package bitcamp.java100.ch06.ex3;

public class MyClass3 {
    
    // 스태틱 변수 = 클래스 변수
    static int v1  = 100;
    
    // 스태틱 메서드 = 클래스 메서드
    static void m1() {
        System.out.println(v1);
    }
    
    // 스태틱 블록
    static {
        System.out.println("MyClass3의 static 블록실행1111!");
        v1 = 300;
    }
    
    // 스태틱 블록을 여러개는 가능하지만 한개만 만듬
    static {
        System.out.println("MyClass3의 static 블록실행2222!");
    }
}
