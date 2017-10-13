// ## 연산자 - char 데이터와 명시적 형변환
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_14 {
    public static void main(String[] args) {
        char v1 = 44032;
        System.out.print(v1);
        System.out.println();
        System.out.printf("%s", v1);
        System.out.println();
        System.out.println(v1);
        System.out.println(Integer.toHexString(v1));
        System.out.println();
        
        int v2 = 44032;
        System.out.print(v2);
        System.out.println();
        System.out.printf("%d", v2);
        System.out.println();
        System.out.println(v2);
        System.out.println(Integer.toHexString(v2));
        
        System.out.println();
        System.out.println((char)v2);
    }
}