package com.desk.backend.service;

import com.desk.backend.models.Cards;
import com.desk.backend.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.smartcardio.Card;

import java.util.ArrayList;
import java.util.List;


@Service
public class CardService {

    @Autowired
    CardRepository query;

    public List<Cards> allCards(){
        System.out.println("realizando Busca no banco ...");

        List<Cards> cards = new ArrayList<>();
        try {   
            if (cards.isEmpty()) {
                System.out.println("Nenhum card encontrado.");
            } else {
                System.out.println("Cards encontrados: " + cards.size());
            }
        return query.findAll();
    }
        catch (Exception e) {
            System.out.println("Erro ao buscar cards: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
