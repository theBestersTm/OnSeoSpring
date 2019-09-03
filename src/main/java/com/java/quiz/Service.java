package com.java.quiz;
import com.java.quiz.Model.Quiz;

import java.util.List;
import java.util.Optional;


public interface Service {
    List<Quiz> getAllQuiz();

    Optional<Quiz> findQuiz(String id);

    void deleteQuiz(String id);

    void editQuiz(String id, Quiz quiz);

    void addQuiz(Quiz quiz);
}
