package bitcamp.java100.ch19.ex7;

public class Test2 {
    
    public static void main(String[] args) {
        
        MyAnnotation1 anno = MyClass2.class.getAnnotation(MyAnnotation1.class);
        
        System.out.println(anno.value());
        System.out.println(anno.value2());
        System.out.println(anno.value3());
    }

}
