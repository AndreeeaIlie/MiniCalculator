package ai.calculator;

import ai.calculator.business.Business;
import ai.calculator.business.BusinessLogic;
import ai.calculator.input.CalculatorInputDataInterface;
import ai.calculator.input.ConsoleInputNumber;
import ai.calculator.input.FileInputData;
import ai.calculator.output.OutputConsole;
import ai.calculator.output.OutputFile;
import ai.calculator.output.OutputInterface;
import ai.calculator.validator.DataValidation;
import ai.calculator.validator.Validator;

import java.io.IOException;

public class MiniCalculator {
    public static void main(String[] args) throws IOException{
        try {
            FileInputData.createFolder();
            FileInputData.createFile();
            FileInputData.readFile();
        } catch (IOException e) {
            System.out.println("Exception occured: ");
            e.printStackTrace();
        }

        CalculatorInputDataInterface calculatorInputDataInterface = new FileInputData();
        String firstStringNumber = calculatorInputDataInterface.getStringNumber();
        System.out.println(firstStringNumber);
        String secondStringNumber = calculatorInputDataInterface.getStringNumber();
        System.out.println(secondStringNumber);
        String operation = calculatorInputDataInterface.getOperation();
        System.out.println(operation);

        Validator validator = new DataValidation();
        double firstNumber = validator.checkNumber(firstStringNumber);
        double secondNumber = validator.checkNumber(secondStringNumber);
        String validOperation = validator.getOperation(operation);

        Business business = new BusinessLogic();
        double outputResult = business.returnResult(firstNumber, secondNumber, validOperation);

        OutputInterface outputInterface = new OutputConsole();
        outputInterface.outputResult(outputResult);

        OutputInterface outputFile = new OutputFile();
        outputFile.outputResult(outputResult);

    }
}
