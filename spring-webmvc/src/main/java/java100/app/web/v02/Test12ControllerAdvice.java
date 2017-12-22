package java100.app.web.v02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

//@ControllerAdvice(assignableTypes= {Test12.class, Test11.class})
public class Test12ControllerAdvice {
    
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        System.out.println("Test12ControllerAdvice.initBinder()");
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

}
