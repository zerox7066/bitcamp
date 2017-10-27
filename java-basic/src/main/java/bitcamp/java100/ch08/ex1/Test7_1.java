// 캡슐화의 존재 이유
// 인스턴스 변수에 무효한 값이 저장되는 것을 방지함으로써 추상화가 무너지는 것을 막는다.
// 추상화(abstraction) : 사물이난 사람을 데이터와 메서드로 표현
// 클래스를 정의하는 것을 말한다.

package bitcamp.java100.ch08.ex1;

class Member {
    String name;
    int age;
    float weight;
    float height;
}

public class Test7_1 {

    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 20;
        m.weight = 900.7f;
        m.height = 16.0f;
    }
}
