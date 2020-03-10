package LeetCode.Misc.A_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

Pseudo code:
Step 1: Add all the elements in the array into HashMap key and the index into hash map value. map.put(nums[i],i);
Step 2: By using a for loop or any loop see if the current element and the difference value exists in the group
Step 3: If it exists then return the current index and the Map value for the difference value key
 */
public class A_TwoSum {

  public static void main(String[] args) {
    //int[] nums = {2, 7, 11, 15};
    int[] nums = {3,3};
     // int[] nums = {0,0};
    int target = 6;
    int[] indexValues = solution(nums, target);
    System.out.println("Index values: " + Arrays.toString(indexValues));
  }

  private static int[] solution(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int current_sum = Math.abs(nums[i] - target);
      if (map.containsKey(current_sum) && map.get(current_sum) != i) {
        return new int[] {i, map.get(current_sum)};
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
