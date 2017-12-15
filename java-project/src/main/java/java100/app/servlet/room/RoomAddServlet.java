package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/room/add1")
public class RoomAddServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");

        out.println("<style>");
        out.println(".container {");
        out.println("    width: 680px;");
        out.println("}");
        
        out.println("footer {");
        out.println("    text-align: center;");
        out.println("}");
        
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        
        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        
        out.println("<h1>강의실 등록 결과</h1>");
        
        try {
            Room room = new Room();
            room.setLocation(request.getParameter("location"));
            room.setName(request.getParameter("name"));
            room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
            
            roomDao.insert(room);
            
            out.println("<p>저장하였습니다.</p>");
            
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










