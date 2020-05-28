package Java.O_LongestCommonPrefix;

public class EfficientSolution {

    public static void main(String[] args) {
        String[] givenArrays = {"flower", "flight", "flow"};
        System.out.println("Longest Common Prefix : " + result(givenArrays));

    }

    private static String result(String[] givenArrays) {
        if (null == givenArrays || givenArrays.length == 0) return ""; // Base case
        String pre = givenArrays[0];
        for (int i = 1; i < givenArrays.length; i++) {
            while (givenArrays[i].indexOf(pre) != 0) {
                pre = pre.substring(0,pre.length()-1);
            }
        }
        return pre;
    }
}
