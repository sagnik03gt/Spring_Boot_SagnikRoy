package com.scm.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @GetMapping("/myPage")
    public String myApp(Model model){
        System.out.println("This is my page");
        model.addAttribute("name", "Sagnik");
        model.addAttribute("age", "age is 22");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @RequestMapping("/service")
    public String servicePage(){
        return "service";
    }

}
