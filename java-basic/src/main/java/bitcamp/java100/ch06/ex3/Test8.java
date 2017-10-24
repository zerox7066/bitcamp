// 클래스 로딩되는 시점
// 1) 클래스 변수를 사용할 때 
//MyClass2.v1 = 200;

// 2) 클래스 메서드를 사용할 때 
//MyClass2.m1();

// 3) new 연산자를 사용할 때
//new MyClass2(); 
        
// 주의!
// => 레퍼런스 변수를 선언할 때는 클래스가 로딩되지 않는다.
// MyClass2 obj1 = null;

/*
public class MyClass2 {
    // static member
    
    // 스태틱 변수 = 클래스 변수
    // => 클래스 이름으로 사용하고, 클래스에 소속된 변수라고 해서
    //    "클래스 변수"라 부른다.
    static int v1 = 100; // 스태틱 변수 = 클래스 변수
    static void m1() { // 스태틱 메서드 = 클래스 메서드
        System.out.println("MyClass2.m1()");
    }
    
    
    // instance member
    int v2 = 200; // 인스턴스 변수
    void m2() { // 인스턴스 메서드
        System.out.println("인스턴스.m2()");
    }
    
}
*/



// 스태틱 변수 스태틱 메서드 : 인스턴스 변수 인스턴스 메서드
package bitcamp.java100.ch06.ex3;

public class Test8 {
    // 컴파일 오류!
    //int i;
    
    static int i;
    
    // 컴파일 오류!
    // static 추가
    /*class A {
        int a1;
        static int a2;
        
        void m1() {
            System.out.println("m1()");
        }
        
        static void m2() {
            
        }
    }*/
    
    static class A {
        int a1;
        static int a2;
        
        void m1() {
            this.a1 = 100;
            this.a2 = 200;
            System.out.println("m1() this.a1 = " + this.a1);
            System.out.println("m1() this.a2 = " + this.a2);
        }
        
        static void m2() {
            // 컴파일 오류!
            //this.b1 = 100;
            //this.b2 = 200;
            
            // 스태틱 메서드 안에는 인스턴스 변수 사용 안됨
            //a1 = 300;  // 컴파일 오류!
            a2 = 400;
            
            //System.out.println("m2() this.b1 = " + a1);  // 컴파일 오류
            System.out.println("m2() this.b2 = " + a2);
        }
    }
    
    // 컴파일 오류!
    // static 추가
    /*public void m3() {
        System.out.println("m3()");
    }*/
    

    static void m3() {
        System.out.println("m3()");
    }
    
    public static void main(String[] args) {
        //A a = null;
        
        A a = new A();
        
        a.a1 = 100;
        
        System.out.println("a.a1 = " + a.a1);
        
        a.m1();
        
        // 컴파일 오류!
        
        //A.m1();
        
        // static method
        A.m2();
        
        i = 200;
        System.out.println(i);
        
        m3();
    }
}
