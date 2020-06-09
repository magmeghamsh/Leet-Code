package FaceBook.Topic1_Arrays_String.A_LongestSubString;

import java.util.HashSet;
import java.util.Set;

public class EfficientSolution {

    public static void main(String[] args) {
        //String givenValue = "abcabcbb";
        String givenValue = "anviaj";
        System.out.println("Length of the subString : " + lengthOfLongestSubstring(givenValue)); // 3
    }

    public static int lengthOfLongestSubstring(String givenValue) {
        int leftPointer = 0, rightPointer = 0, max = 0;

        Set<Character> uniqueCharacters = new HashSet<>();

        while (rightPointer < givenValue.length()) {
            if (!uniqueCharacters.contains(givenValue.charAt(rightPointer))) {
                uniqueCharacters.add(givenValue.charAt(rightPointer++));
            } else {
                uniqueCharacters.remove(givenValue.charAt(leftPointer++));
            }
            max = Math.max(max, uniqueCharacters.size());

        }


        return max;
    }
}
