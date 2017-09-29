// ## 객체(object)와 가비지(garbage)
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test13_6 {

    public static void main(String[] args) {
        // 배열의 주소를 저장하는 레퍼런스
        int[] arr1;

        // new 명령으로 준비된 메모리 => "인스턴스(instance)"
        arr1 = new int[3];

        // 새로 배열을 정의하면 이전 배열은 Garbage 라 한다.
        arr1 = new int[5];
    }
}