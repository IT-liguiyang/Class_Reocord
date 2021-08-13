package cn.web.controller;

import cn.web.domain.CommentActivityThought;
import cn.web.service.CommentActivityThoughtService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/commentActivityThought")
public class CommentActivityThoughtController {

    @Autowired
    private CommentActivityThoughtService commentActivityThoughtService;

    /**
     * 分页查询
     * @param model
     * @param commentActivityThought
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findall")
    public String findAll(Model model, CommentActivityThought commentActivityThought, @RequestParam(defaultValue="1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<CommentActivityThought> pageInfo = commentActivityThoughtService.findAll(commentActivityThought,pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "commentActivityThoughtlist";

    }

    @RequestMapping("/queryKey")
    public String queryKey(String cano,Model model){
        List<CommentActivityThought> CommentActivityThoughtList = commentActivityThoughtService.queryCommentActivityThoughtByPrimaryKey(cano);
        model.addAttribute("CommentActivityThoughtList",CommentActivityThoughtList);
        return "updateCommentActivityThought";
    }

    /**
     * 添加
     * @param commentActivityThought
     * @return
     */
    @PostMapping("/addcommentActivityThought")
    public String addCommentActivityThought(CommentActivityThought commentActivityThought) {
        List<CommentActivityThought> CommentActivityThoughts = commentActivityThoughtService.queryCommentActivityThoughtByPrimaryKey(commentActivityThought.getCano());
        if (CommentActivityThoughts.isEmpty()){
            commentActivityThoughtService.addCommentActivityThought(commentActivityThought);
            return "redirect:findall";
        }else
            return "redirect:/error";


    }

    /**
     * 更新
     * @param commentActivityThought
     * @return
     */
    @RequestMapping("/update")
    public String update(CommentActivityThought commentActivityThought){
        commentActivityThoughtService.updateCommentActivityThought(commentActivityThought);
        return "redirect:findall";
    }

    /**
     *
     * @param cano
     * @return
     */
    @RequestMapping("/delete")
    public String deleteCommentActivityThought(String cano)  {
        commentActivityThoughtService.deleteCommentActivityThought(cano);
        return "redirect:findall";
    }

}
