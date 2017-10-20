// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;

// 기본 생성자 호출하기
public class Test10 {
    public static void main(String[] args) {
        // 메모리의 주소를 저장할 변수 선언(레퍼런스)
        Score9 score;
        
        // 파라미터가 없은 기본 생성자를 찾아 호출        
        score = new Score9();
        
        score = new Score9("홍길동");
    }
}
