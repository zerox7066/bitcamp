
package java100.app;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

@WebServlet(
        urlPatterns="/init",
        name="AppInitServlet", 
        loadOnStartup=1)
@Configuration 
@ComponentScan("java100.app") 
public class AppInitServlet implements Servlet {

    // init()가 호출될 때 받은 파라미터 값을 저장할 변수
    ServletConfig servletConfig;
    
    // Spring IoC 컨테이너 객체
    // => 이 컨테이너를 다른 서블릿에서 사용할 수 있도록 스태틱 변수로 만든다.
    public static AnnotationConfigApplicationContext iocContainer;

    @Bean 
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        return ds;
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        
        System.out.println("AppInitServlet.init()");
        
        // 이렇게 인스턴스 변수에 보관해 둬야 나중에 
        // getServletConfig()가 호출될 때 리턴할 수 있다.
        this.servletConfig = config;
        
        iocContainer = new AnnotationConfigApplicationContext(AppInitServlet.class);
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("AppInitServlet.service()");
    }
    
    @Override
    public void destroy() {
        
        System.out.println("AppInitServlet.destroy()");
        
        DataSource ds = iocContainer.getBean(DataSource.class);
        ds.close();
        
    }
    
    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }
    
    @Override
    public String getServletInfo() {
        return "이 서블릿은 다른 서블릿을 위한 스프링 IoC 컨테이너를 준비한다.";
    }
}















