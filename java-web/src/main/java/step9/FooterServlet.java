package step9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step9/FooterServlet")
public class FooterServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        //res.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = res.getWriter();
        
        out.println("<footer>");
        out.println("<p>페이지 상단 부분!</p>");
        out.println("</footer>");
    }    
}

// 리팩토링, 디자인 패턴 차이점
// Get, Post 방식
// 추상, 인터페이스
// 상속, 데코, 체인 필터
















