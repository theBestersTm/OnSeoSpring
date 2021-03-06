package com.java.quiz.repository;

import com.java.quiz.Model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends MongoRepository <Quiz, String> {
}
