// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;

public class Test1 {
    public static void main(String[] args) {
        // 학생의 성적 정보 저장 변수
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
        
        name = "홍길동";
        kor = 100;
        eng = 100;
        math = 100;
        sum = kor + eng + math;
        aver = sum / 3f;
    }
}
