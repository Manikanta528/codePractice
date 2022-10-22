package com.manikanta.leetcode;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

public class FindMinimumInRotatedSortedArrayII {
    public static void main(String[] args) {
        int nums[] = {3,3,1,3};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length-1, mid;
        while(start < end){
            mid = start + (end - start )/2;

            if(nums[mid] > nums[end]){
                start = mid +1;
            }else if(nums[mid] < nums[end]){
                end = mid;
            }else{
                end--;
            }
        }
        return nums[start];
    }
}
