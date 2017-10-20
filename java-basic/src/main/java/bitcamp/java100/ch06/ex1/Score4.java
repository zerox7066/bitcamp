package bitcamp.java100.ch06.ex1;

// 사용자 정의 테이블(User Definition Data Type Table) - 메모리를 설계
public class Score4 {
    // 필드 선언(인스턴스 변수)
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    // 특별한 인스턴스 메서드 "생성자(Constructor)"
    // 호출방법 : new 생성자명();
    Score4(String name, int kor, int eng, int math) {
        System.out.println("Score4() 호출됨");
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


