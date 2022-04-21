package ai.calculator.input;

import ai.calculator.validator.DataValidation;
import ai.calculator.validator.Validator;

import java.util.Scanner;

public class ConsoleInputNumber implements CalculatorInputDataInterface {
    private String stringNumber;
    private String operation;

    public String getStringNumber() {
        Scanner scanner = new Scanner(System.in);
        this.stringNumber = scanner.nextLine();
        return stringNumber;
    }

    public String getOperation() {
        Scanner scanner = new Scanner(System.in);
        this.operation = scanner.nextLine();
        return operation;
    }
}
