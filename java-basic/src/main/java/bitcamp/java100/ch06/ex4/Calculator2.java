package bitcamp.java100.ch06.ex4;

public class Calculator2 {
    // static에서는 인스턴스를 호출할 수 없다.
    
    // static변수와 instance 변수의 초기값은 '0'
    int result;
 
    // 스태틱 멤버는 인스턴스 멤버를 사용할 수 없다.
    static void plus (Calculator2 that, int value) {
        that.result += value;
    }
    
    static void minus (Calculator2 that, int value) {
        that.result -= value;
    }
    
    static void multiple (Calculator2 that, int value) {
        that.result *= value;
    }
    
    static void divide (Calculator2 that, int value) {
        that.result /= value;
    }
}
