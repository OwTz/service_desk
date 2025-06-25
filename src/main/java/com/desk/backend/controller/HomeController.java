package com.desk.backend.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@Tag(name = "Home Page", description = "Rota para página inicial do site")
public class HomeController {



    @GetMapping("")
    public String home(){
        return "<h1> in working... </h1>";
    }

}
