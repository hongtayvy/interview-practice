package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    @DisplayName("Generate Proper Factorial")
    void runFactorialSolution() {
        assertEquals(120, Factorial.runFactorialSolution(AppConstants.FACTORIAL));
    }
}