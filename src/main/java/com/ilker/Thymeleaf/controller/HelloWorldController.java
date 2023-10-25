package com.ilker.Thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class HelloWorldController {
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @PostMapping("/processFormVTwo")
    public String letsShout(@RequestParam("studentName") String name, Model model){
        name=name.toUpperCase();
        String result = "Selam! "+name;
        model.addAttribute("message",result);
        return "helloworld";
    }
}
