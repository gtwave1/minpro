package com.wave.controller;

import com.wave.pojo.User;
import com.wave.service.UserService;
import com.wave.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test(){
        return "zhaojia";
    }

    @RequestMapping("/test1")
    public User selectById(String userid){
        User user = userService.selectById(userid);
        return user;
    }

    @RequestMapping("/selectusername")
    public Message selectByUsername(String username){
        User user = userService.selectByUsername(username);
        Message message = new Message();
        message.setObject(message);
        return message;
    }
}
