// 상속(inheritance)
// 기존 클래스를 수정하면 새로운 버거가 발생할 수 있다.
// 기존 클래스를 그대로 두고 기존 클래스를 상속 받아 클래스 생성

package bitcamp.java100.ch07.ex2;

public class Test4 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.result = 1;
        calc.multiple(5);
        
        calc.divide(0);
        
        calc.multiple(17);
        
        
        System.out.println(calc.result);
    }
}
