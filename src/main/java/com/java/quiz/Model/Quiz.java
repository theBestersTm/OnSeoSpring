package com.java.quiz.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Entity
@Data
@Document(collection = "Quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String testName;


    public List<Question> questions;


    public void setId(int id) {
    }

    public String getId(int id) {
        return testName;
    }


    public void setQuestions(String questionName, String answer1, String answer2, String answer3, String answer4, int rightAnswer) {
        questions = new List<Question>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Question> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Question question) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Question> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Question> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Question get(int index) {
                return null;
            }

            @Override
            public Question set(int index, Question element) {
                return null;
            }

            @Override
            public void add(int index, Question element) {

            }

            @Override
            public Question remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Question> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Question> listIterator(int index) {
                return null;
            }

            @Override
            public List<Question> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
       questions.add(0, new Question(questionName, answer1, answer2, answer3, answer4, rightAnswer));
        questions.add(1, new Question(questionName, answer1, answer2, answer3, answer4, rightAnswer));
        questions.add(2, new Question(questionName, answer1, answer2, answer3, answer4, rightAnswer));

    }

}
