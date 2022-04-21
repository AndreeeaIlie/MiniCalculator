package ai.calculator.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInputData implements CalculatorInputDataInterface{
    private static List<String> list = new ArrayList<>();
    private String stringNumber;
    private String operation;
    int indexList;


    public static void createFolder() {
//        File folder = new File("C:/Users/ANILIE/IdeaProjects/test_project/src/ai/calculator/FileInput");
        File folder = new File("./src/ai/calculator/FileInput");
        folder.mkdirs();
    }
    public static void createFile() throws IOException {
        File file = new File("./src/ai/calculator/FileInput/outputFile.txt");
        file.createNewFile();
    }

    public static void readFile() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("./src/ai/calculator/FileInput/inputFile.txt"));
        String byLine;
        while ((byLine = br.readLine()) != null) {
            list.add(byLine);
//            System.out.println(list);
        }
        br.close();
    }
    @Override
    public String getStringNumber() {
//        int indexList = 0;
        this.stringNumber = list.get(indexList);
        indexList++;
        return stringNumber;
    }

    @Override
    public String getOperation() {
        this.operation = list.get(2);
        return operation;
    }
}
