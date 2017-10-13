// ## 연산자 - 비트 이동 연산자 활용( >>  >>>  <<)
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_12_1 {
    public static void main(String[] args) {
        int v = 87;  // 0000_0000_0000_0000_0000_0000_0101_0111
        
        for (int i = 1; i < 10; i++) {
            System.out.println(v >> i);
        }
        
        v = -87;
        for (int i = 1; i < 10; i++) {
            System.out.println(v >> i);
        }
        
        v = 87;
        for (int i = 1; i < 10; i++) {
            System.out.println(v >>> i);
        }
        
        v = -87;
        for (int i = 1; i < 10; i++) {
            System.out.println(v >>> i);
        }
        
        v = 5;
        for (int i = 1; i < 10; i++) {
            System.out.println(v << i);
        }
        
        v = -5;
        for (int i = 0; i < 40; i++) {
            //System.out.println(v << i);
            System.out.printf("%32s,  %d\n", Integer.toBinaryString(v << i), v << i);
        }
    }
}