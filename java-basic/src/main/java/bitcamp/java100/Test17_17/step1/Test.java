//: ## 메서드(Method) - 인스턴스(클래스 설계도로 만든 메모리)를 다루는 메서드

package bitcamp.java100.Test17_17.step1;

public class Test {
    
    // entry point
    public static void main(String[] args) {
        // 면적 구하기
        int width = 390;  // 단위 : cm
        int height = 420;  // 단위 : cm
        
        float area = (width * height) / 10000f;
        
        System.out.println(area);
        System.out.println("--------------------------------------------------");
        
        float pyoung = area / 3.3f;
        
        System.out.println(pyoung);
        System.out.println("--------------------------------------------------");
    }
}






















