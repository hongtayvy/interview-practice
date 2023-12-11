package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solutions.DailySolutions;

import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.PARENTHESES;
import static assets.AppConstants.INVALID_PARENTHESES;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesTest {

    @Test
    @DisplayName("Returns valid parentheses")
    void runValidParenthesesSolution() {
        assertTrue(ValidParentheses.runValidParenthesesSolution(PARENTHESES));
    }
    @Test
    @DisplayName("Returns invalid parentheses")
    void runInvalidParenthesesSolution() {
        assertFalse(ValidParentheses.runValidParenthesesSolution(INVALID_PARENTHESES));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingParenthesesMethods() {
        assertEquals(
                ValidParentheses.runValidParenthesesSolution(PARENTHESES),
                DailySolutions.runValidParentheses(PARENTHESES)
        );
    }
}