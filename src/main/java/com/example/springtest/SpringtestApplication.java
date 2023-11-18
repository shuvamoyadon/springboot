package com.example.springtest;

import com.example.springtest.dao.UserRepo;
import com.example.springtest.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.springtest.dao"})
public class SpringtestApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext context= SpringApplication.run(SpringtestApplication.class, args);
       UserRepo userrepo= context.getBean(UserRepo.class);


       User user = new User();
       user.setCity("Kolkata");
       user.setName("Amal");
       user.setStatus("Married");

       User ur = userrepo.save(user);

        System.out.print(ur);

    }

}
