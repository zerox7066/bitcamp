// 세션(session)
// 클라이언트가 요청한 작업을 수행한 후 그 결과를 서버에 보관하는 방법
// 서블릿에서 getSession() 호출하면 HttpSession 객체가 생성된다.

package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/step12/Servlet01")
public class Servlet01 extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        HttpSession session = req.getSession();
        
        session.setAttribute("name", "홍길동");
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("세션을 생성하였고 그 세션아이디 값을 쿠키로 보냈음!");
    }
}














