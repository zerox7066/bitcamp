package step8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet12")
@MultipartConfig(
    //location="/tmp,
    //fileSizeThreshold=1024 * 1024,
    maxFileSize=1024 * 1024 * 10,
    maxRequestSize=1024 * 1024 * 100
)
public class Servlet12 extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        
        String name = null;
        String age = null;
        
        String photo1OrginalFilename = null;
        String photo1NewFilename = null;
        String photo2OrginalFilename = null;
        String photo2NewFilename = null;

        try {
            ServletContext context = this.getServletContext();
            String path = context.getRealPath("/step8");
            
            name = req.getParameter("name");
            age = req.getParameter("age");
            
            Part photo1Part = req.getPart("photo1");
            photo1OrginalFilename = photo1Part.getSubmittedFileName();
            photo1NewFilename = writeUploadFile(photo1Part, path);

            Part photo2Part = req.getPart("photo2");
            photo2OrginalFilename = photo2Part.getSubmittedFileName();
            photo2NewFilename = writeUploadFile(photo2Part, path);

        } catch (Exception e) {
            throw new ServletException(e);
        }

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>파일 업로드 결과</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>파일 업로드 결과</h1>");
        
        out.printf("이름 : %s<br>\n", name);
        out.printf("나이 : %s<br>\n", age);
        
        out.printf("사진1 : %s<br>\n", photo1OrginalFilename);
        out.printf("<img src='%s' width='200'><br>\n", photo1NewFilename);
        
        out.printf("사진2 : %s<br>\n", photo2OrginalFilename);
        out.printf("<img src='%s' width='200'><br>\n", photo2NewFilename);
        out.println("</body>");
        out.println("</html>");

    }
    
    long prevMillis = 0;
    int count = 0;
    synchronized private String getNewFilename(String filename) {
        long currMillis = System.currentTimeMillis();
        if (prevMillis != currMillis) {
            count = 0;
            prevMillis = currMillis;
        }
        
        return currMillis + "_" + count++ + extractFileExtName(filename); 
    }
    
    private String extractFileExtName(String filename) {
        int dotPosition = filename.lastIndexOf(".");
        
        if (dotPosition == -1)
            return "";
        
        return filename.substring(dotPosition);
    }
    
    private String writeUploadFile(Part part, String path) throws IOException {
        
        BufferedInputStream in = new BufferedInputStream(
                part.getInputStream());
        
        String filename = getNewFilename(part.getSubmittedFileName());
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(
                new File(path + "/" + filename)));
                
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        out.flush();
        in.close();
        out.close();
        
        return filename;
    }
    
}
