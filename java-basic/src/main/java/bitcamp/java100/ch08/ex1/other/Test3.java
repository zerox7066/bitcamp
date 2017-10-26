// 캡슐화 - 다른 패키이지의 서브 클래스에서 멤버에 접근하는 경우

package bitcamp.java100.ch08.ex1.other;

import bitcamp.java100.ch08.ex1.A;

public class Test3 extends A {
    
    public static void main(String[] args) {
        // private 접근
        //A.v1 = 100;   // 접근불가!
        
        // default 접근
        //A.v2 = 200;
        
        // protected 접근
        A.v3 = 300;
        
        // public 접근
        A.v4 = 400;
    }

}
