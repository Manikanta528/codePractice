package com.manikanta.leetcode;

//https://leetcode.com/problems/binary-search/

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int s = 0 , e = nums.length -1;
        while(s <= e){
            int m = s+(e-s)/2;
            if(nums[m] == target) return m;
            else if(nums[m] > target) e = m -1;
            else s = m +1;
        }
        return -1;
    }
}
