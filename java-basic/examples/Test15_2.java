// ## 연산자 - 정수의 기본 연산 단위는 int이다.
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_2 {

    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        //byte b3 = b1 - b2;  // 컴파일 오류!

        short s1 = 10;
        short s2 = 20;
        //short s3 = s1 + s2;  // 컴파일 오류! 
        int r1 = s1 + s2;
        long r2 = s1 + s2;
    }
}