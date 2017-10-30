// @Override 애노테이션
// 잘못된 오버라이딩을 방지하는 특별한 명령!

package bitcamp.java100.ch08.ex7;

public class B3 extends X {
    
    // 오버라이딩하는 메서드 앞에 @Override 주석을 붙여라!
    void ml(int a, String s) {}
    
    
    @Override
    //void mI(int a, String s) {}   // 컴파일 오류!
}
