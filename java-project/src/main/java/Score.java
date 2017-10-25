import java.util.Scanner;


//: ## 사용자 정의 데이터 타입
//: 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다. 
//: > '사용자 정의 데이터 타입'은 데이터를 저장할 *메모리를 설계*하는 것이다.
public class Score {
    
    String name;
    //int[] subjects = new int[3];
    int[] subjects;
    int sum;
    float aver;
        
    // 생성자 : 메모리를 만든후 최소한의 상태를 만드는것
    // 즉 배열의 초기 상태을 만듬
    Score() {
        this.subjects = new int[3];
    }


    Score(String name, int kor, int eng, int math) {  // 가변 파라미터
        this.name = name;        // this.name(instance variable 과 name(local variable, method parameter)
        //this.subjects[0] = kor;
        //this.subjects[1] = eng;
        //this.subjects[2] = math;

        this.subjects = new int[] {kor, eng, math}; // 초기값 할당과 구분

        this.compute();
    }

    void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        // 배열을 생성
        // 생성자에서 배열 생성
        //score.subjects = new int[3];  
        
        System.out.print("국어점수? ");
        this.subjects[0] = keyScan.nextInt();
        
        System.out.print("영어점수? ");
        this.subjects[1] = keyScan.nextInt();
        
        System.out.print("수학점수? ");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
    }
    
    //: 합계와 평균을 계산하는 코드를 다음과 같이 별도의 메서드로 분리한다.
    void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float) this.sum / this.subjects.length;
    }
    
    //: 성적 데이터를 출력하는 코드를 별도의 메서드로 분리한다.
    void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
}
