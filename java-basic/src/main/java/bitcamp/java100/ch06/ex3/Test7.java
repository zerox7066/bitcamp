// 스태틱 멤버 - 클래스 안에 선언된  
package bitcamp.java100.ch06.ex3;

public class Test7 {
    
    // 인스턴스 멤버
    static class A {
        static int a = 100;
        
        static {
            System.out.println("A의 스태틱 블록 실행!");
            System.out.printf("A ===> a = %d\n", A.a);
            // 클래스가 로딩되는 시점
            // 1) 클래스 변수를 사용할 때
            B.b = 222;
            
            // 2) 클래스 메서드를 사용할 때
            B.b1();
            B.b1();
            
            // 3) new 연산자를 사용할 때
            new B();
            
            System.out.printf("A ===> a = %d\n", A.a);
            System.out.println("A의 스태틱 블록 종료!");
        }
        
    }
    
    // 스테틱 멤버
    static class B {
        static int b = 200;
        
        static {
            System.out.println("B의 스태틱 블록 실행!");
            System.out.printf("B ===> b = %d\n", B.b);
            A.a = 111;
            System.out.printf("B ===> b = %d\n", B.b);
            System.out.println("B의 스태틱 블록 종료!");
        }
        
        static void b1() {
            System.out.printf("B ===> b = %d\n", B.b);
            B.b = 500;
            
        }
        
    }
    
    public static void main(String[] args) {
        new A();
        
    }
}
