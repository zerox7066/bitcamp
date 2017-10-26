// 클래스의 접근 범위

package bitcamp.java100.ch08.ex1.other;

import bitcamp.java100.ch08.ex1.A;   // public 이기 때문에
//import bitcamp.java100.ch08.ex1.B;   // class 가 default

public class Test5 {
    public static void main(String[] args) {
        //new B();
        new A();
    }

}
