package bitcamp.java100.ch07.ex5;

public class E extends A {
    String name;
    int age;
    
    E() {
        //super();
        //this.name = "홍길동";
        //this.age = 20;
        this("홍길동", 20);
    }
    
    E(int age) {
        //super();
        //this.name = "홍길동";
        //this.age = age;
        this("홍길동", age);
    }
    
    E(String name) {
        //super();
        //this.name = name;
        //this.age = 20;
        this(name, 20);
        
    }
    
    E(String name, int age) {
        super();
        this.name = name;
        this.age = age;
        
    }
}
