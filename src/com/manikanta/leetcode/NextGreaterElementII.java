package com.manikanta.leetcode;

//https://leetcode.com/problems/next-greater-element-ii/

import java.util.Arrays;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int nums[] = {1,8,-1,-100,-1,222,1111111,-111111};
        int arr[] = nextGreaterElements(nums);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] nextGreaterElements(int[] nums){
        int n = nums.length, index = -1;
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            index = linearSearch(nums, i, n, nums[i], index);
            if(index == -1){
                index = linearSearch(nums, 0, i, nums[i], index);
                if(index == -1){
                    arr[i] = -1;
                }else{
                    arr[i] = nums[index];
                }
            }else{
                arr[i] = nums[index];
            }
        }
        return arr;
    }
    public static int linearSearch(int[] nums, int start , int end,int val,int index){
        for(int i = start ; i < end ; i++){
            if(val < nums[i]){
                return i;
            }
        }
        return -1;
    }
}
