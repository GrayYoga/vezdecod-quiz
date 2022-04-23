package com.vezdecod.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},
        scanBasePackages = {"com.vezdecod.quiz", "com.vezdecod.quiz.repository"})
public class QuizApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuizApplication.class, args);
    }
}
