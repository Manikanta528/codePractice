package com.manikanta.leetcode;

class FindTriangularSumOfAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(triangularSum(nums));
    }
    public static int triangularSum(int[] nums) {
        if(nums.length < 2){
            return nums[0];
        }
        
        int[] arr = new int[nums.length -1];
        int temp;
        for(int i = 0 ; i < arr.length ; i++){
            temp = nums[i] + nums[i+1];
            arr[i] = temp%10;
        }
        return triangularSum(arr);
        
    }
}