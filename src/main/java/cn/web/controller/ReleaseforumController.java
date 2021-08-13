package cn.web.controller;

import cn.web.domain.Releaseforum;
import cn.web.service.ReleaseforumService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/releaseforum")
public class ReleaseforumController {

    @Autowired
    private ReleaseforumService releaseforumService;

    /**
     * 分页查询
     * @param model
     * @param releaseforum
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findall")
    public String findAll(Model model, Releaseforum releaseforum, @RequestParam(defaultValue="1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Releaseforum> pageInfo = releaseforumService.findAll(releaseforum,pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "releaseforumlist";

    }

    @RequestMapping("/queryKey")
    public String queryKey(String rno,Model model){
        List<Releaseforum> releaseforumList = releaseforumService.queryReleaseforumByPrimaryKey(rno);
        model.addAttribute("releaseforumList",releaseforumList);
        return "updateReleaseforum";
    }

    /**
     * 添加
     * @param releaseforum
     * @return
     */
    @PostMapping("/addreleaseforum")
    public String addReleaseforum(Releaseforum releaseforum) {
        List<Releaseforum> releaseforums = releaseforumService.queryReleaseforumByPrimaryKey(releaseforum.getRno());
        if (releaseforums.isEmpty()){
            releaseforumService.addReleaseforum(releaseforum);
            return "redirect:findall";
        }else
            return "redirect:/error";


    }

    /**
     * 更新
     * @param releaseforum
     * @return
     */
    @RequestMapping("/update")
    public String update(Releaseforum releaseforum){
        releaseforumService.updateReleaseforum(releaseforum);
        return "redirect:findall";
    }

    /**
     *
     * @param rno
     * @return
     */
    @RequestMapping("/delete")
    public String deletereleaseforum(String rno)  {
        releaseforumService.deleteReleaseforum(rno);
        return "redirect:findall";
    }

}
