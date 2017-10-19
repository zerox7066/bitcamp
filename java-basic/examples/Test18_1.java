//: ## String 클래스 사용법 - String 인스턴스 생성

package bitcamp.java100;

public class Test18_1 {
    
    // entry point
    public static void main(String[] args) {
        String s1;        
        s1 = new String("ABC가각간");
        
        System.out.println(s1);
        System.out.println("--------------------------------------------------");
        
        String s2 = new String("ABC가각간");
        
        if(s1 != s2) {
            System.out.println("s1 != s2");
        }
        System.out.println("--------------------------------------------------");
    }
}






















