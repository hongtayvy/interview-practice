package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solutions.DailySolutions;

import static assets.AppConstants.FIBONACCI;
import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    @DisplayName("Generate Proper Fibonacci")
    void runFibonacciSolution() {
        assertEquals("0 1 1 2 3 5 8 13 ", Fibonacci.runFibonacciSolution(FIBONACCI));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingFactorialSolutions() {
        assertEquals(Fibonacci.runFibonacciSolution(FIBONACCI), DailySolutions.runFibonacci(FIBONACCI));
    }
}
