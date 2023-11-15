package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest {

    @Test
    @DisplayName("Find the index of the target")
    void runTwoSumsSolution() {
        assertArrayEquals(new int[]{0,1}, TwoSums.runTwoSumsSolution(AppConstants.TWO_SUMS_ARRAY, AppConstants.TARGET));
    }
}