package Java.O_LongestCommonPrefix;

public class MySolution {

    public static void main(String[] args) {
        // String[] givenArrays = {"flower", "flight", "flow"}; // Common prefix --> fl
        // String[] givenArrays = {"abcd", "efgh", "klmn"}; // Common prefix -->
        // String[] givenArrays = {"aaa","aa","aaa"}; // Common prefix --> aa
        String[] givenArrays = {"aca","cba"}; // Common prefix -->
        System.out.println("Longest Common Prefix : " + result(givenArrays));
    }

    private static String result(String[] givenArrays) {

        if (null == givenArrays ||givenArrays.length == 0) return ""; // Base case
        String result = "";

        String firstArray = givenArrays[0];

        int firstArrayLength = firstArray.length();

        int j = 0;

        while (j < firstArrayLength) {
            int i = 0;
            while (i < givenArrays.length) {
                String fromArray = givenArrays[i];
               System.out.println("i: "+i);
                if (j < fromArray.length()) {
                    Character charFromArray = fromArray.charAt(j);
                    if (charFromArray != firstArray.charAt(j)) {
                        break;
                    }
                    if (i == givenArrays.length - 1) {
                        result = result + firstArray.charAt(j);
                    }
                }else{
                    break;
                }
                i++;
            }
            j++;
        }

        return result;
    }
}
