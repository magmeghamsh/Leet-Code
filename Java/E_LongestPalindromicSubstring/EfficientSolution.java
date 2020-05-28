package Java.E_LongestPalindromicSubstring;

public class EfficientSolution {

  public static void main(String[] args) {
    //String s = "ababaa"; // Odd case non symmetric, the output should be "ababa"
    // String s = "racecar"; // odd case symmetric, the output should be "racecar"
     String s = "aaaa"; // Even case, the output should be "aaaa"
    System.out.println("Longest Sub String: " + getLongestSubString(s));
  }

  private static String getLongestSubString(String s) {
    int start = 0;
    int end = 0;
    for (int i = 0; i < s.length(); i++) {
      int length1 = expandEachElement(s, i, i);
      int length2 = expandEachElement(s, i, i + 1);
      int len = Math.max(length1, length2);
        System.out.println("Length of the substring: " + len);
      if (len > end - start) {
        start = i - ((len-1) / 2);
        end = i + (len / 2);
          System.out.println("Starting Index: " + start+" Ending index: "+end);
      }

    }
    return s.substring(start, end+1);
  }

  private static int expandEachElement(String s, int leftPointer, int rightPointer) {
   // System.out.println("LeftPointer: " + leftPointer + " rightPointer: " + rightPointer);
    while (leftPointer >= 0
        && rightPointer < s.length()
        && s.charAt(leftPointer) == s.charAt(rightPointer)) {
      leftPointer--;
      rightPointer++;
    }

    return rightPointer - leftPointer - 1;
  }
}
