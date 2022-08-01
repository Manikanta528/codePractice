package com.manikanta.leetcode;

//https://leetcode.com/problems/maximum-product-of-three-numbers/

class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int nums[] = {-100,-98,-1,1,2,3,4};
        System.out.println("max product : "+ maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        quickSort(nums,0,nums.length-1);
        int n = nums.length;
        int maxProduct1 = nums[n-1]*nums[n-2]*nums[n-3];
        int maxProduct2 = nums[0]*nums[1]*nums[n-1];
        return (maxProduct1 > maxProduct2) ? maxProduct1 : maxProduct2;       
    }
    public static void quickSort(int[] nums,int low , int high){
        if(low >= high) return;
        
        int s = low;
        int e = high;
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
        quickSort(nums, low , e);
        quickSort(nums, s, high);
    }
}