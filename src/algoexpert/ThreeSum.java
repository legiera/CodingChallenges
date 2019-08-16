package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    public static ArrayList<Integer[]> threeNumberSum(int[] array, int targetSum){
        Arrays.sort(array);
        ArrayList<Integer[]> triplets = new ArrayList<Integer[]>();
        for (int i =0; i < array.length-2; i++){
            int left = i +1;
            int right = array.length -1;
            while (left < right){

                int currentSum = array[i] + array[left]+ array[right];
                if (currentSum == targetSum){
                    Integer[] newTrplet = {array[i], array[left], array[right]};
                    triplets.add(newTrplet);
                    left++;
                    right--;
                } else if (currentSum < targetSum){
                    left++;
                } else if (currentSum > targetSum){
                    right --;
                }
            }
        }
        return triplets;
    }
}
