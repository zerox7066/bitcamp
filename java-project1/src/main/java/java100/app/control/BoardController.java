package java100.app.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@Controller
public class BoardController {
    
    @Autowired BoardDao boardDao;
    
    @RequestMapping("/board/list")
    public String list(
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("app-servlet.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
        Map<String,Object> data = new HashMap<>();
        data.put("orderColumn", "regdt");
        data.put("align", "asc");
        
        List<String> words = new ArrayList<>();
        words.add("hi");
        words.add("5");
        words.add("1");
        
        //data.put("words", words);
        
        List<Board> list = boardDao.findAll(data);
        
        request.setAttribute("list", list);
        
        iocContainer.close();
        
        return "/board/list.jsp";
        
    }
    
    @RequestMapping("/board/add")
    public String add(
            Board board,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        boardDao.insert(board);
        return "redirect:list.do";
    }
    
    @RequestMapping("/board/delete")
    public String delete(
            @RequestParam("no") int no,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        boardDao.delete(no);
        return "redirect:list.do";
    }
    
    @RequestMapping("/board/form")
    public String form(
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {

        return "/board/form.jsp";
        
    }
    
    @RequestMapping("/board/update")
    public String update(
            Board board,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        boardDao.update(board);
        return "redirect:list.do";
    }
    
    @RequestMapping("/board/view")
    public String view(
            @RequestParam("no") int no,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        Board board = boardDao.findByNo(no);
        request.setAttribute("board", board);
        return "/board/view.jsp";
    }

}
