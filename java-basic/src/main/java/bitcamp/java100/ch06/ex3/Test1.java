// 스태틱 멤버 - 스태틱 필드 
package bitcamp.java100.ch06.ex3;

public class Test1 {
    
    public static void main(String[] args) {
        
        System.console().readLine("계속 실행 하시겠습니까");
        
        // static variable (Method Area)
        // classname.variable = value;
        System.out.println(MyClass.v1);  // 클래스가 메모리에 로딩되는 시점
        
        MyClass.v1 += 200;
        
        System.console().readLine("계속 실행 하시겠습니까");
        
        System.out.println(MyClass.v1);
        
        
    }
}
