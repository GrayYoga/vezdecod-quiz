package com.vezdecod.quiz.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Data
public class Category {

    @GeneratedValue(strategy = SEQUENCE, generator = "CUST_SEQ")
    private @Id Long id;
    private String name;

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

}
