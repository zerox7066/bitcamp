// 캡슐화의 존재 이유
// 인스턴스 변수에 무효한 값이 저장되는 것을 방지함으로써 추상화가 무너지는 것을 막는다.
// 추상화(abstraction) : 사물이난 사람을 데이터와 메서드로 표현
// 클래스를 정의하는 것을 말한다.

package bitcamp.java100.ch08.ex1;

class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
}

public class Test8_1 {

    public static void main(String[] args) {
        Score s = new Score();
        
        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        
        // 계산 오류 발생
        s.sum = 280;
        s.aver = s.sum /3f;
        
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.kor, s.eng, s.math, s.sum, s.aver);
    }
}
