package com.defs.controller;

import com.defs.dto.LoginUser;
import com.defs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author fuyongping
 * @date 2021-01-02 11:46
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    @Qualifier("loginService")
    private LoginService loginService;
    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/jumpRegister")
    public String register(){
        return "login";
    }

    /**
     * 跳转到管理页面
     * @return
     */
    @RequestMapping("/jumpManagement")
    public String management(){
        return "management";
    }

    @RequestMapping("/register")
    public String login(HttpSession session, Model model, LoginUser loginUser){
        // 登录验证，如果有这个用户就将用户名放入TOKEN中
        boolean existsLoginUser = loginService.isExistsLoginUser(loginUser);
        if(!existsLoginUser){
            model.addAttribute("error", "用户名不存在");
            return "login";
        }
        session.setAttribute("TOKEN", loginUser.getUsername());
        return "management";
    }

    //退出登陆
    @RequestMapping("logout")
    public String logout(HttpSession session) throws Exception {
        // session 过期
        session.invalidate();
        return "login";
    }
}
