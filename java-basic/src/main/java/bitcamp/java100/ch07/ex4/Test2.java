// 상속 - java.lang.Object 클래스
// - 자바의 모든 클래스는 Object의 자손이다.

package bitcamp.java100.ch07.ex4;


public class Test2 /*extends Object*/ {
    // static Class class = new Class();
    
    public static void main(String[] args) {
        Test2 obj = new Test2();
        
        // toString()  인스턴스에 대해 간단한 정보를 문자열로 리턴
        System.out.println(obj.toString());
        
        // hashCode() 인스턴스를 구분할 때 사용할 디지털 지문!
        System.out.println(Integer.toHexString(obj.hashCode()));
        System.out.println("====================================================");
        
        // equals()  Object에서는 인스턴스가 같은 지 비교하여 true, false 값을 리턴
        Test2 obj2 = new Test2();
        Test2 obj3 =obj;
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
        System.out.println("====================================================");
        
        // equals() 의 재정의한 클래스
        // String, Integer, Float
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("====================================================");
        
        // StringBuffer는 equals()를 재정의 하지 않음
        // Methods inherited from class java.lang.Object
        // clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait
        // equals 존재하여 재정의 하지 않음
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println("====================================================");
        
        // getClass()
        Class c = obj.getClass();
        
        System.out.println(c.getName());
            
    }
}
