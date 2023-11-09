package solutions;

public class Palindrome {
    /**
     * We don't care to store any data to double-check this. We can manually just check this information.
     */
    public static void runPalindromeSolution(String palindrome){
        //Starting point
        int start = 0;

        //Ending Point
        int end = palindrome.length() - 1;

        //Boolean to keep track if string is a palindrome. We can set to true and only change if false.
        boolean isPalindrome = true;

        //While loop to go through the two created points.
        while(start < end){
            //If a char doesn't match, we set to false, and we break out of the loop.
            //Note: primitives can use == since it compares the values and does not implement the equals method
            if(palindrome.charAt(start) != palindrome.charAt(end)){
                isPalindrome = false;
                break;
            }
            //Increment pointers
            start++;
            end--;
        }

        //This is just in this case we print if it is a palindrome or not.
        if(isPalindrome){
            System.out.println(palindrome + " is a palindrome");
        } else {
            System.out.println(palindrome + " is not palindrome");
        }

    }
}
