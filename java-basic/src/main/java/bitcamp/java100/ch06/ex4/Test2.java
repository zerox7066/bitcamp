// 클래스 멤버와 인스턴스 멤버의 활용

package bitcamp.java100.ch06.ex4;

public class Test2 {
    // static에서는 인스턴스를 호출할 수 없다.
    static int plus (int a,  int b) {
        return a + b;
    }
    
    static int minus (int a,  int b) {
        return a - b;
    }
    
    static int multiple (int a,  int b) {
        return a * b;
    }
    
    static int divide (int a,  int b) {
        return a / b;
    }
    
    public static void main (String[] args) {
        int result = 0;

        result = plus(2, 5);
        result = multiple(result, 3);
        result = minus(result, 7);
        result = divide(result, 2);
        
        System.out.println(result);
    }

}
