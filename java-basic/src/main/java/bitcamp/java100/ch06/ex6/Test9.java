package bitcamp.java100.ch06.ex6;

import bitcamp.java100.ch06.ex5.Score2;

public class Test9 {
    
    // main(static method) 함수에서 instance variable 사용 불가
    // static class 에서 instance variable 사용 가능
    int ginstvar;
    
    // main(static method) 함수에서 static variable 사용 가능
    // static class 에서 static variable 사용 가능
    static int gstatvar;
    
    // main(static method) 함수에서 instance method 호출 불가
    void ginstMethod() {
        // instance variable 사용 가능
        ginstvar += 100;
        
        // static variable 사용 가능
        gstatvar += 100;
        
        System.out.println("ginstMethod() ginstvar = " + ginstvar);
        System.out.println("ginstMethod() gstatvar = " + gstatvar);
        
        // instance method에서 static method 호출 가능
        gstatMethod();
        

        // instance variable / method  선언
        StatClass statclass = new StatClass();
        
        // instance.instance 사용 가능
        statclass.instvar += 100;
        statclass.instMethod();

        // instance.static 사용 가능 : 권장하지 않음
        // classnaem.static 으로 사용 권장
        statclass.statvar += 100;
        statclass.statMethod();
        
        
        // classname.instance 사용 불가
        //StatClass.instvar += 100;  // 컴파일 오류!
        //StatClass.instMethod();    // 컴파일 오류!
        
        // classname.static 사용 가능(static method)
        StatClass.statvar += 100;
        StatClass.statMethod();
    }
    
    // main 함수에서 static method에서 호출 가능
    // static class에서 호출가능
    static void gstatMethod() {
        // static method에서 instance variable 사용 불가
        //ginstvar = 100;  // 컴파일 오류
        
        // static method에서 static variable 사용 가능
        gstatvar += 100;
        
        //System.out.println("ginstMethod() ginstvar = " + ginstvar);  // 컴파일 오류!
        System.out.println("gstatMethod() gstatvar = " + gstatvar);
        
        // static method에서 instance method 호출 불가
        //ginstMethod();  // 컴파일 오류!
        
        // instance variable / method  선언
        StatClass statclass = new StatClass();
        
        // instance.instance 사용 가능
        statclass.instvar += 100;
        statclass.instMethod();

        // instance.static 사용 가능 : 권장하지 않음
        // classname.static 으로 사용 권장
        statclass.statvar += 100;
        statclass.statMethod();
        
        
        // classname.instance 사용 불가
        //StatClass.instvar += 100;  // 컴파일 오류!
        //StatClass.instMethod();    // 컴파일 오류!
        
        // classname.static 사용 가능(static method)
        StatClass.statvar += 100;
        StatClass.statMethod();
    }
    
    
    // ***********************************************************
    // non-public, non-static class 선언가능하나 사용할 수 없음
    //class NonStatClass {     // 사용할 수 없음
    //}
    // ***********************************************************
    
    
    static class StatClass {
        // instance variable 초기값은 '0'
        int instvar;

        // static variable 초기값은 '0'
        static int statvar;
        
        // instance method(non-static method)는 this를 내장하고 있다.
        void instMethod() {
            this.instvar += 100;
            
            // static variable는 this사용 가능 : 권장하지 않음
            // this 생략 권장
            this.statvar += 100;
            
            // instance method 에서 class 밖에 있는 instance method 호출 불가
            //ginstMethod();    // 컴파일 오류!
            
            // instance method 에서 class 밖에 있는 static method 호출 가능
            // 단, 예제처럼 gstatMethod 함수에서 StatClass 객체나 인스턴스 사용하면 컴파일 오류
            //gstatMethod();  // 컴파일 오류!
            
            //instMethod();
            // instance method 에서 static method 호출 가능
            statMethod();
            
            System.out.println("instMethod() instvar = " + this.instvar);
            
            // static variable는 this사용 가능 : 권장하지 않음
            // this 생략 권장
            System.out.println("instMethod() statvar = " + this.statvar); 
        }
        
