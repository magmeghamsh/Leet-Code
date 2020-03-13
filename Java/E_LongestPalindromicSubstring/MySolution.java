package LeetCode.E_LongestPalindromicSubstring;

public class MySolution {

    public static void main(String []args){
        System.out.println("Result "+longestPalindrome("cabbace"));
    }

    public static String  longestPalindrome(String input) {
        int length = input.length();
        String result = "";
        if (length == 1){
            return input;
        }
        for(int i = length; i > 1; i --){
            int currLen = i -1 ;
            int endLen = currLen;
            for(int j = 0; j < length; j++){
                for(int k = endLen ; k >=j; k --){
                    if( (k-j) == currLen ){
                        result = input.substring(j,k);
                        if(isPalindrome(result)){
                            return result;
                        }else{
                            break;
                        }
                    }
                }
                endLen+=1;
                if(endLen >= length){
                    break;
                }
            }
        }
        return result;
    }

    private static boolean isPalindrome (String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
            return true;
        }
        return false;
    }



}
