package com.java.quiz.Model;

/**
 * Created by sgva1 on 8/21/2019.
 */

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    private List<Question> questions;
}
