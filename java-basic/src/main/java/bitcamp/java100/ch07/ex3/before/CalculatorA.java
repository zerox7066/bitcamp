
package bitcamp.java100.ch07.ex3.before;

public class CalculatorA {
    int result;
    
    void multiple(int value) {
        this.result *= value;
    }
    
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
