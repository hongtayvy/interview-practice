package solutions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.INVERT;

class InvertCasesTest {

    @Test
    @DisplayName("Inverted Chars Properly")
    void invertProperly() {
        assertEquals("hELLO", InvertCases.runInvertCasesSolution(INVERT));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingInvertCasesMethods() {
        assertEquals(DailySolutions.runInvertCases(INVERT), InvertCases.runInvertCasesSolution(INVERT));
    }

}