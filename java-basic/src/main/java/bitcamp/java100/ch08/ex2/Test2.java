// 다형성(polymorphism) - 다형적 변수(polymorphic variables)

package bitcamp.java100.ch08.ex2;

public class Test2 {
    
    public static void main(String[] args) {
        
        Car c;
        c = new Car();       // 하위 분류를 가리킬 수 있다.

        c.model = "티코";
        c.capacity = 4;
        c.enginType = 1;
        c.cylinder = 4;
        c.valve = 16;
        //c.auto = true;
        
        
        c = new Truck();
        c.model = "타이탄";
        c.capacity = 3;
        c.enginType = 2;
        c.cylinder = 8;
        c.valve = 32;
        //c.weight = 15;
        //c.dump = true;
        
        
        c = new Sedan();
        //c = new Boat();
        c = new Vehicle();

        
        
        
    }

}
