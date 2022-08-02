package com.manikanta.leetcode;

//https://leetcode.com/problems/largest-perimeter-triangle/

import java.util.Arrays;

class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int nums[] = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums) {
        int maxPer = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2; i++){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];
            if(a+b > c && a+c > b && c+b > a && maxPer < a+b+c){
                maxPer = a+b+c;
            }
        }
        return maxPer;
    }
}