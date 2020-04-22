package Tech.K_ContainerWithMostWater;

public class MySolution {

    public static void main(String[] args) {
        int[] numbers = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // 49
        System.out.println("Container with most water : " + maxArea(numbers));
    }

    public static int maxArea(int[] height) {
        int max_area=0,a_pointer=0,b_pointer=height.length-1;

        while(a_pointer<b_pointer){
            if(height[a_pointer]<height[b_pointer]){
                max_area = Math.max(max_area, height[a_pointer]*(b_pointer-a_pointer));
                a_pointer++;
            } else {
                max_area = Math.max(max_area, height[b_pointer]*(b_pointer-a_pointer));
                b_pointer--;
            }
        }

        return max_area;

    }
}
