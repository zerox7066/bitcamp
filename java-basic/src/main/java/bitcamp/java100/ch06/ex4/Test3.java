// 클래스 멤버와 인스턴스 멤버의 활용

package bitcamp.java100.ch06.ex4;

public class Test3 {
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
    
    public static void main (String[] args) {
        plus(2);
        plus(5);
        multiple(3);
        minus(7);
        divide(2);
        
        System.out.println(result);
    }

}
