package com.xworkz.linkedin.controller;


import com.xworkz.linkedin.DAO.LinkedInDAO;
import com.xworkz.linkedin.entity.LinkedinEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Controller
@RequestMapping("/")
public class LinkedinController {

        @Autowired
        LinkedInDAO linkedInDAO;
    @PostMapping("/loginPage")
    public String loginPage( LinkedInDAO linkedInDAO) {
        linkedInDAO.save();
        return "index";
    }
}
