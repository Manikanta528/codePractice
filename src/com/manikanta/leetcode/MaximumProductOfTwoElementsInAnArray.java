package com.manikanta.leetcode;

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        int nums[] = {1,5,4,5};
        int ans = maxProduct(nums);
        System.out.println(ans);
    }
    public static int maxProduct(int[] nums) {
        /*//brute force
        int max = 0,len = nums.length;
        for (int i = 0; i < len-1 ; i++) {
            for (int j = i+1; j < len; j++) {
                if(max < (nums[i]-1)*(nums[j]-1)){
                    max = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return max;*/
        int max = 0;
        int s = 0 , e = nums.length-1;
        while(s < e){
            if(max < (nums[s]-1)*(nums[e]-1)){
                max = (nums[s]-1)*(nums[e]-1);
            }
            if(nums[s] < nums[e]){
                s++;
            }else{
                e--;
            }
        }
        return max;

    }
}
