package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertCasesTest {

    @Test
    @DisplayName("Inverted Chars Properly")
    void invertProperly() {
        assertEquals("hELLO", InvertCases.runInvertCasesSolution(AppConstants.INVERT));
    }
}