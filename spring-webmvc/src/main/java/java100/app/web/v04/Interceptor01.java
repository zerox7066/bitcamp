package java100.app.web.v04;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor01 implements HandlerInterceptor {
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        
        // 페이지 컨트롤러의 요청 핸들러가 호출되기 전에 실행.
        System.out.println("Interceptor01.preHandle()...");
        
        return true; // 다음 인터셉터가 있다면 계속 실행하라!
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        
        // 페이지 컨트롤러의 요청 핸들러가 호출된후 실행
        System.out.println("Interceptor01.postHandle()...");
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

        // 요청 처리를 완료한 후 호출
        // 즉 JSP 실행을 완료한 후 호출
        System.out.println("Interceptor01.afterCompletion()...");
    }
}
