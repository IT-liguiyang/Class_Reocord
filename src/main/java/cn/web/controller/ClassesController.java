package cn.web.controller;

import cn.web.domain.Classes;
import cn.web.service.ClassesService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    private ClassesService classesService;

    @RequestMapping("/findall")
    public String findAll(Model model, String grade, @RequestParam(defaultValue="1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Classes> pageInfo = classesService.findAll(grade, pageNum, pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "classeslist";
    }

    @PostMapping("/add")
    public String add(Classes classes){
        List<Classes> classesList = classesService.queryByKey(classes.getCno());
        if (classesList.isEmpty()){
            classesService.add(classes);
            return "redirect:findall";
        }else
        return "redirect:/error";
    }

    @RequestMapping("/querykey")
    public String queryByKey(String cno,Model model){
        List<Classes> classesList = classesService.queryByKey(cno);
        model.addAttribute("classesList",classesList);
        return "updateclasses";
    }

    @RequestMapping("/update")
    public String update(Classes classes){
        classesService.update(classes);
        return "redirect:findall";
    }

    @RequestMapping("/delete")
    public String delete(String cno){
        classesService.delete(cno);
        return "redirect:findall";
    }

    @RequestMapping("/queryClassnum")
    public @ResponseBody
    List<Map<String, Object>> countClassNum(){
        return classesService.countClassnum();
    }

    @RequestMapping("/queryGradenum")
    public @ResponseBody List<Map<String,Object>> countGradeNum(){
        return classesService.countGradenum();
    }

}
