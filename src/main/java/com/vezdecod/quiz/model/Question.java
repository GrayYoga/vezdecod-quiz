package com.vezdecod.quiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NonNull;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@Entity
public class Question {
    @GeneratedValue(strategy=SEQUENCE, generator="CUST_SEQ")
    private @Id Long id;
    private int difficulty;
    private Category category;
    private String question;

    public Question(String question, Category category, int difficulty) {
        this.question = question;
        this.category = category;
        this.difficulty = difficulty;
    }

    public Question() {

    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    @Id
    public @NonNull Long getId() {
        return id;
    }
}
