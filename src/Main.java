import java.util.Arrays;
import java.util.HashMap;

import static solutions.SellStocks.runSellStocks;
import static solutions.TwoSums.runTwoSums;
import static solutions.ValidParentheses.runValidParentheses;

public class Main {
    public static void main(String[] args) {
        int [] stocks = new int[]{7,1,5,3,6,4};
        runSellStocks(stocks);
    }

    /**
     *         String palindrome = "tacocat";
     *         runPalindrome(palindrome);
     *
     *         String reverse = "hello";
     *         runReverseString(reverse);
     *
     *         int fizzBuzzMax = 100;
     *         runFizzBuzz(fizzBuzzMax);
     *
     *         int factorial = 5;
     *         runFactorial(factorial);
     *
     *         int[] nums = {2, 7, 11, 15};
     *         int target = 9;
     *         runTwoSums(nums, target);
     * 
     *         int window = 3;
     *         int [] windowArr = {2, 1, 5, 1, 3, 2};
     *         runSlidingWindow(window, windowArr);
     *
     *         String validParentheses = "{}[]()";
     *         runValidParentheses(validParentheses);
     *
     */
}