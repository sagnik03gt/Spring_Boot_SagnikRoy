package com.example.spring_l1.controller;


import com.example.spring_l1.Services.UserService;
import com.example.spring_l1.model.User;
import com.example.spring_l1.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class userController{

    @Autowired
    UserRepo userRepo;

    @Autowired
    private UserService userService;



    @GetMapping("userApp/fst")
    @ResponseBody
    public String myFunc(){

        return "This is user demmo application";
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id){
//        return "Hey this is what it is!!";
        Optional<User> u1 = userRepo.findById(id);
        if(u1.isPresent()){
            User u2 = u1.get();
            return ResponseEntity.of(Optional.of(u2));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/allUser")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users = userRepo.getUsers();
        return ResponseEntity.of(Optional.of(users));
    }

    @GetMapping("/ageLimit/{age}")
    public ResponseEntity<List<User>> userByAge(@PathVariable("age") int age){
        List<User> users = userRepo.getUsers();
        List<User> userByage = new ArrayList<>();
        users.forEach(e->{
            if(e.getAge()>=age){
                userByage.add(e);
            }
        });
        return ResponseEntity.of(Optional.of(userByage));
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User us1){
        us1.setId(null);
        this.userService.addUser(us1);
//        System.out.println(res);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id){
        return userService.deleteUser(id);
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<?> updateUser(@RequestBody User user,@PathVariable("id") int id){
        return userService.updateUser(user,id);
    }


}