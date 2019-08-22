package com.java.quiz.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;

@Document
public class Question {
    @Column(name = "QuestionName")
    private String questionName;

    @Column(name = "Answer1")
    private String answer1;

    @Column(name = "Answer2")
    private String answer2;

    @Column(name = "Answer3")
    private String answer3;

    @Column(name = "Answer4")
    private String answer4;

    @Column(name = "Right answer")
    private int rightAnswer;
}
