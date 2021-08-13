package cn.web.controller;

import cn.web.domain.ActivityThought;
import cn.web.service.ActivityThoughtService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/thought")
public class ActivityThoughtController {

    @Autowired
    private ActivityThoughtService activityThoughtService;

    /**
     * 分页查询
     * @param model
     * @param atcontent
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findall")
    public String findAll(Model model, String atcontent, @RequestParam(defaultValue="1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<ActivityThought> pageInfo = activityThoughtService.findAll(atcontent,pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "activitythoughtlist";

    }

    @RequestMapping("/queryKey")
    public String queryKey(String atno,Model model){
        List<ActivityThought> thoughtList = activityThoughtService.queryActivityByPrimaryKey(atno);
        model.addAttribute("thoughtList",thoughtList);
        return "updateActivityThought";
    }

    /**
     * 添加
     * @param activityThought
     * @return
     */
    @PostMapping("/addthought")
    public String addActivity(ActivityThought activityThought) {
        List<ActivityThought> thoughts = activityThoughtService.queryActivityByPrimaryKey(activityThought.getAtno());
        if (thoughts.isEmpty()){
            activityThoughtService.addActivityThought(activityThought);
            return "redirect:findall";
        }else
            return "redirect:/error";


    }

    /**
     * 更新
     * @param activityThought
     * @return
     */
    @RequestMapping("/update")
    public String update(ActivityThought activityThought){
        activityThoughtService.updateActivityThought(activityThought);
        return "redirect:findall";
    }

    /**
     *
     * @param atno
     * @return
     */
    @RequestMapping("/delete")
    public String deleteactivity(String atno)  {
        activityThoughtService.deleteActivityThought(atno);
        return "redirect:findall";
    }

}
