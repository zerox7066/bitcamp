package bitcamp.java100.ch06.ex1;

// 사용자 정의 테이블(User Definition Data Type Table) - 메모리를 설계
// 기본 생성자(default constructor)
public class Score10 {
    // 필드 선언(인스턴스 변수)
    String name = "이름없음";
    int kor = 10;
    int eng = 10;
    int math = 0;
    int sum;
    float aver;
    
    // 인스턴스 초기화 블록 정의
    {
        this.name = "홍길동";
        this.kor = 20;
    }
    
    // 생성자
    Score10(){
        this.name = "임꺽정";
        
        compute();
    }
    
    // 메서드(연산자 Operator : 인스턴스 변수를 처리) 정의
    void compute() {
        //this();  // 컴파일 오류!
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}


