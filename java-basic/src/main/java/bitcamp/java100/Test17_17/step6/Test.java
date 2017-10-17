//: ## 메서드(Method) - 인스턴스(클래스 설계도로 만든 메모리)를 다루는 메서드

package bitcamp.java100.Test17_17.step6;

public class Test {
    
    // entry point
    public static void main(String[] args) {
        // 면적 구하기
        Rect r;   // 인스턴스를 저장할 레퍼런스 선언
        r = new Rect();  // 인스턴스 생상하고 그 주소를 레퍼런스에 저장
        
        // 인스턴스의 각 필드(항목)에 값을 저장
        r.width = 390;  // 단위 : cm
        r.height = 420;  // 단위 : cm
        
        //float area = (width * height) / 10000f;
        
        // 인스턴스주소.메서드명();
        System.out.println(r.area());
        System.out.println("--------------------------------------------------");
        
        //float pyoung = area / 3.3f;
        
        System.out.println(r.pyeong());
        System.out.println("--------------------------------------------------");
    }
}






















