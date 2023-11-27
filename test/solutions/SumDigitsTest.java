package solutions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.SUM_DIGITS;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumDigitsTest {

    @Test
    @DisplayName("Adds the digits individually together")
    void runSumDigitsSolution() {
        assertEquals(4, SumDigits.runSumDigitsSolution(SUM_DIGITS));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingSumDigitsSolution() {
        assertEquals(SumDigits.runSumDigitsSolution(SUM_DIGITS), DailySolutions.runSumDigits(SUM_DIGITS));
    }
}