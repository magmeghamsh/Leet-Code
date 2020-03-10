package LeetCode.Misc;

public class IsPalindrome {

  public static void main(String[] args) {
      int number = 11311;
    System.out.println("The given number is a Palindrome :  " + isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {
        int rev =0;
        if (number<0 || (number!=0 && number%10==0)) return false;
        while(number > 0){
            rev = rev*10+number%10;
            System.out.println("Reverse : "+rev);
            number /=10;
        }
            return ((number == rev) || number == rev/10);

    }
}
