package com.manikanta.leetcode;

import java.util.ArrayList;

public class DecompRunEncodeList {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int res[] = decompRLEList(nums);
        for(int i : res) System.out.print(i+" ");
    }

    private static int[] decompRLEList(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int len = nums.length;
        int freq, val;
        for(int i = 0 ; i < len ; i+=2 ){
            freq = nums[i];
            val = nums[i+1];
            while(freq-- > 0){
                ans.add(val);
            }
        }
        int res[] = new int[ans.size()];
        for(int i = 0 ; i < ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
