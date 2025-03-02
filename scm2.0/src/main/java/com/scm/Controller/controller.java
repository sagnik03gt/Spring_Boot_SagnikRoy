package com.scm.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {


    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @RequestMapping("/service")
    public String servicePage(){
        return "service";
    }

}
