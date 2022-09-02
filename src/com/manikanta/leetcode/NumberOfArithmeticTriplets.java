package com.manikanta.leetcode;

//https://leetcode.com/problems/number-of-arithmetic-triplets/

import java.util.*;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        int nums[] = {6,14,15,26,31,36,38,41,42,45};
        int diff = 5;
        int ans = arithmeticTriplets(nums,diff);
        System.out.println(ans);
    }
    public static int arithmeticTriplets(int[] nums, int diff){
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);

        int arr[] = new int[set.size()];
        int len = arr.length,p = 0;
        for (Integer i : set) {
            arr[p++] = i;
        }
        Arrays.sort(arr);
        for (int i = 0; i < len-2; i++) {
            for (int j = i+1; j < len-1; j++) {
                if(arr[j] - arr[i] == diff ){
                    for (int k = j+1; k < len; k++) {
                        if(arr[k] - arr[j] == diff){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
