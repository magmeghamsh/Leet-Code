package Java.Misc.slidingwindow;

public class MaxSumInArray {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4; // number of concurrency elements
        int n = arr.length; // no of elements in array
        int maxSumInArray = maxSumInArray(arr, n, k);
        System.out.println("Max sum in a Array:" + maxSumInArray);
    }

    static int maxSumInArray(int[] givenArray, int n, int k) {
        int maxSum = 0;
        if (n < k) {
            System.out.println("Invalid params");
            return -1;
        }

        /*
        Compute sum of first window of size k
         */
        for (int i = 0; i < k; i++) {
            maxSum += givenArray[i];
        }

        /*
        Compute sums of remaining windows by removing first element of previous window and adding last element of current window.
         */
        int currentSum = maxSum;
        for (int rightPointer = k; rightPointer < n; rightPointer++) {
            currentSum += givenArray[rightPointer] - givenArray[rightPointer - k];
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
