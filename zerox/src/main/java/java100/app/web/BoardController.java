package java100.app.web;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
       
    
    //@RequestMapping(value="add", method=RequestMethod.POST)
    public String add_1(Board board,
            UploadFile uploadFile,
            @ModelAttribute("loginUser") Member loginUser,
            @RequestParam("file") MultipartFile file) throws Exception {

        board.setWriter(loginUser);
        boardService.add(board);
        
        List<UploadFile> list = new ArrayList<>();

        /*System.out.println(board.getNo());
        System.out.println(file.getOriginalFilename());*/

        uploadFile.setNo(board.getNo());
        uploadFile.setFilename(file.getOriginalFilename());
        
        list.add(uploadFile);
        board.setFiles(list);
        
        /*System.out.println(uploadFile.toString());
        System.out.println(board.toString());*/
        
        boardService.addFile(uploadFile);
        
        return "redirect:list";
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
    
    @RequestMapping(value="add", method=RequestMethod.POST)
    public String add(Board board,
            UploadFile uploadFile,
            @ModelAttribute("loginUser") Member loginUser,
            @RequestParam("file") MultipartFile[] files) throws Exception {

        board.setWriter(loginUser);
        boardService.add(board);
        
        List<UploadFile> list = new ArrayList<>();
        
        uploadFile.setNo(board.getNo());
        
        List<String> filenames = processMultipartFiles(files);
        for ( String filename : filenames) {
            if (filename.isEmpty()) continue;
            uploadFile.setFilename(filename);
            list.add(uploadFile);
            //board.setFiles(list);
            boardService.addFile(uploadFile);
        }
        
        return "redirect:list";
    }
    
    private List<String> processMultipartFiles(MultipartFile[] files) throws Exception {
      ArrayList<String> list = new ArrayList<>();
      for (MultipartFile file : files) {
        if (file.isEmpty())
          continue;       
        
        String filename = getNewFilename();  //날짜와 카운트로 새로운 파일명 생성
        String exename = extractFileExtName(file.getOriginalFilename());  // 확장자 추출
        file.transferTo(new File(servletContext.getRealPath("/file/" + filename + exename)));
        list.add(filename + exename);
      }
      return list;
    }
    
    int count = 0;
    synchronized private String getNewFilename() {
      if (count > 100) {
        count = 0;
      }
      return String.format("%d_%d", System.currentTimeMillis(), ++count); 
    }
    
    private String extractFileExtName(String filename) {
        int dotPosition = filename.lastIndexOf(".");
        
        if (dotPosition == -1)
            return "";
        
        return filename.substring(dotPosition);
    }

}
