// ## 연산자 - 비트 연산자           xor  얼굴 + 배경
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_10 {
    public static void main(String[] args) {
        int v1 = 0b0101_1100;
        int v2 = 0b0110_0110;
        
        int result = v1 & v2;
        System.out.println(java.lang.Integer.toBinaryString(result));
    }
}