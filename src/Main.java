import static problem.Factorial.runFactorial;
import static problem.FizzBuzz.runFizzBuzz;

import static problem.Palindrome.runPalindrome;
import static problem.ReverseString.runReverseString;
import static problem.SlidingWindow.runSlidingWindow;
import static problem.TwoSums.runTwoSums;
import static problem.ValidParentheses.runValidParentheses;

public class Main {
    public static void main(String[] args) {
//        String palindrome = "tacocat";
//        runPalindrome(palindrome);

//        String reverse = "hello";
//        runReverseString(reverse);

//        int fizzBuzzMax = 100;
//        runFizzBuzz(fizzBuzzMax);

//        int factorial = 5;
//        runFactorial(factorial);

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        runTwoSums(nums, target);
//
//        int window = 3;
//        int [] windowArr = {2, 1, 5, 1, 3, 2};
//        runSlidingWindow(window, windowArr);

        String validParentheses = "{}[]()";
        runValidParentheses(validParentheses);

    }
}