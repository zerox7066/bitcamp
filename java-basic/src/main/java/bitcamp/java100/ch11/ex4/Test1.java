// 추상 클래스

package bitcamp.java100.ch11.ex4;

public class Test1 {
    
    public static void main(String[] args) {
        // 추상 클래스는 인스턴스를 생성할 수 없다.
        //Car car = new Car();  // 컴파일 오류
        
        Sedan car1 = new Sedan();
        car1.run();
        car1.stop();
        
        Truck car2 = new Truck();
        car2.run();
        car2.stop();
    }

}
