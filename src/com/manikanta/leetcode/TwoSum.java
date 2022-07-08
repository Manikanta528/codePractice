package com.manikanta.leetcode;

//https://leetcode.com/problems/two-sum/
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum(nums,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    static int[] twoSum(int[] nums, int target){
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.get(diff) != null) {
                ans[0] = i;
                ans[1] = map.get(diff);
                if(ans[0] == ans[1]) continue;
                break;
            }

        }
        return ans;
    }
}
