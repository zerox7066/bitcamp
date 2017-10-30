package bitcamp.java100.ch08.ex7;

public class C4 extends C3 {
    @Override
    void m1() {
        System.out.println("C4.m1()");
    }
    
    @Override
    void m2() {
        System.out.println("C4.m2()");
    }
    
    void test1() {
        this.m1();   // 메서드 앞에 this 주면 현재 클래스의 메서드
        super.m1();  // 메서드 앞에 super 주면 수퍼 클래스의 메서드
        //super.super.m1();   // 컴파일 오류!
        
        this.m2();   // this은 현재 클래스에서 찾고 없으면 수퍼클래스에서 찾음
        super.m2();  // super은 수퍼클래스에서 찾음
        
        this.m3();
        super.m3();
        
        this.m4();
        super.m4();
    }
    
    public static void main(String[] arge) {
        C4 obj = new C4();
        obj.test1();
    }

}
