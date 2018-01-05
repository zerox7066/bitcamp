package java100.app.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.domain.Score;
import java100.app.service.ScoreService;

@Controller
@RequestMapping("/score")
public class ScoreController {
    
    @Autowired ScoreService scoreService;
    
    @RequestMapping("list")
    public String list(
            @RequestParam(value="pn", defaultValue="1") int pageNo,
            @RequestParam(value="ps", defaultValue="5") int pageSize,
            @RequestParam(value="nm", required=false) String[] names,
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
        options.put("names", names);
        options.put("orderColumn", orderColumn);
        options.put("align", align);
        
        int totalCount = scoreService.getTotalCount();
        int lastPageNo = totalCount / pageSize;
        if ((totalCount % pageSize) > 0) {
            lastPageNo++;
        }
        
        model.addAttribute("pageNo", pageNo);
        model.addAttribute("lastPageNo", lastPageNo);
        model.addAttribute("list", scoreService.list(pageNo, pageSize, options));
        
        return "score/list";
    }
    
    @RequestMapping("{no}")
    public String view(@PathVariable int no, Model model) throws Exception {
        
        model.addAttribute("score", scoreService.get(no));
        return "score/view";
    }
    
    @RequestMapping("form")
    public String form() throws Exception {
        
        return "score/form";
    }
    
    @RequestMapping("add")
    public String add(Score score) throws Exception {
        
        scoreService.add(score);
        return "redirect:list";
    }
    
    @RequestMapping("update")
    public String update(
            Score score) throws Exception {
        
        scoreService.update(score);
        return "redirect:list";
    }
    
    @RequestMapping("delete")
    public String delete(int no) throws Exception {
        
        scoreService.delete(no);
        return "redirect:list";
    }

}
