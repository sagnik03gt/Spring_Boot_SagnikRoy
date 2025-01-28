package com.example.db_demo.Controller;


import com.example.db_demo.DTO.CompanyDto;
import com.example.db_demo.DTO.EmployeeDto;
import com.example.db_demo.Model.Employee;
import com.example.db_demo.Service.CompanyService;
import com.example.db_demo.Service.EmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmplyeeService emplyeeService;

//    @Autowired



//    @GetMapping("/myApp")
//    public String MyApp(){
//        return "My app is running";
//    }
    @PostMapping("/addUser")
    public ResponseEntity<?> addUser(@RequestBody EmployeeDto emp){
           return emplyeeService.addUser(emp);

    }
    @PatchMapping("/updateUser/{id}/{pass}")
    public ResponseEntity updateUser(@PathVariable Integer id,@PathVariable String pass){
       return emplyeeService.updateUser(id,pass);
    }

//    @DeleteMapping("/deleteUser/{id}")
//    public ResponseEntity deleteUser(@PathVariable Integer id){
//        Optional<Employee> emp = em
//    }


}
