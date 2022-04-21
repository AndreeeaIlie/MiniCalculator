package ai.calculator.validator;

public interface Validator {

    double checkNumber(String inputStringNumber);

    double getNumber();
    String getOperation(String inputOperation);
}
