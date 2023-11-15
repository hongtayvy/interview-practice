package solutions;

public class ReverseString {
    public static String runReverseStringSolution(String reverse){
        //Split the array for ease of swapping algorithm.
        char [] charArray = reverse.toCharArray();

        //Starting point.
        int leftPointer = 0;

        //Ending point.
        int rightPointer = reverse.length() - 1;

        //While loop to go through the two points.
        while(leftPointer < rightPointer){
            //Swapping algorithm
            char temp = charArray[leftPointer];
            charArray[leftPointer] = charArray[rightPointer];
            charArray[rightPointer] = temp;

            //Increment
            leftPointer++;
            rightPointer--;
        }

        //Return the character array as a new String
        return new String(charArray);
    }
}
