
package linter;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testNoErrors() {
        try {
            JavaScriptLinter("src/test/resources/no_errors.js"); // Adjust the path to the test file
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    @Test
    void testOneError() {
        try {
            JavaScriptLinter("src/test/resources/one_error.js"); // Adjust the path to the test file
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    @Test
    void testFewErrors() {
        try {
            JavaScriptLinter("src/test/resources/few_errors.js"); // Adjust the path to the test file
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    @Test
    void testManyErrors() {
        try {
            JavaScriptLinter("src/test/resources/many_errors.js"); // Adjust the path to the test file
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    @Test
    void testEmptyFile() {
        try {
            JavaScriptLinter("src/test/resources/empty_file.js"); // Adjust the path to the test file
        } catch (FileNotFoundException e) {
            fail("Test file not found.");
        }
    }

    // Replace the following method with the actual linter method from your App class
    private void JavaScriptLinter(String path) throws FileNotFoundException {
        // Your linter implementation goes here
        // Make sure to handle the linter logic and report errors as specified
        // Use the provided path to read the JavaScript file
        // You can implement similar logic to what you have in your App.JavaScriptLinter method
        // ... (implementation details)
    }
}