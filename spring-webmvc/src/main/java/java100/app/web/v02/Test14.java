// 요청 핸들러의 파라미터 - 배열 파라미터
package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test14")
public class Test14 {
    
    //http://localhost:9999/spring-webmvc/v02/test14.html
    
    @RequestMapping
    public String fileupload(
            String name,
            String[] langs) {
        System.out.println(name);
        if (langs != null) {
            for (String lang : langs) {
                System.out.println(lang);
            }
        }
        System.out.println("------------------------------------");
        return "/hello.jsp";
    }
}































