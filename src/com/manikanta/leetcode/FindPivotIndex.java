package com.manikanta.leetcode;

//https://leetcode.com/problems/find-pivot-index/

class FindPivotIndex {
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int ind = pivotIndex(nums);
        System.out.println(ind);
    }
    public static int pivotIndex(int[] nums) {
        //1,7,3,6,5,6
        //1,8,11,17,22,28

        int n = nums.length;
        int preSum[] = new int[n];
        preSum[0] = nums[0];
        for (int i = 1; i < n ; i++) {
            preSum[i] = preSum[i-1] + nums[i];
        }
        int leftSum = 0, rightSum = preSum[n-1] - nums[0];
        if(leftSum == rightSum) return 0;
        for (int i = 1; i < n; i++) {
            leftSum = preSum[i-1] ;
            rightSum = preSum[n-1] -preSum[i];
            if(leftSum == rightSum) return i;
        }

        return -1;
    }
}