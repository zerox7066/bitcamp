// ## 메서드 - 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드 I
// - 메서드를 이용하여 인스턴스를 다루는 방법을 알아보자!
//

package bitcamp.java100.ch03.Test17_17.step1;

// 1단계: 메서드 분리 전
public class Test {

    public static void main(String[] args) {
        // 면적을 구하는 예제
        // 1) 면적을 계산할 때 필요한 데이터를 저장할 변수 선언
        int width = 390; // 단위: cm
        int height = 420; // 단위: cm
        
        // 2) 너비와 높이를 가지고 넓이를 구한다. 
        // => 평방미터 
        float area = (width * height) / 10000f;
        System.out.println(area);
        
        // => 평으로 출력하기 
        float pyeong = area / 3.3f;
        System.out.println(pyeong);
        
    }
}













