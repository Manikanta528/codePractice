package com.manikanta.leetcode;

//https://leetcode.com/problems/contains-duplicate/
//217

import java.util.HashMap;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,3,4,1};
        boolean ans = containsDuplicates(nums);
        System.out.println(ans);
    }
    static boolean containsDuplicates(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.putIfAbsent(i, 0);
            map.put(i,map.get(i)+1);
            if(map.get(i) > 1) return true;
        }
        return false;
    }
}
