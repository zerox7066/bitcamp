// ## 래퍼(wrapper) 클래스 사용법 - 오토박싱 & 언박싱

package bitcamp.java100;

public class Test20_2 {
    
    // entry point
    public static void main(String[] args) {
        int i =100;
        
        // 오토 박싱(auto-boxing)
        Integer r1 = 100;  // new Integer(100)
        
        Integer r2 = new Integer(300);
        
        // 오토 언박싱(auto-unboxing)
        int i2 = r2;  // r2.intValue()
        
        System.out.println("--------------------------------------------------");
    }
}






















