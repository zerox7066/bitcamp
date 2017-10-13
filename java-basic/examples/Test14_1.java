// ## 사용자 정의 데이터 타입
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test14_1 {

    public static void main(String[] args) {
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }

        Score r1;
        r1 = new Score();

        r1.name = "홍길동";
        r1.kor = 100;
        r1.eng = 90;
        r1.math = 95;
        r1.sum = r1.kor + r1.eng + r1.math;
        r1.aver = r1.sum / 3.0f;

        System.out.printf("%s, %d, %d, %d, %d, %5.1f\n",
        r1.name, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);
    }
}