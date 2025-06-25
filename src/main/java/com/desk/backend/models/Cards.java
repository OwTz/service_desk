package com.desk.backend.models;


import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "cards")
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 23, nullable = false)
    private String nome;

}
