package com.example.springtest;

import com.example.springtest.dao.UserRepo;
import com.example.springtest.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
//@ComponentScan({"com.example.springtest.dao"})
@ComponentScan({"com.example.springtest.controller"})
@ComponentScan({"com.example.springtest.service"})

public class SpringtestApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext context= SpringApplication.run(SpringtestApplication.class, args);
//       UserRepo userrepo= context.getBean(UserRepo.class);
//
//
//       User user1 = new User();
//       user1.setCity("Kolkata");
//       user1.setName("bipin");
//       user1.setStatus("Married");
//
//        User user2 = new User();
//        user2.setCity("delhi");
//        user2.setName("kumar");
//        user2.setStatus("unMarried");
//
//        User user3 = new User();
//        user2.setCity("Mulbai");
//        user2.setName("kumar");
//        user2.setStatus("unMarried");
//
//
//        List<User> user = List.of(user1,user2);
//        Iterable itr= userrepo.saveAll(user);
//
//        //itr.forEach(usr -> System.out.println(usr));
//
//        List<User> lst = userrepo.findByName("kumar");
//        lst.forEach(p-> System.out.println(p));
//
//        List<User> nmlike = userrepo.findByNameLike("%bi%");
//        nmlike.forEach(p-> System.out.println(p));
//
//        List<Integer> allid = userrepo.getAllId();
//        allid.forEach(p-> System.out.println(p));
//
//        List<String> userName = userrepo.getName(202);
//        userName.forEach(p-> System.out.println(p));
//
//
//        List<Object[]> results = userrepo.getNameCity(202,"Kolkata");
//        for (Object[] result : results) {
//            String name = (String) result[0];
//            String status = (String) result[1];
//            System.out.println("Name " + name + " status " + status);
//            // Process name and status
//        }
//
//        List<User> reslt= userrepo.getUser();
//        for (User result : reslt) {
//            System.out.println("Result " + result);
//            // Process name and status
//        }

    }

}
