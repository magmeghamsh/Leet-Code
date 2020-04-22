package Tech.F_ZigZagConversion;

import java.util.HashMap;
import java.util.Map;

public class MySolution {

    public static void main(String[] args) {
        String givenString = "PAYPALISHIRING";
        // int numberOfRows = 2; // Expected output PYAIHRNAPLSIIG
        // int numberOfRows = 3; // Expected output PAHNAPLSIIGYIR
        int numberOfRows = 4; // Expected output PINALSIGYAHRPI
        System.out.println("The Zig Zag Conversion : " + result(givenString, numberOfRows));
    }

    private static String result(String givenString, int numberOfRows) {
        StringBuilder resultValue = new StringBuilder();
        if (givenString.length() == 1 || numberOfRows == 1 || numberOfRows > givenString.length()) {  //Base Case
            return givenString;
        }

        Map<Integer, String[]> arrayMap = new HashMap<>();

        for (int i = 0; i < numberOfRows; i++) {
            arrayMap.put(i, new String[givenString.length()]);
        }

        System.out.println("Number of arrays in the map: " + arrayMap.size());
        if (numberOfRows == 2) {
            int evenIndex = 0;
            int oddIndex = 0;
            for (int i = 0; i < givenString.length(); i++) {
                if (i % 2 == 0) {
                    arrayMap.get(0)[evenIndex] = String.valueOf(givenString.charAt(i));
                    evenIndex++;
                } else {
                    arrayMap.get(1)[oddIndex] = String.valueOf(givenString.charAt(i));
                    oddIndex++;
                }
            }
        } else {
            int currentKey = 0;
            int firstIndexValue = 0;
            for (int i = 0; i < arrayMap.size(); i++) {
                int firstArrayValue = 2 * (numberOfRows -1);
                int indexValue = i * firstArrayValue;
                if(indexValue < givenString.length()) {
                    arrayMap.get(currentKey)[firstIndexValue++] = String.valueOf(givenString.charAt(indexValue));
                }
            }
        }



        for (int i = 0; i < arrayMap.size(); i++) {
            for (int j = 0; j < arrayMap.get(i).length; j++) {
                if(arrayMap.get(i)[j] != null) {
                    resultValue = resultValue.append(arrayMap.get(i)[j]);
                }
            }
        }
        return resultValue.toString();


    }
}
