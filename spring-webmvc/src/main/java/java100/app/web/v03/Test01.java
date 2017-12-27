// 요청 핸들러의 리턴값
package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller
@RequestMapping("/v03/test01")
public class Test01 {
    
    @RequestMapping("/m1")
    public String m1() {
        // 기본 설정된 ViewResolver
        //return "/hello.jsp";
        
        // InternalResourceViewResolver 인 경우
        return "v03/test01/m1";
    }
    
    @RequestMapping("/m2")
    public void m2() {
        System.out.println("Test01.m2()...");
    }
    
    @RequestMapping("/m3")
    public View m3() {
        System.out.println("Test01.m3()...");
        
        View view = new InternalResourceView("/v03/test01/m3.jsp");
        
        return view;
    }
    
}































