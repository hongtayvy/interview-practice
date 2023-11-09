package solutions;

import java.util.HashMap;

public class ConstantTimeOperations {
    /**
     * (Not a list)
     * Example Data: 10, 5, 10, 4, 7
     *
     * Methods:
     * track(int n) -> takes in a number and keeps "track" of it
     * min() -> returns the min of the numbers
     * max() -> returns the max of the numbers
     * mean() -> returns the average of the numbers
     * mode() -> returns the number that occurred most
     */
    private static int minNum = Integer.MAX_VALUE;
    private static int maxNum = Integer.MIN_VALUE;
    private static double meanNum = 0;
    private static double meanCounter = 0;
    private static int modeNum;
    private static int currentMaxNum = 1;
    private static HashMap<Integer, Integer> modeMap = new HashMap<>();
    public static void runConstantTimeOperationsSolution(){
        track(7);
        track(7);
        track(10);
        track(10);
        track(10);
        track(5);
        track(10);
        track(4);
        track(7);

        System.out.println("Min is: " + min());
        System.out.println("Max is: " + max());
        System.out.println("Mean is: " + mean());
        System.out.println("Mode is: " + mode());
    }

    private static void track(int n){
        if(minNum > n){
            minNum = n;
        }

        if(maxNum < n){
            maxNum = n;
        }

        meanNum += n;
        meanCounter += 1;

        if(modeMap.containsKey(n)){
            int updateCounter = modeMap.get(n) + 1;
            modeMap.replace(n, updateCounter);

            if(currentMaxNum < updateCounter){
                currentMaxNum = updateCounter;
                modeNum = n;
            }
        } else {
            modeMap.put(n, 1);
        }

    }

    private static int min(){
        return minNum;
    }

    private static int max(){
        return maxNum;
    }

    private static double mean(){
        return meanNum / meanCounter;
    }

    private static int mode(){
        return modeNum;
    }
}
