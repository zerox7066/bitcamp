// 상속(inheritance)
// 기존 클래스를 수정하면 새로운 버거가 발생할 수 있다.
// 기존 클래스를 그대로 두고 기존 클래스를 상속 받아 클래스 생성

package bitcamp.java100.ch07.ex2;

public class Test2 {

    public static void main(String[] args) {
        CalculatorA calc = new CalculatorA();        
        calc.plus(10);
        calc.plus(20);
        calc.minus(7);
        calc.multiple(2);
        calc.divide(3);
        
        System.out.println(calc.result);
    }
}
