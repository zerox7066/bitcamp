// ## 자바의 최소 연산 단위
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test12_6 {

    public static void main(String[] args) {
        byte b1 = 50;
        byte b2 = 50;
        byte b3;
        
        //리터럴 값 할당 허락
        b3 = 100;

        //변수 할당 허락
        b3 = b1;

        //리터럴과 리터럴 연산 허락
        b3 = 50 + 50; //리터럴과 리터럴 연산 허락

        //변수의 연산 허락하지 않음
        //b3 = b1 + b2; //컴파일 오류
        //b3 = b1 + 50; //컴파일 오류

        //byte 변수의 연산 결과는 int이다.
        //short s1;
        //s1 = b1 + b2;
    }
}