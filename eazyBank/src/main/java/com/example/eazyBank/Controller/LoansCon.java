package com.example.eazyBank.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansCon {

    @GetMapping("/myLoans")
    public String getLoanDetails(){
        return "get Loans Details from DB";
    }
}
