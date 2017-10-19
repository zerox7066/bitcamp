//: ## String 클래스 사용법 - Literal String 인스턴스 생성

package bitcamp.java100;

public class Test18_2 {
    
    // entry point
    public static void main(String[] args) {
        String s1;        
        
        // 리터럴 : 그냥 코드로 바로 적은 값
        s1 = "ABC가각간";
         
        String s2 = "ABC가각간";
        
        if (s1 == s2) {
            // constants pool 이라는 별도의 영역에 인스턴스가 생성
            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            System.out.println("s1 = s2");
        }
        
        String s3 = new String("ABC가각간");
        String s4 = new String("ABC가각간");

        System.out.println("s3 = " + s4);
        System.out.println("s4 = " + s4);
        if (s3 == s4) {
            // constants pool 이라는 별도의 영역에 인스턴스가 생성
            System.out.println("s3 = s4");
        }
        System.out.println("--------------------------------------------------");
    }
}






















