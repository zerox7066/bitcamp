package bitcamp.java100.ch06.ex4;

public class Calculator3 {
    // static에서는 인스턴스를 호출할 수 없다.
    
    // static변수와 instance 변수의 초기값은 '0'
    int result;
 
    // 스태틱 멤버는 인스턴스 멤버를 사용할 수 없다.
    // 인스턴스 멤버를 보다 쉽게 다루기 위해 인스턴스 메서드로 전환
    void plus (int value) {
        this.result += value;
    }
    
    void minus (int value) {
        this.result -= value;
    }
    
    void multiple (int value) {
        this.result *= value;
    }
    
    void divide (int value) {
        this.result /= value;
    }
}
