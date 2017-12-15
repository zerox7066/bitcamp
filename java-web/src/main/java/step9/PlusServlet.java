package step9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step9/PlusServlet")
public class PlusServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        //req.setCharacterEncoding("UTF-8");
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));
        
        out.printf("%d + %d = %d\n", a, b, a + b);
    }    
}

// 리팩토링, 디자인 패턴 차이점
// Get, Post 방식
// 추상, 인터페이스
// 상속, 데코, 체인 필터
// jQuery 버전 확인















