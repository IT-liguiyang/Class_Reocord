package cn.web.controller;


import cn.web.domain.*;
import cn.web.service.ActivityService;
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
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;


    /**
     * 分页查询
     * @param model
     * @param aplace
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findall")
    public String findAll(Model model, String aplace, @RequestParam(defaultValue="1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Activity> pageInfo = activityService.findAll(aplace,pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "activitylist";
    }

    /**
     * 添加
     * @param activity
     * @return
     */
    @PostMapping("/addActivity")
    public String addActivity(Activity activity){
        //判断主键是否已经存在
       List<Activity> activities = activityService.queryActivityByAno(activity.getAno());
        if (activities.isEmpty()){
            activityService.addActivity(activity);
            return "redirect:findall";
        }else
            return "redirect:/error";

    }

    @RequestMapping("/querykey")
    public String queryActivityByAno(String ano, Model model){
        List<Activity> activityList = activityService.queryActivityByAno(ano);
        model.addAttribute("activityList",activityList);
        return "updateactivity";
    };

    /**
     * 更新
     * @param activity
     * @return
     */
    @RequestMapping("/updateactivity")
    public String update(Activity activity){
        activityService.updateActivity(activity);
        return "redirect:findall";
    }

    /**
     * 删除
     * @param ano
     * @return
     */
    @RequestMapping("/delete")
    public String deleteactivity(String ano)  {
        activityService.deleteActivity(ano);
        return "redirect:findall";
    }


}
