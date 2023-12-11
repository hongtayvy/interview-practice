package problems;

public class SlidingWindow {
    public static int runSlidingWindowSolution(int k, int[] arr){
        //This is the placeholder for the highest value we created
        int maxSum = 0;

        //This is the current window sum defined by k (size of the window)
        int windowSum = 0;

        //We will use this to remove the last value (think of this as shifting over)
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            /**
             * We initially create our window here adding until we have created the k - 1 (indicies)
             * Once we created our initial window, we go and compare it to maxSum
             * If the current maxSum is less than windowSum, we set windowSum into maxSum
             * We then slide out window over 1 (so we subtract the first element from the windowSum)
             * We move the windowStart to the next element
             */
            windowSum += arr[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= k - 1) {
                maxSum = Math.max(windowSum, maxSum);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }
        return maxSum;
    }
}
