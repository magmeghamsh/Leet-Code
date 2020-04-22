package Tech.H_StringToInteger;

public class MySolution {

    public static void main(String[] args) {
        // String givenNumber = "-42a"; // -42
         String givenNumber = "2147483646"; // 2147483646 failing for this case
        // String givenNumber = "2147483648";
       // String givenNumber = "-91283472332";
        // String givenNumber = "3.14";
        // String givenNumber = "  +0 1234"; // 0
        // String givenNumber = "-+2";
        System.out.println("Result: " + myAtoi(givenNumber));
    }

    public static int myAtoi(String str) {
        str = str.trim();

        boolean isNegative = false;
        int result = 0;
        int digits = 0;
        if (str.length() == 0) {
            return result;
        } else {
            if (str.charAt(0) == '-') {
                isNegative = true;
                str = str.substring(1);
            } else if (str.charAt(0) == '+') {
                str = str.substring(1);
            }
        }

        str = str.split("\\s")[0];
        str = str.replaceAll("^0+", "0");
        System.out.println("Modified String : " + str);

        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                //if(result != 0){
                digits++;
                if (digits >= 10) {
                    if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                        return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                    System.out.println("Is Negative: " + isNegative);
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                // }
                result = result * 10 + (c - '0');
            } else if (c == '-' || c == '+') {
                return 0;
            } else {
                break;
            }
        }

        return isNegative ? -(result) : result;

    }
}
