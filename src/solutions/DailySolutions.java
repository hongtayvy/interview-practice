package solutions;

import java.util.HashMap;
import java.util.Stack;

public class DailySolutions {
    public static int runFactorial(int f){
        return factorial(f);
    }

    private static int factorial(int f){
        if(f == 0){
            return 1;
        }

        return f * factorial(f - 1);
    }
    public static String runInvertCases(String invert){
        char[] array = invert.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if(Character.isUpperCase(c)){
                array[i] = Character.toLowerCase(c);
            } else {
                array[i] = Character.toUpperCase(c);
            }
        }

        return new String(array);
    }

    public static boolean runPalindrome(String palindrome){
        int leftPointer = 0;
        int rightPointer = palindrome.length() - 1;

        while(leftPointer < rightPointer){
            if(palindrome.charAt(leftPointer) != palindrome.charAt(rightPointer)){
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        return true;
    }

    public static String runReverseString(String reverse){
        char[] array = reverse.toCharArray();

        int leftPointer = 0;
        int rightPointer = reverse.length() - 1;

        while(leftPointer < rightPointer){
            char temp = array[leftPointer];
            array[leftPointer] = array[rightPointer];
            array[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        }

        return new String(array);
    }

    public static int runSellStocks(int[] stocks){
        int lowestValueStock = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int stock : stocks) {
            if(lowestValueStock > stock){
                lowestValueStock = stock;
            }

            int currentProfit = stock - lowestValueStock;
            if(maxProfit < currentProfit){
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }

    public static int runSlidingWindow(int window, int[] array){
        int windowIndex = 0;
        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            windowSum += array[i];

            if(i >= window - 1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= array[windowIndex];
                windowIndex++;
            }
        }

        return maxSum;
    }

    public static int runSquareNum(int n){
        return n*n;
    }

    public static int runSumDigits(int number){
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static int[] runTwoSums(int[] array, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }

            hashMap.put(array[i], i);
        }

        return new int[]{};
    }

    public static boolean runValidParentheses(String parentheses){
        char[] array = parentheses.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char p : array) {
            if(p == '['){
                stack.push(']');
            } else if(p == '{'){
                stack.push('}');
            } else if(p == '('){
                stack.push(')');
            } else if(stack.isEmpty() || stack.pop() != p){
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static int runMissingNumber(int [] array, int n){
        int missingNumber = n * (n + 1) / 2;

        for (int i : array) {
            missingNumber -= i;
        }

        return missingNumber;
    }

    public static int runMissingNumberWithoutEquation(int [] array, int n){
        int missingNumber = 0;
        for(int i = 1; i < n + 1; i++){
            missingNumber += i;
        }

        for (int i : array) {
            missingNumber -= i;
        }

        return missingNumber;
    }

    public static String runFibonacci(int fibonacci){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < fibonacci; i++){
            sb.append(fibonacci(i)).append(" ");
        }

        return sb.toString();
    }

    private static int fibonacci(int f){
        if(f <= 1){
            return f;
        }

        return fibonacci(f - 1) + fibonacci(f - 2);
    }
}