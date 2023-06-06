package com.example.demo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo1.entitys.User;
import com.example.demo1.services.UserService;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping("/list")
    public String showList(Model model){
        List <User> userList = userService.getAllUser();
        model.addAttribute("userList", userList);
        return "/user/list.html";
    }
}
