// ## 연산자 - 비트 이동 연산자 응용( >>  >>>  <<)
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_12_2 {
    public static void main(String[] args) {
        // ### 문제 : int 메모리에 들어 있는 값을 1바이트 씩 앞에서 부터 출력
        int v = 1234567890;
        
        System.out.println(Integer.toHexString(v));
        
        System.out.println(Integer.toHexString((v & 0xff000000) >> 24));
        System.out.println(Integer.toHexString((v & 0x00ff0000) >> 16));
        System.out.println(Integer.toHexString((v & 0x0000ff00) >> 8));
        System.out.println(Integer.toHexString((v & 0x000000ff) >> 0));
    }
}