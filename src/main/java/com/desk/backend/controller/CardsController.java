package com.desk.backend.controller;


import com.desk.backend.models.Cards;
import com.desk.backend.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardsController {

    @Autowired
    private CardService service;

    @GetMapping
    public List<Cards> allCards(){
        return service.allCards();
    }
}
