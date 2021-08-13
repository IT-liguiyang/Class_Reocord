package cn.web.controller;

import cn.web.domain.ClassNotes;
import cn.web.service.ClassNotesService;
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
@RequestMapping("/notes")
public class ClassNotesController {

    @Autowired
    private ClassNotesService classNotesService;

    @RequestMapping("/findall")
    public String findAll(Model model,String cnsubject, @RequestParam(defaultValue="1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<ClassNotes> pageInfo = classNotesService.findAll(cnsubject, pageNum, pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "noteslist";
    }

    @PostMapping("/add")
    public String add(ClassNotes classNotes){
        List<ClassNotes> classNotesList = classNotesService.queryByKey(classNotes.getCnno());
        if (classNotesList.isEmpty()){
            classNotesService.add(classNotes);
            return "redirect:findall";
        }else
            return "redirect:/error";
    }

    @RequestMapping("/querykey")
    public String queryByKey(String cnno,Model model){
        List<ClassNotes> classNotesList = classNotesService.queryByKey(cnno);
        model.addAttribute("classNotesList",classNotesList);
        return "updatenotes";
    }

    @RequestMapping("/update")
    public String update(ClassNotes classNotes){
        classNotesService.update(classNotes);
        return "redirect:findall";
    }

    @RequestMapping("/delete")
    public String delete(String cnno){
        classNotesService.delete(cnno);
        return "redirect:findall";
    }
}
