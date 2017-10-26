
package bitcamp.java100.ch07.ex1;

public class CalculatorA {
    int result;
    
    void multiple(int value) {
        this.result *= value;
    }

    // Test4.java 실행 오류
    /*void divide(int value) {
        this.result /= value;
    }*/
    
    void divide(int value) {
        if (value == 0) {
            System.out.println("0으로 나누면 안됩니다.");
            return;
        }
        this.result /= value;
    }
    
    void plus(int value) {
        this.result += value;
    }
    
    void minus(int value) {
        this.result -= value;
    }
}