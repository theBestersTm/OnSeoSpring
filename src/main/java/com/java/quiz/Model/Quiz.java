package com.java.quiz.Model;

/**
 * Created by sgva1 on 8/21/2019.
 */

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Getter;
import javax.persistence.*;

@Entity
@Table(name = "Quizes")
@Data
public class Quiz {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Test_ID")

    private int testId;

    @Column(name = "Test_name")
    private String testName;

    @Column(name = "Question")
    private String question;

    @Column(name = "Question_id")
    private String questionId;

    @Column(name = "Answer1")
    private String answer1;

    @Column(name = "Answer2")
    private String answer2;

    @Column(name = "Answer3")
    private String answer3;

    @Column(name = "Answer4")
    private String answer4;

    @Column(name = "Right answer")
    private String roghtAnswer;

    public Quiz(String testName, int testId) {
        this.testName = testName;
        this.testId = testId;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + testName + '\'' +
                ", bookAuthor='" + question + '\'' +
                ", answer1=" + answer1 +
                '}';
    }
}
