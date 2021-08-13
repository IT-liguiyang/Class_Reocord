package cn.web.controller;

import cn.web.domain.Commentforum;
import cn.web.service.CommentforumService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/commentforum")
public class CommentforumController {

    @Autowired
    private CommentforumService commentforumService;

    /**
     * 分页查询
     * @param model
     * @param commentforum
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findall")
    public String findAll(Model model, Commentforum commentforum, @RequestParam(defaultValue="1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Commentforum> pageInfo = commentforumService.findAll(commentforum,pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "commentforumlist";

    }

    @RequestMapping("/queryKey")
    public String queryKey(String cfno,Model model){
        List<Commentforum> commentforumList = commentforumService.queryCommentforumByPrimaryKey(cfno);
        model.addAttribute("commentforumList",commentforumList);
        return "updateCommentforum";
    }

    /**
     * 添加
     * @param commentforum
     * @return
     */
    @PostMapping("/addcommentforum")
    public String addCommentforum(Commentforum commentforum) {
        List<Commentforum> commentforums = commentforumService.queryCommentforumByPrimaryKey(commentforum.getCfno());
        if (commentforums.isEmpty()){
            commentforumService.addCommentforum(commentforum);
            return "redirect:findall";
        }else
            return "redirect:/error";


    }

    /**
     * 更新
     * @param commentforum
     * @return
     */
    @RequestMapping("/update")
    public String update(Commentforum commentforum){
        commentforumService.updateCommentforum(commentforum);
        return "redirect:findall";
    }

    /**
     *
     * @param cfno
     * @return
     */
    @RequestMapping("/delete")
    public String deletecommentforum(String cfno)  {
        commentforumService.deleteCommentforum(cfno);
        return "redirect:findall";
    }

}
