/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args)
    {
        String filePath = "C:\\Users\\User\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js";
        try {
            jsLinter(filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

    }
    public static void jsLinter(String filePath) throws IOException{

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int lineNumber=1;

            while ((line = reader.readLine()) != null) {

                if (line.isEmpty()) {
                    lineNumber++;
                    continue;
                }
                if (line.endsWith("{") || line.endsWith("}")) {
                    lineNumber++;
                    continue;
                }
                if(line.contains("if") || line.contains("else"))
                {
                    lineNumber++;
                    continue;
                }
                if (!line.endsWith(";")) {
                    System.out.println("Line " + lineNumber + ": Missing semicolon.");
                }
                lineNumber++;
            }
            reader.close();
    }
}