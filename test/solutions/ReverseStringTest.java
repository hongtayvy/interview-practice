package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    @DisplayName("Reverse string properly")
    void runReverseStringSolution() {
        assertEquals("esreveR", ReverseString.runReverseStringSolution(AppConstants.REVERSE));
    }
}