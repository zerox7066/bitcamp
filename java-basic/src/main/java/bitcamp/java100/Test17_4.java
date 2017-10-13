//: ## 메서드(Method) - 기본 메서드 정의

package bitcamp.java100;

public class Test17_4 {
    // Parameter / Argument 갯수가 변경될 경우
    // Parameter 타입은 일치시켜야 한다.
    // Parameter은 배열로 취급
    static void m1(int... values) {
        System.out.printf("아규먼트 갯수 : %d\n", values.length);
        for (int v : values) {
            System.out.println(v);
        }
        System.out.println("--------------------------------------------------");
    }
    
    //static void m2(int... values1, int... values2) {}
    //static void m2(int... values1, String valuew2) {}
    
    static void m3(String name, int age, int... valuses) {}
    //static void m4(int... valuse, String name, int age) {}  // 컴파일 오류!
    //static void m5(String name, int... values, int age) {}  // 컴파일 오류!
    //static void m6(String name, int... values, String tel) {}  // 컴파일 오류!
    
    static void sum(int... values) {
        int s = 0;
        for (int v : values) {
            s += v;
        }
        System.out.printf("합계: %d\n", s);
    }

    public static void main(String[] args) {
        m1();
        m1(10);
        m1(10, 20);
        m1(10, 20, 30);
        
        sum();
        sum(1, 2, 3, 4, 5);
        sum(100, 80, 90);
    }
}














