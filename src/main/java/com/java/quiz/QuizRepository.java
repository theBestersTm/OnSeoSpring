package com.java.quiz;

import com.java.quiz.Model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by sgva1 on 8/21/2019.
 */
public interface QuizRepository extends MongoRepository <Quiz, String> {
    public  Quiz findByNameQuiz(String quizName);
    public List<Quiz> findbyTestId(int TestId);
}
