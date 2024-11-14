package com.example.holadocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/hola")
    public String holaMundo() {
        return "hola";
    }
    
    @GetMapping("/")
    public String homeMundo() {
        return "home";
    }
}

