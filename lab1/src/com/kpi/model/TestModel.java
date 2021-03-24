package com.kpi.model;

import com.kpi.DataSource.DataSource;
import com.kpi.model.entity.Question;

import java.util.Arrays;

public class TestModel {
    private Question[] questions = new Question[2];
    private int countOfQuestions;


    public TestModel() {
        this.questions = DataSource.questions;
        this.countOfQuestions = DataSource.questions.length;
    }

    private Question[] expandArray() {
        return Arrays.copyOf(this.questions, this.questions.length*2);
    }

    public void addQuestion(Question question) {
        if (countOfQuestions == questions.length)
            this.questions = expandArray();
        questions[countOfQuestions] = question;
        countOfQuestions++;
    }

    public String showInfo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfQuestions; i++) {
            sb.append(questions[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getQuestionsForCurrentDiscipline(String discipline) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfQuestions; i++) {
            if (questions[i].getDiscipline().equals(discipline)) {
                sb.append("Type = " + questions[i].getType() + ", Question = " + questions[i].getQuestion() + ", "
                        + "Answers = " + Arrays.toString(questions[i].getAnswers()) + ", "
                        + "Correct answer = " + questions[i].getCorrectAnswer() + "\n");
            }
        }
        return sb.toString();
    }

    public String getQuestionsForCurrentType(String type) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfQuestions; i++) {
            if (questions[i].getType().equals(type)) {
                sb.append("Discipline = " + questions[i].getDiscipline() + ", Question = " + questions[i].getQuestion() + ", "
                        + "Answers = " + Arrays.toString(questions[i].getAnswers()) + ", "
                        + "Correct answer = " + questions[i].getCorrectAnswer() + "\n");
            }
        }
        return sb.toString();
    }
}

