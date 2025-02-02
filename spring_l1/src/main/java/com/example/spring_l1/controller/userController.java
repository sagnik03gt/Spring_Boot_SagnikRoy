package com.example.spring_l1.controller;

import com.example.spring_l1.model.User;
import com.example.spring_l1.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    userRepo user;


//    @PostMapping("/addUser")
//    public String addUser(){
//        User u1 = new User();
//        u1.setAge(22);
//        u1.setName("Sagnik");
//        user.save(u1);
//
//        return "Saved";
//    }

}
