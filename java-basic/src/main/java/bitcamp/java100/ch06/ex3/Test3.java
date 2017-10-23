// 스태틱 멤버 - 인스턴스 변수가 생성될 때 
package bitcamp.java100.ch06.ex3;

public class Test3 {
    
    public static void main(String[] args) {
        //MyClass2.v1 = 200;
        
        //MyClass2.m1();
        
        //new MyClass2();
        
        // 레퍼런스 변수를 선언 할때는 클래스가 로딩되지 않는다. 
        MyClass obj1 = null; 
        MyClass obj2 = null;
        
        System.out.println(obj1.v1);
        // 가능한 레퍼런스르 가지고 클래스 변수를 사용하지 말라.
        
    }
}
