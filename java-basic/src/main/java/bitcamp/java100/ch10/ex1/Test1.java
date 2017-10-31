// 패키지 멤버 클래스 사용

package bitcamp.java100.ch10.ex1;

import bitcamp.java100.ch10.ex1.other.C;

public class Test1 {
    
    public static void main(String[] args) {
        // 1) 같은 패키지에 소속된 클래스 사용
        A obj = new A();
        
        // 2) 다른 패키지에 소속된 클래스 : 패키지명 표시
        bitcamp.java100.ch10.ex1.other.B obj2 = new 
                bitcamp.java100.ch10.ex1.other.B();
        
        //other.B obj3 = new other.B();  // 컴파일 오류!
        
        // 3) 다른 패키지에 소속된 클래스 import 표시
        C obj4 = new C();
        
        // 4) 다른 패키지에 소속된 클래스를 사용하려면 공개되어야 한다.
        //bitcamp.java100.ch10.ex1.other.D obj5 = 
        //        new bitcamp.java100.ch10.ex1.other.D();  // 컴파일 오류!
        
        // 5) 한 소스 파일에 여러 개의 패키지 멤버 클래스를 정의
        F obj6 = new F();
        G obj7 = new G();
    }

}
