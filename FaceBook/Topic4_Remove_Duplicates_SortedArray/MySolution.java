package FaceBook.Topic4_Remove_Duplicates_SortedArray;

import java.util.Arrays;

public class MySolution {

    public static void main(String[] args) {
        //int[] givenArray = {1, 1, 2};
        int[] givenArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Length of the array after removing dups : " + removeDups(givenArray));
    }

    private static int removeDups(int[] nums) {
        int currentElement = 1;
        int uniqueElement = 0;


        while (currentElement < nums.length) {
            if (nums[uniqueElement] != nums[currentElement]) {
                nums[++uniqueElement] = nums[currentElement];
            }
            currentElement++;
        }


        System.out.println("Arrays: " + Arrays.toString(nums));
        return ++uniqueElement;


        /*int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        System.out.println("Arrays: "+ Arrays.toString(nums));
        return i + 1;*/
    }
}



