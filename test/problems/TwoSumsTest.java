package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solutions.DailySolutions;

import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.TWO_SUMS_ARRAY;
import static assets.AppConstants.TARGET;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumsTest {

    @Test
    @DisplayName("Find the index of the target")
    void runTwoSumsSolution() {
        assertArrayEquals(new int[]{0,1}, TwoSums.runTwoSumsSolution(TWO_SUMS_ARRAY, TARGET));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingTwoSumMethods() {
        assertArrayEquals(
                TwoSums.runTwoSumsSolution(TWO_SUMS_ARRAY, TARGET),
                DailySolutions.runTwoSums(TWO_SUMS_ARRAY, TARGET)
        );
    }
}