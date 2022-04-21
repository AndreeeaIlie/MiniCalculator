package ai.calculator.business;

import ai.calculator.input.CalculatorInputDataInterface;
import ai.calculator.input.ConsoleInputNumber;
import ai.calculator.validator.DataValidation;
import ai.calculator.validator.Validator;

public class BusinessLogic implements Business{
//    private double firstNumber;
//    private double secondNumber;
//    private String operation;
    double result;

//    public BusinessLogic(){}
//    public BusinessLogic(double firstNumber, double secondNumber, String operation) {
//        this.firstNumber = firstNumber;
//        this.secondNumber = secondNumber;
//        this.operation = operation;
//    }
    public double returnResult (double firstNumber,double secondNumber, String validOeration) {
//        Validator validator = new DataValidation();
//        double firstNumber = validator.getNumber();
//        String operation = validator.getOperation();
//        double secondNumber = validator.getNumber();
//        System.out.println(operation);
        switch (validOeration) {
            case "+" :
                result = firstNumber + secondNumber;
                break;
            case "-" :
                result = firstNumber - secondNumber;
                break;
            case "*" :
                result = firstNumber * secondNumber;
                break;
            case "/" :
                result = firstNumber / secondNumber;
                break;
        }
        return result;

    }
}
