package java100.app.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import java100.app.domain.Board;
import java100.app.domain.Member;
import java100.app.domain.UploadFile;
import java100.app.service.BoardService;

@Controller
@RequestMapping("/board")
@SessionAttributes(value="loginUser")
public class BoardController {
    
    @Autowired ServletContext servletContext;
    @Autowired BoardService boardService;
    
    @RequestMapping("list")
    public String list(
            @RequestParam(value="pn", defaultValue="1") int pageNo,
            @RequestParam(value="ps", defaultValue="5") int pageSize,
            @RequestParam(value="title", required=false) String[] titles,
            @RequestParam(value="oc", required=false) String orderColumn,
            @RequestParam(value="al", required=false) String align,
            Model model) throws Exception {
        
        if (pageNo < 1) {
            pageNo = 1;
        }
        
        if (pageSize < 5 || pageSize > 15) {
            pageSize = 5;
        }
        
        HashMap<String,Object> options = new HashMap<>();
        options.put("titles", titles);
        options.put("orderColumn", orderColumn);
        options.put("align", align);
        
        for (String option : options.keySet()) {
            System.out.println(options.get(option));
        }
        
        int totalCount = boardService.getTotalCount();
        int lastPageNo = totalCount / pageSize;
        if ((totalCount % pageSize) > 0) {
            lastPageNo++;
        }
        
        model.addAttribute("pageNo", pageNo);
        model.addAttribute("lastPageNo", lastPageNo);
        model.addAttribute("list", boardService.list(pageNo, pageSize, options));
        
        return "board/list";
    }
    
    @RequestMapping("{no}")
    public String view(@PathVariable int no, Model model) throws Exception {
        
        boardService.updateViewCount(no);
        
        model.addAttribute("board", boardService.get(no));
        return "board/view";
    }
    
    @RequestMapping("form")
    public String form() throws Exception {

        return "board/form";
    }
    
    @RequestMapping("update")
    public String update(Board board) throws Exception {
        
        boardService.update(board);
        return "redirect:list";
    }
    
    @RequestMapping("delete")
    public String delete(int no) throws Exception {
        
        boardService.delete(no);
        return "redirect:list";
    }  
    
    @RequestMapping("add")
    public String add(
            Board board,
            MultipartFile[] files,
            @ModelAttribute("loginUser") Member loginUser) throws Exception {
        
        String uploadDir = servletContext.getRealPath("/download");
        ArrayList<UploadFile> uploadFile = new ArrayList<>();
        
        for (MultipartFile part : files) {
            if (part.isEmpty()) continue;
            
            String filename = this.writeUploadFile(part, uploadDir);
            uploadFile.add(new UploadFile(filename));
        }
        
        board.setFiles(uploadFile);
        
        board.setWriter(loginUser);
        
        boardService.add(board);
        
        return "redirect:list";
    }
    
    long prevMillis = 0;
    int count = 0;
    
    private String writeUploadFile(MultipartFile part, String path) throws IOException {
        
        String filename = getNewFilename(part.getOriginalFilename());
        part.transferTo(new File(path + "/" + filename));
        return filename;
    }
    
    // 다른 클라이언트가 보낸 파일명과 중복되지 않도록 
    // 서버에 파일을 저장할 때는 새 파일명을 만든다.
    synchronized private String getNewFilename(String filename) {
        long currMillis = System.currentTimeMillis();
        if (prevMillis != currMillis) {
            count = 0;
            prevMillis = currMillis;
        }
        
        return  currMillis + "_" + count++ + extractFileExtName(filename); 
    }
    
    // 파일명에서 뒤의 확장자명을 추출한다.
    private String extractFileExtName(String filename) {
        int dotPosition = filename.lastIndexOf(".");
        
        if (dotPosition == -1)
            return "";
        
        return filename.substring(dotPosition);
    }

}
