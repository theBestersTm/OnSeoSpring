package com.java.quiz;

import com.java.quiz.Model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class QuizService implements Service{
    @Autowired
    QuizRepository quizRepository;


    @Override
    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }

    @Override
    public Optional<Quiz> findQuiz(int id) {
        return quizRepository.findById(id);
    }

    @Override
    public void deleteQuiz(int id) {
        quizRepository.deleteById(id);
    }

    @Override
    public void editQuiz(int id, Quiz quiz) {
        quiz.setId(id);
        quizRepository.save(quiz);
    }
///
    @Override
    public void addQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }
}
