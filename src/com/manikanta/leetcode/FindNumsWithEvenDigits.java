package com.manikanta.leetcode;

public class FindNumsWithEvenDigits {
    public static void main(String[] args) {
        int nums[] ={555,901,482,1771};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int count = 0;
        String temp = "";
        for (int i = 0; i < nums.length; i++) {
            temp = Integer.toString(nums[i]);
            if(temp.length()%2 == 0) count++;
        }
        return count;
    }
}
