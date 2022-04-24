package com.vezdecod.quiz.controller;

import com.vezdecod.quiz.entity.Question;
import com.vezdecod.quiz.entity.QuestionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
    QuestionRepository questionRepo;
    QuizController(QuestionRepository questionRepo) {
        this.questionRepo = questionRepo;
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/question/random")
    public Question getRandom() {
//        return new Question("Поэт, автор поэмы Евгений Онегин", new Category("Поэты"), 200);
        return questionRepo.getById(1);
    }
}
