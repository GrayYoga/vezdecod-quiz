package com.vezdecod.quiz.controller.model.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@Table(name = "category")
public class Category {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long id;
    private String name;

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

}
