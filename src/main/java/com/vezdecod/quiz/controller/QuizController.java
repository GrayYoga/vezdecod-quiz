package com.vezdecod.quiz.controller;

import com.vezdecod.quiz.controller.model.entity.Question;
import com.vezdecod.quiz.controller.model.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequiredArgsConstructor
public class QuizController {
//    @Autowired()
    QuestionRepository questionRepo;
//    @Autowired
//    TutorialRepository tutorialRepository;

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
