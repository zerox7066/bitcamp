// 다형성 - compute() 오버라이딩전 
// 국영수 점수만 계산

package bitcamp.java100.ch08.ex5;

public class Test1 {
    public static void main(String[] args) {
        ScoreEx s1 = new ScoreEx(1, "홍길동", 100, 100, 100, 80, 80);
        
        System.out.printf("합계 = %d\n", s1.getSum());
        System.out.printf("평균 = %f\n", s1.getAver());
        
        s1.setKor(80);
        System.out.printf("합계 = %d\n", s1.getSum());
        System.out.printf("평균 = %f\n", s1.getAver());
        
        
        // 오버라이딩 된 메서드는 호출되는 것은 클래스의 인스턴스 주소에서 결정
    }

}
