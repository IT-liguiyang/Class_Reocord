package cn.web.controller;

import cn.web.domain.Student;

import cn.web.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 分页查询
     * @param model
     * @param student
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findall")
    public String findAll(Model model, Student student, @RequestParam(defaultValue="1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize){
        PageInfo<Student> pageInfo = studentService.findAll(student,pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "studentlist";

    }

    @RequestMapping("/queryKey")
    public String queryKey(String username,Model model){
        List<Student> StudentList = studentService.queryStudentByPrimaryKey(username);
        model.addAttribute("StudentList",StudentList);
        return "updateStudent";
    }

    /**
     * 添加
     * @param student
     * @return
     */
    @PostMapping("/addstudent")
    public String addStudent(Student student) {
        List<Student> Students = studentService.queryStudentByPrimaryKey(student.getUsername());
        if (Students.isEmpty()){
            studentService.addStudent(student);
            return "redirect:findall";
        }else
            return "redirect:/error";
    }

    /**
     * 更新
     * @param student
     * @return
     */
    @RequestMapping("/update")
    public String update(Student student){
        studentService.updateStudent(student);
        return "redirect:findall";
    }

    /**
     *
     * @param username
     * @return
     */
    @RequestMapping("/delete")
    public String deleteStudent(String username)  {
        studentService.deleteStudent(username);
        return "redirect:findall";
    }

}
