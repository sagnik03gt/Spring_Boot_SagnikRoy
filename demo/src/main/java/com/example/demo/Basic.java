package com.example.demo;


import com.example.demo.DTO.LogInDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Basic {

    @GetMapping("/num")
    public String number(){
        return "HI!!!";
    }
//    @GetMapping("/get")
//    public String get(@RequestParam(name = "")){
    @PostMapping("/sum")
    public ResponseEntity<Integer> sum(@RequestParam int num1,@RequestParam int num2){
        int sum=num1+num2;
        return ResponseEntity.ok(sum);
    }
    @GetMapping("/sub")
    public ResponseEntity<?> sub(@RequestParam(name = "n1") int num1,@RequestParam(name = "n2") int num2){
        if(num1==0){
            return ResponseEntity.badRequest().body("0 is invalid");
        }
        int sub=num1-num2;
        return ResponseEntity.ok(sub);
    }
    @PostMapping("/age/{a}")
    public ResponseEntity<?> myAge(@PathVariable int a){
        return ResponseEntity.accepted().body("My age is: "+a);
    }
    @PostMapping("/login")
    public ResponseEntity<?> getLog(@RequestBody LogInDTO logInDTO){
        if(logInDTO.username.equals("sagi") && logInDTO.password.equals("abcd12")){
            return ResponseEntity.accepted().body("Login Succesful");
        }
        return ResponseEntity.badRequest().body("404 Not Found User Derails!!!");
    }

}
