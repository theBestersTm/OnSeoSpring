package com.java.quiz;
import com.java.quiz.Model.Quiz;

import java.util.List;
import java.util.Optional;

public interface Service {
    List<Quiz> getAllQuiz();

    Optional<Quiz> findQuiz(int id);

    void deleteQuiz(int id);

    void editQuiz(int id, Quiz quiz);

    void addQuiz(Quiz quiz);
}
