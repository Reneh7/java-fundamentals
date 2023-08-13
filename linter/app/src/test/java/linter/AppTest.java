
package linter;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testNoErrors() {
        String filePath = "C:/Users/User/java-fundamentals/linter/app/src/test/resources/noError.js";
        var fileTest1 = new App();

        assertDoesNotThrow(() -> {
            fileTest1.jsLinter(filePath);
        });
    }

    @Test
    void testOneError() {
        String filePath="C:\\Users\\User\\java-fundamentals\\linter\\app\\src\\test\\resources\\oneError.js";
        var fileTest2= new App();
        assertDoesNotThrow(() -> {
            fileTest2.jsLinter(filePath);});
    }

    @Test
    void testFewErrors() {
        String filePath="C:\\Users\\User\\java-fundamentals\\linter\\app\\src\\test\\resources\\fewErrors.js";
        var fileTest3= new App();
        assertDoesNotThrow(() -> {
            fileTest3.jsLinter(filePath);});
    }

    @Test
    void testManyErrors() {
        String filePath="C:\\Users\\User\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js";
        var fileTest4= new App();
        assertDoesNotThrow(() -> {
            fileTest4.jsLinter(filePath);});

    }

    @Test
    public void testEmptyFile() {
        String filePath="C:/Users/User/java-fundamentals/linter/app/src/test/resources/empty.js";
        var fileTest5= new App();

        assertDoesNotThrow(() -> {
            fileTest5.jsLinter(filePath);});
    }
}



