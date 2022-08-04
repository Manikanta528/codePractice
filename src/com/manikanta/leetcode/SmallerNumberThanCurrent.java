package com.manikanta.leetcode;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.*;

public class SmallerNumberThanCurrent {
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int ans[] = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
            //brute force
            // int arr[] = new int[nums.length];
            // for(int i = 0; i < nums.length; i++){
            //     int count = 0;
            //     for(int j = 0; j < nums.length; j++){
            //         if(i != j) {
            //             if (nums[i] > nums[j]) {
            //                 count++;
            //             }
            //         }
            //     }
            //     arr[i] = count;
            // }
            // return arr;

            int temp[] = nums.clone();
            Arrays.sort(temp);
            int len = nums.length;
            HashMap<Integer,Integer> map = new HashMap<>();
            int ans[] = new int[len];
            for(int i = 0 ; i < len ; i++){
                map.putIfAbsent(temp[i],i);
            }
            for(int i = 0 ; i < len ; i++){
                ans[i] = map.get(nums[i]);
            }
            return ans;
    }

}
