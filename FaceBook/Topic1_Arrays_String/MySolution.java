package FaceBook.Topic1_Arrays_String;

import java.util.HashSet;
import java.util.Set;

public class MySolution {

    public static void main(String[] args) {
        //String givenValue = "abcabcbb";
        String givenValue = "anviaj";
        System.out.println("Length of the subString : " + lengthOfLongestSubstring(givenValue)); // 3
    }

    public static int lengthOfLongestSubstring(String givenValue) {
        //HashSet<String> setOfSubstrings = new HashSet<>();
        int max = 0;
        int index = 0;
        Set<Character> setofChars = new HashSet<>();
        for (int i = 0; i < givenValue.length(); i++) {
            setofChars.add(givenValue.charAt(i));
            for (int j = i + 1; j < givenValue.length(); j++) {
                if (!setofChars.contains(givenValue.charAt(j))) {
                    setofChars.add(givenValue.charAt(j));
                    index = j;
                } else {
                    break;
                }
            }
            max = Math.max(max, setofChars.size());
            setofChars = new HashSet<>();
        }
        return max;
    }
}
