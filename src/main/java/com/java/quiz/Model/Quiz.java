package com.java.quiz.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@Document(collection = "Quiz")
public class Quiz {
    @Id
    private String id;

    private String testName;

    public List<Question> questions;

//    public void setQuestions(String questionName, String answer1, String answer2, String answer3, String answer4, int rightAnswer) {
//        questions = new ArrayList<Question>();
//        questions.add(0, new Question(questionName, answer1, answer2, answer3, answer4, rightAnswer));
//        questions.add(1, new Question(questionName, answer1, answer2, answer3, answer4, rightAnswer));
//        questions.add(2, new Question(questionName, answer1, answer2, answer3, answer4, rightAnswer));
//
//    }

}
