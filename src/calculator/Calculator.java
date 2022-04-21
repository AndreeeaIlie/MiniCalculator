package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        switch (operation) {
            case "+" : result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            case "-" : result = firstNumber - secondNumber;
                System.out.println(result);
                break;
            case "*" : result = firstNumber * secondNumber;
                System.out.println(result);
                break;
            case "/" : result = firstNumber / secondNumber;
                System.out.println(result);
                break;
        }


    }
}
