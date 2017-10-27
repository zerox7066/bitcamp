// 캡슐화 - 셋터의 활용
// 인스턴스 변수에 무효한 값이 저장되는 것을 방지함으로써 추상화가 무너지는 것을 막는다.
// 추상화(abstraction) : 사물이난 사람을 데이터와 메서드로 표현
// 클래스를 정의하는 것을 말한다.

package bitcamp.java100.ch08.ex1;

class Score3 {
    String name;
    private int kor;
    private int eng;
    private int math;

    private int sum;
    private float aver;

    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public int getKor() {
        return kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }

    public int getEng() {
        return eng;
    }

    public void setMath(int math) {
        this.math = math;
        this.compute();
    }

    public int getMath() {
        return math;
    }

    // getter만 필요 (read only property)
    public int getSum() {
        return this.sum;
    }

    public float getAver() {
        return this.aver;
    }
}

public class Test8_3 {

    public static void main(String[] args) {
        Score3 s = new Score3();

        s.name = "홍길동";
        s.setKor(100);
        s.setEng(90);
        s.setMath(80);

        // 셋터에서 자동 계산
        // s.compute();

        System.out.printf("%s, %d, %d, %d, %d, %f\n", 
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());

        //s.eng = 50;
        s.setEng(50);
        //s.compute();

        System.out.printf("%s, %d, %d, %d, %d, %f\n", 
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
    }
}
