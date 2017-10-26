// 상속 - java.lang.Object 클래스
// - 자바의 모든 클래스는 Object의 자손이다.

package bitcamp.java100.ch07.ex4;


public class Test1 /*extends Object*/ {
    // static Class class = new Class();
    
    public static void main(String[] args) {
        // 해당 인스턴스가 어떤 클래스의 자손인지 검사
        Test1 obj = new Test1();
        
        if (obj instanceof Test1) {
            System.out.println("obj는 Test1의 인스턴스이다.");
        }
        
        if (obj instanceof Object) {
            System.out.println("obj는 Object의 인스턴스이다.");
        }
    }
    
    // 클래스는 그 자신의 정보를 "class"라는 스태틱 변수에 보관
    Class c = Test1.class;
    
    Class sc = c.getSuperclass();
}
