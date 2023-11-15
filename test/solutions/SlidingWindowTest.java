package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowTest {

    @Test
    @DisplayName("Calculate the proper max window sum")
    void runSlidingWindowSolution() {
        assertEquals(9, SlidingWindow.runSlidingWindowSolution(AppConstants.WINDOW, AppConstants.WINDOW_ARRAY));
    }
}