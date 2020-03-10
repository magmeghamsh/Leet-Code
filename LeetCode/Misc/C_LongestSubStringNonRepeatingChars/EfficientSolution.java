package LeetCode.Misc.C_LongestSubStringNonRepeatingChars;

import java.util.HashSet;

public class EfficientSolution {
    public static void main(String[] args) {
        // String test = "abcabcabc";
        //String test = "bbbbbbb";
        String test = "pwwkeawq";
        System.out.println("Length of longest substring repeating characters : " + lengthOfLongestSubString(test));
    }

    /* Take two pointer and move right till u find non repeating characters
    else remove from set and shrink from left*/
    static int lengthOfLongestSubString(String test) {
        int leftPointer = 0, rightPointer = 0, max = 0;
        HashSet<Character> uniqueCharacters = new HashSet<>();
        while (rightPointer < test.length()) {
            if (!uniqueCharacters.contains(test.charAt(rightPointer))) {
                uniqueCharacters.add(test.charAt(rightPointer++));
            } else {
                uniqueCharacters.remove(test.charAt(leftPointer++));
            }
            max = Math.max(uniqueCharacters.size(), max);
        }
        return max;
    }
}
