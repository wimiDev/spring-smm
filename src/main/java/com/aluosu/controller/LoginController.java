package com.aluosu.controller;

import com.aluosu.pojo.User;
import com.aluosu.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    /**
     * 登陆方法, 用户输入邮箱和密码, 查询数据库检验是否有该账户,如果有,
     * 返回原先页面 ,登陆成功。
     * @param email 用户邮箱
     * @param password 用户密码
     * @param model Spring MVC中的Model，用来储存经过controller处理后的信息，再由View层渲染
     *         得到前端页面。
     * @return
     */
    @RequestMapping(path="/login")
    public String login(@RequestParam("email") String email, @RequestParam("pwd") String password, Model model) {
        User logedUser = this.userService.loginByEmail(email, password);
        if (logedUser == null) {
            System.out.println("attempting to log in with the non-existed account");
            model.addAttribute("msg", "醒醒！");
            return "login";
        } else {

            User user = logedUser;
            model.addAttribute("msg", user.getName());
            return "login";
        }
    }
}
