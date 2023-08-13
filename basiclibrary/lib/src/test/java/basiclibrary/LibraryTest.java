/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

//    @Test
//    public void testRoll() {
//        int[] rolledArray = Library.roll(4);
//        assertNotNull(rolledArray);
//        assertEquals(4, rolledArray.length);
//        for (int num : rolledArray) {
//            assertTrue(num >= 1 && num <= 6);
//        }
//    }
//
//    @Test
//    public void testContainsDuplicates() {
//        int[] array = {1, 1, 2};
//        assertTrue(Library.containsDuplicates(array));
//
//        int[] noDuplicatesArray = {1, 2, 3};
//        assertFalse(Library.containsDuplicates(noDuplicatesArray));
//    }
//
//    @Test
//    public void testCalculateAverage() {
//        int[] array = {30, 30, 30};
//        double expectedAverage = 30.0;
//        assertEquals(expectedAverage, Library.calculateAverage(array));
//    }
//
//    @Test
//    public void testArraysOfArrays() {
//        int[][] weeklyMonthTemperatures = {
//                {66, 64, 58, 65, 71, 57, 60},
//                {57, 65, 65, 70, 72, 65, 51},
//                {55, 54, 60, 53, 59, 57, 61},
//                {65, 56, 55, 52, 55, 62, 57}
//        };
//        assertArrayEquals(weeklyMonthTemperatures[2], Library.arraysOfArrays(weeklyMonthTemperatures));
//    }

    public void testAnalyzingWeather() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expected = "High:72\nLow:51\nNever saw temperatures: 63 67 68 69";
        String result = Library.analyzingWeather(weeklyMonthTemperatures);

        assertEquals(expected, result);
    }

    @Test
    public void testTally() {
        List<String> votes = new ArrayList<>(Arrays.asList("Bush", "Bush", "Bush", "Shrub", "Hedge", "Shrub", "Bush", "Hedge", "Bush"));
        String expectedWinner = "Bush";
        String winner = Library.tally(votes);
        assertEquals(expectedWinner, winner);
    }
}



