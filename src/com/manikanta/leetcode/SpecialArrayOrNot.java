package com.manikanta.leetcode;

//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

public class SpecialArrayOrNot {
    public static void main(String[] args) {
        int nums[] = {3,4};
        int ans = specialArray(nums);
        System.out.println(ans);
    }

    private static int specialArray(int[] nums) {
        int count = 0,n = nums.length;
        for (int i = 0; i < n+1; i++) {
            count = 0;
            for(int j = 0 ; j< n ; j++){
                if(nums[j] >= i) count++;
            }
            if(count == i) return i;
        }
        return -1;
    }


}
