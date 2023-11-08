import java.util.HashMap;
import java.util.Stack;

import static solutions.SlidingWindow.runSlidingWindowSolution;

public class Main {
    public static void main(String[] args) {
        System.out.println(runPalindrome("tacocat") ? "Is a valid palindrome" : "is not a valid palindrome");
        System.out.println("Hello reversed is: " + runReverseString("hello"));
        System.out.println("The factorial of 5 is " + runFactorial(5) + " and the unoptimized version is " + unoptimizedFactorial(5));
        printArrayData(runTwoSums(new int[]{2, 7, 11, 15}, 9));
        System.out.println(runValidParentheses("{}[]()") ? "They are valid parentheses" : "They are not valid parentheses");
        System.out.println(runValidParentheses("{") ? "They are valid parentheses" : "They are not valid parentheses");
        System.out.println("The max stock return is " + runSellStocks(new int[]{7,1,5,3,6,4}));
        System.out.println("The max sum for the sliding window is " + runSlidingWindow(new int[]{2, 1, 5, 1, 3, 2}, 3));
        printFibonacci(10);
//        runFizzBuzz(16);
    }

    private static boolean runPalindrome(String palindrome){
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
    private static String runReverseString(String reverse){
        int leftPointer = 0;
        int rightPointer = reverse.length() - 1;
        char[] array = reverse.toCharArray();

        while(leftPointer < rightPointer){
            char temp = array[leftPointer];
            array[leftPointer] = array[rightPointer];
            array[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        }

        return new String(array);

    }
    private static void runFizzBuzz(int n){
        for(int i = 1; i < n; i++){
            String fizz = (i % 3 == 0 ? "fizz" : "");
            String buzz = (i % 5 == 0 ? "buzz" : "");

            System.out.println((!fizz.isEmpty() || !buzz.isEmpty()) ? fizz + buzz : i);
        }

    }
    private static int runFactorial(int n){
        if(n == 0){
            return 1;
        } else{
            return n * runFactorial(n -1);
        }

    }
    private static int unoptimizedFactorial(int n){
        int factorial = 1;
        for(int i = n; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }
    private static int[] runTwoSums(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }

            hashMap.put(nums[i], i);
        }

        return new int[]{};
    }
    private static boolean runValidParentheses(String parentheses){
        char[] array = parentheses.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char p : array){
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
    private static int runSellStocks(int[] stocks){
        int lowestPossibleStock = Integer.MAX_VALUE;
        int currentProfit = 0;
        int maxProfit = 0;

        for(int stock : stocks){
            if(lowestPossibleStock > stock){
                lowestPossibleStock = stock;
            }

            currentProfit = stock - lowestPossibleStock;
            if(maxProfit < currentProfit){
                maxProfit = currentProfit;
            }
        }

        return currentProfit;
    }

    private static int runSlidingWindow(int[] windowArray, int window){
        int windowSum = 0;
        int maxSum = 0;
        int windowStartPointer = 0;

        for(int i = 0; i < windowArray.length; i++){
            windowSum += windowArray[i];

            if(i >= window -1 ){
                maxSum = Math.max(windowSum, maxSum);
                windowSum -= windowArray[windowStartPointer];
                windowStartPointer++;
            }
        }

        return maxSum;
    }

    private static int fibonacci(int n){
        if(n <= 1){
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    private static void printFibonacci(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    private static void printArrayData(int[] array){
        if(array != null){
            for(int i : array){
                System.out.println("Indicies are " + i);
            }
        } else {
            System.out.println("there are no indicies available ");
        }
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
     *         int [] stocks = new int[]{7,1,5,3,6,4};
     *         runSellStocks(stocks);
     */
}