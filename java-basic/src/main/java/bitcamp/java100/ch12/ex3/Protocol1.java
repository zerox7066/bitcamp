// 인터페이스를 정의하는 방법

package bitcamp.java100.ch12.ex3;

public interface Protocol1 {
    // 인터페이스 규칙이기 때문에 모든 메서드는 추상 메서드이다.
    void m1();
    
    abstract void m2();
        
    public abstract void m3();
    
    // public abstract 생략 가능
    void m4();
        
    //void m5() {} // 컴파일 오류!
    
}
