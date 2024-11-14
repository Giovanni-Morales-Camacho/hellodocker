package com.example.holadocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/hola") //esta es la url a abirse dentro del puerto 8080
    public String holaMundo() {
        return "hola"; //este es el html que tomará para mostrar
    }
    
    @GetMapping("/")
    public String homeMundo() {
        return "home";
    }
}

