// Spring IoC(Inversion of Control) 컨테이너 사용

package bitcamp.java100.ch20.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex2/application-context3.xml");
        
    }

}
