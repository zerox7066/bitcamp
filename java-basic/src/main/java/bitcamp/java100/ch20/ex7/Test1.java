// Spring IoC(Inversion of Control) 컨테이너 사용

package bitcamp.java100.ch20.ex7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex7/application-context1.xml");
        
        System.out.println("----------------------------");
        
        Engine obj1 = (Engine) appCtx.getBean("e1");
        Engine obj2 = (Engine) appCtx.getBean("e1");
        Engine obj3 = (Engine) appCtx.getBean("e1");
        
        if (obj1 == obj2)
           System.out.println("obj1 == obj2");
        if (obj2 == obj3)
           System.out.println("obj2 == obj3");
    }

}
