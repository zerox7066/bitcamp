//: ## 메서드(Method) - 기본 메서드 정의

package bitcamp.java100;

public class Test17_8 {
    // 사용자 정의 데이터 객체를 이용해서 여러개의 값을 반환
    static class Member{
        String name;
        int age;
        boolean working;
        float score;
        char level;
    }
    
    // 사용자 정의 객체를 리턴
    // Primitive 타입만 값을 리턴!!!
    static Member m1() {
        Member ref = new Member();
        ref.name = "홍길동";
        ref.age = 20;
        ref.working = false;
        ref.score = 4.12f;
        ref.level = 'M';  // '' 은 문자의 유니코드 값 저장
        
        // ref 레퍼런스에 저장된 객체의 주소를 리턴
        return ref;
    }
    
    public static void main(String[] args) {
        Member mem = m1();
        
        System.out.println(mem.name);
        System.out.println(mem.age);
        System.out.println(mem.working);
        System.out.println(mem.score);
        System.out.println(mem.level);
        System.out.println("--------------------------------------------------");
    }
}














