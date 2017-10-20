// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;

// 메서드 문법을 이용하여 클래스에 연산자 추가
// 인스턴스를 만들 때 생성자 호출하기
public class Test5 {
    public static void main(String[] args) {
        // 메모리의 주소를 저장할 변수 선언(레퍼런스)
        Score4 score;
        
        // 설계도에 따라 메모리 준비 (준비된 메모리를 "인스턴스", "객체")
        // new 연산자를 통해 준비된 메모리는 "힙(heap)"이라 불리는 영역에 존재
        // 인스턴스를 만들 때 생성자를 호출한다.
        score = new Score4("임꺽정", 100, 80, 70);
        
        System.out.printf("이름 = %s\n", score.name);
        System.out.printf("총점 = %d\n", score.sum);
        System.out.printf("평균 = %.2f\n", score.aver);
    }
}
