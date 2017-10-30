// 다형성 - 오버로딩(overloading)
// 파라미터의 개수나 타입, 순서가 다르더라도 같은 기능을 수행하는 메서드에 대해
// 같은 이름을 부여함으로써 같은 기능에 대해 같은 이름의 메서드를 사용할 수 있도록
// 일관성을 제공하는 문법이다.

package bitcamp.java100.ch08.ex8;

public class Test4 {
    
    public static void main(String[] args) {
        A obj = new A();
        
        obj.m1(100);  // OK!
        
        // 값을 안주는데 받겠다고 하면 오류!
        //int value = obj.m1(100);   // 컴파일 오류!
        
        // m2()이 값을 리턴하더라도 호출자는 그 값을 반드시 받을 필요가 없다. 
        obj.m2();
        
        // 리턴값을 받을 수 있다.
        int result = obj.m2();
        
        // 오버로딩은 리턴 타입을 일치시켜야 한다.
    }
}
