package cn.yhj.wei.controller;


import cn.yhj.wei.bean.User;
import cn.yhj.wei.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @package: com.yhj.boot.first.controller
 * @ClassName: Index
 * @author: yhj.
 * @date : 2022-01-06 14:51
 **/

@Slf4j
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String tologin(@RequestParam(value = "userCode") String userCode,
                          @RequestParam(value = "userPassword") String userPassword,
                          HttpSession session, Model model){
        User user=userService.login(userCode,userPassword);
        if(null!=user){
            //写入session
            session.setAttribute("loginUser",user);
            //登录成功 跳转到主页面
            return "redirect:/main";
        }else {
            model.addAttribute("msg", "用户名或者密码错误");
            return "login";
        }
    }

    //跳转到主页面
    @GetMapping("/main")
    public String main(HttpSession session,Model model){
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser!=null){
            return "main";
        }else {
            model.addAttribute("msg", "请先登录");
            return "login";
        }
    }
}
