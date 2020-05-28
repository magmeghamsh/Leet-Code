package Java.M_RomanToInteger;

import java.util.HashMap;

public class MySolution {

    public static void main(String[] args) {
        String roman = "MMCMXCIX"; // 2999
        // String roman = "CXXIII"; //123
        // String roman = "IV"; //4

        System.out.println("Roman to integer : " + romanToInteger(roman));
    }

    private static int romanToInteger(String roman) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i > 0 && map.get(roman.charAt(i)) > map.get(roman.charAt(i - 1))) {
                result += map.get(roman.charAt(i)) - 2 * map.get(roman.charAt(i - 1));
            } else {
                result += map.get(roman.charAt(i));
            }
        }
        return result;
    }
}
