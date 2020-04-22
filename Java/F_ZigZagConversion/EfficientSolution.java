package Tech.F_ZigZagConversion;

public class EfficientSolution {

    public static void main(String[] args) {
        String givenString = "PAYPALISHIRING";
        // int numberOfRows = 2; // Expected output PYAIHRNAPLSIIG
        // int numberOfRows = 3; // Expected output PAHNAPLSIIGYIR
        int numberOfRows = 4; // Expected output PINALSIGYAHRPI
        System.out.println("The Zig Zag Conversion : " + convert(givenString, numberOfRows));
    }

    public static String convert(String s, int numRows) {

        char[] charsArray = new char[s.length()];

        int lengthOfGivenString = s.length();

        if (lengthOfGivenString == 1 || numRows == 1 || numRows >lengthOfGivenString) {  //Base Case
            return s;
        }

        int counter = 0;
        int interval = 2 * numRows -2;
        for(int i =0; i<numRows; i++){
            int step = interval - 2*i;
            int start  = 0;
            for (int j=i; j< lengthOfGivenString; j += interval){
                charsArray[counter] = s.charAt(j);
                System.out.println("Counter : "+ counter +" character : "+charsArray[counter]);
                counter++;
                if(step > 0 && step < interval && j + step < lengthOfGivenString){
                    charsArray[counter] = s.charAt(j + step);
                    System.out.println("Counter : "+ counter +" character : "+charsArray[counter]);
                    counter++;
                }
            }
        }


        return String.valueOf(charsArray);
    }
}
