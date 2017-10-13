// ## 연산자 - 다른 타입의 변수와 연산
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_3 {

    public static void main(String[] args) {
        byte b1 = 20,  b2 = 22;
        short s1 = 30,  s2 = 33;
        int i1 = 40,  i2 = 44;
        long l1 = 50,  l2 = 55;
        float f1 = 3.14f,  f2 = 45.32f;
        double d1 = 4567.8988, d2 = 976.5432;

        int r1 = b1 + s1;
        r1 = b1 + i1;
        r1 = i1 + s1;

        //r1 = b1 + l1;  // 계산 결과는 long 타입
        //r1 = s1 + l1;  // 계산 결과는 long 타입
        //r1 = i1 + l1;  // 계산 결과는 long 타입
        long r2 = i1 + l1;
        r2 = b1 + l1;
        r2 = s1 + l1;

        //long r3 = b1 + f1;  // 계산 결과는 long 타입
        //r3 = s1 + f1;  // 계산 결과는 long 타입
        //r3 = i1 + f1;  // 계산 결과는 long 타입
        //r3 = l1 +f1;  // 계산 결과는 long 타입

        float r4 = b1 + f1;
        System.out.printf("%f\n", r4);
        r4 = s1 + f1;
        System.out.printf("%f\n", r4);
        r4 = i1 + f1;
        System.out.printf("%f\n", r4);
        r4 = l1 + f1;
        System.out.printf("%f\n", r4);

        //float r5 = f1 + d1;
        double r5 = b1 + d1;
        r5 = s1 + d1;
        r5 = i1 + d1;
        r5 = l1 + d1;
    }
}