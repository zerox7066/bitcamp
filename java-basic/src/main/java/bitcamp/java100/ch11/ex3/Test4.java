// 상속 : generalization

package bitcamp.java100.ch11.ex3;

import bitcamp.java100.ch11.ex3.Car;

public class Test4 {
    
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "그냥차!";
        car.cc = 300;
        
        car.run();
        car.stop();
    }

}
