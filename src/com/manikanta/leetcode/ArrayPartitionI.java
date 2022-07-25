package com.manikanta.leetcode;

import java.util.Arrays;

class ArrayPartitionI {
    public static void main(String[] args) {
        int nums[] = {1,4,3,2};
        int ans = arrayPairSum(nums);
        System.out.println(ans);
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int len = nums.length;
        for(int i = 0 ; i < len; i+=2){
            sum += Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}