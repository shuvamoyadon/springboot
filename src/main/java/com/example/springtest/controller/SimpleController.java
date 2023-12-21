package com.example.springtest.controller;

import com.example.springtest.entity.User;
import org.hibernate.mapping.Array;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


//@Controller
@RestController
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SimpleController {

    @RequestMapping("/")
    public String home() {
        // The string "home" is the name of the view (i.e., home.jsp)
        return "home";
    }

    @RequestMapping("/UserDetails")
    public User getUser() {
        User user = new User();
        user.setStatus("UnMarried");
        user.setCity("Mumbai");

        return user;
    }

    @GetMapping("/{id}/{id2}")
    public List pathVariable(@PathVariable  String id , @PathVariable String id2){
        return List.of(id,id2);
    }

    @GetMapping("/requestParam")
    public String requestParameter(@RequestParam  String name,
                                   @RequestParam(name="email", required = false,defaultValue = "")  String email)
    {

        return "Name:"+ name + "<br>EmailID:" + email;
    }

}
