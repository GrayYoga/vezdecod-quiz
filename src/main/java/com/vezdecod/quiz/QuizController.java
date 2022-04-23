package com.vezdecod.quiz;

import com.vezdecod.quiz.model.Category;
import com.vezdecod.quiz.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/question/random")
    public Question getRandom() {
        return new Question("Поэт, автор поэмы Евгений Онегин", new Category("Поэты"), 200);
    }
}
