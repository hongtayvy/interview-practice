package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareNumTest {

    @Test
    @DisplayName("Squares the number properly")
    void runSquareSolution() {
        assertEquals(4, SquareNum.runSquareSolution(AppConstants.SQUARE));
    }
}