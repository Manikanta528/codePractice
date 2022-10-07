package com.manikanta.leetcode;


//https://leetcode.com/problems/number-of-ways-to-split-array/
import java.util.Arrays;

public class NumberOfWaysToSplitArray {
    public static void main(String[] args) {
        int nums[] = {-100000,100000};
        System.out.println(waysToSplitArray(nums));
    }

    private static int waysToSplitArray(int[] nums) {
        int count = 0, len = nums.length;
        long leftSum = 0, rightSum = 0;
        for (int i = 0; i < len; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < len-1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            //System.out.println(leftSum +" "+ rightSum);
            if( leftSum >= rightSum) count++;
        }
        return count;
    }
}
