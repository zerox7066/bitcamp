//: ## 메서드(Method) - 관련 메서드를 분류하기

package bitcamp.java100;

public class Test17_16 {
    
    // entry point
    public static void main(String[] args) {
        // 별도의 클래스로 분류된 메서드 사용
        // 클래스명.메서드명()
        
        Test17_16_A.m1();
        Test17_16_B.m1();
        Test17_16_A.m2();
        Test17_16_B.m2();
        Test17_16_A.m3();
        Test17_16_B.m3();
        
        Test17_16_B.m4();
        
        System.out.println("--------------------------------------------------");
        
        
        // 다른 패키지에 있는 클래스 사용
        
        //Test17_16_C.m1();  // 컴파일 오류!
        
        bitcamp.java100.other.Test17_16_C.m1();
        bitcamp.java100.other.Test17_16_C.m2();
        bitcamp.java100.other.Test17_16_C.m3();
        bitcamp.java100.other.Test17_16_C.m4();
        
        System.out.println("--------------------------------------------------");
        
        
    }
}






















