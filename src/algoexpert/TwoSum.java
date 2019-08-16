package algoexpert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] result = new int[2];
        Map<Integer, Boolean> nums = new HashMap<>();

        for(int num : array){
            int potentialMatch= targetSum-num;

            if(nums.containsKey(potentialMatch)){ // answer is boolean
                return potentialMatch> num ? new int[] {potentialMatch, num} : new int[] {potentialMatch, num};
            } else{
                nums.put(num, true);
            }

        }
        return new int[0];

    }


    public static int[] twoNumberSumSolution3(int[] array, int targetSum) {
        Arrays.sort(array);
        int left =0;
        int right = array.length -1;
        while(left<right){
            int currentSum = array[left]+ array[right];
            if (currentSum == targetSum){
                return new int[] {array[left], array[right]};
            }else if (currentSum <targetSum){
                left++;
            }else if (currentSum> targetSum){
                right--;
            }
        }
        return new int [0];
    }
}