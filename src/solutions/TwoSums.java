package solutions;

import java.util.HashMap;

public class TwoSums {
    public static void runTwoSums(int [] sumArray, int target){
        /**Create a new hashmap to store the values <sumArray[i], i>
         * We store the value into the key so in the future we can find the key
         * In which we store the index in the value
         */

        HashMap<Integer, Integer> sumMap = new HashMap();

        //Create our result array
        int [] result = null;

        //Loop through sumArry to find solution
        for(int i = 0; i < sumArray.length; i++){
            /**
             * We get the complement for each number
             * For example if the target is 9 and sumArray[0] is 2 then the complement would be 2
             */
            int complement = target - sumArray[i];

            //We proceed to see if we have a key in the hashmap that matches that complement
            if(sumMap.containsKey(complement)){
                result = new int[]{sumMap.get(complement), i};
            }

            //If there is no complement currently that matches we will just put the value and index into the map for the future
            sumMap.put(sumArray[i], i);
        }

        if(result != null) {
            for (int i : result) {
                System.out.println("Indicies are: " + i);
            }
        }
    }
}
