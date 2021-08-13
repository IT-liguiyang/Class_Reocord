package cn.web.controller;

import cn.web.domain.Work;
import cn.web.service.WorkService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/work")
public class WorkController {

    @Autowired
    private WorkService workService;

    /**
     * 分页查询
     *
     * @param model
     * @param work
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findall")
    public String findAll(Model model, Work work, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {
        PageInfo<Work> pageInfo = workService.findAll(work, pageNum, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "worklist";

    }

    @RequestMapping("/queryKey")
    public String queryKey(String comno, Model model) {
        List<Work> workList = workService.queryWorkByPrimaryKey(comno);
        model.addAttribute("workList", workList);
        return "updateWork";
    }

    /**
     * 添加
     *
     * @param work
     * @return
     */
    @PostMapping("/addwork")
    public String addWork(Work work) {
        List<Work> works = workService.queryWorkByPrimaryKey(work.getComno());
        if (works.isEmpty()) {
            workService.addWork(work);
            return "redirect:findall";
        } else
            return "redirect:/error";


    }

    /**
     * 更新
     *
     * @param work
     * @return
     */
    @RequestMapping("/update")
    public String update(Work work) {
        workService.updateWork(work);
        return "redirect:findall";
    }

    /**
     * @param comno
     * @return
     */
    @RequestMapping("/delete")
    public String deletework(String comno) {
        workService.deleteWork(comno);
        return "redirect:findall";
    }

}
