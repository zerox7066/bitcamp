package bitcamp.java100.ch19.ex4;

public class Test1 {
    
    public static void main(String[] args) {
        
        MyAnnotation1 anno = MyClass1.class.getAnnotation(MyAnnotation1.class);
        
        System.out.println(anno.name());
        System.out.println(anno.age());
    }

}
