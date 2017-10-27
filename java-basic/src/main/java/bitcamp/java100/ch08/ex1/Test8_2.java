// 캡슐화의 존재 이유
// 인스턴스 변수에 무효한 값이 저장되는 것을 방지함으로써 추상화가 무너지는 것을 막는다.
// 추상화(abstraction) : 사물이난 사람을 데이터와 메서드로 표현
// 클래스를 정의하는 것을 말한다.

package bitcamp.java100.ch08.ex1;

class Score2 {
    String name;
    int kor;
    int eng;
    int math;
    
    private int sum;
    private float aver;
    
    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
    // getter만 필요 (read only property)
    public int getSum() {
        return this.sum;
    }
    
    public float getAver() {
        return this.aver;
    }
}

public class Test8_2 {

    public static void main(String[] args) {
        Score2 s = new Score2();
        
        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
       
        s.compute();
        // sum, aver 접근 제한
        /*
        s.sum = 280;
        s.aver = s.sum /3f;*/
        
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.kor, s.eng, s.math, s.getSum(), s.getAver());
        
        s.eng = 50;
        s.compute();

        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.kor, s.eng, s.math, s.getSum(), s.getAver());
        
        
    }
}
