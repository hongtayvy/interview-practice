package solutions;

public class Palindrome {
    /**
     * We don't care to store any data to double-check this. We can manually just check this information.
     */
    public static boolean runPalindromeSolution(String palindrome){
        //The pointer that starts from the left of the string
        int leftPointer = 0;

        //The pointer that starts from the right of the string
        int rightPointer = palindrome.length() - 1;

        //While loop to traverse from the left and right pointer indexes.
        while(leftPointer < rightPointer){
            //If a char doesn't match then we simply return false.
            //Note: primitives can use == since it compares the values and not the memory
            if(palindrome.charAt(leftPointer) != palindrome.charAt(rightPointer)){
                return false;
            }
            //Increment pointers
            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
