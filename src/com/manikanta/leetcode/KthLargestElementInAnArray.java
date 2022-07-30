package com.manikanta.leetcode;

//https://leetcode.com/problems/kth-largest-element-in-an-array/

class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
    public static int findKthLargest(int[] nums, int k) {
        quickSort(nums,0,nums.length-1);
        int ans = nums[0];
        return ans;
    }
    public static void quickSort(int[] nums, int lo, int hi) {
        if(lo >= hi) return;

        int s = lo;
        int e = hi;
        int m = s + (e - s)/2;
        int pivot = nums[m];

        while(s <= e){
            while(nums[s] < pivot){
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
        quickSort(nums,lo ,e);
        quickSort(nums,s,hi);
    }
}