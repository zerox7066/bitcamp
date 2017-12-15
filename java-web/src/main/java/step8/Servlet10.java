package step8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet10")
public class Servlet10 extends HttpServlet {
    

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        DiskFileItemFactory factory = new DiskFileItemFactory();
        
        ServletFileUpload upload = new ServletFileUpload(factory);

        HashMap<String,FileItem> itemMap = new HashMap<>();
        try {
            List<FileItem> items = upload.parseRequest(req);
            
            for (FileItem item : items) {
                itemMap.put(item.getFieldName(), item);
            }

        } catch (Exception e) {
            throw new ServletException(e);
        }
        
        String name = itemMap.get("name").getString("UTF-8");
        String age = itemMap.get("age").getString();
        String photo1Filename = itemMap.get("photo1").getName();
        String photo2Filename = itemMap.get("photo2").getName();

        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.printf("이름 : %s\n", name);
        out.printf("나이 : %s\n", age);
        out.printf("사진1 : %s\n", photo1Filename);
        out.printf("사진2 : %s\n", photo2Filename);


    }

}
