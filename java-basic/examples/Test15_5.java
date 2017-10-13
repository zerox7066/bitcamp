// ## 연산자 - 증가/감소 연산자
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_5 {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        a = a + 1;
        b = b - 1;
        System.out.printf( "a = %d, b = %d\n", a, b);

        a = 10;
        b = 10;

        ++a;
        --b;
        System.out.printf( "a = %d, b = %d\n", a, b);

        a = 10;
        b = 10;

        a++;
        b--;
        System.out.printf( "a = %d, b = %d\n", a, b);

        // prefix
        a = 10;
        b = 10;
        int r1 = ++a;
        int r2 = --b;
        System.out.printf( "a = %d, b = %d, r1 = %d, r2 = %d\n", a, b, r1, r2);
        
        //postfix
        a = 10;
        b = 10;
        r1 = a++;
        r2 = b--;
        System.out.printf( "a = %d, b = %d, r1 = %d, r2 = %d\n", a, b, r1, r2);
        
        //postfix
        a = 10;
        a = ++a;
        System.out.printf( "a = %d\n", a);

        //postfix
        b = 10;
        b = b++;
        System.out.printf( "b = %d\n", b);

        a = 5;
        r1 = ++a + ++a * ++a;
        System.out.printf( "a = %d, r1 = %d\n", a, r1);
        
        a = 5;
        r1 = a++ + a++ * a++;
        System.out.printf( "a = %d, r1 = %d\n", a, r1);
    }
}