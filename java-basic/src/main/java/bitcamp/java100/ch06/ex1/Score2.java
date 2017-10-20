package bitcamp.java100.ch06.ex1;

// 사용자 정의 테이블(User Definition Data Type Table) - 메모리를 설계
// 새 데이터 다루는 연산자 정의 - 메서드 정의
public class Score2 {
    // 필드 선언(인스턴스 변수)
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    // 메서드(연산자 Operator : 인스턴스 변수를 처리) 정의
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}


