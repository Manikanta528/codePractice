package com.manikanta.leetcode;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int nums[] = {5,2,3,1};
        nums = sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    public static void quickSort(int[] nums, int low, int hi){
        //base condition
        if(low >= hi) return;

        int s = low;
        int e = hi;
        int m = s + (e - s)/2;
        int pivot = nums[m];

        //checking for violation and swap
        while(s <= e){
            while ( nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(nums, low , e);
        quickSort(nums, s, hi);
    }
}
