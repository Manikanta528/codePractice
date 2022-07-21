package com.manikanta.leetcode;

//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/

class SortArrayByParity {
    public static void main(String[] args) {
        int nums[] = {3,1,2,4};
        int ans[] = sortArrayByParity(nums);
        for (int v :
                ans) {
            System.out.print(v+" ");
        }
    }
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length,p=0;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            if(nums[i]%2 == 0) ans[p++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]%2 != 0) ans[p++] = nums[i];
        }
        return ans;
    }
}