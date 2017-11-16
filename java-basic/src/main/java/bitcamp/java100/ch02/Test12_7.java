// ## 부동소수점 변수 
// - 부동소수점을 변수에 저장하는 방법을 알아보자!
//

package bitcamp.java100.ch02;

public class Test12_7 {

    public static void main(String[] args) {
// 부동소수점을 저장할 메모리 준비하기
// => 단정도 수준의 부동소수점을 저장할 메모리
        float f1;
        f1 = 9876567f;
        System.out.println(f1);

// 정수와 달리 부동소수점 변수는 메모리에 저장할 수 있는 크기 보다 더 큰 수를 저장해도 컴파일 오류가 발생하지 않는다. 다만 값이 짤릴 뿐이다.
        f1 = 9876543456789L; // 8바이트 정수를 4바이트 메모리에 저장. 
        System.out.println(f1); //9.8765436E12 = 9876543600000

// 8바이트 부동소수점을 4바이트에 저장할 때, 컴파일 오류!
        //f1 = 9876543.4567; // 컴파일 오류!

// 8바이트 부동소수점을 4바이트에 넣기 위해 리터럴 뒤에 f를 붙인다?
        f1 = 9876543.4567f;
        // f1이라는 변수에 값을 넣기 전에 이미 9876543.4567 값이 4바이트 부동소수점으로 변환되면서 값이 짤린 상태이다. 따라서 출력하면 짤린 값이 출력된다.
        System.out.println(f1);

// 결론!
// - 가능한 정수 값을 부동소수점 메모리에 저장하지 말라! 부동소수점 자체가 근사값을 표현하는 방식이기 때문에 정확한 값을 다룰 수 없다.
// - 혹시 정수 값을 저장하더라도 int 값은 double 메모리에 저장하는 것이 원래 값을 거의 보존하는 방법이다.
// - long 값을 부동소수점 메모리에 저장할 때는 값이 짤리는 것을 각오 해야 한다. 주의깊게 사용하라!

    }
}
