package com.example.eazyBank.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceAcc {

    @GetMapping("/myBalance")
    public String getBalanceDetails(){
        return "get Balance Details from DB";
    }
}
