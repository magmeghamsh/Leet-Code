package Tech.ZZZZ_Misc;

public class LongestPrefix {

  public static void main(String[] args) {
    String[] strings = {"flower", "flow", "flight", "flijdsf"};
    System.out.println("Common Prefix: "+longestCommonPrefix(strings));
  }

  public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
        System.out.println(" Prefix: "+strs[i].startsWith(prefix));
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
      }
    }
    return prefix;
  }
}
