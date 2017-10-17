//: ## 메서드(Method) - 기본 메서드 정의

package bitcamp.java100;

public class Test17_3 {
    
    static void m1(String name) {
        System.out.printf("%s님  반갑습니다!\n", name);
    }
    
    static void m2(String name, int age) {
        System.out.printf("%s(%d)님 반갑습니다!\n", name, age);
    }

    public static void main(String[] args) {
        // 호출하는 방법        
        m1("홍길동");
        m1("임꺽정");
        m1("유관순");
        System.out.println("--------------------------------------------------");
        
        m2("홍길동", 20);
        m2("임꺽정", 30);
        m2("유관순", 16);
        System.out.println("--------------------------------------------------");
    }
}














