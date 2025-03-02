package com.example.eazyBank.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountCon {

    @GetMapping("/myAccount")
    public String getAccountDetails(){
        return "get Account Details from DB";
    }
}
