package com.java.quiz.service;

import com.java.quiz.Model.Quiz;
import com.java.quiz.Service;
import com.java.quiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class QuizService implements Service {
    @Autowired
    QuizRepository quizRepository;


    @Override
    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }

    @Override
    public Optional<Quiz> findQuiz(String id) {
        return quizRepository.findById(id);
    }

    @Override
    public void deleteQuiz(String id) {
        quizRepository.deleteById(id);
    }

    @Override
    public void editQuiz(String id, Quiz quiz) {
        quizRepository.save(quiz);
    }

    @Override
    public void addQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }
}
