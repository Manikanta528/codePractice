package com.manikanta.leetcode;

//https://leetcode.com/problems/maximum-difference-between-increasing-elements/

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] nums = {7,1,5,4};
        int ans = maximumDifference(nums);
        System.out.println(ans);
    }
    public static int maximumDifference(int[] nums){
        int maxDiff = -1;
        int n = nums.length;
        for(int i = 0 ; i < n-1 ; i++){
            for(int  j = i+1 ; j < n ; j++){
                if(nums[i] < nums[j]){
                    maxDiff = (maxDiff < Math.abs(nums[i] - nums[j])) ? Math.abs(nums[i] - nums[j]) : maxDiff;
                }
            }
        }
        return maxDiff;
    }
}
