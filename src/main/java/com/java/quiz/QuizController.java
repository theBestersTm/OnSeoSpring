package com.java.quiz;

import com.java.quiz.Model.Question;
import com.java.quiz.Model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class QuizController {
    @Autowired
    private Service service;
//

    @GetMapping("/add")
    public List<Quiz> getTests(){
        return service.getAllQuiz();
    }//

    @PostMapping("/add")
    public String add(@RequestBody Quiz quiz){
        quiz.setTestName("Laptop");
        quiz.setQuestions("Which of interface you couldnt see in lastest laptop","SATA","PATA","M.2","TYPE-C",2);
        service.addQuiz(quiz);

        return "Added Quiz with id: " + quiz.getId();
    }
}


