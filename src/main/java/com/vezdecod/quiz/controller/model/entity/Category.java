package com.vezdecod.quiz.controller.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
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
