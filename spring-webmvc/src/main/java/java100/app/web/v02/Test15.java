// 요청 핸들러의 파라미터 - @PathVariable
package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test15")
public class Test15 {
    
    //http://localhost:9999/spring-webmvc/app/v02/test15/board/100
    
    @RequestMapping("/board/{no}")
    public String m1(@PathVariable("no") int no) {
        System.out.println(no);
        System.out.println("------------------------------------");
        return "/hello.jsp";
    }
    
    //http://localhost:9999/spring-webmvc/app/v02/test15/category/15/product/100
    
    @RequestMapping("/category/{catno}/product/{prodno}")
    public String m2(
            @PathVariable("catno") int catno,
            @PathVariable("prodno") int prodno) {
        System.out.println(catno);
        System.out.println(prodno);
        System.out.println("------------------------------------");
        return "/hello.jsp";
    }
    
    //http://localhost:9999/spring-webmvc/app/v02/test15/category2/15/product/100
    
    @RequestMapping("/category2/{catno}/product2/{prodno}")
    public String m3(
            @PathVariable int catno,
            @PathVariable int prodno) {
        System.out.println(catno);
        System.out.println(prodno);
        System.out.println("------------------------------------");
        return "/hello.jsp";
    }
    
  //http://localhost:9999/spring-webmvc/app/v02/test15/java-sdk-8.0.151.exe
    
    @RequestMapping("/software/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d+}{ext:\\.[a-z]+}")
    public String m4(
            @PathVariable String name,
            @PathVariable String version,
            @PathVariable String ext) {
        System.out.println(name);
        System.out.println(version);
        System.out.println(ext);
        System.out.println("------------------------------------");
        return "/hello.jsp";
    }
}































