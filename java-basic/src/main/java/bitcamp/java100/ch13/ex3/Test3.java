package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test3 {
    
    public static void main(String[] args) {
        class MyClass {}
        
        class MyClass2 implements AutoCloseable {

            // AutoCloseable 인터페이스 오버라이딩해서 try-with-resource 사용
            @Override
            public void close() throws Exception {
                System.out.println("close() 호출되었음!");                
            }
            
        }
        
        // try-with-resource 문 (Java 7에서 추가)
        try (   // java.lang.AutoCloseable 인터페이스 규칙으로 만든 클래스의 객체(finally 필요없음)
                //MyClass obj = new MyClass();
                
                // MyClass2에 AutoCloseable 구현
                MyClass2 obj2 = new MyClass2();
        ) {
            System.out.println("try 블록 실행!");
            //throw new Exception("예외 발생!");
            
            int r = 20 / 0;
        } catch (Exception e) {
            System.out.println("catch 블록 실행!");
            
        } 
    }

}
