package com.desk.backend.controller;



import com.desk.backend.models.Usuarios;
import com.desk.backend.service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Tag(name = "Clientes", description = "Rota para gerenciar clientes")
@RestController
@RequestMapping("/clientes")
public class Clientes {

    @Autowired
    private UserService service;


    @GetMapping("/all")
    public List<Usuarios> listUsers(){
        return service.allUsers();
    }

    @PostMapping("/add")
    public Usuarios addUser(@PathVariable Usuarios user){
        return service.addUser(user);
    }

    @GetMapping("/find/{id}")
    public Optional<Usuarios> findUserByID(@PathVariable long id){
        return service.findById(id);
    }

}
