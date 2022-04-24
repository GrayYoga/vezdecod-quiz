package com.vezdecod.quiz.entity;

import javax.persistence.*;

//@Data
@Entity
//@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int difficulty;

    @ManyToOne()
    private Category category;
    private String question;

    public Question(String question, Category category, int difficulty) {
        this.question = question;
        this.category = category;
        this.difficulty = difficulty;
    }

    public Question() {

    }
}
