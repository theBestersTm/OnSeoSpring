package com.java.quiz;

/**
 * Created by sgva1 on 8/21/2019.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class QuizController implements ServiceController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "main";
    }

    @Override
    public void GetAllQuiz() {

    }

    @Override
    public void FindQuiz() {

    }

    @Override
    public void DeleteQuiz() {

    }

    @Override
    public void PassQuiz() {

    }

    @Override
    public void EditQuiz() {

    }



}


