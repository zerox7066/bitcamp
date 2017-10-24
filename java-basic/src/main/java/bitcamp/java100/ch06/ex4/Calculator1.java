package bitcamp.java100.ch06.ex4;

public class Calculator1 {
    // static에서는 인스턴스를 호출할 수 없다.
    
    // static변수와 instance 변수의 초기값은 '0'
    static int result;
    
    static void plus (int value) {
        result += value;
    }
    
    static void minus (int value) {
        result -= value;
    }
    
    static void multiple (int value) {
        result *= value;
    }
    
    static void divide (int value) {
        result /= value;
    }
}
