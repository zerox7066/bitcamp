// ## 연산자 - 복합 대입 연산자 (Compound Assignment Operator)
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_13 {
    public static void main(String[] args) {
        int sum = 0;
        
        sum = sum + 100;
        sum = sum + 100;
        System.out.println(sum);
        
        sum = 0;
        sum += 100;
        sum += 100;
        System.out.println(sum);
    }
}