        // static method(class method) 에서 this 사용할 수 없다.
        static void statMethod() {
            // static method에서 instance 내장변수 this 사용 불가
            //this.instvar += 100;  // 컴파일 오류!
            //this.statvar += 100;  // 컴파일 오류!
            
            // static class에서 class 밖에 있는 instance method 호출 불가
            //ginstMethod();    // 컴파일 오류!
            
            // instance method 에서 class 밖에 있는 static method 호출 가능
            // 단, 예제처럼 gstatMethod 함수에서 StatClass 객체나 인스턴스 사용하면 컴파일 오류
            //gstatMethod();  // 컴파일 오류!
            
            
            // static method에서 instance method 호출 불가
            //instMethod();  // 컴파일 오류!
            
            // static method에서 instance variable 사용 불가
            //instvar += 100;  // 컴파일 오류!
            
            // static method에서 static variable 사용 가능
            statvar += 100;
            
            // static method에서 instance variable 사용 불가
            //System.out.println("m2() instvar = " + instvar);  // 컴파일 오류
            System.out.println("m2() statvar = " + statvar);
        }
    }
    
    public static void main(String[] args) {
        //A a = null;
        
        // main(static method) 에서 instance variable / method 사용 불가
        //ginstvar += 100;   // 컴파일 오류!
        //ginstMethod();      // 컴파일 오류!
        
        // main(static method) 에서 static variable / method 사용 가능
        gstatvar += 100;
        gstatMethod();

        System.out.println("gstatvar = " + gstatvar);
        
        
        //######################################################################################
        // instance reference 변수 선언과 동시에 클래스(변수, 메서드)가 Method Area에 로딩된다.
        // Heap에 인스턴스 변수만 메모리 생성되고 인스턴스 메서드는 생성되지 않음.
        // (클래스 메서드 즉 Method Area에 있는 함수를 호출)
        //######################################################################################

        // 인스턴스은 클래스 메서드(Method Area)를 호출한다.   
        // static 붙은 메서드는 클래스명.메서드명()
        // static 없는 메서드는 인스턴스명.메서드명()
        
        // new를 사용해서 instance variable 를 계속 선언하면 힙에 계속해서 인스턴스 메모리가 생성
        StatClass statclass1 = new StatClass();
        StatClass statclass2 = new StatClass();
        

        // instance.instance 사용 가능
        statclass1.instvar += 100;
        statclass1.instMethod();
        
        System.out.println("statclass1.instvar = " + statclass1.instvar);

        // instance.static 사용 가능 : 권장하지 않음
        // classname.static 으로 사용 권장
        statclass2.statvar += 100;
        statclass2.statMethod();
        
        System.out.println("statclass2.statvar = " + statclass2.statvar);
        
        // classname.instance 사용 불가
        //StatClass.instvar += 100;  // 컴파일 오류!
        //StatClass.instMethod();    // 컴파일 오류!

        // classname.static 사용 가능
        StatClass.statvar += 100;
        StatClass.statMethod();
        
        System.out.println("StatClass.statvar = " + StatClass.statvar);
        
        // 클래스 배열 : 인스턴스를 배열로 만들수 없음
        // 배열을 인스턴스로 정의해야 한다.
        StatClass[] statclass3 = new StatClass[3];
        statclass3[0] = new StatClass();
        statclass3[1] = new StatClass();
        statclass3[2] = new StatClass();
        
        // classarray.instance 사용 가능
        statclass3[0].instvar = 100;
        statclass3[0].instMethod();
        
        System.out.println("statclasss[0].instvar = " + statclass3[0].instvar);

        // classarray.static 사용 가능 : 권장하지 않음
        // classname.static 으로 사용 권장
        statclass3[0].statvar = 100;
        statclass3[0].statMethod();
        
        System.out.println("statclass3[0].statvar = " + statclass3[0].statvar);
        
        // 클래스 배열 : 인스턴스를 배열로 만들수 없음
        StatClass[] statclass4 = new StatClass[3];

        statclass4[0] = statclass1;
        
        System.out.println("statclass4[0].instvar = " + statclass4[0].instvar);
        System.out.println("statclass4[0].instvar = " + statclass4[0].statvar);
    }
}
