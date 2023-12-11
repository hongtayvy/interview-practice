package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solutions.DailySolutions;

import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.FACTORIAL;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test
    @DisplayName("Generate Proper Factorial")
    void runFactorialSolution() {
        assertEquals(120, Factorial.runFactorialSolution(FACTORIAL));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingFactorialSolutions() {
        assertEquals(Factorial.runFactorialSolution(FACTORIAL), DailySolutions.runFactorial(FACTORIAL));
    }
}