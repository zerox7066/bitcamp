// ## 문자 코드 값을 저장할 변수
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test12_9 {

    public static void main(String[] args) {
        char c1;
        c1 = 44032;
        char c2 = 0xD669;

        char n1, n2, n3;
        n1 = 0xD669;
        n2 = 0xC6D0;
        n3 = 0xCCA0;
        System.out.printf("%c %c %c\n", n1, n2, n3);
        
        n1 = '황';
        n2 = '원';
        n3 = '철';
        System.out.printf("%c %c %c\n", n1, n2, n3);

        char x = '7';
        int num;
        num = x - 48;

        System.out.println(num);

    }
}