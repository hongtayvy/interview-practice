package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solutions.DailySolutions;

import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.SQUARE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareNumTest {

    @Test
    @DisplayName("Squares the number properly")
    void runSquareSolution() {
        assertEquals(4, SquareNum.runSquareSolution(SQUARE));
    }
    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingSquareMethods() {
        assertEquals(SquareNum.runSquareSolution(SQUARE), DailySolutions.runSquareNum(SQUARE));
    }
}