package ai.calculator.output;

public class OutputConsole implements OutputInterface{



    public OutputConsole(){}



    public void outputResult (double outputResult) {
//        Business business = new BusinessLogic();
//        double outputResult = business.returnResult();
        System.out.println(outputResult);
    }
}
