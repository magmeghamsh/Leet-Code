package Tech.D_MedianTwoSortedArrays;

public class EfficientSolution {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {10, 12, 13, 16};
        double result = findMedianSortedArrays(a, b);
        System.out.println("Result: " + result); // The result should be 7.0

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length = nums1.length + nums2.length;

        int low = 0;
        int high = nums1.length;

        int value = nums1.length + nums2.length + 1;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = value / 2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == nums1.length) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == nums2.length) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY &&  maxLeftY<= minRightX) {
                if (length % 2 == 0) {
                    return (double) (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return Math.max(maxLeftX, minRightY);
                }
            } else if (maxLeftX > minRightY) {
                high = partitionY - 1;
            } else {
                low = partitionX + 1;
            }
        }


        return 0;
    }
}
