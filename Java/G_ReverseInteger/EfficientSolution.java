package Java.G_ReverseInteger;

public class EfficientSolution {

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

        boolean isPositive = true;
        long result = 0;

        if (x < 0) {
            isPositive = false;
            x = -x;
        }

        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return 0;
        return isPositive ? (int) result : (int) -result;
    }
}
