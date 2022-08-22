package com.manikanta.leetcode;

//https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] nums = {105,924,32,968};
        boolean ans = canBeIncreasing(nums);
        System.out.println(ans);
    }

    private static boolean canBeIncreasing(int[] nums) {
        int len = nums.length;
        int count = 0,ind = -1;
        for (int i = 0; i < len-1; i++) {
            if( nums[i] >= nums[i+1]){
                count++;
                //System.out.println(count);
                ind = i;
            }
            if(count > 1) return false;
        }
        if (count == 0) return true;
        int countleft = 0, countrig = 0;
        if(ind-1 != -1 ){
            if(nums[ind-1] >= nums[ind+1]) countleft++;
            //System.out.println(countleft+" "+ ind);
        }
        if(ind+2 != len ){
            if(nums[ind] >= nums[ind+2]) countrig++;
            System.out.println(countrig+" "+ ind);
        }

        if( countleft == 0 || countrig == 0 ) return true;
        return false;

    }
}
