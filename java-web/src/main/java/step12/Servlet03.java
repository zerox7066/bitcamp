// 세션(session)
// 클라이언트가 요청한 작업을 수행한 후 그 결과를 서버에 보관하는 방법
// 서블릿에서 getSession() 호출하면 HttpSession 객체가 생성된다.

package step12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/step12/Servlet03")
public class Servlet03 extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        
        HttpSession session = req.getSession();
        
        String name = req.getParameter("name");
        session.setAttribute("name", name);

        RequestDispatcher rd = req.getRequestDispatcher("/step12/form2.jsp");
        rd.forward(req, res);
    }
}














