package com.kpi.exceptions;

public class InvalidInputException extends RuntimeException{
    public static final String WRONG_INPUT_TYPE = "Wrong input type ";
    public static final String NEGATIVE_OR_ZERO_VALUE = "Value can't be negative or zero";
    public static final String ANSWER_NOT_EXIST = "The answer not exists";

    public InvalidInputException(String message) {
        super(message);
    }
}
