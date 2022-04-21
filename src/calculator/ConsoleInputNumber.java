package calculator;

import calculator.CalculatorInputData;

import java.util.Scanner;

public class ConsoleInputNumber implements CalculatorInputData {
    private double number;
    private String operation;

    public double getNumber() {
       Scanner scanner = new Scanner(System.in);
       this.number = scanner.nextDouble();
       return number;
    }

    @Override
    public String getOperation() {
        Scanner scanner = new Scanner(System.in);
        this.operation = scanner.nextLine();
        return operation;
    }

}
