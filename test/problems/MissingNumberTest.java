package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solutions.DailySolutions;

import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.MISSING_NUMBER_ARRAY;
import static assets.AppConstants.MISSING_NUMBER_MAX;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    @Test
    @DisplayName("Generate Proper Factorial")
    void runMissingNumberSolution() {
        assertEquals(5, MissingNumber.runMissingNumberSolution(MISSING_NUMBER_ARRAY, MISSING_NUMBER_MAX));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingMissingNumberSolutions() {
        assertEquals(
                MissingNumber.runMissingNumberSolution(MISSING_NUMBER_ARRAY, MISSING_NUMBER_MAX),
                DailySolutions.runMissingNumber(MISSING_NUMBER_ARRAY, MISSING_NUMBER_MAX)
        );
    }

    @Test
    @DisplayName("Generate Proper Factorial")
    void runMissingNumberNoEquationSolution() {
        assertEquals(5, MissingNumber.runMissingNumberSolutionWithoutEquation(MISSING_NUMBER_ARRAY, MISSING_NUMBER_MAX));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingMissingNumberNoEquationSolutions() {
        assertEquals(
                MissingNumber.runMissingNumberSolution(MISSING_NUMBER_ARRAY, MISSING_NUMBER_MAX),
                DailySolutions.runMissingNumberWithoutEquation(MISSING_NUMBER_ARRAY, MISSING_NUMBER_MAX)
        );
    }
}