package com.manikanta.leetcode;

//https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,tmax = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                tmax = 0;
            }else{
                tmax++;
                max = Integer.max(max,tmax);
            }
        }
        return max;
    }

}
