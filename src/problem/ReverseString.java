package problem;

public class ReverseString {
    public static void runReverseString(String reverse){
        //Split the array for ease of swapping algorithm.
        char [] charArray = reverse.toCharArray();

        //Starting point.
        int start = 0;

        //Ending point.
        int end = reverse.length() - 1;

        //While loop to go through the two points.
        while(start < end){
            //Swapping algorithm
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            //Increment
            start++;
            end--;
        }

        //Print data for verification
        System.out.println("String is originally: " + reverse +
                " reversed is: " + new String(charArray)
        );
    }
}
