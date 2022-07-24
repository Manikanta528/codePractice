package com.manikanta.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int ans = dominantIndex(nums);
        System.out.println(ans);
    }

    private static int dominantIndex(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = -1,ind = -1;
        for(int i = 0 ; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
                ind = i;
            }
            list.add(nums[i]);
        }
        list.remove(new Integer(max));
        Integer max2 = Collections.max(list);
        if(max2*2 <= max) return ind;
        return -1;
    }
}
