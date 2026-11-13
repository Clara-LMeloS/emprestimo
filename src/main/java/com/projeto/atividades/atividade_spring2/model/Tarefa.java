package com.projeto.atividades.atividade_spring2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue
   private Long id;

   private String titulo;
   private boolean feita;
}
