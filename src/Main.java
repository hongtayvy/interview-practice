import assets.AppConstants;
import java.util.Scanner;

import static solutions.ConstantTimeOperations.runConstantTimeOperationsSolution;
import static solutions.Factorial.runFactorialSolution;
import static solutions.Fibonacci.runFibonacciSolution;
import static solutions.FizzBuzz.runFizzBuzzSolution;
import static solutions.InvertCases.runInvertCasesSolution;
import static solutions.Palindrome.runPalindromeSolution;
import static solutions.ReverseString.runReverseStringSolution;
import static solutions.SellStocks.runSellStocksSolution;
import static solutions.SlidingWindow.runSlidingWindowSolution;
import static solutions.SquareNum.runSquareSolution;
import static solutions.SumDigits.runSumDigitsSolution;
import static solutions.TwoSums.runTwoSumsSolution;
import static solutions.ValidParentheses.runValidParenthesesSolution;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println(AppConstants.MENU);
        int choice = Integer.parseInt(stdin.nextLine());

        while(choice != 0){
            switch(choice){
                case 1 -> runFactorialSolution(AppConstants.FACTORIAL);
                case 2 -> runFizzBuzzSolution(AppConstants.FIZZBUZZ);
                case 3 -> runInvertCasesSolution(AppConstants.INVERT);
                case 4 -> runPalindromeSolution(AppConstants.PALINDROME);
                case 5 -> runReverseStringSolution(AppConstants.REVERSE);
                case 6 -> runSellStocksSolution(AppConstants.STOCK_ARRAY);
                case 7 -> runSlidingWindowSolution(AppConstants.WINDOW, AppConstants.WINDOW_ARRAY);
                case 8 -> runSquareSolution(AppConstants.SQUARE);
                case 9 -> runSumDigitsSolution(AppConstants.SUM_DIGITS);
                case 10 -> runTwoSumsSolution(AppConstants.TWO_SUMS_ARRAY, AppConstants.TARGET);
                case 11 -> runValidParenthesesSolution(AppConstants.PARENTHESES);
                case 12 -> runConstantTimeOperationsSolution();
                case 13 -> runFibonacciSolution(AppConstants.FIBONACCI);
                default -> runSolution();
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

    private static void runSolution() {

    }
}