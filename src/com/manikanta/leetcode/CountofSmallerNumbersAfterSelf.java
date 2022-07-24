package com.manikanta.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountofSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        int nums[] = {-1,-1};
        System.out.println(countSmaller(nums));
    }
    public static List<Integer> countSmaller(int[] nums) {

        // brute force
        //Time Limit Error
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            int count = 0;
            for (int j = i+1; j < n ; j++) {
                if(nums[i] > nums[j]) count++;
            }
            list.add(count);
        }
        list.add(0);
        return list;
    }
}
