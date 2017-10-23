// 스태틱 멤버 - 스태틱 블록 실행 확인 
package bitcamp.java100.ch06.ex3;

public class Test5 {
    
    static int v1 = 100;
    static void m1() {
        System.out.println("m1()");
    }
    
    int v2 = 200;
    void m2() {
        System.out.println("m2()");
    }
    
    public static void main(String[] args) {
        // main 스태틱으로 선언
        // jvm에서 인스턴스를 생성하지 않아도 호출
        
        System.out.println(v1);  // OK!
        m1();  // OK!
        
        // 인스턴스 변수는 인스턴스 주소르 ㄹ통해서만 접근
        //System.out.println(v2);  // 컴파일 오류!
        
        //m2(); // 컴파일 오류!
        
        Test5 obj1 = new Test5();
        obj1.v2 = 100;
        System.out.println(obj1.v2);
        
        Test5 obj2 = new Test5();
        obj2.v2 = 200;
        System.out.println(obj2.v2);
        
        
    }
}
