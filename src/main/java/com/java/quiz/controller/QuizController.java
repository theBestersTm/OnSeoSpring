package com.java.quiz.controller;

import com.java.quiz.Model.Quiz;
import com.java.quiz.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class QuizController {
    @Autowired
    private Service service;

    @GetMapping("/add")
    public List<Quiz> getTests(){
        return service.getAllQuiz();
    }

    @PostMapping("/add")
    public String add(@RequestBody Quiz quiz){
        service.addQuiz(quiz);

        return "Added Quiz";
    }
}


