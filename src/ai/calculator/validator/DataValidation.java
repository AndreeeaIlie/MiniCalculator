package ai.calculator.validator;

import ai.calculator.input.CalculatorInputDataInterface;
import ai.calculator.input.ConsoleInputNumber;

public class DataValidation implements Validator {
    private String firstNumber;
    private String secondNumber;
    private String operation;
    double inputNumber;
    private double validNumber;
    private String validOperation;

//    CalculatorInputDataInterface calculatorInputDataInterface = new ConsoleInputNumber();
    public DataValidation(){}
//    public DataValidation(String firstNumber, String secondNumber, String operation) {
//        this.firstNumber = firstNumber;
//        this.secondNumber = secondNumber;
//        this.operation = operation;
//    }

    public boolean isNumeric(String stringNumber) {
        try {
            Double.parseDouble(stringNumber);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public double checkNumber(String inputStringNumber) {
//        double inputNumber;
//        double inputNumber2;

//        String inputStringNumber = calculatorInputDataInterface.getStringNumber();
        if (isNumeric(inputStringNumber) == true ) {
            inputNumber = Double.parseDouble(inputStringNumber);
//            getNumber();
            return inputNumber;
        }
//        else  if (isNumeric(secondNumber) == true) {
//            inputNumber2 = Double.parseDouble(secondNumber);
//            return inputNumber2;
//        }
        return 0;
    }
    public double getNumber () {
//        double number = checkNumber(inputNumber);
        if (inputNumber == 0) {
            System.out.println("Please enter a valid number");
        } else
            this.validNumber = inputNumber;
        System.out.println(inputNumber);
        return validNumber;
    }
    public String checkOperation() {
//        String operation = calculatorInputDataInterface.getOperation();
        if (operation != "+"  || operation != "-" || operation != "*" || operation != "-") {
            return operation;
        }
        return  "invalid";
    }

    public String getOperation(String inputOperation) {
//        String operation = checkOperation();
//        if ( operation == "invalid") {
//            System.out.println("Please enter a valid operation");
//        } else
            this.validOperation = inputOperation;
        return validOperation;
    }
}
