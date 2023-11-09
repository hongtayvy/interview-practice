package solutions;

public class SumDigits {
    /**
     * The idea is to add the digits of the number i.e.
     * 121 = 4;
     */
    public static void runSumDigitsSolution(int number){
        int numSum = 0;
        String numString = Integer.toString(number);
        char[] numArray = numString.toCharArray();

        for(char n : numArray){
            if(Character.isDigit(n)){
                numSum += Character.digit((int) n, 10);
            }
        }

        System.out.printf("The sum of %d is %d", number, numSum);
    }
}
