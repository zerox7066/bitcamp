// ## 연산자 - 논리 연산자
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_8 {

    public static void main(String[] args) {
        System.out.printf("true && true = %b\n",  true && true);
        System.out.printf("true && false = %b\n",  true && false);
        System.out.printf("false && true = %b\n",  false && true);
        System.out.printf("false && false = %b\n",  false && false);
        System.out.println();
        
        System.out.printf("true || true = %b\n",  true || true);
        System.out.printf("true || false = %b\n",  true || false);
        System.out.printf("false || true = %b\n",  false || true);
        System.out.printf("false || false = %b\n",  false || false);
        System.out.println();

        System.out.printf("true & true = %b\n",  true & true);
        System.out.printf("true & false = %b\n",  true & false);
        System.out.printf("false & true = %b\n",  false & true);
        System.out.printf("false & false = %b\n",  false & false);
        System.out.println();
        
        System.out.printf("true | true = %b\n",  true | true);
        System.out.printf("true | false = %b\n",  true | false);
        System.out.printf("false | true = %b\n",  false | true);
        System.out.printf("false | false = %b\n",  false | false);
        System.out.println();

        boolean b1 = false;
        boolean result = false && (b1 = true);
        System.out.printf("b1=%b, result=%b\n", b1, result);

        b1 = false;
        result = false & (b1 = true);
        System.out.printf("b1=%b, result=%b\n", b1, result);
    }
}