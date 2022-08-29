package com.manikanta.leetcode;

//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int nums[] = {1,2,2,1};
        int k = 1;
        int ans = countKDifference(nums, k);
        System.out.println(ans);
    }
    public static int countKDifference(int[] nums, int k){
        int count = 0;
        int len = nums.length;
        for(int i = 0 ; i < len-1; i++){
            for(int j = i+1; j < len; j++) {
                if(Math.abs(nums[i]- nums[j]) == k){
                    count++;
                }
            }
        }
        return count;
    }
}
