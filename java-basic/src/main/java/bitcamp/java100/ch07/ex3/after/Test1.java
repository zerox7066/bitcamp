// 상속(inheritance) -Generalization 적용
// 1) Specialization 
//    - 슈퍼 클래스를 상속 받아 기능을 추가하여 더 특별한 서브 클래스를 만드는 것.
//
// 2) Generaization
//    - 서브 클래스들의 공통 변수나 공통 메서드를 추출하여

package bitcamp.java100.ch07.ex3.after;

public class Test1 {

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
