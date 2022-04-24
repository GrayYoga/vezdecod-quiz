package com.vezdecod.quiz.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

}
