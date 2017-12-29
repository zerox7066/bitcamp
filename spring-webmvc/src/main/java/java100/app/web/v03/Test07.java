// @Session
package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/v03/test07")
@SessionAttributes({"name","age"})
public class Test07 {
    
    @RequestMapping(value="/m1")
    public String m1(Model model) {
        
        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 20);        //auto-boxing
        model.addAttribute("working", true);
        
        return "v03/test07/m1";
    }

    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(
            @ModelAttribute("name") String name, 
            @ModelAttribute("age") int age) {
        
        StringBuffer buf = new StringBuffer();
        
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%s\n", age));
        
        return buf.toString();
    }

    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(
            @ModelAttribute String name, 
            @ModelAttribute("age") int age) {
        
        StringBuffer buf = new StringBuffer();
        
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%d\n", age));
        
        return buf.toString();
    }

    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m4(@ModelAttribute("working") String working) {
        
        StringBuffer buf = new StringBuffer();
        
        buf.append(String.format("working=%s\n", working));
        
        return buf.toString();
    }

    @RequestMapping(value="/m5")
    public String m5() {
        return "v03/test07/m1";
    }
}































