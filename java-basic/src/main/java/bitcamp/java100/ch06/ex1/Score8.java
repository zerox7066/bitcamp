package bitcamp.java100.ch06.ex1;

// 사용자 정의 테이블(User Definition Data Type Table) - 메모리를 설계
// 기본 생성자(default constructor)
public class Score8 {
    // 필드 선언(인스턴스 변수)
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    // 생성자
    Score8() {
        
    }
    Score8(String name) {
        this.name = name;
        
        // this를 컴파일러가 자동으로 붙인다.
        kor = 50;
        eng = 50;
        math = 50;
        
        compute();
    }
    
    // 메서드(연산자 Operator : 인스턴스 변수를 처리) 정의
    void compute() {
        //this();  // 컴파일 오류!
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}


