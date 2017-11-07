package bitcamp.java100.ch12.ex1;

public class Caller {
    
    public static void main(String[] args) {
        Protocol obj = new Callee();
        
        // String 클래스는 인터페이스 Protocol 규약이 아님
        //Protocol obj2 = new String();   // 컴파일 오류!
        
        // 인터페이스 구현체
        obj.m1();
        obj.m2();
    }

}
