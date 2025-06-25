package com.desk.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desk.backend.models.Usuarios;
import com.desk.backend.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService service;


    @GetMapping("/all")
    public List<Usuarios> listUsers(){
        return service.allUsers();
    }

    @PostMapping("/add")
    public Usuarios addUser(@RequestBody Usuarios user){
        return service.addUser(user);
    }

}
