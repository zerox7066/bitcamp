// 다형성(polymorphism) - 다형적 변수(polymorphic variables)

package bitcamp.java100.ch08.ex2;

public class Test1 {
    
    public static void main(String[] args) {
        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Truck();
        v = new Sedan();
        
        Boat b;
        b = new Boat();
        //b = new Vehicle();  // 하위 분류를 상위 분류로 가리킬 수 없다.
        //b = new Car();      // 다른 파생 분류를 가리킬 수 없다.
        //b = new Truck();
        //b = new Sedan();
        
        Car c;
        c = new Car();       // 하위 분류를 가리킬 수 있다.
        c = new Truck();
        c = new Sedan();
        //c = new Boat();
        //c = new Vehicle();
        
        Sedan s;
        s = new Sedan();
        //s = new Truck();
        //s = new Car();
        //s = new Boat();
        //s = new vehicle();  // 상위 분류를 가리킬 수 없다.
        
        
    }

}
