package solutions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.REVERSE;
class ReverseStringTest {

    @Test
    @DisplayName("Reverse string properly")
    void runReverseStringSolution() {
        assertEquals("esreveR", ReverseString.runReverseStringSolution(REVERSE));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingReverseStringMethods() {
        assertEquals(DailySolutions.runReverseString(REVERSE), ReverseString.runReverseStringSolution(REVERSE));
    }
}