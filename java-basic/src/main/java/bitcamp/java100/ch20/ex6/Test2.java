// Spring IoC(Inversion of Control) 컨테이너 사용

package bitcamp.java100.ch20.ex6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex6/application-context2.xml");
        
        System.out.println(appCtx.getBean("c1"));
        System.out.println(appCtx.getBean("c2"));
        System.out.println(appCtx.getBean("c3"));
        
    }

}
