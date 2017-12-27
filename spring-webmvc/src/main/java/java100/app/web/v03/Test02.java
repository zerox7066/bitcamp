// 요청 핸들러의 리턴값
package java100.app.web.v03;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v03/test02")
public class Test02 {
    
    @RequestMapping("/m1")
    @ResponseBody
    public String m1() {
        return "hello";
    }    
    
    @RequestMapping("/m2")
    @ResponseBody
    public String m2(HttpServletResponse response) {
        response.setContentType("text/plain;charset=UTF=8");
        
        response.setHeader("Content-Type", "text/plain;charset=UTF-8");
        
        return "한글";
    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3() {
        return "한글";
    }
    
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    //@ResponseBody
    public HttpEntity<String> m4() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        HttpEntity<String> entity = new HttpEntity<>("한글!", headers);
        
        return entity;
    }
    
    @RequestMapping(value="/m5")
    //@ResponseBody
    public ResponseEntity<String> m5() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        ResponseEntity<String> entity = new ResponseEntity<>(
                "한글!", 
                headers,
                HttpStatus.OK);
        
        return entity;
    }
    
    @RequestMapping(value="/m6")
    @ResponseBody
    public Object m6() {
        return new Member("홍길동", 20, true);
    }
}































