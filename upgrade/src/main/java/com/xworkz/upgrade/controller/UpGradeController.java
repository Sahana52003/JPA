package com.xworkz.upgrade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UpGradeController {
    public UpGradeController(){
        System.out.println("UpGradeController is Called");
    }




    @GetMapping("/")
    public String showHomePage(){

        return "index";
    }


    @GetMapping("/login")
    public String showLoginPage(){
        return "login";
    }

//
//    @PostMapping("/loginData")
//    public String showLoginPage(){
//        return "login";
//    }

    @GetMapping("/register")
    public String showRegisterPage(){
        return "register";
    }

    @PostMapping("/registerData")
    public String saveRegisterPage(){
        return "register";
    }

}
