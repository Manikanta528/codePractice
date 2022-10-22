package com.manikanta.leetcode;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        // int pivot = -1;
        // for(int i = 1 ; i < nums.length ; i++){
        //     if(nums[i-1] > nums[i]){
        //         pivot = i;
        //         break;
        //     }
        // }
        // if(pivot == -1 ) return nums[0];
        // return nums[pivot];


        int start = 0;
        int end = nums.length-1,mid;
        while(start < end){
            mid = start + (end - start)/2;

            if(nums[mid] > nums[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return nums[start];
    }
}
