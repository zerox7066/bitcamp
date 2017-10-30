package bitcamp.java100.ch08.ex8;

public class Test5 {
    
    static int plus(int a, int b) {
        return a + b;
    }
    
    /*
    static int plus(int v1, int v2) {
        return v1 + v2 + v2;
    }*/

    // 파라미터 순서에 따라 메서드를 구분할 수 있다.
    static private int m1(int a, String b, String c) {
        System.out.println("m1(int, String, String)");
        return 1;
    }
    
    static protected int m1(int a, String b, int c) {
        System.out.println("m1(int,String, int)");
        return 1;
    }
        

    static void m1(String a, int b) {
        System.out.println("m1(String, int)");
    }
    
    public static void main(String[] args) {
        System.out.println(plus(10, 20));
        
        m1(10, "aaa", "bbb");
        m1(20, "ccc", 10);
        m1("aaa", 10);
        
        System.out.println(10);   // println(int)
        System.out.println(10f);  // println(float)
        System.out.println(10L);  // println(long)
    }
}
