// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;

// 메서드 문법을 이용하여 클래스에 연산자 추가
public class Test3 {
    public static void main(String[] args) {
        // 메모리의 주소를 저장할 변수 선언(레퍼런스)
        Score2 score;
        
        // 설계도에 따라 메모리 준비 (준비된 메모리를 "인스턴스", "객체")
        // new 연산자를 통해 준비된 메모리는 "힙(heap)"이라 불리는 영역에 존재
        score = new Score2();
        
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 100;
        score.math = 100;
        
        score.compute();
    }
}
