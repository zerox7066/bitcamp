package bitcamp.java100.ch06.ex1;

// 사용자 정의 테이블(User Definition Data Type Table) - 메모리를 설계
// 기본 생성자(default constructor)
public class Score9 {
    // 필드 선언(인스턴스 변수)
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    // 인스턴스 초기화 블록 정의
    {
        System.out.println("인스턴스 초기화 블록 실행1111!");
    }

    {
        System.out.println("인스턴스 초기화 블록 실행2222!");
    }
    
    Score9(){
        System.out.println("Socre9() 호출됨!");
    }
    
    Score9(String name){
        System.out.println("Socre9(String) 호출됨!");
    }
    
    // 메서드(연산자 Operator : 인스턴스 변수를 처리) 정의
    void compute() {
        //this();  // 컴파일 오류!
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}


