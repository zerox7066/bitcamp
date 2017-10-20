package bitcamp.java100.ch06.ex1;

// 사용자 정의 테이블(User Definition Data Type Table) - 메모리를 설계
// 기본 생성자(default constructor)
public class Score7 {
    // 필드 선언(인스턴스 변수)
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    // 파라미터 없는 생성자 => default constructor
    Score7() {
        this("홍길동");  // 내부 생성자 호출
        
        /*
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute();
        */
    }
    
    Score7(String name) {
        
        this(name, 50, 50, 50);
        /*
        this.name = name;
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute();
        */
    }
    
    Score7(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }
    
    // 메서드(연산자 Operator : 인스턴스 변수를 처리) 정의
    void compute() {
        //this();  // 컴파일 오류!
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}


