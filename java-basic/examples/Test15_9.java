// ## 연산자 - 논리 연산자
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_9 {
    public static void main(String[] args) {
        int age = 27;
        
        String result = (age <= 19) ? "미성년" : "성년";
        
        System.out.println(result);
    } 
}