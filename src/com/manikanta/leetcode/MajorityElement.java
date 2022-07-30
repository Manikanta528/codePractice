package com.manikanta.leetcode;

//https://leetcode.com/problems/majority-element/

import java.util.HashMap;


class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            map.putIfAbsent(nums[i], 0 );
            map.put(nums[i],map.get(nums[i]) +1 );
            if(map.get(nums[i]) == len/2){
                ans = nums[i];
            }

        }
        return ans;

    }
}