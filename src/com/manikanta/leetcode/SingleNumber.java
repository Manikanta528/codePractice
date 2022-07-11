package com.manikanta.leetcode;

//https://leetcode.com/problems/single-number/

public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
    static int singleNumber(int nums[]){
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
