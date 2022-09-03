package com.manikanta.leetcode;

//https://leetcode.com/problems/count-good-triplets/

public class CountEqualAndDivisiblePairsInAnArray {
    public static void main(String[] args) {
        int nums[] = {3,1,2,2,2,1,3};
        int k= 2;
        int ans = countPairs(nums,k);
        System.out.println(ans);
    }
    public static int countPairs(int[] nums, int k){
        int count = 0,len = nums.length;

        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if(nums[i] == nums[j] && (i*j)%k== 0){
                    count++;
                }
            }
        }

        return count;
    }
}
