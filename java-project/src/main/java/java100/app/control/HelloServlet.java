package java100.app.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/hello/*")
public class HelloServlet implements Servlet {

    // init()가 호출될 때 받은 파라미터 값을 저장할 변수
    ServletConfig servletConfig;
    
    @Override
    public void destroy() {}
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
    }
    
    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }
    
    @Override
    public String getServletInfo() {
        return "인사하는 서블릿";
    }
    
    
    @Override
    public void service(ServletRequest request, ServletResponse response) 
            throws ServletException, IOException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        // 출력하는 콘텐츠의 문자표 이름(character set)을 웹브라우저에게 알려줘라!
        httpResponse.setContentType("text/plain;charset=UTF-8");
        
        switch (httpRequest.getPathInfo()) {
        case "/hi": this.doHi(httpRequest, httpResponse); break;
        case "/hi2": this.doHi2(httpRequest, httpResponse); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doHi(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("하이루~~~");
    }
    
    private void doHi2(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        out.println("오호라... 안녕!");
        
    } 
}










