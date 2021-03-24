package com.kpi.model.entity;

import java.util.Arrays;

public class Question {
    private String type;
    private String discipline;
    private String question;
    private String[] answers;
    private String correctAnswer;

    public Question(String type, String discipline, String question, String[] answers, String correctAnswer) {
        this.type = type;
        this.discipline = discipline;
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getType() {
        return type;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "type='" + type + '\'' +
                ", discipline='" + discipline + '\'' +
                ", question='" + question + '\'' +
                ", answers=" + Arrays.toString(answers) +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}
