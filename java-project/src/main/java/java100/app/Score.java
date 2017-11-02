package java100.app;

import java.util.Scanner;

//: ## 사용자 정의 데이터 타입
//: 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다. 
//: > '사용자 정의 데이터 타입'은 데이터를 저장할 *메모리를 설계*하는 것이다.
public class Score {
    
    protected String name;
    protected int[] subjects;
    protected int sum;
    protected float aver;
        
    // 생성자 : 메모리를 만든후 최소한의 상태를 만드는것
    // 즉 배열의 초기 상태을 만듬
    public Score() {
        this.subjects = new int[3];
    }


    public Score(String name, int kor, int eng, int math) {  // 가변 파라미터
        this.name = name;        // this.name(instance variable 과 name(local variable, method parameter)
        //this.subjects[0] = kor;
        //this.subjects[1] = eng;
        //this.subjects[2] = math;

        this.subjects = new int[] {kor, eng, math}; // 초기값 할당과 구분

        this.compute();
    }

    public void input() {
        @SuppressWarnings("resource")
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

    public void update() {
        @SuppressWarnings("resource")
        Scanner keyScan = new Scanner(System.in); 
        
        System.out.printf("국어?(%d) ", this.subjects[0]);
        int kor = this.subjects[0];
        try {
            kor = Integer.parseInt(keyScan.nextLine());
        } catch(Exception e) {}
        

        System.out.printf("영어?(%d) ", this.subjects[1]);
        int eng = this.subjects[1];
        try {
            eng = Integer.parseInt(keyScan.nextLine());
        } catch(Exception e) {}

        
        System.out.printf("수학?(%d) ", this.subjects[2]);
        int math = this.subjects[2];
        try {
            math = Integer.parseInt(keyScan.nextLine());
        } catch(Exception e) {}
        
        
        if (confirm2("변경하시겠습니까?(y/N) ")) {
            this.subjects[0] = kor;
            this.subjects[1] = eng;
            this.subjects[2] = math;
            
            this.compute();
            
            System.out.println("변경하였습니다.");
        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }
    
    static boolean confirm2(String message) {
        @SuppressWarnings("resource")
        Scanner keyScan = new Scanner(System.in);        
        System.out.print(message);
        String response = keyScan.nextLine().trim().toLowerCase();
        
        if (response.equals("n") || response.equals("no") || response.equals("")) {
            return false;
        }        
        return true;
    }
    
    //: 합계와 평균을 계산하는 코드를 다음과 같이 별도의 메서드로 분리한다.
    private void compute() {
        int sum = 0;
        for (int sub : this.subjects) {
            sum += sub;
        }
        this.sum = sum;
        this.aver = (float) this.sum / this.subjects.length;
    }
    
    //: 성적 데이터를 출력하는 코드를 별도의 메서드로 분리한다.
    public void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
    public void print(String name, int sum, float aver) {
        System.out.printf("%-4s, %4d, %6.1f\n",  
                name, 
                sum, 
                aver);
    }
    
    public void printDetail() {
        System.out.printf("%-4s, %4d, %6.1f\n",  
                this.name, 
                this.sum, 
                this.aver);
    }
}
