package com.example.springtest.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SimpleController {

    @GetMapping("/home")
    public String home() {
        // The string "home" is the name of the view (i.e., home.jsp)
        return "home";
    }
}
