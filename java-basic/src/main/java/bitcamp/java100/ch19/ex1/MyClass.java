package bitcamp.java100.ch19.ex1;

@MyAnnotation
public class MyClass {
    
    @MyAnnotation
    public int a;
    
    @MyAnnotation
    public void m() {
        
        //@MyAnnotation
        System.out.println("Hello!!!");
    }
    
    public void m2(@MyAnnotation int a, @MyAnnotation String b) {
        
        @MyAnnotation  // 선언부에는 모두 사용 가능
        int x = 10;
    }
}
