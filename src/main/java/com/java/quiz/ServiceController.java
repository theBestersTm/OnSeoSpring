package com.java.quiz;

import org.springframework.stereotype.Service;

/**
 * Created by sgva1 on 8/21/2019.
 */
@Service
public interface ServiceController {

    void GetAllQuiz();

    void FindQuiz();

    void DeleteQuiz();

    void PassQuiz();

    void EditQuiz();
}

