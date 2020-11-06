package com.defs.controller;

import com.defs.domain.User;
import com.defs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-03 20:04
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    /**
     * 查询全部的用户
     * @param model
     * @return
     */
    @RequestMapping("/allUsers")
    public String list(Model model) {
        List<User> list = userService.queryAllUsers();
        model.addAttribute("list", list);
        return "allUsers";
    }

    /**
     * 跳转到添加用户界面
     * @return
     */
    @RequestMapping("/toAddUser")
    public String toAddPaper() {
        return "addUser";
    }

    /**
     * 保存新添加的用户
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    public String addPaper(User user) {
        System.out.println(user);
        userService.addUser(user);
        return "redirect:/user/allUsers";
    }

    /**
     * 跳转到更新用户页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/toUpdateUser")
    public String toUpdateUser(Model model, Integer id) {
        User user = userService.queryUserById(id);
        System.out.println(user);
        model.addAttribute("user",user );
        return "updateUser";
    }

    /**
     * 保存更改后的用户信息
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser( User user) {
        System.out.println(user);
        userService.updateUser(user);
        return "redirect:/user/allUsers";
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @RequestMapping("/del/{userId}")
    public String deleteUser(@PathVariable("userId") int id) {
        userService.deleteUserById(id);
        return "redirect:/user/allUsers";
    }

    /**
     * 根据名字查询用户信息
     * @param queryUsername
     * @param model
     * @return
     */
    @RequestMapping("/queryUsers")
    public String queryUsersByName(String queryUsername,Model model){
        List<User> list = userService.queryUserByName(queryUsername);
        model.addAttribute("list", list);
        if(list.size()==0||list==null){
            model.addAttribute("error","未查到数据");
            list.addAll(userService.queryUserByName("admin"));
        }
        return "allUsers";
    }
}
