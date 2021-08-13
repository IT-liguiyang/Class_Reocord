package cn.web.controller;

import cn.web.domain.Admin;
import cn.web.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    private String login(Admin admin, HttpSession session){
        List<Admin> adminList = adminService.checkLogin(admin);
        if (!(adminList.isEmpty())) {
            session.setAttribute("login",adminList);
            return "redirect:/main";
        }
        else {
            session.setAttribute("msg","用户名或者密码错误");
            return "redirect:/";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
