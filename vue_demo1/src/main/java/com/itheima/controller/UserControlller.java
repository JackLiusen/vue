package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserControlller {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public List<User> findAll(){
        System.out.println("test");
        return userService.findAll();
    }
    @RequestMapping("/findById.do")
    public User findById(Integer id){
        System.out.println("找到了");
        return userService.findById(id);
    }
    @RequestMapping("/updateUser.do")
    public void updateUser(@RequestBody User user){

        userService.updateUser(user);
    }

}
