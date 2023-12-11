package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MissingNumber {
    /**
     * Given an array of non-duplicating numbers from 1 to n where one number is missing, write an efficient java program to find that missing number.
     */
    public static int runMissingNumberSolution(int [] array, int n){
        int summationOfN = n * (n + 1) / 2;
        for(int i : array){
            summationOfN -= i;
        }

        return summationOfN;
    }

    public static int runMissingNumberSolutionWithoutEquation(int[] array, int n){
        int actualSum = 0;

        for(int i = 1; i < n + 1; i++){
            actualSum += i;
        }

        for(int i : array){
            actualSum -= i;
        }

        return actualSum;
    }
}
