package java100.app.servlet.score;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/score/update1")   
public class ScoreUpdateServlet extends HttpServlet {
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>성적관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='../css/common.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        
        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        
        out.println("<h1>성적 변경</h1>");
        
        try {
            Score score = new Score();
            score.setNo(Integer.parseInt(request.getParameter("no")));
            score.setName(request.getParameter("name"));
            score.setKor(Integer.parseInt(request.getParameter("kor")));
            score.setEng(Integer.parseInt(request.getParameter("eng")));
            score.setMath(Integer.parseInt(request.getParameter("math")));
            
            if(scoreDao.update(score) > 0) {
                out.println("<p>변경하였습니다.</p>");
            } else {
                out.printf("<p>'%s'의 성적 정보가 없습니다.</p>\n", score.getNo());
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        
        out.println("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
        
        rd = request.getRequestDispatcher("/footer");
        rd.include(request, response);
        
        out.println("</div>");
        
        out.println("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
        out.println("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
        out.println("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");
        
        out.println("</body>");
        out.println("</html>");
    }
}













