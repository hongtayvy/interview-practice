package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solutions.DailySolutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.PALINDROME;
import static assets.AppConstants.NONPALINDROME;


class PalindromeTest {
    @Test
    @DisplayName("Is a valid palindrome")
    void isValidPalindrome() {
        assertTrue(Palindrome.runPalindromeSolution(PALINDROME));
    }

    @Test
    @DisplayName("Is not a valid palindrome")
    void isNotValidPalindrome() {
        assertFalse(Palindrome.runPalindromeSolution(NONPALINDROME));
    }

    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingPalindromeMethods(){
        assertEquals(Palindrome.runPalindromeSolution(PALINDROME), DailySolutions.runPalindrome(PALINDROME));
    }
}