// 오버라이딩 규칙
// 접근 범위 같거나 확장
// 
package bitcamp.java100.ch08.ex7;

public class B2 extends B {
    // 모두 일치
    //void m1(int a, String s) {}  // OK!
    //protected void m1(int a, String s) {}  // OK!
    //public void m1(int a, String s) {} // OK!
    //void m1(int x, String y) {}   // OK! 파라미터명은 달라도 된다.
    
    // 리턴 타입 불일치
    //int m1(int a, String s) {}   // 컴파일 오류!
    void m1_1(int a, String s) {}   // 새 메서드 추가한 것!
    
    void m1(String a, String s) {}  // 파라미터의 타입이 다르면 새 메서드 추가한 것!
    void m1(String s, int a) {}   //
    void m1(int a) {} // 파라미터의 개수가 다르면 새 메서드 추가한 것!
}
