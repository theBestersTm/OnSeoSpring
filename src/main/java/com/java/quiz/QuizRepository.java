package com.java.quiz;

import com.java.quiz.Model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuizRepository extends MongoRepository <Quiz, String> {
}
