// Reflection API

package bitcamp.java100.ch18;

import java.io.StringWriter;

public class Test2 {
    
    public static void main(String[] args) throws Exception {
        
        Class<?> clazz = StringWriter.class;
        
        System.out.println(clazz.getName());
        
        System.out.println(clazz.getSimpleName());
        
        System.out.println(clazz.getTypeName());
        
        Class<?> superClass = clazz.getSuperclass();
        System.out.printf("수퍼클래스 : %s\n", superClass.getName());
    }

}
