package com.java.quiz.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
@Data
@Document
public class Question {

    public String questionName;


    private String answer1;


    private String answer2;


    private String answer3;


    private String answer4;


    private int rightAnswer;

    public Question(String questionName, String answer1, String answer2, String answer3, String answer4, int rightAnswer) {
        this.questionName=questionName;
        this.answer1=answer1;
        this.answer2=answer2;
        this.answer3=answer3;
        this.answer4=answer4;
        this.rightAnswer=rightAnswer;
    }
}
