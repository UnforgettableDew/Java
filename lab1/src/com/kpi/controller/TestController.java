package com.kpi.controller;

import com.kpi.InputUtility.InputUtility;
import com.kpi.exceptions.InvalidInputException;
import com.kpi.model.entity.Question;
import com.kpi.model.TestModel;
import com.kpi.view.TestView;

public class TestController {
    private TestModel model = new TestModel();
    private TestView view = new TestView();

    public int checkNumber(String message) {
        String value = InputUtility.inputData(view, message);
        try {
            Validator.checkInt(value);
            Validator.checkPositiveInt(Integer.parseInt(value));
        } catch (InvalidInputException ex) {
            view.printMessage(ex.getMessage() + "\n");
            return checkNumber(message);
        }
        return Integer.parseInt(value);
    }

    public String checkCorrectAnswer(String[] answers){
        String correctAnswer = InputUtility.inputData(view, view.INPUT_CORRECT_ANSWER);
        try{
            Validator.checkAnswerExistence(answers, correctAnswer);
        }catch (InvalidInputException ex){
            view.printMessage(ex.getMessage() + "\n");
            return checkCorrectAnswer(answers);
        }
        return correctAnswer;
    }

    public void menu() {
        while (true) {
            view.printMessage(view.MAIN_MENU);
            switch (checkNumber(view.INPUT_POINT)) {
                case 5:
                    return;
                case 1:
                    String[] arrayOfAnswers;
                    model.addQuestion(new Question(InputUtility.inputData(view, view.INPUT_TYPE),
                            InputUtility.inputData(view, view.INPUT_DISCIPLINE),
                            InputUtility.inputData(view, view.INPUT_QUESTION),
                            arrayOfAnswers = InputUtility.inputArray(view, view.INPUT_ANSWERS,
                                    checkNumber(view.INPUT_COUNT_OF_ANSWERS)),
                            checkCorrectAnswer(arrayOfAnswers)
                    ));
//                    arrayOfAnswers = InputUtility.inputArray(view, view.INPUT_ANSWERS, InputUtility.inputInt(view,
//                            view.INPUT_COUNT_OF_ANSWERS));
//                    model.addAnswers(arrayOfAnswers = InputUtility.inputArray(view, view.INPUT_ANSWERS, InputUtility.inputInt(view,
//                            view.INPUT_COUNT_OF_ANSWERS)), InputUtility.inputCorrectAnswer(view, view.INPUT_CORRECT_ANSWER, arrayOfAnswers));
//                    model.addAnswers(InputUtility.inputArray(view, view.INPUT_ANSWERS, InputUtility.inputInt(view,
//                                    view.INPUT_COUNT_OF_ANSWERS)),
//                            InputUtility.inputString(view, view.INPUT_CORRECT_ANSWER));
                    break;
                case 2:
                    view.printMessageAndListOfQuestions(view.LIST_OF_QUESTIONS,
                            model.getQuestionsForCurrentDiscipline(InputUtility.inputData(view, view.INPUT_DISCIPLINE)));
                    break;
                case 3:
                    view.printMessageAndListOfQuestions(view.LIST_OF_QUESTIONS,
                            model.getQuestionsForCurrentType(InputUtility.inputData(view, view.INPUT_TYPE)));
                    break;
                case 4:
                    view.printMessage(view.ALL_TESTS, model.showInfo());
                    break;
                default:
                    view.printMessage(view.INVALID_VALUE);
                    break;
            }
        }
    }

}
