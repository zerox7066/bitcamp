
package bitcamp.java100;

public class Test17_18 {
    
    static class My {
        int value;
        
        // static method(class method) : 인스턴스의 값을 사용하려면 반드시 파라미터로 받아야 한다.
        // non static method(instance method)
        static void print(My ref) {
            System.out.println(ref.value);
            //System.out.println(this.value);  // 컴파일 오류!
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
        My.print(r1); 
        My.print(r2); 
        My.print(r3);
        
        r1.print(r1);
        System.out.println("--------------------------------------------------");
    }
}























