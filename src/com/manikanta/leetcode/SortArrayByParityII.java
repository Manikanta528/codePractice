package com.manikanta.leetcode;

//https://leetcode.com/problems/sort-array-by-parity-ii/

import java.util.Arrays;

class SortArrayByParityII {
    public static void main(String[] args) {
        int nums[] = {4,2,5,7};
        int ans[] = sortArrayByParityII(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len];

        int ep = 0, op = 1;
        for(int i : nums){
            if(i%2 == 0){
                ans[ep] = i;
                ep+=2;
            }else {
                ans[op] = i;
                op+=2;
            }
        }
        return ans;
    }
}