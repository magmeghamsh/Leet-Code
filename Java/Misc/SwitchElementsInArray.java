package Java.Misc;

import java.util.Arrays;

public class SwitchElementsInArray {

  public static void main(String[] args) {
   // int[] num = {1, 0, 4, 20, 0, 3, 0, 2, 0};
     int[] num = {0, 0, 1, 0};
    // int[] num = {11,0, 24};
    // int[] num = {0,1, 20};
    // int[] num = {0,1, 11,12};
    int i = 0;
    int index = indexOfLastNonZeroElement(num, num.length - 1);
    while (i < num.length && i < index) {
      int currentValue = num[i];
      if (currentValue == 0) {
        index = indexOfLastNonZeroElement(num, index);
        System.out.println("Index Value: " + index);
        if (index != 0) {
          int substitueValue = num[index];
          System.out.println(
              "Current Value: " + currentValue + " substitueValue: " + substitueValue);
          num[index] = currentValue;
          num[i] = substitueValue;
          System.out.println("Current index: " + i + " substitueIndex: " + index);
          System.out.println("New array : " + Arrays.toString(num));
        }else {
            break;
        }
      }
      i++;
    }

    System.out.println("New array after moving zeros to end: " + Arrays.toString(num));
  }

  private static int indexOfLastNonZeroElement(int[] arr, int index) {
    int nonZeroIndex = 0;
    while (index < arr.length && index > 0) {
      if (arr[index] != 0) {
        nonZeroIndex = index;
        break;
      }
      index--;
    }
    return nonZeroIndex;
  }
}
