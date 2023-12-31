package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solutions.DailySolutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.WINDOW;
import static assets.AppConstants.WINDOW_ARRAY;

class SlidingWindowTest {

    @Test
    @DisplayName("Calculate the proper max window sum")
    void runSlidingWindowSolution() {
        assertEquals(9, SlidingWindow.runSlidingWindowSolution(WINDOW, WINDOW_ARRAY));
    }

    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingSlidingWindowSolutions() {
        assertEquals(SlidingWindow.runSlidingWindowSolution(WINDOW, WINDOW_ARRAY), DailySolutions.runSlidingWindow(WINDOW, WINDOW_ARRAY));
    }
}