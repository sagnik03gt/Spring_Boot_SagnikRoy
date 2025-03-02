package com.example.eazyBank.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactCon {

    @GetMapping("/Contact")
    public String getContactDetails(){
        return "get Contacts Details from DB";
    }
}
