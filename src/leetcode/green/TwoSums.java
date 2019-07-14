package leetcode.green;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 1; i < nums.length; i++) {
            Integer val = map.get(target - nums[i]);
            if (val == null)
                map.put(nums[i], i);
            else
                arr[0] = val;
            arr[1] = i;

        }
        return arr;
    }
}