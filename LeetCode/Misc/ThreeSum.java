package LeetCode.Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
[-1, 0, 1],
[-1, -1, 2]
]*/
public class ThreeSum {

  public static void main(String[] args) {

    // int[] nums = {-1, 0, 1, 2, -1, -4};
     // int[] nums = {0,0,0,0};

      int[] nums = {-2,0,1,1,2};
    List<List<Integer>> result = threeSum(nums);
    System.out.println("Total number of triplets : " + result);
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    System.out.println("Arrays after sorting : " + Arrays.toString(nums));
    int i = 0;
    int length = nums.length;

    List<List<Integer>> listOfresults = new ArrayList<>();
      if(nums.length < 3) return listOfresults;
    while (i < length - 2) {
        if(nums[i] > 0) break;
      for (int k = i + 2; k < length; k++) {
        int currentSum = Math.abs(nums[i] + nums[i + 1] + nums[k]);
        if (currentSum == 0) {
            listOfresults.add(Arrays.asList(nums[i],nums[i + 1],nums[k]));
          System.out.println("Values: " + nums[i] + "," + nums[i + 1] + "," + nums[k]);
        }
      }
      i++;
    }
    return listOfresults;
  }
}
