// ## 배열의 길이와 인덱스
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test13_3 {

    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[3];
        System.out.println(arr1.length);

        arr1[0] = 100;
        arr1[1] = 90;
        arr1[2] = 80;

        //java.lang.ArrayIndexOutOfBoundsException 예외 발생
        //컴파일 에러 발생하지 않음
        //arr1[-1] = 200;
        //arr1[3] = 100;
    }
}