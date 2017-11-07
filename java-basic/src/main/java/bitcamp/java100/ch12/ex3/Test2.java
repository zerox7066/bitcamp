// 인터페이스 구현

package bitcamp.java100.ch12.ex3;

// 인터페이스에 선언된 모든 메서드를 구현해야 한다.
public class Test2 implements Protocol3 {

    @Override
    public void m1() {
        System.out.println("m1()");
    }

    @Override
    public void m2(int v) {
        System.out.println("m2()");
    }

    @Override
    public void m3(String v) {
        System.out.println("m3()");
    }

}
