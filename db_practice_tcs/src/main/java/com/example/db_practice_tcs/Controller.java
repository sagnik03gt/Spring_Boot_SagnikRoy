package com.example.db_practice_tcs;


import Repo.Emp_tcsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Emp_tcsRepo emp;

    @GetMapping("/myPage")
    public String func(){
        return "This is my page";
    }
    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestParam String name,@RequestParam int age){

    }
}
