
package bitcamp.java100;

public class Test17_19 {
    
    static class My {
        int value;
        
        // static method(class method) : 인스턴스의 값을 사용하려면 반드시 파라미터로 받아야 한다.
        // non static method(instance method) : 메서드의 내장변수 this를 사용
        void print() {
            System.out.println(this.value);
        }
    }
    
    // entry point
    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();
        
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        // 클래스 메서드를 인스턴스 값을 다룸 
        r1.print(); 
        r2.print(); 
        r3.print();
        
        //My m4 = null;
        //m4.print();
        System.out.println("--------------------------------------------------");
        
        //String s1 = "Hello";
        //s1.print();
        System.out.println("--------------------------------------------------");
    }
}





















