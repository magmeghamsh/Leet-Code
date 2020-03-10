package LeetCode;

import java.util.Arrays;
import java.util.TreeMap;

public class ArrayTest {

  public static void main(String[] args) {
    //int[] number = {1, 30, 2, 5, 6, 9, 8, 4};
      int[] number = {1, 0, 2, 5, 6, 9, 8, 4, -1, -10, 2, 3, -15, 12, 3, -8};
    TreeMap<Integer, String> treeMap = new TreeMap<>();
    int start = 0;
    for (int i = 0; i < 4; i++) {
      int end = start + number.length / 4;
      splitString(number, start, end);
      treeMap.put(splitString(number, start, end), getWeather(i));
      start = end;
    }
    System.out.println("Season having high temp: " + treeMap.get(treeMap.lastKey()));
  }

  private static int splitString(int[] number, int start, int end) {
    // System.out.println("Start: "+start+" End: "+end);
    int[] splitArray = Arrays.copyOfRange(number, start, end);
    // System.out.println("Split Array: " + Arrays.toString(splitArray));
    Arrays.sort(splitArray);
    int temp = splitArray[splitArray.length - 1] - splitArray[0];
    return temp;
  }

  private static String getWeather(int i) {
    if (i == 0) {
      return "Winter";
    } else if (i == 1) {
      return "Autumn";
    } else if (i == 2) {
      return "Summer";
    }
    return "Spring";
  }
}
