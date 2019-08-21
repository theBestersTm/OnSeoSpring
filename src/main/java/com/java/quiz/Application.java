package com.java.quiz;

/**
 * Created by sgva1 on 8/21/2019.
 */

import com.java.quiz.Model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Application implements CommandLineRunner {
    @Autowired
    private QuizRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        repository.deleteAll();

        // save a couple of customers
        repository.save(new Quiz("Laptop hardware", 1));
        repository.save(new Quiz("Sowtware enginering", 2));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Quiz quiz : repository.findAll()) {
            System.out.println(quiz);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByNameQuiz("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Quiz quiz : repository.findbyTestId(2)) {
            System.out.println(quiz);
        }
    }
}