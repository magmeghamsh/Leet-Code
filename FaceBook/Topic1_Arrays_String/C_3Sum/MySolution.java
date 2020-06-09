package FaceBook.Topic1_Arrays_String.C_3Sum;

import java.util.*;

public class MySolution {

    public static void main(String[] args) {

        int[] givenArray = {-1, 0, 1, 2, -1, -4};
        //int[] givenArray = {-4, -1, -1, 0, 1, 2};
        int targetSum = 0;
        System.out.println("Triplets : " + noOfTriplets(givenArray, targetSum)); // [ [-1, 0, 1],[-1, -1, 2]]

    }

    private static List<List<Integer>> noOfTriplets(int[] givenArray, int targetSum) {

        Set<List<Integer>> result = new HashSet<>();
        Set<String> deDuped = new HashSet<>();
        int noOfTriplet = 1;

        // Arrays.sort(givenArray);

        System.out.println("Given Array : "+ Arrays.toString(givenArray));

        for (int i = 0; i < givenArray.length ; i++) {

            for (int j = i + 1; j < givenArray.length ; j++) {

                for (int k = j + 1; k < givenArray.length ; k++) {
                    //System.out.println("K value: " + k);

                    System.out.println((noOfTriplet++)+" Triplets : "+String.valueOf(givenArray[i]) +","+ String.valueOf(givenArray[j]) +","+ String.valueOf(givenArray[k]));

                    int sum = givenArray[i] + givenArray[j] + givenArray[k];
                    if (sum == targetSum) {
                        int[] subArray = {givenArray[i] , givenArray[j] , givenArray[k] };
                        Arrays.sort(subArray);
                        System.out.println("Index values: i "+subArray[0]+" j: "+subArray[1]+" k: "+subArray[2]);
                        String value = subArray[0] +String.valueOf(subArray[1])+String.valueOf(subArray[2]);
                        if(!deDuped.contains(value)) {
                            deDuped.add(value);
                            result.add(Arrays.asList(givenArray[i], givenArray[j], givenArray[k]));
                        }
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

}
