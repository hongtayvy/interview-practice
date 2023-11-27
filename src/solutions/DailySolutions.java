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
        } else {
            return f * factorial(f - 1);
        }

    }
    public static String runInvertCases(String invert){
        char [] array = invert.toCharArray();

        for(int i = 0; i < array.length; i++){
            if (Character.isLowerCase(array[i])) {
                array[i] = Character.toUpperCase(array[i]);
            } else {
                array[i] = Character.toLowerCase(array[i]);
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
        int leftPointer = 0;
        int rightPointer = reverse.length() - 1;

        char [] array = reverse.toCharArray();

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
        int lowestPossibleStock = Integer.MAX_VALUE;
        int maximumProfit = 0;

        for(int stock : stocks){
            if(lowestPossibleStock > stock){
                lowestPossibleStock = stock;
            }

            int currentProfit = stock - lowestPossibleStock;

            if(maximumProfit < currentProfit){
                maximumProfit = currentProfit;
            }
        }

        return maximumProfit;
    }

    public static int runSlidingWindow(int window, int[] windowArray){
        int maxSum = 0;
        int windowSum = 0;
        int windowIndex = 0;

        for(int i = 0; i < windowArray.length; i++){
            windowSum += windowArray[i];

            if(i >= window - 1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= windowArray[windowIndex];
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
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static int[] runTwoSums(int[] array, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            int complement = target - array[i];

            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }

            hashMap.put(array[i], i);
        }

        return new int[]{};
    }

    public static boolean runValidParentheses(String parentheses){
        Stack<Character> stack = new Stack<>();
        for(char p : parentheses.toCharArray()){
            if(p == '['){
                stack.push(']');
            } else if(p == '{'){
                stack.push('}');
            } else if(p == '('){
                stack.push(')');
            } else if(stack.isEmpty() || stack.pop() != p) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}