package Java.P_3Sum;

import java.util.ArrayList;
import java.util.List;

public class MySolution {

    public static void main(String[] args){
        int[] num = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        List<List<Integer>> listOfTriplets = result(num,target);

    }

    private static List<List<Integer>> result(int[] num, int target) {
        List<Integer> listOfInteger = new ArrayList<>();
        List<List<Integer>> listOfTriplets = new ArrayList<>();

        if(num.length <=3){
            int firstSum = num[0]+num[1]+num[2];
        }


        return listOfTriplets;
    }
}
