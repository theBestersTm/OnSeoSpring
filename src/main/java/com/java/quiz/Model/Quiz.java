package com.java.quiz.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Document(collection = "Quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Test_name")
    private String testName;

    @Column(name = "Question")
    private List<Question> questions;

    public void setId(int id) {
    }

    public String getId( int id) {
        return testName;
    }


}
