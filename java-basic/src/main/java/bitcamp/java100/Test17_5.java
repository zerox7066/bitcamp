//: ## 메서드(Method) - 기본 메서드 정의

package bitcamp.java100;

public class Test17_5 {
    // 값을 반환하는 메소드 정의
    static String m1() {
        return "Hello";
    }
    
    static int m2() {
        return 100;
    }
    
    static boolean m3() {
        return true;
    }
    
    // 메서드에 선언된 타입과 return 타입은 동일
    //static int m4() {return "Hello";}  // 컴파일 오류!
    //static int m5() {}  // 컴파일 오류!
    
    // return 문을 만나면 메서드 종료!!!
    static int m6() {
        return 100;
        //int a = 100;  // Unreachable code
        //a++;
    }

    public static void main(String[] args) {
        // 값을 반환하는 메서드 호출
        String v = m1();
        System.out.println(v);
        System.out.println("--------------------------------------------------");
        
        System.out.println(m1());  // debug에 불합리
        System.out.println("--------------------------------------------------");
        
        // 반환값을 저장하지 않으면 반환값은 버려진다.
        m1();
        
        // 타입 일치
        //String s m2();   // 컴파일 오류!
    }
}














