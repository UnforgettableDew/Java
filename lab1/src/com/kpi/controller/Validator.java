package com.kpi.controller;

import com.kpi.exceptions.InvalidInputException;

public class Validator {
    public static boolean checkInt(String value) {
        if (value.matches("[+,-]?[0-9]+"))
            return true;
        throw new InvalidInputException(InvalidInputException.WRONG_INPUT_TYPE);
    }

    public static boolean checkPositiveInt(int value) {
        if (value > 0)
            return true;
        throw new InvalidInputException(InvalidInputException.NEGATIVE_OR_ZERO_VALUE);
    }

    public static boolean checkAnswerExistence(String[] answers, String correctAnswer) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals(correctAnswer)) {
                return true;
            }
        }
        throw new InvalidInputException(InvalidInputException.ANSWER_NOT_EXIST);
    }
}
