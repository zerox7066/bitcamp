package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet09")
public class Servlet09 extends HttpServlet {    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        
        String name = null;
        String age = null;
        String photo1Filename = null;
        String photo2Filename = null;
        

        ServletContext context = this.getServletContext();
        String path = context.getRealPath("/step8");
        
        MultipartRequest multi = new MultipartRequest(req, path, "UTF-8");
        //MultipartRequest multi = new MultipartRequest(req, "C:\\workspace\\java-web\\src\\main\\webapp\\sample", 
        //        1024*10000, "UTF-8", new DefaultFileRenamePolicy());

        name = multi.getParameter("name");
        age = multi.getParameter("age");
        photo1Filename = multi.getFilesystemName("photo1");
        photo2Filename = multi.getFilesystemName("photo2");
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.printf("이름 = %s\n", name);
        out.printf("나이 = %s\n", age);
        out.printf("사진1 = %s\n", photo1Filename);
        out.printf("사진2 = %s\n", photo2Filename);
        
        
    }
}
