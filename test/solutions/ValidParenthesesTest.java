package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    @DisplayName("Returns valid parentheses")
    void runValidParenthesesSolution() {
        assertTrue(ValidParentheses.runValidParenthesesSolution(AppConstants.PARENTHESES));
    }
}