// 다형성(polymorphism) - 다형적 변수(polymorphic variables) 의 형 변환

package bitcamp.java100.ch08.ex2;

import java.io.File;

public class Test5 {
    
    public static void main(String[] args) {
        // 다양한 타입의 객체 주소를 보관할 배열
        // Object 클래스는 최상위 루트 클래스이다.
        Object[] arr = new Object[100];
        
        arr[0] = new String("Hello");
        arr[1] = Integer.valueOf(100);
        arr[2] = new File("./build.gradle");
        
        Car c1 = new Truck();
        Car c2 = new Sedan();
        
        
    }

}
