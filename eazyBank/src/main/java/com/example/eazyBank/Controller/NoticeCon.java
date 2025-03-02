package com.example.eazyBank.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeCon {

    @GetMapping("/myNotices")
    public String getNoticeDetails(){
        return "get Notice Details from DB";
    }
}
