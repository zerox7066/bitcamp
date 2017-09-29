// ## 부동 소수점 변수
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test12_7 {

    public static void main(String[] args) {
        float f1;
        f1 = 9876567f;
        System.out.println(f1);

        f1 = 9876543456789L;
        System.out.println(f1); // 값이 짤림
        
        //f1 = 9876543.4567;  //컴파일 오류

        f1 = 9876543.4567f;
        System.out.println(f1); // 값이 짤림

    }
}