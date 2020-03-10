package LeetCode.slidingwindow;

import java.util.HashMap;

public class SubArraysWithDistinctElements {

    public static void main(String[] args) {

        int[] givenArray = {1, 2, 3, 2};
        int noOfDistinctElements = 2; // Number of distinct elements in array should be 2
        int noOfDistinctArrays = exactArrays(givenArray, noOfDistinctElements);
        System.out.println("Number of distinct arrays : " + noOfDistinctArrays);
    }

    private static int exactArrays(int[] givenArray, int noOfDistinctElements){
        return numberOfDistinctArrays(givenArray, noOfDistinctElements)- numberOfDistinctArrays(givenArray,noOfDistinctElements-1);
    }

    private static int numberOfDistinctArrays(int[] givenArray, int noOfDistinctElements) {

        // To store the result
        int count = 0, leftPointer = 0, rightPointer = 0;

        /*
        Map to keep track of number of distinct elements in the current window
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        while (rightPointer < givenArray.length) {
            map.put(givenArray[rightPointer], map.getOrDefault(givenArray[rightPointer], 0) + 1);
            while (map.size() > noOfDistinctElements) {
                map.put(givenArray[leftPointer], map.get(givenArray[leftPointer]) - 1);
                if (map.get(givenArray[leftPointer]) == 0) {
                    map.remove(givenArray[leftPointer]);
                }
                leftPointer++;
            }
            count += rightPointer - leftPointer + 1;
            rightPointer++;
        }
        return count;
    }
}
