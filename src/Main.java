import assets.AppConstants;

import java.util.Arrays;
import java.util.Scanner;

import static problems.ConstantTimeOperations.runConstantTimeOperationsSolution;
import static problems.Factorial.runFactorialSolution;
import static problems.Fibonacci.runFibonacciSolution;
import static problems.FizzBuzz.runFizzBuzzSolution;
import static problems.InvertCases.runInvertCasesSolution;
import static problems.MissingNumber.runMissingNumberSolutionWithoutEquation;
import static problems.Palindrome.runPalindromeSolution;
import static problems.ReverseString.runReverseStringSolution;
import static problems.SellStocks.runSellStocksSolution;
import static problems.SlidingWindow.runSlidingWindowSolution;
import static problems.SquareNum.runSquareSolution;
import static problems.SumDigits.runSumDigitsSolution;
import static problems.TwoSums.runTwoSumsSolution;
import static problems.ValidParentheses.runValidParenthesesSolution;
import static problems.MissingNumber.runMissingNumberSolution;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println(AppConstants.MENU);
        int choice = Integer.parseInt(stdin.nextLine());

        while(choice != 0){
            switch(choice){
                case 1 -> System.out.println(runFactorialSolution(AppConstants.FACTORIAL));
                case 2 -> runFizzBuzzSolution(AppConstants.FIZZBUZZ);
                case 3 -> System.out.println(runInvertCasesSolution(AppConstants.INVERT));
                case 4 -> System.out.println(runPalindromeSolution(AppConstants.PALINDROME));
                case 5 -> System.out.println(runReverseStringSolution(AppConstants.REVERSE));
                case 6 -> System.out.println(runSellStocksSolution(AppConstants.STOCK_ARRAY));
                case 7 -> System.out.println(runSlidingWindowSolution(AppConstants.WINDOW, AppConstants.WINDOW_ARRAY));
                case 8 -> System.out.println(runSquareSolution(AppConstants.SQUARE));
                case 9 -> System.out.println(runSumDigitsSolution(AppConstants.SUM_DIGITS));
                case 10 -> System.out.println(Arrays.toString(runTwoSumsSolution(AppConstants.TWO_SUMS_ARRAY, AppConstants.TARGET)));
                case 11 -> System.out.println(runValidParenthesesSolution(AppConstants.PARENTHESES));
                case 12 -> runConstantTimeOperationsSolution();
                case 13 -> runFibonacciSolution(AppConstants.FIBONACCI);
                case 14 -> System.out.println(runMissingNumberSolution(AppConstants.MISSING_NUMBER_ARRAY, AppConstants.MISSING_NUMBER_MAX));
            }

            System.out.println(AppConstants.RESELECT);
            choice = Integer.parseInt(stdin.nextLine());

            switch(choice){
                case 1 -> {
                    System.out.println(AppConstants.MENU);
                    choice = Integer.parseInt(stdin.nextLine());
                }
                case 2 -> choice = 0;
            }
        }
    }
}