package Tech.D_MedianTwoSortedArrays;

import java.util.Arrays;

public class MySolution {

    public static void main (String [] args) {
        int[] a = {1,2,3,4};
        int [] b = {10,12,13,16};
        double result = findMedianSortedArrays(a,b);
        System.out.println("Result: "+result); // The result should be 7.0

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        int j = 0; int k = 0;
        for(int i = 0; i < nums1.length; i++){
            nums3[i] = nums1[i];
            j++;
        }
        for(int i = j; i < nums3.length; i++){
            nums3[i] = nums2[k];
            k++;
        }
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));
        int length = nums3.length;
        if(length %2 == 0){
            int end = nums3[length /2];
            int start = nums3[(length/2) -1];
            System.out.println(start + " "+ end);
            return (double)(start + end)/2;
        }else{
            return nums3[(length-1)/2];
        }

    }
}
