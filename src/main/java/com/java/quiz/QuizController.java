package com.java.quiz;

import com.java.quiz.Model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class QuizController {
    @Autowired
    private Service service;

    @GetMapping("/tests")
    public List<Quiz> getTests(){
        return service.getAllQuiz();
    }

    @PostMapping("/add")
    public String add(@RequestBody Quiz quiz){
        service.addQuiz(quiz);
        return "Added Quiz with id: " + quiz.getId(3);
    }
}


