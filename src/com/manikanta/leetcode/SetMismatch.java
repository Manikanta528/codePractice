package com.manikanta.leetcode;

//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int arr[] = new int[nums.length + 1];
        int ans[] = new int[2];
        for(int i : nums){
            arr[i]++;
            if(arr[i] == 2) ans[0] = i;
        }

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == 0){
                ans[1] = i;
                break;
            }
        }
        return ans;

    }
}
