package LeetCode.slidingwindow;

public class LongestSubStringPalindrome {
  private static int lo = 0, maxLen = 0;

  public static void main(String[] args) {

    String givenString = "bbabaac";

    String palindrome = longPalindrome(givenString);
    System.out.println("Longest SubString Palindrome " + palindrome);
  }

  private static String longPalindrome(String givenString) {

    if (givenString.length() < 2) {
      return givenString;
    }
    for (int i = 0; i < givenString.length(); i++) {
      extendPalindrome(givenString, i, i); // For odd length of string
      extendPalindrome(givenString, i, i + 1); // For even length of string
    }
    return givenString.substring(lo, lo + maxLen);
  }

  private static void extendPalindrome(String givenString, int left, int right) {
    while (left >= 0
        && right < givenString.length()
        && givenString.charAt(left) == givenString.charAt(right)) {
      left--;
      right++;
      System.out.println("Left : " + left + " , Right: " + right);
    }
    if (maxLen < right - left - 1) {
      lo = left + 1;
      maxLen = right - left - 1;
      System.out.println("Lo : " + lo + " , Max Length: " + maxLen);
      System.out.println("Palindrome : " + givenString.substring(lo, lo + maxLen));
    }
  }
}
