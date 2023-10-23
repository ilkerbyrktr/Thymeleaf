package com.ilker.Thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processFormVTwo")
    public String letsShout(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        name=name.toUpperCase();
        String result = "Selam! "+name;
        model.addAttribute("message",result);
        return "helloworld";
    }
}
