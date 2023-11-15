package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {
    @Test
    @DisplayName("Is a valid palindrome")
    void isValidPalindrome() {
        assertTrue(Palindrome.runPalindromeSolution(AppConstants.PALINDROME));
    }

    @Test
    @DisplayName("Is not a valid palindrome")
    void isNotValidPalindrome() {
        assertFalse(Palindrome.runPalindromeSolution(AppConstants.REVERSE));
    }
}