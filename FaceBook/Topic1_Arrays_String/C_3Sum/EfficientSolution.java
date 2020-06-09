package FaceBook.Topic1_Arrays_String.C_3Sum;

import java.util.*;

public class EfficientSolution {

    public static void main(String[] args) {
         //int[] givenArray = {-1, 0, 1, 2, -1, -4};
         int[] givenArray = {-4, -1, -1, 0, 1, 2};
        int targetSum = 0;
        System.out.println("Triplets : " + noOfTriplets(givenArray, targetSum)); // [ [-1, 0, 1],[-1, -1, 2]]
    }

    private static List<List<Integer>> noOfTriplets(int[] givenArray, int targetSum) {

        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(givenArray);

        for (int i = 0; i < givenArray.length; i++) {
            int j = i + 1;
            int k = givenArray.length - 1;
            while (j < k) {
                int sum = givenArray[i] + givenArray[j] + givenArray[k];
                if (sum == targetSum) {
                    result.add(Arrays.asList(givenArray[i], givenArray[j++], givenArray[k--]));
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }


        return new ArrayList<>(result);
    }

}
