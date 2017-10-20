package bitcamp.java100.ch06.ex1;

// 사용자 정의 테이블(User Definition Data Type Table) - 메모리를 설계
// 객체지향의 "다형성(polymorphism)" 규칙에는
public class Score5 {
    // 필드 선언(인스턴스 변수)
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    // 파라미터 없는 생성자
    Score5() {
        System.out.println("Score5() 호출됨");
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute();
    }
    
    // 파라미터 있는 생성자
    Score5(String name) {
        System.out.println("Score5(String) 호출됨!");
        this.name = name;
    }
    
    // 특별한 인스턴스 메서드 "생성자(Constructor)"
    // 호출방법 : new 생성자명();
    Score5(String name, int kor, int eng, int math) {
        System.out.println("Score5(String, int, int, int) 호출됨");
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }
    
    // 메서드(연산자 Operator : 인스턴스 변수를 처리) 정의
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}


