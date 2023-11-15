package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {

    @Test
    @DisplayName("Adds the digits individually togethe")
    void runSumDigitsSolution() {
        assertEquals(4, SumDigits.runSumDigitsSolution(AppConstants.SUM_DIGITS));
    }
}