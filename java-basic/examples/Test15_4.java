// ## 연산자 - 암시적 형변환으로 해결이 안되는 경우 해결하는 방법
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_4 {

    public static void main(String[] args) {
        float f1 = 3.141592f;
        int i1 = 7654321;
        System.out.printf("f1 = %f,  i1 = %d\n", f1, i1);

        double r1 = f1 + i1;
        System.out.printf("r1 = %f\n", r1);

        double r2 = (double) f1 + (double) i1;  // 7654324.141592
        System.out.printf("r2 = %f\n", r2);

        double r3 = (double) 3.141592 + (double) 7654321;
        System.out.printf("r3 = %f\n", r3);

        double r4 = (double) f1 + i1;  // 7654324.141592
        System.out.printf("r4 = %f\n", r4);

        double r5 = f1 + (double) i1;  // 7654324.141592
        System.out.printf("r5 = %f\n", r5);
    }
}