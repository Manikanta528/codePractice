package com.manikanta.leetcode;

//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int nums[] = {5,6,2,7,4};
        int ans = maxProductDifference(nums);
        System.out.println(ans);
    }
    public static int maxProductDifference(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }
}
