//: ## String 클래스 사용법 - Literal String 인스턴스 생성

package bitcamp.java100;

public class Test18_3 {
    
    // entry point
    public static void main(String[] args) {
        String s1 = "ABC가각간";
        String s2 = "ABC가각간";
        String s3 = "ABC가각간";
        

        String s4 = new String("ABC가각간");
        String s5 = new String("ABC가각간");
        String s6 = new String("ABC가각간");
        
        if (s1 == s2) System.out.println("s1 == s2");
        if (s2 == s3) System.out.println("s2 == s3");
        
        if (s1 != s4) System.out.println("s1 != s4");
        if (s1 != s5) System.out.println("s1 != s5");
        if (s1 != s6) System.out.println("s1 != s6");
        
        if (s4 != s5) System.out.println("s4 != s5");
        if (s4 != s6) System.out.println("s4 != s6");
        if (s4 != s6) System.out.println("s4 != s6");
        
        if(s1 == "ABC가각간") System.out.println("s1 == ABC가각간");
        if(s4 != "ABC가각간") System.out.println("s4 != ABC가각간");
        
        System.out.println(s1);
        System.out.println(s4);
        
        System.out.println("--------------------------------------------------");
    }
}






















