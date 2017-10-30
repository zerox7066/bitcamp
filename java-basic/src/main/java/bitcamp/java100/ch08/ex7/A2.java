package bitcamp.java100.ch08.ex7;

public class A2 extends A {
    public void test1() {
        m4(); // 상속 받은 public 사용 가능!
        m3(); // 서브 클래스에서 상소 받은 Protected 멤버 사용 가능!
        m2(); // default는 같은 패키지에서 상속 받은 멤버 사용 가능!
        // m1(); // private 멤버는 그 클래스만 사용 가능 컴파일 오류!
    }

    // private은 클래스 안에서만 사용할 수 있으므로 m1()은 오버라이딩 아니다.
    private void m1() {
        System.out.println("B.m1()");
    }

    // 수퍼클래스 A의 m2() 메서드 오버라이딩
    void m2() {
        super.m2();
    }

    // 수퍼클래스 A의 m3() 메서드 오버라이딩
    protected void m3() {
        // TODO Auto-generated method stub
        super.m3();
    }

    // 수퍼클래스 A의 m4() 메서드 오버라이딩
    public void m4() {
        // TODO Auto-generated method stub
        super.m4();
    }
}
