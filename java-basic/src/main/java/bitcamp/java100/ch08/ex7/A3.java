// 다형성 - 오버라이딩할 때 접근 제어의 확장 및 축소

package bitcamp.java100.ch08.ex7;

public class A3 extends A {
    
    // default  ==>  protected
    //protected void m2() {}  // OK!
    
    // default  ==> public
    //public void m2() {}  // OK!
    
    public void m3() {}  // OK!
    
    // 오버라이딩은 접근 범위 축소 불가능
    // default  ==> private
    //private void m2() {}  // 컴파일 오류!
    
    // protected  ==> default
    //void m3() {}  // 컴파일 오류!

    // public  ==>  protected
    //protected void m4() {}  // 컴파일 오류!

}
