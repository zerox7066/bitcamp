// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;

// 여러개의 생성자에서 한 개 선택
public class Test6 {
    public static void main(String[] args) {
        // 메모리의 주소를 저장할 변수 선언(레퍼런스)
        Score5 score;
        
        score = new Score5();
        
        score = new Score5("임꺽정", 100, 100, 100);
        
        score = new Score5("유관순");
    }
}
