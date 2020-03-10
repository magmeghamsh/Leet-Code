package LeetCode.A_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;

public class MySolution {

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
