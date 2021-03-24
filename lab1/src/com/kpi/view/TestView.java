package com.kpi.view;

public class TestView {
    public static final String INPUT_TYPE = "Enter type of test: ";
    public static final String INPUT_DISCIPLINE = "Enter a discipline: ";
    public static final String INPUT_QUESTION = "Enter a question: ";
    public static final String INPUT_ANSWERS = "Enter the answer options:";
    public static final String INPUT_COUNT_OF_ANSWERS = "Enter count of answers: ";
    public static final String INPUT_CORRECT_ANSWER = "Enter the correct answer:";
    public static final String LIST_OF_QUESTIONS = "List of questions:";
    public static final String INVALID_VALUE = "Invalid value!";
    public static final String INPUT_POINT = "Select the point: ";
    public static final String ALL_TESTS = "All tests:";

    public static final String MAIN_MENU = "Main menu:\n"
            + "1 - Add question to the test\n"
            + "2 - Get questions of current discipline\n"
            + "3 - Get questions of current type\n"
            + "4 - Show all tests\n"
            + "5 - Exit\n";

    public static void printMessage(String... message) {
        for(String m:message)
            System.out.print(m + "\n");
    }

    public static void printMessageAndListOfQuestions(String message, String value) {
        if (value.length() != 0) {
            System.out.println(message + "\n" + value);
        } else
            System.out.println(INVALID_VALUE);
    }

}
