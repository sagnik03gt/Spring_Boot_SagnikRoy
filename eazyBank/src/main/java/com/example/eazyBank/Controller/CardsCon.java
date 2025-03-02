package com.example.eazyBank.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsCon {

    @GetMapping("/myCards")
    public String getMyCardDetails(){
        return "get Card Details from DB";
    }
}
