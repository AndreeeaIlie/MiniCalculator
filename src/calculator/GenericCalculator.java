package calculator;

import calculator.CalculatorInputData;
import calculator.ConsoleInputNumber;

public class GenericCalculator {

    public static void main(String[] args) {
        CalculatorInputData calculatorInputData = new ConsoleInputNumber();

        double firstNumber = calculatorInputData.getNumber();
        double secondNumber = calculatorInputData.getNumber();
        String operation = calculatorInputData.getOperation();
        double result;

        switch (operation) {
            case "+" :
                result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            case "-" :
                result = firstNumber - secondNumber;
                System.out.println(result);
                break;
            case "*" :
                result = firstNumber * secondNumber;
                System.out.println(result);
                break;
            case "/" :
                result = firstNumber / secondNumber;
                System.out.println(result);
                break;
        }

    }
}
