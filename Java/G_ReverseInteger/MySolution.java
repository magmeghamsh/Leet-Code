package Java.G_ReverseInteger;

public class MySolution {

    public static void main(String[] args) {

        // int givenInteger = 123; // Expected
        // int givenInteger = -123;
        // int givenInteger = 120;
        // int givenInteger = 0;
        // int givenInteger = 0000;
        // int givenInteger = 901000;
        int givenInteger = 1534236469;
        System.out.println("The reverse integer : " + reverse(givenInteger));

    }

    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        StringBuilder modifiedSb = new StringBuilder();
        int modnumber = 0, number = Math.abs(x);
        boolean isNegative = false;
        String s = String.valueOf(number);

        if (x < 0) {
            isNegative = true;
        }

        if (s.length() == 1) {
            return x;
        }

        for (int i = 0; i < s.length(); i++) {
            modnumber = number % 10;
            if (!(modnumber == 0)) {
                modifiedSb.append(number);
                break;
            }
            number = number / 10;
        }

        int modifiedNumber = Integer.valueOf(modifiedSb.toString());

        System.out.println("modifiedNumber : " + modifiedNumber);

        if (String.valueOf(modifiedNumber).length() > 9) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            modnumber = modifiedNumber % 10;
            modifiedNumber = modifiedNumber / 10;

            System.out.println(" Number : " + modifiedNumber + " Mod Number: " + modnumber);
            sb.append(modnumber);

            if (modifiedNumber == 0) {
                break;
            }

        }

        return isNegative ? -1 * Integer.valueOf(sb.toString()) : Integer.valueOf(sb.toString());
    }
}
