package LeetCode.slidingwindow;

import java.util.HashMap;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        int[] givenArray = {11, 5, 0, 4, -8};
        int sum = 4;
        System.out.println("Message : " + subArraySum(givenArray, sum));
    }

  private static String subArraySum(int[] givenArray, int sum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int i=0;
        String message = "No Sum exists in the array";
        while(i < givenArray.length){
            int complement = sum - givenArray[i];
            if(hashMap.containsKey(complement)){
                message = "Index is : "+hashMap.get(complement)+ " second index : "+ i;
                break;
            } else {
                hashMap.put(givenArray[i],i);
                i++;
            }
        }
        return message;
  }
}
