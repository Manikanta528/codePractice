package com.manikanta.leetcode;

import java.util.*;

public class SplitArrayIntoConsecutiveSubsequences {
    public static void main(String[] args) {
        int nums[] = {1,2,3,3,4,5};
        boolean ans = isPossible(nums);
        System.out.println(ans);
    }

    private static boolean isPossible(int[] nums) {
        if(nums.length < 3) return false;
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i : nums){
            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }


        return true;
    }

}
