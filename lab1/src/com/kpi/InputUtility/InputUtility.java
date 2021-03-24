package com.kpi.InputUtility;

import com.kpi.exceptions.InvalidInputException;
import com.kpi.controller.Validator;
import com.kpi.view.TestView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static String inputData(TestView view, String message) {
        view.printMessage(message);
        return sc.next();
    }

//    public static int inputInt(TestView view, String message) {
//        view.printMessage(message);
//        String integer = sc.next();
//        try{
//            Validator.checkInt(integer);
//            Validator.checkPositiveInt(Integer.parseInt(integer));
//        }catch (InvalidInputException ex){
//            view.printMessage(ex.getMessage() + "\n");
//            return inputInt(view, message);
//        }
//        return Integer.parseInt(integer);
//    }

//    public static String inputCorrectAnswer(TestView view, String message){
//        view.printMessage(message);
//        String correctAnswer = sc.next();
//        try{
//            Validator.checkAnswerExistence(answers, correctAnswer);
//        }catch (InvalidInputException ex){
//            view.printMessage(ex.getMessage() + "\n");
//            return inputCorrectAnswer(view, message, answers);
//        }
//        return correctAnswer;
//    }

    public static String[] inputArray(TestView view, String message, int countOfAnswers) {
        view.printMessage(message);
        String[] answers = new String[countOfAnswers];
        for (int i = 0; i < countOfAnswers; i++)
            answers[i] = sc.next();
        return answers;
    }
}
